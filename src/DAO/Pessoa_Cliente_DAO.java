package DAO;

import DTO.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import DTO.Pessoa;
import java.time.LocalTime;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class Pessoa_Cliente_DAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

////////////// CADASTRO DO CLIENTE ////////////////////////

    ArrayList<Pessoa> lista = new ArrayList<>();

    public void cadastrarCliente(Pessoa objCadCliente) {
        String sql = "insert into clientes(Id,Nome, Apelido, Nacionalidade, Genero, Endereço, Senha,Telefone, BI, Email, Data_Nascimento, Mes_de_Cadastro) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        conn = new Connection_DAO().connect();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objCadCliente.getIdPessoa());
            pstm.setString(2, objCadCliente.getNome());
            pstm.setString(3, objCadCliente.getApelido());
            pstm.setString(4, objCadCliente.getNacionalidade());
            pstm.setString(5, objCadCliente.getGenero());
            pstm.setString(6, objCadCliente.getEndereço());
            pstm.setString(7, objCadCliente.getPassword());
            pstm.setString(8, objCadCliente.getNrDeTelofone());
            pstm.setString(9, objCadCliente.getNumeroDeIdentificacao());
            pstm.setString(10, objCadCliente.geteMail());
            pstm.setString(11, objCadCliente.getDataNascimento());
            pstm.setString(12,objCadCliente.getMesDeCadastro());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "CADASTRO EFECTUADO COM SUCESSO!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cliente DAO: " + e);
        }
    }

    ////////////////////// ATUALIZAR DADOS DO CLIENTE //////////////////////
    public void AtualizarCliente(Pessoa objClienteDTO)  {
        String sql = "UPDATE clientes SET Nome=?, Apelido=?, Nacionalidade=?, Genero=?, Endereço=?, Senha=?,Telefone=?, BI=?, Data_Nascimento=?, Mes_de_Cadastro = ?  where Email = ?";
        conn = new Connection_DAO().connect();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClienteDTO.getNome());
            pstm.setString(2, objClienteDTO.getApelido());
            pstm.setString(3, objClienteDTO.getNacionalidade());

            pstm.setString(4, objClienteDTO.getGenero());
            pstm.setString(5, objClienteDTO.getEndereço());
            pstm.setString(6, objClienteDTO.getPassword());
            pstm.setString(7, objClienteDTO.getNrDeTelofone());
            pstm.setString(8, objClienteDTO.getNumeroDeIdentificacao());
            pstm.setString(9, objClienteDTO.getDataNascimento());
            pstm.setString(10, objClienteDTO.geteMail());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Funcionario DAO Alterar: " + e);
        }


    }
    //////////////////////Recuperar PASSWORD ////////////////////
    public void enviarEmail(String email,String cod){
        String host = "smtp.gmail.com";
        String port = "587";
        String username = "hoteltrnsyvania@gmail.com";
        String password = "gldyqeywrrvldxpi";
        // Configurações da sessão de e-mail
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        // Cria a sessão de e-mail com autenticação
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        try {
            // Cria a mensagem de e-mail
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("hoteltrnsyvania@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            message.setSubject("Recuperação de Password");
            message.setText("Sua password é "+cod);
            // Envia o e-mail
            Transport.send(message);
           // System.out.println("Sua password é "+cod);
            JOptionPane.showMessageDialog(null,"Verifique a sua Password em seu Email");
        } catch (MessagingException e) {
            System.out.println("Erro ao enviar e-mail: " + e.getMessage());
        }

    }
    public String recuperarSenha(String email){
        String sql = "select senha from clientes where email = ?";
        String senha = null;

        conn = new Connection_DAO().connect();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,email);
            rs = pstm.executeQuery();
            if(rs.next())
                senha = rs.getString("senha");
            pstm.close();
            System.out.println(senha);
            enviarEmail(email,senha);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Funcionario DAO Alterar: " + e);
        }
        return senha;
    }


    ////////////////////// PESQUISA DO CLIENTE ////////////////////

    public ArrayList<Pessoa> PesquisarFuncionario() {
        String sql = "select * from clientes";
        conn = new Connection_DAO().connect();

        try {
            pstm =  conn.prepareStatement(sql);
            rs= pstm.executeQuery();

            while(rs.next()){
                Pessoa objCadCliente = new Pessoa();
                objCadCliente.setIdPessoa(rs.getInt("Id"));
                objCadCliente.setNome(rs.getString("Nome"));
                objCadCliente.setApelido(rs.getString("Apelido"));
                objCadCliente.setNacionalidade(rs.getString("Nacionalidade"));
                objCadCliente.setGenero(rs.getString("Genero"));
                objCadCliente.setEndereço(rs.getString("Endereço"));
                objCadCliente.setPassword(rs.getString("Senha"));
                objCadCliente.setNrDeTelofone(rs.getString("Telefone"));
                objCadCliente.setNumeroDeIdentificacao(rs.getString("BI"));
                objCadCliente.seteMail(rs.getString("Email"));
                objCadCliente.setDataNascimento(rs.getString("Data_Nascimento"));

                lista.add(objCadCliente);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Pesquisar Cliente DAO" +  e);
        }
        return lista;
    }

    public ResultSet Autenticacao_Cliente(Pessoa objadmindto) {
        rs = null;
        conn = new Connection_DAO().connect();

        try {
            String sql = "select * from clientes where  Senha=? and Email=?";
            pstm = conn.prepareStatement(sql);
//            pstm.setString(1, objadmindto.getNome());
            pstm.setString(1, objadmindto.getPassword());
            pstm.setString(2, objadmindto.geteMail());

            rs = pstm.executeQuery();
            return rs;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente dao autenticacao:  " + e);
            return null;
        }

    }

    public void mailReclamacoa(String email, String emailContent) {
        String host = "smtp.gmail.com";
        String port = "587";
        String username = "hoteltrnsyvania@gmail.com";
        String password = "gldyqeywrrvldxpi";


        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);


        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("hoteltrnsyvania@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            message.setSubject("Mensagem de Relaclamação:");
            message.setText(emailContent);


            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Email Enviado");
        } catch (MessagingException e) {
            System.out.println("Erro ao enviar e-mail: " + e.getMessage());
        }
    }
}
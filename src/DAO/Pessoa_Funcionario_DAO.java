package DAO;


import DTO.Pessoa;
import DTO.Reserva;
//import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Pessoa_Funcionario_DAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;


    //////////////// CADASTRO DO FUNCIONARIO ////////////////////////

    ArrayList<Pessoa> lista = new ArrayList<>();

    public void cadastrarFunc(Pessoa objCadFuncionario) throws SQLException, ExecutionException, ClassNotFoundException {
        String sql = "insert into funcionarios (id_funcionario, Nome, Apelido, Status_Funcionario, Nacionalidade, Genero, Endereço, Senha, Nr_De_Telefone, BI, Email, Data_Nascimento) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        conn = new Connection_DAO().connect();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objCadFuncionario.getIdPessoa());
            pstm.setString(2, objCadFuncionario.getNome());
            pstm.setString(3, objCadFuncionario.getApelido());
            pstm.setBoolean(4, objCadFuncionario.isStatus_Pessoa());
            pstm.setString(5, objCadFuncionario.getNacionalidade());
            pstm.setString(6, objCadFuncionario.getGenero());
            pstm.setString(7, objCadFuncionario.getEndereço());
            pstm.setString(8, objCadFuncionario.getPassword());
            pstm.setString(9, objCadFuncionario.getNrDeTelofone());
            pstm.setString(10, objCadFuncionario.getNumeroDeIdentificacao());
            pstm.setString(11, objCadFuncionario.geteMail());
            pstm.setString(12, objCadFuncionario.getDataNascimento());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Funcionario Cadastrado Com Sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Funcionario DAO: " + e);
        }
    }


    /////////////////////////// ELIMINAR FUNCIONARIO ///////////////////////////////
    public void eliminarFuncionario(Pessoa objCadFuncionario){

        //     objReservaDTO.setStatusReserva(false);
        String sql = "UPDATE funcionarios SET Status_Funcionario = 0 WHERE id_funcionario= ";
        try {
            conn = new Connection_DAO().connect();
            pstm = conn.prepareStatement(sql);
            pstm.setBoolean(1, objCadFuncionario.isStatus_Pessoa());

            //email do funcionario que deseja "eliminar"
            pstm.setString(2, objCadFuncionario.geteMail());
            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Eliminar Funcionario DAO" + e);
        }
    }


    //////////////////////// ATUALIZAR DADOS DO FUNCIONARIO //////////////////////////

    public void atualizarFunc(Pessoa objfuncionariodto)
    {
        String sql = "UPDATE funcionarios SET Nome=?,Apelido=?, Status_Funcionario = ?, Nacionalidade=?, Genero =?, Endereço=?,Senha=?,Nr_De_Telefone=? ,BI=? ,Email=? ,Data_Nascimento= ? WHERE id_funcionario = ?";
        conn= new Connection_DAO().connect();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome());
            pstm.setString(2, objfuncionariodto.getApelido());
            pstm.setBoolean(3, objfuncionariodto.isStatus_Pessoa());
            pstm.setString(4, objfuncionariodto.getNacionalidade());
            pstm.setString(5, objfuncionariodto.getGenero());
            pstm.setString(6, objfuncionariodto.getEndereço());
            pstm.setString(7, objfuncionariodto.getPassword());
            pstm.setString(8, objfuncionariodto.getNrDeTelofone());
            pstm.setString(9, objfuncionariodto.getNumeroDeIdentificacao());
            pstm.setString(10, objfuncionariodto.geteMail());
            pstm.setString(11, objfuncionariodto.getDataNascimento());
            pstm.setInt(12, objfuncionariodto.getIdPessoa());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "FUNCIONARIO ALTERADO COM SUCESSO!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Funcionario DAO Alterar: " + e);
        }
    }

    ////////////////////// LISTAGEM DO FUNCIONARIO ////////////////////

    public ArrayList<Pessoa> listarFuncionario()  {
        String sql = "SELECT * FROM funcionarios";
        conn = new Connection_DAO().connect();

        try {
            pstm =  conn.prepareStatement(sql);
            rs= pstm.executeQuery();

            while(rs.next()){
                Pessoa objCadFuncionario = new Pessoa();
                objCadFuncionario.setIdPessoa(rs.getInt("id_funcionario"));
                objCadFuncionario.setNome(rs.getString("Nome"));
                objCadFuncionario.setApelido(rs.getString("Apelido"));
                objCadFuncionario.setStatus_Pessoa(rs.getBoolean("Status_Funcionario"));

                objCadFuncionario.setNacionalidade(rs.getString("Nacionalidade"));
                objCadFuncionario.setGenero(rs.getString("Genero"));
                objCadFuncionario.setEndereço(rs.getString("Endereço"));
                objCadFuncionario.setPassword(rs.getString("Senha"));
                objCadFuncionario.setNrDeTelofone(rs.getString("Nr_De_Telefone"));
                objCadFuncionario.setNumeroDeIdentificacao(rs.getString("BI"));
                objCadFuncionario.seteMail(rs.getString("Email"));
                objCadFuncionario.setDataNascimento(rs.getString("Data_Nascimento"));

                lista.add(objCadFuncionario);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Pesquisar funcionarioDao" +  e);
        }
        return lista;
    }



    public ResultSet Autenticacao_Func(Pessoa objadmindto){
        rs = null ;
        conn = new Connection_DAO().connect();

        try {
            String sql = "select * from funcionarios where Email=? and Senha=? and Status_Funcionario = 1";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objadmindto.getNome());
            pstm.setString(2, objadmindto.getPassword());
            rs = pstm.executeQuery();
            return rs;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Funcionario dao autenticacao:  " +  e);
            return null;
        }


    }






}
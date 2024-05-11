/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;

import DAO.Pessoa_Cliente_DAO;
import DAO.Reserva_Cliente_DAO;
import DTO.Pessoa;
import com.toedter.calendar.JDateChooser;
import DTO.Reserva;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import javax.swing.*;

/**
 *
 * @author steli
 */
public class Tela_Cadastro_Confirmacao implements ActionListener{
    //  Jla

    private JPanel panel = new JPanel(null);
    private JButton btnConfirmar = new JButton("Confirmar");
    private JButton btnButton1 = new JButton("Voltar");
    private JLabel lblnome = new JLabel("Nome:");
    private JLabel lblNacionalidade = new JLabel("Nacionalidade:");
    private JTextField txfNacionalidade = new JTextField();
    private JTextField txfNome = new JTextField();
    private JLabel lblApelido = new JLabel("Apelido:");
    private JTextField txfApelido = new JTextField();
    private JLabel lblDataNasc = new JLabel("<html>Data Nascimento:</html>");
    private JDateChooser jDateChooserdata = new JDateChooser();
    private JLabel lblSexo = new JLabel("Sexo:");
    private JTextField txfSexo = new JTextField();
    private JLabel lblnNacionalidade = new JLabel("Nacionalidade:");

    JRadioButton masculino = new JRadioButton("Masculino");
    JRadioButton feminino = new JRadioButton("Feminino");
    JRadioButton outro = new JRadioButton("Outro");
    ButtonGroup grupo = new ButtonGroup();
    private JLabel lblTelefone = new JLabel("Telefone:");
    Color verde_2 = new Color(21, 152, 116);
    private JTextField txfTelefone = new JTextField();
    private JLabel lblEmail = new JLabel("E-mail:");
    private JTextField txfEmail = new JTextField();
    private JLabel lblBi = new JLabel("Bilhete de ID:");
    private JTextField txfBI = new JTextField();
    private JLabel lblEndereco = new JLabel("Endereço:");
    private JTextField txfEndereco = new JTextField();
    private JLabel lblPassword = new JLabel("Password:");
    private String VariavelQueRecebeNacionalidade;
    private JPasswordField txfPassword = new JPasswordField();

    private JPanel pintarLaterar =  new JPanel();
    private JLabel pintarSuperior =  new JLabel("<html><h1 style='margin-left: 30px;'>CONFIRMAÇAO DOS DADOS</h1></html>");
    ImageIcon imagem = new ImageIcon(getClass().getResource("logo Branco.png"));
    JLabel label = new JLabel(imagem);

    Color WhiteSmokee = new Color(205, 232, 232, 255);
    Color fundo = new Color(210, 232, 232, 255);
    Color aqua_5 = new Color(1, 51, 49);
    Color aqua_3 = new Color(12, 87, 83, 237);
    Font fonte  = new Font("sarala", Font.HANGING_BASELINE, 18);
    public Tela_Cadastro_Confirmacao(){
        visualizar();
    }
    public void visualizar(){
        pintarLaterar.setBounds(700,0,300,700);
        pintarSuperior.setBounds(0,0,700,45);
        pintarLaterar.setBackground(Color.gray);
        pintarSuperior.setOpaque(true);
        pintarLaterar.setBackground(Color.red);
        pintarLaterar.setOpaque(true);
        panel.add(pintarLaterar);
        panel.add(pintarSuperior);

        txfApelido.setEnabled(false);
        txfBI.setEnabled(false);
        txfTelefone.setEnabled(false);
        txfEmail.setEnabled(false);
        txfNome.setEnabled(false);
        txfPassword.setEnabled(false);
        txfEndereco.setEnabled(false);
        jDateChooserdata.setEnabled(false);
        txfSexo.setEnabled(false);
        txfNacionalidade.setEnabled(false);
        masculino.setEnabled(false);
        feminino.setEnabled(false);
        outro.setEnabled(false);

        lblnome.setBounds(130,80,350,30);
        txfNome.setBounds(320,80,300,30);
        panel.add(txfNome);
        panel.add(lblnome);
        lblApelido.setBounds(130,115,370,25);
        txfApelido.setBounds(320,115,300,30);
        panel.add(lblApelido);
        panel.add(txfApelido);
        lblDataNasc.setBounds(130,145,370,35);
        jDateChooserdata.setBounds(320,150,300,30);
        panel.add(lblDataNasc);
        panel.add(jDateChooserdata);
        lblSexo.setBounds(130,185,370,30);
        masculino.setBounds(320,185,100,30);
        feminino.setBounds(445,185,90,30);
        outro.setBounds(542,185,78,30);
        masculino.setBackground(Color.WHITE);
        feminino.setBackground(Color.white);
        outro.setBackground(Color.white);
        panel.add(masculino);
        panel.add(feminino);
        panel.add(outro);
        panel.add(lblSexo);
        lblTelefone.setBounds(130,220,370,25);
        txfTelefone.setBounds(320,220,300,30);

        ///mod
        lblNacionalidade.setBounds(130,255,370,25);
        txfNacionalidade.setBounds(320, 255, 300, 25);
        panel.add(lblNacionalidade);
        panel.add(txfNacionalidade);

        panel.add(lblTelefone);
        panel.add(txfTelefone);


        lblEmail.setBounds(130,290,370,25);
        txfEmail.setBounds(320,290,300,30);
        panel.add(lblEmail);
        panel.add(txfEmail);
        lblBi.setBounds(130,325,100,25);
        txfBI.setBounds(320,325,300,30);
        panel.add(lblBi);
        panel.add(txfBI);
        lblEndereco.setBounds(130,360,370,25);
        txfEndereco.setBounds(320,360,300,30);
        panel.add(lblEndereco);
        panel.add(txfEndereco);
        lblPassword.setBounds(130,395,370,25);
        txfPassword.setBounds(320,395,300,30);
        panel.add(lblPassword);
        panel.add(txfPassword);
        btnButton1.setBounds(415,450,100,30);
        btnConfirmar.setBounds(530,450,100,30);


        panel.add(btnButton1);
        panel.add(btnConfirmar);
        panel.setBackground(Color.WHITE);
        Tela_Principal objTela_Principal = new Tela_Principal();
        objTela_Principal.setTitle("Tela Confirmacao Cadastro");
        objTela_Principal.add(panel);

        panel.add(btnConfirmar);
        panel.add(btnButton1);
        btnConfirmar.addActionListener(this);
        btnButton1.addActionListener(this);

        btnConfirmar.setBackground(Color.white);
        btnConfirmar.setForeground(aqua_5);
        btnButton1.setBackground(Color.white);
        btnButton1.setForeground(aqua_5);

        panel.setBackground(fundo);

        lblNacionalidade.setFont(fonte);
        lblPassword.setFont(fonte);
        lblApelido.setFont(fonte);
        lblBi.setFont(fonte);
        lblnome.setFont(fonte);
        lblEmail.setFont(fonte);
        lblDataNasc.setFont(fonte);
        lblSexo.setFont(fonte);
        lblEndereco.setFont(fonte);
        lblTelefone.setFont(fonte);

        pintarSuperior.setForeground(WhiteSmokee);
        pintarSuperior.setBackground(verde_2);
        pintarLaterar.setBackground(verde_2);
        label.setBounds(750,200,200,200);
        pintarLaterar.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnConfirmar) {

            cadastrarPes();
            new Tela_Cliente_Menu();
        }

        if (e.getSource() == btnButton1) {
            new Tela_Cadastro();

        }
    }

    public static void main(String[] args){
        new Tela_Cadastro_Confirmacao();
    }
//////////////METODOS/////////////////

    ///////////////////////////////CADASTRO DO CLIENTE////////////////////////////////
    ///////////////////////////////CADASTRO DO CLIENTE////////////////////////////////
    private void cadastrarPes()  {
        int      idPessoa;
        String   nome;
        String   apelido;
        String   nacionalidade;
        String   eMail;
        String   genero = null;
        String   endereco;
        String   password;
        String   nrDeTelefone;
        String   dataNascimento;
        String   numeroDeIdentificacao;
        String mesCadastro;

        nome=  txfNome.getText();
        apelido=  txfApelido.getText();

        eMail= txfEmail.getText();
        genero = txfSexo.getText();
        nacionalidade = txfNacionalidade.getText();
        endereco= txfEndereco.getText();
        password= txfPassword.getText();
        nrDeTelefone= txfTelefone.getText();
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        //SimpleDateFormat g = new SimpleDateFormat("MM");
        dataNascimento = String.valueOf(f.format(jDateChooserdata.getDate()));
        Date m = new Date();
        mesCadastro = String.valueOf(m.getMonth()+1);
        numeroDeIdentificacao = txfBI.getText();



        Pessoa objPessoaDTO = new Pessoa();
        objPessoaDTO.setNome(nome);
        objPessoaDTO.setApelido(apelido);
        objPessoaDTO.setNacionalidade(nacionalidade);
        objPessoaDTO.seteMail(eMail);
        objPessoaDTO.setGenero(genero);
        objPessoaDTO.setEndereço(endereco);
        objPessoaDTO.setPassword(password);
        objPessoaDTO.setNrDeTelofone(nrDeTelefone);
        objPessoaDTO.setDataNascimento(dataNascimento);
        objPessoaDTO.setNumeroDeIdentificacao(numeroDeIdentificacao);
        objPessoaDTO.seteMail(eMail);
        objPessoaDTO.setDataNascimento(dataNascimento);
        objPessoaDTO.setMesDeCadastro(mesCadastro);
        Pessoa_Cliente_DAO objClienteDAO= new Pessoa_Cliente_DAO();
        objClienteDAO.cadastrarCliente(objPessoaDTO);

    }

    public void copiarTextoDasTextField(String nome, String apelido, Date data, String sexo, String telefone, String nacionalidade, String email, String bi, String endereco, String password){
        txfNome.setText(nome);
        txfApelido.setText(apelido);
        jDateChooserdata.setDate(data);
        txfSexo.setText(sexo);
        txfTelefone.setText(telefone);
        txfNacionalidade.setText(nacionalidade);
        txfEmail.setText(email);
        txfPassword.setText(password);
        txfBI.setText(bi);
        txfEndereco.setText(endereco);
    }

}


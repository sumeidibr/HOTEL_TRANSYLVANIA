/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template**/

package VIEW;

import DAO.ADMIN_DAO;
import DAO.Connection_DAO;
import DAO.Pessoa_Funcionario_DAO;
import DTO.ADMIN_DTO;
import DTO.Funcionario;
import DTO.Pessoa;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author steli
 */
public class Tela_FUNC_Logar implements ActionListener{

    ImageIcon iconeUsuario = new ImageIcon(getClass().getResource("utilizador.png"));
    ImageIcon iconeCadeado = new ImageIcon(getClass().getResource("trancar.png"));

    ImageIcon iconeSetaDireita = new ImageIcon(getClass().getResource("setadireita.png"));
    ImageIcon iconeSetaEsquerda = new ImageIcon(getClass().getResource("setaesquerda.png"));

    JPanel panel1 = new JPanel(null);
    JLayeredPane panel2 = new JLayeredPane();
    private JLabel lblDiscri = new JLabel("<html><h1 style='margin-left: 30px;'>FUNCIONARIO</h1></html>");


    //setSize(700,600);


    //paneil de entrada permuta
    private JLabel lblNome = new JLabel(iconeUsuario);
    private JLabel lblApelido = new JLabel(iconeCadeado);
    private JTextField txfNome = new JTextField("E-mail do Funcionario");
    private JPasswordField txfPassword = new JPasswordField(" Password");
    ImageIcon teste = new ImageIcon(getClass().getResource("blogger.png"));
    JLabel lblImage = new JLabel(teste);
    JButton btnConfirmar = new JButton("Entrar");
    JButton btnVoltar = new JButton("Voltar");



    Color aqua_0 = new Color(55, 77, 73, 207);
    Color aqua_1 = new Color(19, 107, 105);
    Color aqua_2 = new Color(16, 105, 88);
    Color aqua_3 = new Color(7, 75, 71, 237);
    Color aqua_4 = new Color(4, 68, 65);
    Color aqua_5 = new Color(1, 51, 49);
    Color aqua_6 = new Color(0, 47, 45);



    Color WhiteSmokee = new Color(205, 232, 232, 255);

    Color fundo = new Color(207, 232, 232, 255);

    Color pasillo = new Color(219, 224, 224, 195);

    Font fontee  = new Font("sarala", Font.HANGING_BASELINE, 18);
    Font fonte  = new Font("sarala", Font.PLAIN, 18);

    Border bordaTracejada = BorderFactory.createDashedBorder(aqua_0, 1, 1, 0, true);
    Color cinza = new Color(136, 141, 141, 255);
    Font fonteee = new Font("sarala", Font.ITALIC, 14);

    ImageIcon imagem = new ImageIcon(getClass().getResource("logo Branco.png"));
    JLabel label = new JLabel(imagem);
    private JLabel texto1 = new JLabel("E-mail");

    private JLabel texto2 = new JLabel("Palavra-passe");

    Font fonteeee = new Font("sarala", Font.ITALIC, 14);

    Color verde_2 = new Color(21, 152, 116);
    Color branco = new Color(250, 250, 250, 255);
    Color branco1 = new Color(227, 226, 226, 255);
    Color transparente = new Color(217, 217, 217, 0);
    public Tela_FUNC_Logar(){
        visualizar();
    }

    public void visualizar(){
        txfNome.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txfNome.setText("");
                txfNome.setForeground(Color.black);
                txfNome.setFont(fonte);

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

          txfPassword.addMouseListener(new MouseListener() {
                                           @Override
                                           public void mouseClicked(MouseEvent e) {
                                               txfPassword.setText("");
                                               txfPassword.setForeground(Color.black);
                                               txfPassword.setFont(fonte);
                                           }

                                           @Override
                                           public void mousePressed(MouseEvent e) {

                                           }

                                           @Override
                                           public void mouseReleased(MouseEvent e) {

                                           }

                                           @Override
                                           public void mouseEntered(MouseEvent e) {

                                           }

                                           @Override
                                           public void mouseExited(MouseEvent e) {

                                           }

                                       });

              //Parte de Cima
        lblDiscri.setBackground(verde_2);
        lblDiscri.setForeground(Color.white);
        lblDiscri.setBounds(0,0,1000,45);
        lblDiscri.setOpaque(true);

        panel1.setBounds(600,45,400,655);
        panel1.setBackground(verde_2);

        panel2.setBounds(0, 45, 600, 655);
        panel2.setBackground(Color.white);
        panel2.setOpaque(true);
        //panel2.add(lbl1);
        panel2.setLayout(null);

        txfPassword.setForeground(cinza);
        txfNome.setForeground(cinza);
        txfNome.setFont(fonteee);
        txfPassword.setFont(fonteee);

        texto1.setBounds(180,270,170,30);
        texto1.setFont(fonteee);

        texto2.setBounds(180,342,170,30);
        texto2.setFont(fonteee);

        lblNome.setBounds(110,300,50,30);
        txfNome.setBounds(180,300,300,35);
        lblApelido.setBounds(100,380,70,35);
        txfPassword.setBounds(180,380,300,35);
        lblImage.setBounds(260,100,150,150);
        btnConfirmar.setBounds(340,450,108,33);
        btnVoltar.setBounds(210,450,108,33);
        txfNome.setBorder(null);
        txfPassword.setBorder(null);
        btnConfirmar.setBorder(null);
        btnVoltar.setBorder(null);
        btnConfirmar.setForeground(Color.white);
        btnVoltar.setForeground(Color.white);
        btnConfirmar.setBackground(verde_2);
        btnVoltar.setBackground(verde_2);
        panel2.add(btnConfirmar);
        panel2.add(btnVoltar);
        panel2.add(lblImage);
        panel2.add(lblNome);
        panel2.add(texto1);
        panel2.add(texto2);

        panel2.add(txfNome);
        panel2.add(lblApelido);
        panel2.add(txfPassword);

        txfNome.setBackground(branco1);
        txfPassword.setBackground(branco1);

        Tela_Principal objTela_Principal = new Tela_Principal();
        objTela_Principal.setTitle("Tela Cliente Menu");
        objTela_Principal.add(lblDiscri);
        objTela_Principal.add(panel1);
        objTela_Principal.add(panel2);
        objTela_Principal.setBackground(fundo);
        btnVoltar.addActionListener(this);
        btnConfirmar.addActionListener(this);

        label.setBounds(100,100,200,200);

        panel1.add(label);

    }


    public static void main(String[] args) {
        new Tela_FUNC_Logar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnConfirmar){
            try {
                AutenticarFunc();
            } catch (SQLException ex) {
                Logger.getLogger(Tela_ADMIN_Logar.class.getName()).log(Level.SEVERE, "Metodo Autenticao Func", ex);
            }


        }
        if(e.getSource()== btnVoltar){
            new Tela_Principal();
        }
    }

    private void AutenticarFunc() throws SQLException {
        String email_func = txfNome.getText();
        String senha_func = txfPassword.getText();

        Pessoa objfuncdto = new Pessoa();
        objfuncdto.setNome(email_func);
        objfuncdto.setPassword(senha_func);

        Pessoa_Funcionario_DAO objadmindao = new Pessoa_Funcionario_DAO();
        ResultSet rsAdminDao = objadmindao.Autenticacao_Func(objfuncdto);

        if(rsAdminDao.next()){
             Tela_FUNC_Menu objTela_Func_Menu =  new Tela_FUNC_Menu();
        }else{
            JOptionPane.showMessageDialog(null,"Nome ou Senha Incorrectos!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
}

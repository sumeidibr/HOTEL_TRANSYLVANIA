/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template**/

package VIEW;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import DAO.ADMIN_DAO;
import DTO.ADMIN_DTO;
import VIEW.Tela_ADMIN_Menu;
import VIEW.Tela_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;


/**
 *
 * @author steli
 */
public class Tela_ADMIN_Logar implements ActionListener{
    ImageIcon iconeUsuario = new ImageIcon(getClass().getResource("utilizador.png"));
    ImageIcon iconeCadeado = new ImageIcon(getClass().getResource("trancar.png"));

    ImageIcon logo = new ImageIcon(getClass().getResource("logo Branco.png"));
    JPanel panel1 = new JPanel(null);
    JLayeredPane panel2 = new JLayeredPane();
    private JLabel lblDiscri = new JLabel("<html><h1 style='margin-left: 30px;'> ADMIN </h1></html>");

    private JLabel texto1 = new JLabel("E-mail");

    private JLabel texto2 = new JLabel("Palavra-passe");
    //setSize(700,600);


    //paneil de entrada permuta
    private JLabel logotipo = new JLabel(logo);
    private JLabel lblNome = new JLabel(iconeUsuario);
    private JLabel lblApelido = new JLabel(iconeCadeado);
    ImageIcon iconeSetaDireita = new ImageIcon(getClass().getResource("setadireita.png"));
    ImageIcon iconeSetaEsquerda = new ImageIcon(getClass().getResource("setaesquerda.png"));
    private JTextField txfNome = new JTextField("E-mail");
    private JPasswordField txfPassword = new JPasswordField(" Password");
    ImageIcon teste = new ImageIcon(getClass().getResource("administrator.png"));
    JLabel lblImage = new JLabel(teste);
    JButton btnConfirmar = new JButton("Entrar");
    JButton btnVoltar = new JButton("Voltar");

    Color aqua_0 = new Color(14, 21, 21, 207);
    Color aqua_1 = new Color(33, 150, 146);
    Color aqua_2 = new Color(14, 100, 84);
    Color aqua_3 = new Color(9, 82, 79, 237);
    Color aqua_4 = new Color(4, 68, 65);
    Color aqua_5 = new Color(1, 51, 49);
    Color aqua_6 = new Color(0, 47, 45);

    Border bordaTracejada = BorderFactory.createDashedBorder(aqua_0, 1, 1, 0, true);
    Color fundo = new Color(210, 232, 232, 255);

    Color cinza = new Color(136, 141, 141, 255);
    Font fonte  = new Font("sarala", Font.ITALIC, 14);
    Tela_Principal objTela_Principal = new Tela_Principal();

    ImageIcon imagem = new ImageIcon(getClass().getResource("logo Branco.png"));
    JLabel label = new JLabel(imagem);


    Color verde_2 = new Color(21, 152, 116);

    Color branco = new Color(250, 250, 250, 255);
    Color branco1 = new Color(227, 226, 226, 255);
    Color transparente = new Color(217, 217, 217, 0);

    public Tela_ADMIN_Logar(){
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
                                     } );



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

        txfPassword.setForeground(cinza);
        txfNome.setForeground(cinza);
        txfNome.setFont(fonte);
        txfPassword.setFont(fonte);


        texto1.setBounds(180,270,170,30);
        texto1.setFont(fonte);

        texto2.setBounds(180,342,170,30);
        texto2.setFont(fonte);

        lblNome.setBounds(110,300,50,30);
        txfNome.setBounds(180,300,300,35);
        lblApelido.setBounds(100,370,70,35);
        txfPassword.setBounds(180,380,300,35);
        lblImage.setBounds(260,100,150,150);
        btnConfirmar.setBounds(340,445,100,32);
        btnVoltar.setBounds(210,445,100,32);
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


        txfNome.setBackground(branco1);
        txfPassword.setBackground(branco1);



        panel2.add(txfNome);
        panel2.add(lblApelido);
        panel2.add(txfPassword);
        panel2.setLayout(null);


        objTela_Principal.setTitle("Tela Cliente Menu");
        objTela_Principal.add(lblDiscri);
        objTela_Principal.add(panel1);
        objTela_Principal.add(panel2);
        logotipo.setBounds(850,150,300,300);
        panel2.add(logotipo);
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
                Autenticar();
            } catch (SQLException ex) {
                Logger.getLogger(Tela_ADMIN_Logar.class.getName()).log(Level.SEVERE, "Metodo Autenticao Admin", ex);
            }
//            new Tela_ADMIN_Menu();
        }
        if(e.getSource()== btnVoltar){
            new Tela_Principal();
        }
    }
    private void Autenticar() throws SQLException{
        String nome_admin = txfNome.getText();
        String senha_admin = txfPassword.getText();

        ADMIN_DTO objadmindto = new ADMIN_DTO();
        objadmindto.setAdmin(nome_admin);
        objadmindto.setSenha_Admin(senha_admin);

        ADMIN_DAO objadmindao = new ADMIN_DAO();
        ResultSet rsAdminDao = objadmindao.Autenticacao_Admin(objadmindto);

        if(rsAdminDao.next()){
            Tela_ADMIN_Menu objTela_ADMIN_Menu = new Tela_ADMIN_Menu();
        }else{
            JOptionPane.showMessageDialog(null,"Nome ou Senha Incorrectos!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }


}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;

import DAO.Pessoa_Cliente_DAO;
import DAO.Pessoa_Funcionario_DAO;
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
public class Tela_Principal extends JFrame implements ActionListener{
    Font fontee  = new Font("sarala", Font.ITALIC, 16);
    Font fonteee  = new Font("sarala", Font.HANGING_BASELINE, 17);
//////////////////////GIF PARA O INICIO DA TELA

    ImageIcon iconeUsuario = new ImageIcon(getClass().getResource("utilizador.png"));
    ImageIcon iconeCadeado = new ImageIcon(getClass().getResource("trancar.png"));
    ImageIcon iconeEnvelope = new ImageIcon(getClass().getResource("envelope.png"));

    ImageIcon iconeSetaDireita = new ImageIcon(getClass().getResource("setadireita.png"));
    private JMenuBar barra = new JMenuBar();
    private JMenu menu1 = new JMenu("Opçoes");
    private JMenu menu2 = new JMenu("Outras");
    private JMenuItem item1 = new JMenuItem("ADMIN...");
    private JMenuItem item2 = new JMenuItem("FUNC....");
    private JMenuItem item4 = new JMenuItem("Encerrar");
    private JMenuItem item3 = new JMenuItem("Mais Info.");
    ImageIcon imagem = new ImageIcon(getClass().getResource("logo verde.png"));
    JLabel label = new JLabel(imagem);
    private  JPanel painelEsquerdo = new JPanel(null);
    private JButton btnCadastrar = new JButton("Cadastrar");
    private JLabel lblTextoEntrada = new JLabel("<html><h1 style='Font-Size: 35pt;Font-Family: Righteous;'>Seja Bem Vindo/a!</h1> <br style='Line-Height: 1.9rem;Font-Size: 18pt;'> Experimente o Luxo no Colo da Natureza.<br> Visite o paraíso aqui!</html>");
    private  JPanel painelDireito = new JPanel(null);
    private JLabel lblEmail = new JLabel(iconeEnvelope);
    private JLabel lblNome = new JLabel(iconeUsuario);
    private JLabel lblSneha = new JLabel(iconeCadeado);
    public JTextField txtNomeField = new JTextField("Nome");
    public JTextField txtEmail = new JTextField("Digite o seu E-mail");
    public JPasswordField txtPassword = new JPasswordField("password");
    private JButton btnRecuperar = new JButton("<html><p style='Border-bottom: 1px solid #19B88C;'>Recuperar o password ?</p></html>");
    private JButton btnConfirmar = new JButton("Entrar");

    private JPanel panelPrincipalJPanel = new JPanel(null);
    
    
    public Tela_Principal(){ 
        visualizacao();
    }
    ///Tela de reclamacoes
    ImageIcon imageRecla = new ImageIcon(getClass().getResource(""));
    JButton btnImagemRec = new JButton("<html><p style='Border-bottom: 1px solid #19B88C;'>Contactar-nos ?</p></html>");

    //// Cores
    Color verde_0 = new Color(115, 227, 188);
    Color verde_1 = new Color(52, 210, 156);
    Color verde_2 = new Color(21, 152, 116);
    Color verde_3 = new Color(17, 115, 82);
    Color verde_4 = new Color(10, 110, 76);

    Color foto = new Color(88, 175, 156);
    Color foto1 = new Color(50, 215, 179);

    Color aqua_0 = new Color(118, 236, 222);
    Color aqua_1 = new Color(33, 150, 146);
    Color aqua_2 = new Color(14, 100, 84);
    Color aqua_3 = new Color(9, 82, 79, 237);
    Color aqua_4 = new Color(4, 68, 65);
    Color aqua_5 = new Color(1, 51, 49);

    Color fundo = new Color(184, 245, 240);

    Color branco = new Color(250, 250, 250, 255);
    Color branco1 = new Color(227, 226, 226, 255);
    Color transparente = new Color(217, 217, 217, 0);

    Border bordaTracejada = BorderFactory.createDashedBorder(branco, 1, 1, 0, true);
    Border redonda= BorderFactory.createLineBorder(Color.red, 40);
    Border roundedBorder = BorderFactory.createLineBorder(verde_2, 40, true);

    private JButton btnVisitantes = new JButton("Visitante");

    Font fonteeee  = new Font("sarala", Font.HANGING_BASELINE, 15);

    public void visualizacao(){

        txtNomeField.setFont(fontee);
        txtEmail.setFont(fontee);

        txtEmail.addMouseListener(new MouseListener() {
                                      @Override
                                      public void mouseClicked(MouseEvent e) {
                                          txtEmail.setText("");
                                          txtEmail.setForeground(Color.black);
                                          txtEmail.setFont(fonteee);
                                          //  txtNomeField.setFont();

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
        txtPassword.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtPassword.setText("");
                txtPassword.setForeground(Color.black);
                //  txtNomeField.setFont();

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

                setUndecorated(true);
        setJMenuBar(barra);
        barra.add(menu1);
        barra.add(menu2);
        menu1.add(item1);
        menu1.add(item2);
        menu2.add(item3);
        menu2.add(item4);

        item4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             new Tela_ADMIN_Logar();

            }
        });
         item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new Tela_FUNC_Logar();

            }
        });
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tela_Criadores();

            }
        });



        setResizable(false);
        setTitle("Tela Principal");
        setVisible(true);
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);


        lblNome.setVisible(false);
        txtNomeField.setBorder(null);

//        txtNomeField.setBackground(new Color(199, 229, 195));
//        txtEmail.setBackground(new Color(199, 229, 195));
//        txtPassword.setBackground(new Color(199, 229, 195));

        ///Icone reclamacoes
        btnImagemRec.setBounds(400,460,150,25);
        btnImagemRec.setFont(fonteeee);
        btnImagemRec.setBorder(null);
        btnImagemRec.setForeground(verde_2);
        btnImagemRec.setBackground(null);
        painelDireito.add(btnImagemRec);
        btnImagemRec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tela_Reclamacoes();
            }
        });

        txtEmail.setBorder(null);
        txtPassword.setBorder(null);
        painelDireito.setBackground(Color.red);
        painelDireito.setBounds(400,0,600,700);
        lblNome.setBounds(110,255,70,25);
        txtNomeField.setBounds(200,255,300,25);


        btnConfirmar.setBackground(aqua_4);
        btnConfirmar.setForeground(aqua_0);
        btnConfirmar.setFont(fontee);
        btnRecuperar.setForeground(aqua_0);
        btnRecuperar.setBackground(aqua_4);
        btnRecuperar.setFont(fontee);
        btnRecuperar.setBorder(null);
        painelDireito.add(btnConfirmar );
        painelDireito.add(btnRecuperar);
        painelDireito.add(lblNome);
        painelDireito.add(lblEmail);
        painelDireito.add(lblSneha);
        painelDireito.add(txtEmail);
        painelDireito.add(txtNomeField);
        painelDireito.add(txtPassword);

        txtNomeField.setVisible(false);
        txtEmail.setBackground(branco1);
        txtPassword.setBackground(branco1);

        txtEmail.setBounds(200,293,315,40);
        lblEmail.setBounds(110,295,70,25);
        txtPassword.setBounds(200,345,315,40);
        lblSneha.setBounds(110,345,70,25);


        painelEsquerdo.setBounds(0,0,400,700);

        label.setBounds(240,50,200,200);

        painelDireito.add(label);





        lblTextoEntrada.setBounds(50,180,350,160);
        painelEsquerdo.add(lblTextoEntrada);
        painelEsquerdo.add(btnCadastrar);
        painelEsquerdo.add(btnVisitantes);
        panelPrincipalJPanel.add(painelEsquerdo);
        panelPrincipalJPanel.add(painelDireito);

        add(panelPrincipalJPanel);
        btnRecuperar.addActionListener(this);
        btnCadastrar.addActionListener(this);
        btnConfirmar.addActionListener(this);

        /////////////Estilo

        btnCadastrar.setBackground(null);
        btnCadastrar.setForeground(branco);
        btnCadastrar.setBorder(bordaTracejada);
        btnCadastrar.setBounds(50,370,120,35);

        btnVisitantes.setBackground(null);
        btnVisitantes.setForeground(branco);
        btnVisitantes.setBorder(bordaTracejada);
        btnVisitantes.setBounds(190,370,120,35);


        btnConfirmar.setBounds(300,405,140,35);
        btnRecuperar.setBounds(195,458,200,35);


        btnConfirmar.setBackground(verde_2);
        btnConfirmar.setForeground(branco);


        btnRecuperar.setBackground(null);
        btnRecuperar.setForeground(verde_2);

        lblTextoEntrada.setFont(fonteeee);
        btnCadastrar.setFont(fonteeee);
        btnVisitantes.setFont(fonteeee);
        btnVisitantes.addActionListener(this);

        painelEsquerdo.setBackground(verde_2);

        lblTextoEntrada.setForeground(branco);

        painelDireito.setBackground(branco);

    }








    public static void main(String[] args) {
        new Tela_Principal();
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnConfirmar){
            try {
                AutenticarCliente();
            } catch (SQLException ex) {
                Logger.getLogger(Tela_ADMIN_Logar.class.getName()).log(Level.SEVERE, "Metodo Autenticao cliente", ex);
            }



        }
        if(e.getSource()==btnRecuperar){
            new Tela_Recuperar_Password();
        }
        if (e.getSource()==btnCadastrar){
            new Tela_Cadastro();
        }
         if (e.getSource()==btnVisitantes){
             new Tela_Cliente_Select_Quartos_Demo();
         }

    }

    public void AutenticarCliente() throws SQLException {
//        String nome_cli = txtNomeField.getText();
        String senha_cli = txtPassword.getText();
        String email_cli = txtEmail.getText();


        Pessoa objfuncdto = new Pessoa();
//        objfuncdto.setNome(nome_cli);
        objfuncdto.setPassword(senha_cli);
        objfuncdto.seteMail(email_cli);


        Pessoa_Cliente_DAO objadmindao = new Pessoa_Cliente_DAO();
        ResultSet rsAdminDao = objadmindao.Autenticacao_Cliente(objfuncdto);

        if(rsAdminDao.next()){
            Tela_Cliente_Menu objTela_cliente_Menu =  new Tela_Cliente_Menu();
            levarEmail();
        }else{
            JOptionPane.showMessageDialog(null,"Email ou Senha Incorrectos!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }

    public String princEmail() {
        return txtEmail.getText();
    }

    public void levarEmail() {
        String email = txtEmail.getText();
        Tela_Cliente_Menu objCl = new Tela_Cliente_Menu();
        objCl.detalhesReserva(email);
    }





}

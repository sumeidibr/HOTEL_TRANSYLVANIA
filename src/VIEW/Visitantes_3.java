package VIEW;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class Visitantes_3 extends JFrame {
    JPanel panel;
    ImageIcon img1 = new ImageIcon();

    JLabel m1 = new JLabel();
    JLabel m2 = new JLabel();
    JLabel m3 = new JLabel();

    JRadioButton btn1, btn2, btn3;

    ButtonGroup gp ;

    ///////////////////////////////
    private JMenuBar barra = new JMenuBar();
    private JMenu menu1 = new JMenu("Opçoes");
    private JMenu menu2 = new JMenu("Outras");
    private JMenuItem item1 = new JMenuItem("ADMIN...");
    private JMenuItem item2 = new JMenuItem("FUNC....");
    private JMenuItem item4 = new JMenuItem("Encerrar");
    private JMenuItem item3 = new JMenuItem("Mais Info.");

    private JPanel painelEsquerdo = new JPanel(null);
    private JPanel painelDireito = new JPanel(null);

    private JPanel panelPrincipalJPanel = new JPanel(null);

    private JButton voltar = new JButton("Voltar");


    /////////// Descriçao ////////////////

    JLabel p1 = new JLabel("<html><h2>Quarto Queen Standard</h2></html>");
    JLabel p1_content = new JLabel("<html><ul style='float: right;'>" +
            "<li>Piscina a vista</li><li>Ar condicionado</li>" +
            "</ul></html>");
    JLabel p1_content_2 = new JLabel("<html><ul style='display: flex; flex-direction: row;'>" +
            "<li>Casa de banho privativa</li><li>Televisao de ecra plano</li>" +
            "</ul></html>");


    JLabel p2 = new JLabel("<html><h3>Área do Quarto  30m^2</h3></html>");
    JLabel p2_content = new JLabel("<html><p>1 Cama de casal grande; <br> Camas confortáveis; 8,4- Com base em comentários</p></html>");


    JLabel p3 = new JLabel("<html><h3>Comodidades dos quartos:</h3></html>");
    JLabel p3_content = new JLabel("<html><ul style='list-style: armenian;'>" +
            "<li>Secretária</li><li>Cofre</li><li>Pisos superiores<br> acessíveis por elevadores</li>" +
            "<li>Televisao de ecra plano</li><li>Relógio despertador</li><li>Ventoinha</li>" +
            "<li>Toalhas</li>" +
            "</ul></html>");

    JLabel p3_content_2 = new JLabel("<html> <ul>" +
            "<li>Tomada perto da cama</li><li>Televisao</li><li>Frigorífico</li>" +
            "<li>Chaleira elétrica</li><li>Telefone</li><li>Roupeiro</li>" +
            "<li>Canais por satélite</li>" +
            "</ul></html>");



    public Visitantes_3(){
        visualizacao();
        setVisible(true);
    }

    public void visualizacao(){
        panel = new JPanel();
        panel.setBackground(null);
        panel.setOpaque(true);

        gp = new ButtonGroup();

        btn1 = new JRadioButton();
        btn2 = new JRadioButton();
        btn3 = new JRadioButton();

        btn1.setBounds(30,320,20,50);
        btn2.setBounds(60,320,20,50);
        btn3.setBounds(90,320,20,50);

        m1.setBounds(4,10,600,300);
        m2.setBounds(3,10,600,300);
        m2.setBounds(3,10,600,300);

        m1.setIcon(new ImageIcon(getClass().getResource("Quarto_quar.png")));

        gp.add(btn1);
        gp.add(btn2);
        gp.add(btn3);

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);

        panel.add(m1);
        panel.add(m2);
        panel.add(m3);

        voltar.setBounds(30,600,100,30 );
        voltar.setBackground(Color.white);
        voltar.setForeground(Color.black);
        panel.add(voltar);





        setResizable(false);
        setTitle("Tela Principal");
        setVisible(true);
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);



        panel.setLayout(null);
        panelPrincipalJPanel.setLayout(null);




        painelDireito.setBounds(600,0,600,900);
        panel.setBounds(10,0,600,800);






        panel.setBackground(Color.white);
        painelDireito.setBackground(Color.white);

        /////////////////////// Descriçao  /////////////////////////////
        p1.setBounds(30,0,1000,100);
        p1_content.setBounds(3,27,1000,130);
        p1_content_2.setBounds(130,27,1000,130);

        p2.setBounds(35,100,1000,100);
        p2_content.setBounds(35,120,1000,130);

        p3.setBounds(35,160,1000,130);
        p3_content.setBounds(3,240,1000,160);
        p3_content_2.setBounds(175,240,1000,160);

        painelDireito.add(p1);
        painelDireito.add(p1_content);
        painelDireito.add(p1_content_2);

        painelDireito.add(p2);
        painelDireito.add(p2_content);

        painelDireito.add(p3);
        painelDireito.add(p3_content);
        painelDireito.add(p3_content_2);


        panelPrincipalJPanel.add(painelDireito);
        panelPrincipalJPanel.add(panel);
        add(panelPrincipalJPanel);

        setJMenuBar(barra);
        barra.add(menu1);
        barra.add(menu2);
        menu1.add(item1);
        menu1.add(item2);
        menu2.add(item3);
        menu2.add(item4);

        item4.addActionListener(new

                                        ActionListener() {
                                            @Override
                                            public void actionPerformed (ActionEvent e){
                                                System.exit(0);
                                            }
                                        });
        item1.addActionListener(new

                                        ActionListener() {
                                            @Override
                                            public void actionPerformed (ActionEvent e){
                                                new Tela_ADMIN_Logar();

                                            }
                                        });
        item2.addActionListener(new

                                        ActionListener() {
                                            @Override
                                            public void actionPerformed (ActionEvent e){
                                                new Tela_FUNC_Logar();

                                            }
                                        });
        item3.addActionListener(new

                                        ActionListener() {
                                            @Override
                                            public void actionPerformed (ActionEvent e){
                                                new Tela_Criadores();

                                            }
                                        });



        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m1.setIcon(new ImageIcon(getClass().getResource("Quarto_quar.png")));
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m1.setIcon(new ImageIcon(getClass().getResource("banho_4.jpg")));
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m1.setIcon(new ImageIcon(getClass().getResource("pisci2.jpg")));
            }
        });

        voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tela_Cliente_Select_Quartos_Demo();
            }
        });


    }

    public static void main(String[] args) {
        new Visitantes_3();
    }


}




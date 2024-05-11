/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author steli
 */

public class Tela_Cliente_Select_Quartos_Demo implements ActionListener{
    private JPanel panel =  new JPanel(null);
    private JPanel panel1 =  new JPanel(null);
    private JLabel lblquarto1 = new JLabel("Quarto Padrao");
    private JLabel lblDiscricao1 = new JLabel("<html><p style='text-align: center;'>Vista ao jardim  infantil.Controlo de<br>temperatura no quarto.</p> </html>");

    private ImageIcon imageIcon1 = new ImageIcon(getClass().getResource("qqq.jpg"));
    private JLabel lblImagem1 = new JLabel(imageIcon1);


    private JPanel panel2 =  new JPanel(null);
    private JLabel lblquarto2 = new JLabel("Quarto Twin");

    private JLabel lblDiscricao2 = new JLabel("<html><p style='text-align: center;'>Produtos de Higiene pessoal<br>gratuitos. Ar condicionado.</p></html>");
    private ImageIcon imageIcon2 = new ImageIcon(getClass().getResource("quartoII.jpg"));
    private JLabel lblImagem2 = new JLabel(imageIcon2);
    private JPanel panel3 =  new JPanel(null);
    private JLabel lblquarto3 = new JLabel("Quarto King");
    private JButton btnButton2 = new JButton("Ver detalhes");
    private JButton btnButton3 = new JButton("Ver detalhes");
    private JButton btnButton4 = new JButton("Ver detalhes");
    private JButton btnButton1 = new JButton("Ver detalhes");
    private JLabel lblDiscricao3 = new JLabel("<html> <p style='text-align: center;'>Vista para o mar . Acesso ao Cofre.<br>Canais Premium <br> </p></html>");
    private ImageIcon imageIcon3 = new ImageIcon(getClass().getResource("quartoIII.jpg"));
    private JLabel lblImagem3 = new JLabel(imageIcon3);
    private JPanel panel4 =  new JPanel(null);
    private JLabel lblquarto4 = new JLabel("Quarto Queen");
    private JLabel lblDiscricao4 = new JLabel("<html><p style='text-align: center;'>Localizado 2o Andar, com vista para <br>mar. Acesso a Televisao</p></html>");
    private ImageIcon imageIcon4 = new ImageIcon(getClass().getResource("quarto_4.jpg"));
    private JLabel lblImagem4 = new JLabel(imageIcon4);
    private JButton btnCancelar = new JButton("Cancelar");

    private JLabel lblMenuQuarto  = new JLabel("<html><h1>QUARTOS</h1></html>");
    private JLabel lblDiscri = new JLabel("<html><h1 style='margin-left: 40px;'>MENU</h1></html>");


    Color aqua_0 = new Color(118, 236, 222);
    Color aqua_1 = new Color(32, 134, 133);
    Color aqua_2 = new Color(14, 100, 84);
    Color aqua_3 = new Color(11, 94, 91, 237);
    Color aqua_4 = new Color(4, 68, 65);
    Color aqua_5 = new Color(1, 51, 49);
    Color aqua_0_transp = new Color(219, 227, 227, 255);
    Color aqua_1_transp = new Color(47, 182, 178, 239);
    Color aqua_2_transp = new Color(14, 100, 84, 216);
    Color aqua_3_transp = new Color(9, 82, 79, 237);
    Color aqua_4_transp = new Color(4, 68, 65, 228);
    Color aqua_5_transp = new Color(1, 51, 49, 236);

    Color WhiteSmokee = new Color(187, 227, 227, 255);

    Color fundo = new Color(233, 239, 239, 255);

    Color pasillo = new Color(219, 224, 224, 195);


    public Tela_Cliente_Select_Quartos_Demo(){
        visualizar();
    }
    public void visualizar(){

        lblDiscri.setBackground(aqua_3);
        lblDiscri.setForeground(Color.white);
        lblDiscri.setBounds(0,0,1000,45);
        lblDiscri.setOpaque(true);

        lblMenuQuarto.setBounds(450,20,150,100);
        panel.add(lblMenuQuarto);
        panel.add(lblDiscri);

        Border bordaTracejada = BorderFactory.createDashedBorder(Color.lightGray, 3, 2, 0, true);
        panel1.setBorder(bordaTracejada);
        panel2.setBorder(bordaTracejada);
        panel3.setBorder(bordaTracejada);
        panel4.setBorder(bordaTracejada);
        panel1.setBounds(10,150,240,400);
        panel2.setBounds(255,150,240,400);
        panel3.setBounds(505,150,240,400);
        panel4.setBounds(750,150,240,400);

        lblquarto1.setBounds(80,10,100,35);
        lblDiscricao1.setBounds(20,300,300,35);
        btnButton1.setBounds(45,350,150,35);
        lblImagem1.setBounds(20,50,200,200);
        panel1.add(lblImagem1);
        panel1.add(lblquarto1);
        panel1.add(lblDiscricao1);
        panel1.add(btnButton1);

        lblquarto2.setBounds(80,10,100,35);
        lblDiscricao2.setBounds(20,300,300,35);
        btnButton2.setBounds(45,350,150,35);
        lblImagem2.setBounds(20,50,200,200);
        panel2.add(lblImagem2);
        panel2.add(lblquarto2);
        panel2.add(lblDiscricao2);
        panel2.add(btnButton2);
        lblImagem3.setBounds(20,50,200,200);
        panel3.add(lblImagem3);
        lblquarto3.setBounds(80,10,100,35);
        lblDiscricao3.setBounds(20,300,300,35);
        btnButton3.setBounds(45,350,150,35);
        panel3.add(lblquarto3);
        panel3.add(lblDiscricao3);
        panel3.add(btnButton3);

        lblquarto4.setBounds(80,10,100,35);
        lblDiscricao4.setBounds(20,300,300,35);
        btnButton4.setBounds(45,350,150,35);
        lblImagem4.setBounds(20,50,200,200);
        panel4.add(lblImagem4);
        panel4.add(lblquarto4);
        panel4.add(lblDiscricao4);
        panel4.add(btnButton4);

        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);

        btnCancelar.setBounds(410,600,150,35);

        panel.add(btnCancelar);

        btnCancelar.addActionListener(this);
        Tela_Principal objTela_Principal = new Tela_Principal();
        objTela_Principal.setTitle("Tela seleccao de quartos");
        objTela_Principal.add(panel);

        btnButton1.addActionListener(this);
        btnButton3.addActionListener(this);
        btnButton2.addActionListener(this);
        btnButton4.addActionListener(this);

        ///////////////////////// ESTILOS
        panel.setBackground(aqua_0_transp);
        panel1.setBackground(fundo);
        panel2.setBackground(fundo);
        panel3.setBackground(fundo);
        panel4.setBackground(fundo);

        btnButton1.setBackground(pasillo);


        btnButton2.setBackground(pasillo);


        btnButton3.setBackground(pasillo);


        btnButton4.setBackground(pasillo);


        btnCancelar.setBackground(pasillo);



    }
    public static void main(String[] args) {
        new Tela_Cliente_Select_Quartos_Demo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnCancelar){
            new Tela_Principal();
        }
        if(e.getSource()==btnButton1){
            new Visitantes();

        }
        if(e.getSource()==btnButton2){
            new visitantes1();

        }
        if(e.getSource()==btnButton3){
            new Visitantes_2();

        }
        if(e.getSource()==btnButton4){
            new Visitantes_3();

        }
    }


    private void quarto1() {
        //float preco = 1700f;
        Tela_Cliente_CheckIn  obj =  new Tela_Cliente_CheckIn();
        obj.nomeQuart(lblquarto1.getText(),"2000");
    }
    private void quarto2() {
        //float preco = 1700f;
        Tela_Cliente_CheckIn  obj =  new Tela_Cliente_CheckIn();
        obj.nomeQuart(lblquarto2.getText(),"1800");
    }
    private void quarto3() {
        //float preco = 1700f;
        Tela_Cliente_CheckIn  obj =  new Tela_Cliente_CheckIn();
        obj.nomeQuart(lblquarto3.getText(),"1000");
    }
    private void quarto4() {
        //float preco = 1700f;
        Tela_Cliente_CheckIn  obj =  new Tela_Cliente_CheckIn();
        obj.nomeQuart(lblquarto4.getText(),"500");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;

import DAO.Connection_DAO;
import DAO.Quarto_DAO;
import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author steli
 */

public class Tela_Cliente_Select_Quartos implements ActionListener {
    private JPanel panel = new JPanel(null);
    private JPanel panel1 = new JPanel(null);
    private JLabel lblquarto1 = new JLabel("Quarto Padrao");
    private JLabel lblDiscricao1 = new JLabel("<html><p style='text-align: center;'>Vista ao jardim  infantil.Controlo de<br>temperatura no quarto.</p> </html>");

    private ImageIcon imageIcon1 = new ImageIcon(getClass().getResource("qqq.jpg"));
    private JLabel lblImagem1 = new JLabel(imageIcon1);


    private JPanel panel2 = new JPanel(null);
    private JLabel lblquarto2 = new JLabel("Quarto Twin");

    private JLabel lblDiscricao2 = new JLabel("<html><p style='text-align: center;'>Produtos de Higiene pessoal<br>gratuitos. Ar condicionado.</p></html>");
    private ImageIcon imageIcon2 = new ImageIcon(getClass().getResource("quartoII.jpg"));
    private JLabel lblImagem2 = new JLabel(imageIcon2);
    private JPanel panel3 = new JPanel(null);
    private JLabel lblquarto3 = new JLabel("Quarto King");
    private JButton btnButton2 = new JButton("Solicitar Reserva");
    private JButton btnButton3 = new JButton("Solicitar Reserva");
    private JButton btnButton4 = new JButton("Solicitar Reserva");
    private JButton btnButton1 = new JButton("Solicitar Reserva");
    private JLabel lblDiscricao3 = new JLabel("<html> <p style='text-align: center;'>Vista para o mar . Acesso ao Cofre.<br>Canais Premium <br> </p></html>");
    private ImageIcon imageIcon3 = new ImageIcon(getClass().getResource("quartoIII.jpg"));
    private JLabel lblImagem3 = new JLabel(imageIcon3);
    private JPanel panel4 = new JPanel(null);
    private JLabel lblquarto4 = new JLabel("Quarto Queen");
    private JLabel lblDiscricao4 = new JLabel("<html><p style='text-align: center;'>Localizado 2o Andar, com vista para <br>mar. Acesso a Televisao</p></html>");
    private ImageIcon imageIcon4 = new ImageIcon(getClass().getResource("quarto_4.jpg"));
    private JLabel lblImagem4 = new JLabel(imageIcon4);
    private JButton btnCancelar = new JButton("Cancelar");

    private JLabel lblMenuQuarto = new JLabel("<html><h1>QUARTOS</h1></html>");
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

    ////Apenas para pegar os dados da tela select datas\\\\\\\
    JDateChooser data_entr = new JDateChooser();
    JDateChooser data_sai = new JDateChooser();

    Color verde_2 = new Color(21, 152, 116);
    Color branco = new Color(250, 250, 250, 255);
    Color branco1 = new Color(227, 226, 226, 255);
    Color transparente = new Color(217, 217, 217, 0);
    Font fonteeee  = new Font("sarala", Font.BOLD, 15);
    private JTextField txfNrCrianc = new JTextField();
    private JTextField txfNrAdults = new JTextField();

    JTextField data1 = new JTextField();
    JTextField data2 = new JTextField();
    JDateChooser data_entr1 = new JDateChooser();
    JDateChooser data_sai1 = new JDateChooser();


    public Tela_Cliente_Select_Quartos() {

        visualizar();
    }

    public void visualizar() {

        lblDiscri.setBackground(verde_2);
        lblDiscri.setForeground(Color.white);
        lblDiscri.setBounds(0, 0, 1000, 45);
        lblDiscri.setOpaque(true);

        lblMenuQuarto.setBounds(450, 20, 150, 100);
        panel.add(lblMenuQuarto);
        panel.add(lblDiscri);

        Border bordaTracejada = BorderFactory.createDashedBorder(Color.lightGray, 3, 2, 0, true);
        panel1.setBorder(bordaTracejada);
        panel2.setBorder(bordaTracejada);
        panel3.setBorder(bordaTracejada);
        panel4.setBorder(bordaTracejada);
        panel1.setBounds(10, 150, 240, 400);
        panel2.setBounds(255, 150, 240, 400);
        panel3.setBounds(505, 150, 240, 400);
        panel4.setBounds(750, 150, 240, 400);

        lblquarto1.setBounds(80, 10, 100, 35);
        lblDiscricao1.setBounds(20, 300, 300, 35);
        btnButton1.setBounds(45, 350, 150, 35);
        lblImagem1.setBounds(20, 50, 200, 200);
        panel1.add(lblImagem1);
        panel1.add(lblquarto1);
        panel1.add(lblDiscricao1);
        panel1.add(btnButton1);

        lblquarto2.setBounds(80, 10, 100, 35);
        lblDiscricao2.setBounds(20, 300, 300, 35);
        btnButton2.setBounds(45, 350, 150, 35);
        lblImagem2.setBounds(20, 50, 200, 200);
        panel2.add(lblImagem2);
        panel2.add(lblquarto2);
        panel2.add(lblDiscricao2);
        panel2.add(btnButton2);
        lblImagem3.setBounds(20, 50, 200, 200);
        panel3.add(lblImagem3);
        lblquarto3.setBounds(80, 10, 100, 35);
        lblDiscricao3.setBounds(20, 300, 300, 35);
        btnButton3.setBounds(45, 350, 150, 35);
        panel3.add(lblquarto3);
        panel3.add(lblDiscricao3);
        panel3.add(btnButton3);

        lblquarto4.setBounds(80, 10, 100, 35);
        lblDiscricao4.setBounds(20, 300, 300, 35);
        btnButton4.setBounds(45, 350, 150, 35);
        lblImagem4.setBounds(20, 50, 200, 200);
        panel4.add(lblImagem4);
        panel4.add(lblquarto4);
        panel4.add(lblDiscricao4);
        panel4.add(btnButton4);

        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);

        btnCancelar.setBounds(410, 600, 150, 35);

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

        Tela_Cliente_Select_Quartos obj = new Tela_Cliente_Select_Quartos();
        obj.visualizar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCancelar) {
            new Tela_Cliente_Menu();
        }
        if (e.getSource() == btnButton1) {
            new Tela_Cliente_CheckIn().copiarCampos(txfNrCrianc.getText(), txfNrAdults.getText(), data_entr.getDate(), data_sai.getDate());
            quarto1();

        }
        if (e.getSource() == btnButton2) {
            //  quarto2();
            new Tela_Cliente_CheckIn().copiarCampos(txfNrCrianc.getText(), txfNrAdults.getText(), data_entr.getDate(), data_sai.getDate());
            quarto2();

        }
        if (e.getSource() == btnButton3) {

            new Tela_Cliente_CheckIn().copiarCampos(txfNrCrianc.getText(), txfNrAdults.getText(), data_entr.getDate(), data_sai.getDate());
            quarto3();

        }
        if (e.getSource() == btnButton4) {
            new Tela_Cliente_CheckIn().copiarCampos(txfNrCrianc.getText(), txfNrAdults.getText(), data_entr.getDate(), data_sai.getDate());
            quarto4();

        }
    }

    private void quarto1() {
        //float preco = 1700f;
        Tela_Cliente_CheckIn obj = new Tela_Cliente_CheckIn();
        obj.nomeQuart(lblquarto1.getText(), "2000");
        obj.copiarCampos(txfNrCrianc.getText(), txfNrAdults.getText(), data_entr.getDate(), data_sai.getDate());

    }

    private void quarto2() {
        //float preco = 1700f;
        Tela_Cliente_CheckIn obj = new Tela_Cliente_CheckIn();
        obj.nomeQuart(lblquarto2.getText(), "1800");
        obj.copiarCampos(txfNrCrianc.getText(), txfNrAdults.getText(), data_entr.getDate(), data_sai.getDate());

    }

    private void quarto3() {
        //float preco = 1700f;
        Tela_Cliente_CheckIn obj = new Tela_Cliente_CheckIn();
        obj.nomeQuart(lblquarto3.getText(), "1000");
        obj.copiarCampos(txfNrCrianc.getText(), txfNrAdults.getText(), data_entr.getDate(), data_sai.getDate());

    }

    private void quarto4() {
        //float preco = 1700f;
        Tela_Cliente_CheckIn obj = new Tela_Cliente_CheckIn();
        obj.nomeQuart(lblquarto4.getText(), "500");
        obj.copiarCampos(txfNrCrianc.getText(), txfNrAdults.getText(), data_entr.getDate(), data_sai.getDate());
    }

    ///////////////////////////METODO QUE FAZ OS BUTOES DOS QUARTOS OCUPADOS FICAREM DISABLED
    /////////////O METODO QUE RECEBE AS DATAS É CHAMADO DA CLASSE QUARTO_DAO
    public void copiarCampos(String nrCriancas, String nrAdultos, Date d1, Date d2) {
        txfNrCrianc.setText(nrCriancas);
        txfNrAdults.setText(nrAdultos);
        data_entr.setDate(d1);
        data_sai.setDate(d2);
        data_entr1.setDate(d1);
        data_sai1.setDate(d2);
        /////////////LEVA AS DATAS
        Quarto_DAO obj = new Quarto_DAO();
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
//            if (obj.obterNomeQuartoPorDatas(f.format(data_entr.getDate()), f.format(data_sai.getDate())).equals(lblquarto1.getText())) {
//                btnButton1.setEnabled(false);
//        } else if (obj.obterNomeQuartoPorDatas(f.format(d1.getDate()), f.format(d2.getDate())).equals(lblquarto2.getText())) {
//            btnButton2.setEnabled(false);
//        } else if (obj.obterNomeQuartoPorDatas(f.format(d1.getDate()), f.format(d2.getDate())).equals(lblquarto3.getText())) {
//            btnButton3.setEnabled(false);
//        } else if (obj.obterNomeQuartoPorDatas(f.format(d1.getDate()), f.format(d2.getDate())).equals(lblquarto4.getText())) {
//            btnButton4.setEnabled(false);
//        }
          if (obj.obterNomeQuartoPorDatas(f.format(data_entr.getDate()), f.format(data_sai.getDate())).contains(lblquarto1.getText())) {
            btnButton1.setEnabled(false);
        } if (obj.obterNomeQuartoPorDatas(f.format(data_entr.getDate()), f.format(data_sai.getDate())).contains(lblquarto2.getText())) {
            btnButton2.setEnabled(false);
        } if (obj.obterNomeQuartoPorDatas(f.format(data_entr.getDate()), f.format(data_sai.getDate())).contains(lblquarto3.getText())) {
            btnButton3.setEnabled(false);
        } if (obj.obterNomeQuartoPorDatas(f.format(data_entr.getDate()), f.format(data_sai.getDate())).contains(lblquarto4.getText())) {
            btnButton4.setEnabled(false);
        }
 }

   }











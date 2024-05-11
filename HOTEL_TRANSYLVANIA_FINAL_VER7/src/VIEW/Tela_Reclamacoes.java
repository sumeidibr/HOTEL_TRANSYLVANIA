package VIEW;

import DAO.Pessoa_Cliente_DAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tela_Reclamacoes {
    Tela_Principal obj =  new Tela_Principal();
    JTextArea jTextArea = new JTextArea();
    Dimension preferredSize = new Dimension(300, 200);
    JPanel panel = new JPanel(null);
    JLabel lbltexto = new JLabel("Digite aqui sua reclamação:");
    JLabel lblEmail = new JLabel("Email:");


    JTextField txfEmail = new JTextField();
    JPanel ladoDireito = new JPanel ();
    JLabel cima = new JLabel("<html><h1 style='margin-left: 30px;'>RECLAME AQUI</h1></html>");
    ImageIcon image = new ImageIcon(getClass().getResource("blogger.png"));
    JLabel lblimagem = new JLabel(image);
    JButton btnConfirmar = new JButton("Enviar");
    JButton btnCancelar = new JButton("Cancelar");

    Color verde_2 = new Color(21, 152, 116);
    Color branco = new Color(250, 250, 250, 255);
    Color branco1 = new Color(222, 221, 221, 255);
    Color transparente = new Color(217, 217, 217, 0);
    Font fonteeee  = new Font("sarala", Font.BOLD, 15);

    ImageIcon imagem = new ImageIcon(getClass().getResource("logo Branco.png"));
    JLabel lblLogo = new JLabel(imagem);
    public Tela_Reclamacoes(){

        txfEmail.setBorder(null);

        lblimagem.setBounds(480,10,300,300);
        lblLogo.setBounds(480,50,300,300);
        ladoDireito.add(lblLogo);
       // panel.add(lblimagem);

        lblEmail.setBounds(50,135,80,30);
        txfEmail.setBounds(100,135,300,35);
        ladoDireito.setBounds(700,0,300,700);
        cima.setBounds(0,0,700,40);
        cima.setOpaque(true);
        ladoDireito.setBackground(verde_2);
        cima.setBackground(verde_2);
        ladoDireito.setOpaque(true);
        panel.add(ladoDireito);
        panel.add(cima);
        jTextArea.setBounds(50,200,400,300);
        lbltexto.setBounds(50,180,200,20);
        btnConfirmar.setBounds(350,530,100,35);
        btnCancelar.setBounds(220,530,100,35);


        panel.setBackground(Color.white);
        lblEmail.setFont(fonteeee);
        lbltexto.setFont(fonteeee);
        cima.setForeground(Color.white);
        txfEmail.setBackground(branco1);
        jTextArea.setBackground(branco1);
        btnConfirmar.setBackground(verde_2);
        btnConfirmar.setForeground(Color.white);
        btnCancelar.setBackground(verde_2);
        btnCancelar.setForeground(Color.white);

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tela_Principal();
            }
        });
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txfEmail.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo email vazio");
                    txfEmail.requestFocus();
                }else if (!validarEmail(txfEmail.getText())) {
                    JOptionPane.showMessageDialog(null, "Email inválido");
                    txfEmail.requestFocus();
                }else if(jTextArea.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Campo de reclamacao vazio");
                    jTextArea.requestFocus();
                }else
                    new Pessoa_Cliente_DAO().mailReclamacoa(txfEmail.getText(), jTextArea.getText());
            }
        });

        panel.add(btnConfirmar);
        panel.add(btnCancelar);
        panel.add(lbltexto);
        jTextArea.setBackground(branco1);
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
        jTextArea.setPreferredSize(preferredSize);
        panel.add(lblEmail);
        panel.add(txfEmail);
        panel.add(jTextArea);
        obj.add(panel);
    }
    public static void main(String[] args) {
        new Tela_Reclamacoes();
    }
    public static boolean validarEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
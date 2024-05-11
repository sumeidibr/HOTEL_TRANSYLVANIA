/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;

import DAO.Pessoa_Cliente_DAO;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author steli
 */
public class Tela_Recuperar_Password implements ActionListener{

    ImageIcon imagem = new ImageIcon(getClass().getResource("logo Branco.png"));
    JLabel label = new JLabel(imagem);
    JLabel lblImagem = new JLabel("<html> <h1>TELA RECUPERAR PASSWORD CLIENTE<</h1></html>");
    ImageIcon icone = new ImageIcon(getClass().getResource("lock.png"));
    ImageIcon icone1 = new ImageIcon(getClass().getResource("utilizador.png"));
    ImageIcon icone2 = new ImageIcon(getClass().getResource("envelope.png"));
    JLabel lblImagem1 = new JLabel(icone);
    private JPanel panel = new JPanel(null);
    private JButton btnEnviar = new JButton("Enviar");
    private JButton btnButton1 = new JButton("Cancelar");
    private JLabel lblNome = new JLabel(icone1);
    private JTextField txfNome = new JTextField();
    private JLabel lblEmail = new JLabel(icone2);
    private JTextField txfEmail = new JTextField();

    JPanel pintarlado = new JPanel();

    public Tela_Recuperar_Password(){
        visualizar();
    }
    public void visualizar(){
        lblImagem.setBounds(0,0,600,40);
        lblImagem.setBackground(new Color(92,141,137));
        lblImagem.setOpaque(true);

        lblImagem1.setBounds(310,100,300,100);
        panel.add(lblImagem);
        panel.add(lblImagem1);
        pintarlado.setBounds(600,0,400,700);
        pintarlado.setBackground(new Color(92,141,137));
        pintarlado.setOpaque(true);
        panel.add(pintarlado);
        lblNome.setBounds(130,220,70,25);
        txfNome.setBounds(220,220,300,25);
        panel.add(lblNome);
        panel.add(txfNome);
        lblEmail.setBounds(130,255,70,25);
        txfEmail.setBounds(220,255,300,25);
        panel.add(lblEmail);
        panel.add(txfEmail);

        btnEnviar.setBounds(429,300,90,25);
        btnButton1.setBounds(329,300,90,25);
        panel.add(btnEnviar);
        panel.add(btnButton1);
        panel.setBackground(Color.WHITE);
        Tela_Principal objTela_Principal = new Tela_Principal();
        objTela_Principal.setTitle("Tela Recuperar Password");

        objTela_Principal.add(panel);
        btnButton1.addActionListener(this);
        btnEnviar.addActionListener(this);


        label.setBounds(250,250,200,200);

        pintarlado.add(label);
    }

    public static void main(String[] args) {
        new Tela_Recuperar_Password();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnButton1);{
            new Tela_Principal();}
        if (e.getSource()==btnEnviar){
            new Pessoa_Cliente_DAO().recuperarSenha(txfEmail.getText());
        }

    }
}

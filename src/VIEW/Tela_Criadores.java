package VIEW;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_Criadores {
    Tela_Principal obj =  new Tela_Principal();
    ImageIcon teste = new ImageIcon(getClass().getResource("setting.png"));
    JLabel lblImage = new JLabel(teste);
    JPanel panel = new JPanel(null);
    JLabel lbl1 = new JLabel("Seja bem-vindo ao nosso Projecto de Gestão Hoteleira!");
    JLabel lbl2 = new JLabel("É uma honra ter você como nosso hóspede e estamos ansiosos para proporcionar a você uma");
    JLabel lbl3 = new JLabel("estadia agradável e confortável. Estamos aqui para garantir que você tenha tudo o que precisa");

    JLabel lbl4 = new JLabel("durante sua estadia, desde acomodações confortáveis até serviços excepcionais.");
    JLabel lbl5 = new JLabel("Se você precisar de algo ou tiver alguma dúvida, não hesite em entrar em contato com nossa equipe");
    JLabel lbl6 = new JLabel("que estará à disposição para ajudá-lo em todos os momentos. Esperamos que você");
    JLabel lbl7 = new JLabel("desfrute de sua estadia e que saia daqui com ótimas lembranças. Obrigado por escolher nosso hotel!");
    JButton btnVoltar = new JButton("Voltar");
    public Tela_Criadores(){
        visualizar();
    }
    public void visualizar(){
        lblImage.setBounds(580,100,450,150);
        lbl1.setBounds(300,250,520,30);
        lbl2.setBounds(300,280,540,30);
        lbl3.setBounds(300,310,540,30);
        lbl4.setBounds(300,340,540,30);
        lbl5.setBounds(300,370,580,30);
        lbl6.setBounds(300,400,540,30);
        lbl7.setBounds(300,430,580,30);
        btnVoltar.setBounds(500,480,200,30);
        panel.add(btnVoltar);
        panel.add(lblImage);
        panel.add(lbl1);
        panel.add(lbl2);
        panel.add(lbl3);
        panel.add(lbl4);
        panel.add(lbl5);
        panel.add(lbl6);
        panel.add(lbl7);
        obj.add(panel);

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tela_Principal();
            }
        });

    }

    public static void main(String[] args) {
        new Tela_Criadores();
    }
}

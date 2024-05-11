package VIEW;

import com.mysql.cj.protocol.a.TextResultsetReader;

import javax.swing.*;

public class GifTelaPrinc extends JFrame{
    ImageIcon iconeIncio = new ImageIcon(getClass().getResource("hotelllt.gif"));
    JPanel telaAddGif = new JPanel(null);
    JLabel imagem = new JLabel(iconeIncio);
    public GifTelaPrinc(){
        Visu();
    }
    public void Visu() {
        setLocationRelativeTo(null);
        telaAddGif.setBounds(0, 0, 500, 400);
        setLayout(null);
        setSize(500,400);
        setVisible(true);
        imagem.setBounds(0,0,500,400);
        telaAddGif.add(imagem);
        add(telaAddGif);
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dispose();
        new Tela_Principal();
    }

    public static void main(String[] args) {
        new GifTelaPrinc();

    }


}

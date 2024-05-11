/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class  Tela_Cliente_Reserva implements ActionListener{
    private JPanel panel =  new JPanel();
    private JButton btnButton = new JButton("Efetuar reserva e Voltar ao menu Usuario");
    private JButton btnButton1 = new JButton("Cancelar");
    
    public Tela_Cliente_Reserva(){
        visualizar();
    }
    public void visualizar(){
    panel.add(btnButton);
    panel.add(btnButton1);
    btnButton.addActionListener(this);
    btnButton1.addActionListener(this);
    Tela_Principal objTela_Principal = new Tela_Principal();
    objTela_Principal.setTitle("Tela de Efetuar Resrva");
    objTela_Principal.add(panel);
    
    }
    public static void main(String[] args) {
          new  Tela_Cliente_CheckIn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== btnButton){
       new Tela_Cliente_Menu();
       }
        if(e.getSource()== btnButton1){
        new Tela_Cliente_CheckIn();
       }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

//
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author steli
 */
public class Tela_Cadastro implements ActionListener {
    private JPanel panel = new JPanel(null);
    private JButton btnVoltar = new JButton("Cancelar");
    private JButton btnConfirmar = new JButton("Continuar");
    private JLabel lblnome = new JLabel("Nome: ");
    private JTextField txfNome = new JTextField();
    private JLabel lblApelido = new JLabel("Apelido: ");
    private JTextField txfApelido = new JTextField();
    private JLabel lblDataNasc = new JLabel("<html>Data Nascimento</html>");
    private JDateChooser jDateChooserdata = new JDateChooser();
    private JLabel lblSexo = new JLabel("Sexo: ");
    JRadioButton masculino = new JRadioButton("Masculino");
    JRadioButton feminino = new JRadioButton("Feminino");
    JRadioButton outro = new JRadioButton("Outro");
    ButtonGroup grupo = new ButtonGroup();
    private JLabel lblnNacionalidade = new JLabel("Nacionalidade: ");
    private JComboBox cbxNacionalidades = new JComboBox<>();
    private JLabel lblTelefone = new JLabel("Telefone:");
    private JTextField txfTelefone = new JTextField();
    private JLabel lblEmail = new JLabel("E-mail:");
    private JTextField txfEmail = new JTextField();
    private JLabel lblBi = new JLabel("BI:");
    private JTextField txfBI = new JTextField();
    private JLabel lblEndereco = new JLabel("Endereço:");
    private JTextField txfEndereco = new JTextField();
    private JLabel lblPassword = new JLabel("Password:");
    private JPasswordField txfPassword = new JPasswordField();
    private String VariavelQueRecebeNacionalidade;
    private JPanel pintarLaterar = new JPanel();
    private JLabel pintarSuperior = new JLabel("<html><h1 style='margin-left: 30px;'>CADASTRO </h1></html>");

    ImageIcon imagem = new ImageIcon(getClass().getResource("logo Branco.png"));
    JLabel label = new JLabel(imagem);

    Color aqua_0 = new Color(118, 236, 222);
    Color aqua_1 = new Color(28, 133, 131);
    Color aqua_2 = new Color(14, 100, 84);
    Color aqua_3 = new Color(12, 87, 83, 237);
    Color aqua_4 = new Color(9, 84, 81);
    Color aqua_5 = new Color(1, 51, 49);

    Color verde_0 = new Color(115, 227, 188);
    Color verde_1 = new Color(52, 210, 156);

    Color verde_3 = new Color(17, 115, 82);
    Color verde_4 = new Color(10, 110, 76);


    Color verde_2 = new Color(21, 152, 116);
    Color branco = new Color(250, 250, 250, 255);
    Color branco1 = new Color(227, 226, 226, 255);
    Color transparente = new Color(217, 217, 217, 0);
    Font fonteeee  = new Font("sarala", Font.BOLD, 15);
    Color WhiteSmokee = new Color(205, 232, 232, 255);

    Color fundo = new Color(210, 232, 232, 255);

    Color pasillo = new Color(219, 224, 224, 195);

    Font fonte = new Font("sarala", Font.HANGING_BASELINE, 18);

    public void adicionarNacionalidades() {
        cbxNacionalidades.addItem("Africa do SUl");
        cbxNacionalidades.addItem("Nigeria");
        cbxNacionalidades.addItem("EUA");
        cbxNacionalidades.addItem("Brazil");
        cbxNacionalidades.addItem("Moçambique");
        cbxNacionalidades.addItem("Angola");
        cbxNacionalidades.addItem("EUA");
        cbxNacionalidades.addItem("Africa do SUl");
        //Colocar selecionado logo que abrir a tela
        cbxNacionalidades.setSelectedItem("Moçambique");
    }

    public Tela_Cadastro() {
        //    txfNome.setBorder(null);
        pintarLaterar.setBounds(700, 0, 300, 700);
        pintarSuperior.setBounds(0, 0, 700, 45);
        pintarLaterar.setBackground(Color.gray);
        pintarSuperior.setOpaque(true);

        pintarLaterar.setOpaque(true);
        panel.add(pintarLaterar);
        panel.add(pintarSuperior);


        lblnome.setBounds(130, 80, 350, 30);
        txfNome.setBounds(320, 80, 300, 30);
        panel.add(txfNome);
        panel.add(lblnome);
        lblApelido.setBounds(130, 115, 370, 25);
        txfApelido.setBounds(320, 115, 300, 30);
        panel.add(lblApelido);
        panel.add(txfApelido);
        lblDataNasc.setBounds(130, 145, 370, 35);
        jDateChooserdata.setBounds(320, 150, 300, 30);
        panel.add(lblDataNasc);
        panel.add(jDateChooserdata);
        lblSexo.setBounds(130, 185, 370, 30);
        masculino.setBounds(320, 185, 100, 30);
        feminino.setBounds(445, 185, 90, 30);
        outro.setBounds(542, 185, 78, 30);
        masculino.setBackground(Color.WHITE);
        feminino.setBackground(Color.white);
        outro.setBackground(Color.white);
        panel.add(masculino);
        panel.add(feminino);
        panel.add(outro);
        panel.add(lblSexo);
        lblTelefone.setBounds(130, 220, 370, 25);
        txfTelefone.setBounds(320, 220, 300, 30);

        ///mod
        lblnNacionalidade.setBounds(130, 255, 370, 25);
        cbxNacionalidades.setBounds(320, 255, 300, 30);
        panel.add(lblnNacionalidade);
        panel.add(cbxNacionalidades);

        panel.add(lblTelefone);
        panel.add(txfTelefone);

        lblEmail.setBounds(130, 290, 370, 25);
        txfEmail.setBounds(320, 290, 300, 30);
        panel.add(lblEmail);
        panel.add(txfEmail);
        lblBi.setBounds(130, 325, 100, 25);
        txfBI.setBounds(320, 325, 300, 30);
        panel.add(lblBi);
        panel.add(txfBI);
        lblEndereco.setBounds(130, 360, 370, 25);
        txfEndereco.setBounds(320, 360, 300, 30);
        panel.add(lblEndereco);
        panel.add(txfEndereco);
        lblPassword.setBounds(130, 395, 370, 25);
        txfPassword.setBounds(320, 395, 300, 30);
        panel.add(lblPassword);
        panel.add(txfPassword);
        btnVoltar.setBounds(415, 450, 100, 35);
        btnConfirmar.setBounds(530, 450, 100, 35);

        panel.add(btnVoltar);
        panel.add(btnConfirmar);
        panel.setBackground(Color.WHITE);
        Tela_Principal objTela_Principal = new Tela_Principal();
        objTela_Principal.setTitle("Tela cadastro");
        objTela_Principal.add(panel);

        grupo.add(masculino);
        grupo.add(feminino);
        grupo.add(outro);
        //add nac
        adicionarNacionalidades();

        cbxNacionalidades.addActionListener(this);
        btnVoltar.addActionListener(this);
        btnConfirmar.addActionListener(this);

        ////////////// ESTILO /////////////////////
        pintarSuperior.setBackground(verde_2);
        pintarSuperior.setForeground(Color.white);
        pintarLaterar.setBackground(verde_2);
        panel.setBackground(fundo);
        btnConfirmar.setBackground(verde_2);
        btnConfirmar.setForeground(Color.white);
        btnVoltar.setBackground(verde_2);
        btnVoltar.setForeground(Color.white);

        btnConfirmar.setFont(fonteeee);
        btnVoltar.setFont(fonteeee);

        lblnNacionalidade.setFont(fonte);
        lblPassword.setFont(fonte);
        lblApelido.setFont(fonte);
        lblBi.setFont(fonte);
        lblnome.setFont(fonte);
        lblEmail.setFont(fonte);
        lblDataNasc.setFont(fonte);
        lblSexo.setFont(fonte);
        lblEndereco.setFont(fonte);
        lblTelefone.setFont(fonte);

        label.setBounds(750, 200, 200, 200);
        pintarLaterar.add(label);


        Calendar minDate = Calendar.getInstance();
        minDate.set(Calendar.YEAR, 1975);
        minDate.set(Calendar.MONTH, Calendar.JANUARY);
        minDate.set(Calendar.DAY_OF_MONTH, 1);
        jDateChooserdata.setMinSelectableDate(minDate.getTime());


        Calendar maxDate = Calendar.getInstance();
        maxDate.set(Calendar.YEAR, 2005);
        maxDate.set(Calendar.MONTH, Calendar.DECEMBER);
        maxDate.set(Calendar.DAY_OF_MONTH, 31);
        jDateChooserdata.setMaxSelectableDate(maxDate.getTime());


        Calendar initialDate = Calendar.getInstance();
        initialDate.set(Calendar.YEAR, 1999);
        initialDate.set(Calendar.MONTH, Calendar.JANUARY);
        initialDate.set(Calendar.DAY_OF_MONTH, 1);
        jDateChooserdata.setDate(initialDate.getTime());
    }

    public static void main(String[] args) {
        new Tela_Cadastro();
    }

    String sexo = "";
    String nacionalidade = "";

    @Override
    public void actionPerformed(ActionEvent e) {
        //pegar da combo box nacionalidade
        if (e.getSource() == cbxNacionalidades) {
            nacionalidade = (String) cbxNacionalidades.getSelectedItem();
        }

        if (e.getSource() == btnVoltar) {
            new Tela_Principal();

        }
        if (e.getSource() == btnConfirmar) {
            char[] tamanhopass = txfPassword.getPassword();

            if (txfNome.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo de nome vazio");
                txfNome.requestFocus();
            } else if (!txfNome.getText().matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "O campo de nome deve conter apenas letras");
                txfNome.requestFocus();
            } else if (txfEndereco.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo de endereço vazio");
                txfEndereco.requestFocus();
            } else if (jDateChooserdata.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Campo de data vazio");
            } else if (txfTelefone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo telefone vazio");
                txfTelefone.requestFocus();
            } else if (!txfTelefone.getText().matches("\\d+")) { //verificar se so tem numeros
                JOptionPane.showMessageDialog(null, "Campo de celular so pode conter digitos");
                txfTelefone.requestFocus();//tamanho do numero
            } else if ((txfTelefone.getText().length() != 9)) {
                JOptionPane.showMessageDialog(null, "Um numero so pode ter 9 digitos");
                txfTelefone.requestFocus();
            } else if (validarIniciasCell(txfTelefone.getText())) {
                JOptionPane.showMessageDialog(null, "Iniciais de número inválidas");
                txfTelefone.requestFocus();
            } else if (tamanhopass.length < 4) {
                JOptionPane.showMessageDialog(null, "Senha deve conter no minimo 4 Digitos");
                txfPassword.requestFocus();
            } else if (grupo.getSelection() == null) {
                JOptionPane.showMessageDialog(null, "Selecione o sexo");
            } else if (!validarEmail(txfEmail.getText())) {
                JOptionPane.showMessageDialog(null, "Email inválido");
                txfEmail.requestFocus();
            } else if (txfEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo email vazio");
                txfEmail.requestFocus();
            } else if (txfBI.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo BI vazio");
                txfBI.requestFocus();
            } else if (!txfBI.getText().matches("\\d{12}[A-Za-z]")) {
                JOptionPane.showMessageDialog(null, "Formato de BI inválido");
                txfBI.requestFocus();
            } else if (txfApelido.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo apelido vazio");
                txfApelido.requestFocus();
            } else if (!txfApelido.getText().matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "O campo de Apelido deve conter apenas letras");
                txfApelido.requestFocus();
            } else {
                if (masculino.isSelected()) {
                    sexo = "Masculino";
                } else if (feminino.isSelected()) {
                    sexo = "Feminino";
                } else if (outro.isSelected()) {
                    sexo = "Outro";
                }

                String nome = txfNome.getText();
                String apelido = txfApelido.getText();
                Date data = jDateChooserdata.getDate();
                String telefone = txfTelefone.getText();
                nacionalidade = (String) cbxNacionalidades.getSelectedItem();
                String email = txfEmail.getText();
                String bi = txfBI.getText();
                String endereco = txfEndereco.getText();
                String password = txfPassword.getText();

                Tela_Cadastro_Confirmacao obj = new Tela_Cadastro_Confirmacao();
                obj.copiarTextoDasTextField(nome, apelido, data, sexo, telefone, nacionalidade, email, bi, endereco, password);
            }
        }

    }

    public static boolean validarEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean validarIniciasCell(String telefone) {
        char primeiraInicial = telefone.charAt(0);
        char segundaInicial = telefone.charAt(1);

        return !(primeiraInicial == '8' && ((segundaInicial == '2') || (segundaInicial == '4') || (segundaInicial == '6') || segundaInicial == '7') || (segundaInicial == '5'));
    }

}

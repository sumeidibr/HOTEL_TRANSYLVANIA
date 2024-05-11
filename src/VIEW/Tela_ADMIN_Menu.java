/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template**/

package VIEW;

import DAO.Pessoa_Funcionario_DAO;
import DTO.Pessoa;
import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author steli
 */
public class Tela_ADMIN_Menu implements ActionListener {

    JPanel panel1 = new JPanel(null);
    JLayeredPane panel2 = new JLayeredPane();

    JPanel paneCadastarFunc = new JPanel();
    JPanel paneStatusFunc = new JPanel();
    JPanel paneRelatorios = new JPanel();
    JLabel lbl1 = new JLabel("LAYER 1");
    // JLabel lbl2 = new JLabel("LAYER 2");
    // JLabel lbl3 = new JLabel("LAYER 3");
    // JLabel lbl4 = new JLabel("LAYER 4");
    JLabel lbl5 = new JLabel("LAYER 5");


    private JLabel lblDiscri = new JLabel("<html><h1 style='margin-left: 30px;'>ADMIN MENU</h1></html>");
    private JTextField yass = new JTextField("PARTE DE FAZER RESERVA");
    private JTextField yass1 = new JTextField("PARTE DE FAZER ESTADO DA RESERVA");
    private JTextField yass2 = new JTextField("PARTE DE FAZER ATUALIZAR RESERVA");

    //registrar Funcionario
    private JButton btnButton = new JButton("Cancelar");
    private JButton btnConfirmar = new JButton("Continuar");

    private JLabel lblnome = new JLabel("Nome ");
    private JTextField txfNome = new JTextField();
    private JLabel lblApelido = new JLabel("Apelido ");
    private JTextField txfApelido = new JTextField();
    private JLabel lblDataNasc = new JLabel("<html>Date de Nascimento</html>");
    private JDateChooser jDateChooserdata = new JDateChooser();
    private JLabel lblSexo = new JLabel("Sexo ");
    JRadioButton masculino = new JRadioButton("Masculino");
    JRadioButton feminino = new JRadioButton("Feminino");
    JRadioButton outro = new JRadioButton("Outro");
    ButtonGroup grupo = new ButtonGroup();
    private JLabel lblnNacionalidade = new JLabel("Nacionalidade: ");
    private JComboBox cbxNacionalidades = new JComboBox<>();
    private JLabel lblTelefone = new JLabel("Telefone");
    private JTextField txfTelefone = new JTextField();
    private JLabel lblEmail = new JLabel("E-mail");
    private JTextField txfEmail = new JTextField();
    private JLabel lblBi = new JLabel("Bilhete de ID");
    private JTextField txfBI = new JTextField();
    private JLabel lblEndereco = new JLabel("Endereço");
    private JTextField txfEndereco = new JTextField();
    private JLabel lblPassword = new JLabel("Password");
    private JPasswordField txfPassword = new JPasswordField();

    //setSize(1000,700);

    private JButton btnCadastrarFunci = new JButton("Cadastrar Funcionario");
    private JButton btnVoltar = new JButton("Voltar");

    private JButton btnMudarStatusFunc = new JButton("Mudar estado Funcionario");
    private JButton btnRelatorio = new JButton("Relatorios");

    //paneil de entrada permuta
//    private JLabel lblNome = new JLabel("Nome");
//    private JLabel lblApelido = new JLabel("Apelido");
//    private JLabel lblEmail = new JLabel("E-mail");
//    private JTextField txfNome = new JTextField();
//    private JTextField txfApelido = new JTextField();
//    private JTextField txfEmail = new JTextField();
//    private ImageIcon teste = new ImageIcon(getClass().getResource("images.png"));
//    private JLabel lblImage = new JLabel(teste);
    //parte relatorios


    Color aqua_5 = new Color(1, 51, 49);
    Font fonte = new Font("sarala", Font.HANGING_BASELINE, 18);
    Color aqua_0 = new Color(118, 236, 222);
    Color aqua_1 = new Color(33, 150, 146);
    Color aqua_2 = new Color(14, 100, 84);
    Color aqua_3 = new Color(9, 82, 79, 237);
    Color aqua_4 = new Color(4, 68, 65);
    private JButton btnButton5 = new JButton("Relatorio Ocupacao Quarto");


    private JButton btnButton6 = new JButton("Relatorio Ocupacao por Origem");
    Color aqua_6 = new Color(0, 47, 45);
    Color fundo = new Color(210, 232, 232, 255);
    ////////////////////////BUTÃ•ES DE MUDAR STATUS DO FUNCIONARIO//////////////////////////////////////
    JButton carregarFunc = new JButton("CARREGAR");
    JTextField txdData = new JTextField();
    JTextField txfSexo = new JTextField();

    JTable TabelaFuncionario;
    JScrollPane barra;
    JTextField txtid;

    JLabel actFunc = new JLabel("Deseja activar o funcionario?");
    JRadioButton sim = new JRadioButton("SIM");
    JRadioButton nao = new JRadioButton("NÃO");
    ButtonGroup grupo1 = new ButtonGroup();
    ButtonGroup grupo2 = new ButtonGroup();
    private JLabel lbNac = new JLabel("Nacionalidade");
    private JTextField txfNac = new JTextField();
    JButton btnAtualizar = new JButton("ATUALIZAR");
    SimpleDateFormat data;


    Color WhiteSmokee = new Color(205, 232, 232, 255);


    Color pasillo = new Color(219, 224, 224, 195);

    Font fontee = new Font("sarala", Font.HANGING_BASELINE, 16);


    Border bordaTracejada = BorderFactory.createDashedBorder(aqua_0, 1, 1, 0, true);
    Color cinza = new Color(136, 141, 141, 255);
    Font fonteee = new Font("sarala", Font.ITALIC, 14);


    ///////////// Acréscimo ///////////

    public Tela_ADMIN_Menu() {
        visualizar();
    }

    public void visualizar() {
        lbl1.setOpaque(true);
        lbl1.setBounds(400, 100, 100, 30);

//        lbl2.setOpaque(true);
//        lbl2.setBounds(400, 100, 100, 30);

        //    lbl3.setOpaque(true);
        //    lbl3.setBounds(400, 100, 100, 30);

        //Parte de Cima
        lblDiscri.setBackground(aqua_3);
        lblDiscri.setForeground(Color.white);
        lblDiscri.setBounds(0, 0, 1000, 45);
        lblDiscri.setOpaque(true);

        panel1.setBounds(0, 45, 200, 655);
        panel1.setBackground(aqua_1);

        panel2.setBounds(200, 45, 800, 655);
        panel2.setBackground(Color.pink);
        //panel2.add(lbl1);
        panel2.setLayout(null);
        //panel direito primeira aparicao
//        lblNome.setBounds(400,300,50,30);
//        txfNome.setBounds(500,300,300,25);
//        lblApelido.setBounds(400,330,70,25);
//        txfApelido.setBounds(500,330,300,25);
//        lblEmail.setBounds(400,360,70,25);
//        txfEmail.setBounds(500,360,300,25);
//        lblImage.setBounds(580,100,150,150);
//        txfNome.setEnabled(false);
//        txfEmail.setEnabled(false);
//        txfApelido.setEnabled(false);
//        panel2.add(lblImage);
//        panel2.add(lblNome);
//        panel2.add(lblEmail);
//        panel2.add(txfNome);
//        panel2.add(txfEmail);
//        panel2.add(lblApelido);
//        panel2.add(txfApelido);


        paneCadastarFunc.setLayout(null);
        paneCadastarFunc.setBounds(200, 45, 800, 655);
        paneCadastarFunc.setBackground(Color.pink);
//        paneCadastarFunc.add(lbl2);


        paneRelatorios.setBounds(200, 45, 800, 655);
        paneRelatorios.setBackground(Color.white);
        //    paneRelatorios.add(lbl3);

        btnButton5.setFont(fonte);
        btnButton6.setFont(fonte);

        paneRelatorios.add(btnButton5);
        paneRelatorios.add(btnButton6);
        paneRelatorios.add(btnVoltar);


        btnButton5.addActionListener(this);
        btnButton6.addActionListener(this);
        btnVoltar.addActionListener(this);

        paneStatusFunc.setBounds(200, 45, 800, 655);
        paneStatusFunc.setBackground(Color.yellow);

        btnCadastrarFunci.setBackground(aqua_3);
        btnCadastrarFunci.setForeground(Color.white);
        btnCadastrarFunci.setBounds(20, 50, 150, 35);
        panel1.add(btnCadastrarFunci);

        btnMudarStatusFunc.setBackground(aqua_3);
        btnMudarStatusFunc.setForeground(Color.white);
        btnMudarStatusFunc.setBounds(20, 120, 150, 35);
        panel1.add(btnMudarStatusFunc);

        btnRelatorio.setBackground(aqua_3);
        btnRelatorio.setForeground(Color.white);
        btnRelatorio.setBounds(20, 200, 150, 35);
        panel1.add(btnRelatorio);

        btnVoltar.setForeground(Color.white);
        btnVoltar.setBackground(aqua_3);
        btnVoltar.setBounds(20, 270, 150, 35);
        panel1.add(btnVoltar);
        btnCadastrarFunci.addActionListener(this);
        btnMudarStatusFunc.addActionListener(this);
        btnRelatorio.addActionListener(this);
        btnVoltar.addActionListener(this);
        Tela_Principal objTela_Principal = new Tela_Principal();
        objTela_Principal.setTitle("Tela Cliente Menu");
        objTela_Principal.add(lblDiscri);
        objTela_Principal.add(panel1);
        objTela_Principal.add(panel2);
    }

    public static void main(String[] args) {
        new Tela_ADMIN_Menu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCadastrarFunci) {
            panel2.removeAll();
            lblnome.setBounds(110, 80, 350, 30);
            txfNome.setBounds(280, 80, 300, 30);
            paneCadastarFunc.add(txfNome);
            paneCadastarFunc.add(lblnome);
            lblApelido.setBounds(110, 115, 370, 25);
            txfApelido.setBounds(280, 115, 300, 30);
            paneCadastarFunc.add(lblApelido);
            paneCadastarFunc.add(txfApelido);
            lblDataNasc.setBounds(110, 145, 370, 35);
            jDateChooserdata.setBounds(280, 150, 300, 30);
            paneCadastarFunc.add(lblDataNasc);
            paneCadastarFunc.add(jDateChooserdata);
            lblSexo.setBounds(110, 185, 370, 30);
            masculino.setBounds(280, 185, 100, 30);
            feminino.setBounds(400, 185, 90, 30);
            outro.setBounds(507, 185, 78, 30);
            masculino.setBackground(Color.WHITE);
            feminino.setBackground(Color.white);
            outro.setBackground(Color.white);
            paneCadastarFunc.add(masculino);
            paneCadastarFunc.add(feminino);
            paneCadastarFunc.add(outro);
            paneCadastarFunc.add(lblSexo);
            lblTelefone.setBounds(110, 220, 370, 25);
            txfTelefone.setBounds(280, 220, 300, 30);
            paneCadastarFunc.add(lblTelefone);
            paneCadastarFunc.add(txfTelefone);
            lblEmail.setBounds(110, 255, 370, 25);
            txfEmail.setBounds(280, 255, 300, 30);
            paneCadastarFunc.add(lblEmail);
            paneCadastarFunc.add(txfEmail);
            lblBi.setBounds(110, 290, 370, 25);
            txfBI.setBounds(280, 290, 300, 30);
            paneCadastarFunc.add(lblBi);
            paneCadastarFunc.add(txfBI);
            lblEndereco.setBounds(110, 325, 370, 25);
            txfEndereco.setBounds(280, 325, 300, 30);
            paneCadastarFunc.add(lblEndereco);
            paneCadastarFunc.add(txfEndereco);
            lblPassword.setBounds(110, 360, 370, 25);
            txfPassword.setBounds(280, 360, 300, 30);
            paneCadastarFunc.add(lblPassword);
            paneCadastarFunc.add(txfPassword);
            btnButton.setBounds(315, 400, 90, 25);
            btnConfirmar.setBounds(280, 460, 130, 30);
            btnConfirmar.setBackground(Color.white);
            btnConfirmar.setForeground(aqua_5);
            lblnNacionalidade.setBounds(110, 400, 370, 25);
            cbxNacionalidades.setBounds(280, 400, 300, 30);
            paneCadastarFunc.add(lblnNacionalidade);
            paneCadastarFunc.add(cbxNacionalidades);

            //add nac
            adicionarNacionalidades();

            //paneCadastarFunc.add(btnButton);
            paneCadastarFunc.add(btnConfirmar);
            paneCadastarFunc.setBackground(fundo);
            panel2.add(paneCadastarFunc);
            grupo.add(masculino);
            grupo.add(feminino);
            grupo.add(outro);
            // btnButton.addActionListener(this);

            panel2.validate();
            panel2.revalidate();
            btnConfirmar.addActionListener(this);

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
        }

        if (e.getSource() == btnMudarStatusFunc) {
            panel2.removeAll();

            panel2.add(paneStatusFunc);
            paneStatusFunc.setLayout(null);
            txfNome.setEnabled(false);
            txfApelido.setEnabled(false);
            Object[][] linhas = {{}};
            String[] colunas = {"Id_Funcionario", "Nome", "Apelido", "Status", "Nacionalidade", "Genero", "EndereÃ§o", "Senha", "Telefone", "BI", "Email", "Data_Nascimento"};
            DefaultTableModel model = new DefaultTableModel(linhas, colunas);
            TabelaFuncionario = new JTable(model);
            barra = new JScrollPane(TabelaFuncionario);

            TabelaFuncionario.setBounds(730, 250, 800, 400);
            barra.setBounds(730, 250, 500, 400);

            panel2.removeAll();
            paneStatusFunc.setBackground(fundo);
            paneStatusFunc.setOpaque(true);


            paneStatusFunc.add(actFunc);
            paneStatusFunc.add(lblnome);
            paneStatusFunc.add(sim);
            paneStatusFunc.add(nao);


            paneStatusFunc.add(carregarFunc);

            adicionarNacionalidades();
            lblnome.setBounds(175, 50, 150, 30);
            txfNome.setBounds(260, 50, 150, 30);
            paneStatusFunc.add(txfNome);
            paneStatusFunc.add(lblnome);
            lblApelido.setBounds(175, 95, 170, 30);
            txfApelido.setBounds(260, 95, 150, 30);
            paneStatusFunc.add(lblApelido);
            paneStatusFunc.add(txfApelido);
            lblDataNasc.setBounds(175, 140, 170, 35);
            jDateChooserdata.setBounds(260, 140, 150, 30);
            paneStatusFunc.add(lblDataNasc);
            paneStatusFunc.add(jDateChooserdata);
            lblSexo.setBounds(175, 185, 170, 25);
            txfSexo.setBounds(260, 185, 150, 30);
            paneStatusFunc.add(lblSexo);
            paneStatusFunc.add(txfSexo);

            lblTelefone.setBounds(420, 50, 170, 25);
            txfTelefone.setBounds(530, 50, 150, 30);
            paneStatusFunc.add(lblTelefone);
            paneStatusFunc.add(txfTelefone);
            lblEmail.setBounds(420, 95, 170, 25);
            txfEmail.setBounds(530, 95, 150, 30);
            paneStatusFunc.add(lblEmail);
            paneStatusFunc.add(txfEmail);
            lblBi.setBounds(420, 140, 170, 25);
            txfBI.setBounds(530, 140, 150, 30);
            paneStatusFunc.add(lblBi);
            paneStatusFunc.add(txfBI);
            lblEndereco.setBounds(420, 185, 170, 25);
            txfEndereco.setBounds(530, 185, 150, 30);
            paneStatusFunc.add(lblEndereco);
            paneStatusFunc.add(txfEndereco);

            lblPassword.setBounds(180, 230, 170, 25);
            txfPassword.setBounds(260, 230, 150, 30);
            paneStatusFunc.add(lblPassword);
            paneStatusFunc.add(txfPassword);

            lblnNacionalidade.setBounds(420, 230, 170, 25);
            cbxNacionalidades.setBounds(530, 230, 150, 30);
            paneStatusFunc.add(lblnNacionalidade);
            paneStatusFunc.add(cbxNacionalidades);


            paneStatusFunc.add(barra).setBounds(40, 355, 550, 150);
            paneStatusFunc.add(btnAtualizar);
            paneStatusFunc.setBackground(fundo);

            btnButton.setBounds(315, 470, 90, 25);
            btnButton.setBackground(Color.white);
            btnButton.setForeground(aqua_5);

            btnAtualizar.setBounds(280, 280, 130, 28);
            btnAtualizar.setBackground(Color.white);
            btnAtualizar.setForeground(aqua_5);


            carregarFunc.setBounds(420, 280, 130, 28);
            carregarFunc.setBackground(Color.white);
            carregarFunc.setForeground(aqua_5);
            carregarFunc.addActionListener(this);

            actFunc.setForeground(aqua_5);
            actFunc.setBounds(570, 280, 300, 30);
            sim.setBounds(600, 315, 100, 25);
            nao.setBounds(600, 350, 100, 25);

            txtid = new JTextField();
            txtid.setBounds(200, 280, 50, 30);
            txtid.setEnabled(false);
            paneStatusFunc.add(txtid);

            btnConfirmar.setBounds(410, 470, 90, 25);
            btnConfirmar.setBackground(Color.white);
            btnConfirmar.setForeground(aqua_5);
            btnConfirmar.addActionListener(this);

            paneStatusFunc.add(lblnNacionalidade);
            paneStatusFunc.add(txfNac);
            panel2.add(paneStatusFunc);
            grupo2.add(sim);
            grupo2.add(nao);
            listar();


            panel2.validate();
            panel2.revalidate();
            lblnNacionalidade.setFont(fontee);
            lblnome.setFont(fontee);
            lblDataNasc.setFont(fontee);
            lblApelido.setFont(fontee);
            lblBi.setFont(fontee);
            lblEmail.setFont(fontee);
            lblEndereco.setFont(fontee);
            lblPassword.setFont(fontee);
            lblTelefone.setFont(fontee);
            lblSexo.setFont(fontee);
            btnAtualizar.addActionListener(this);
        }

        if (e.getSource() == btnVoltar) {
            new Tela_ADMIN_Logar();
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
                cadastrarFuncionario();
            }
        }
            if (e.getSource() == carregarFunc) {
                carregarDados();
            }
            if (e.getSource() == btnAtualizar) {
                Atualizar();
            }
            if (e.getSource() == btnRelatorio) {
                panel2.removeAll();
                panel2.add(paneRelatorios);
                panel2.validate();
                panel2.revalidate();
            }
            if (e.getSource() == btnButton5) {
                String resp = JOptionPane.showInputDialog("DIGITE O MÊS (1-12): ");
                new Tela_ADMIN_Relatorio_OcupacaoDeQuartos().grafQuartos(resp);
            }
            if (e.getSource() == btnButton6) {
                String resp = JOptionPane.showInputDialog("DIGITE O MÊS (1-12): ");
                new Tela_ADMIN_Relatorio_OcupacaoPorOrigem().grafNacionalidades(resp);
            }
        }

        public void cadastrarFuncionario () {

            String nome_atc, Apelido_atc, Endereco_atc, Nacionalidade_atc, Email_atc, Genero_atc = null, Senha_atc, BI_atc, Nascimento_atc, Telefone_atc;
            //   int id_atc;
            boolean status_func = false;


            //id_atc = Integer.parseInt(txtid.getText());
            nome_atc = txfNome.getText();
            Apelido_atc = txfApelido.getText();
            if (sim.isSelected()) {
                status_func = true;
            } else if (nao.isSelected()) {
                status_func = false;
            }
            Nacionalidade_atc = (String) cbxNacionalidades.getSelectedItem();

            if (masculino.isSelected()) {
                Genero_atc = "Masculino";
            } else if (feminino.isSelected()) {
                Genero_atc = "Feminino";
            }
            Endereco_atc = txfEndereco.getText();
            Senha_atc = txfPassword.getText();
            Telefone_atc = txfTelefone.getText();
            BI_atc = txfBI.getText();
            Email_atc = txfEmail.getText();
            data = new SimpleDateFormat("dd-MM-yyyy");
            Nascimento_atc = data.format(jDateChooserdata.getDate());

            Pessoa objfuncionariodto = new Pessoa();

            objfuncionariodto.setNome(nome_atc);
            objfuncionariodto.setApelido(Apelido_atc);
            objfuncionariodto.setStatus_Pessoa(status_func);
            objfuncionariodto.setNacionalidade(Nacionalidade_atc);
            objfuncionariodto.setGenero(Genero_atc);
            objfuncionariodto.setEndereço(Endereco_atc);
            objfuncionariodto.setPassword(Senha_atc);
            objfuncionariodto.setNrDeTelofone(Telefone_atc);
            objfuncionariodto.setNumeroDeIdentificacao(BI_atc);
            objfuncionariodto.seteMail(Email_atc);
            objfuncionariodto.setDataNascimento(Nascimento_atc);
            //  objfuncionariodto.setIdPessoa(id_atc);

            Pessoa_Funcionario_DAO objfuncionariodao = new Pessoa_Funcionario_DAO();
            try {
                objfuncionariodao.cadastrarFunc(objfuncionariodto);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            } catch (ExecutionException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }


            //JOptionPane.showMessageDialog(null, "Funcionario Registrado com Sucesso");
        }

        private void listar () {
            try {
                Pessoa_Funcionario_DAO objfuncionariodao = new Pessoa_Funcionario_DAO();
                DefaultTableModel model = (DefaultTableModel) TabelaFuncionario.getModel();
                model.setNumRows(0);

                ArrayList<Pessoa> lista = objfuncionariodao.listarFuncionario();
                for (int i = 0; i < lista.size(); i++) {
                    model.addRow(new Object[]{
                            lista.get(i).getIdPessoa(),
                            lista.get(i).getNome(),
                            lista.get(i).getApelido(),
                            lista.get(i).isStatus_Pessoa(),
                            lista.get(i).getNacionalidade(),
                            lista.get(i).getGenero(),
                            lista.get(i).getEndereço(),
                            lista.get(i).getPassword(),
                            lista.get(i).getNrDeTelofone(),
                            lista.get(i).getNumeroDeIdentificacao(),
                            lista.get(i).geteMail(),
                            lista.get(i).getDataNascimento()
                    });
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Listar valores VIEW" + e);
            }
        }
        public void carregarDados () {

            int id = TabelaFuncionario.getSelectedRow();
            txtid.setText(TabelaFuncionario.getModel().getValueAt(id, 0).toString());
            txfNome.setText(TabelaFuncionario.getModel().getValueAt(id, 1).toString());
            txfApelido.setText(TabelaFuncionario.getModel().getValueAt(id, 2).toString());

            txfNac.setText(TabelaFuncionario.getModel().getValueAt(id, 4).toString());
            txfSexo.setText(TabelaFuncionario.getModel().getValueAt(id, 5).toString());
            txfEndereco.setText(TabelaFuncionario.getModel().getValueAt(id, 6).toString());
            txfPassword.setText(TabelaFuncionario.getModel().getValueAt(id, 7).toString());
            txfTelefone.setText(TabelaFuncionario.getModel().getValueAt(id, 8).toString());
            txfBI.setText(TabelaFuncionario.getModel().getValueAt(id, 9).toString());
            txfEmail.setText(TabelaFuncionario.getModel().getValueAt(id, 10).toString());
            txdData.setText(TabelaFuncionario.getModel().getValueAt(id, 11).toString());

        }

        public void adicionarNacionalidades () {
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
        ///////////////////////ATUALIZAR////////////////////
        private void Atualizar () {

            String nome_atc, Apelido_atc, Endereco_atc, Email_atc, Genero_atc = null, Senha_atc, BI_atc, Nascimento_atc, Telefone_atc;
            int id_atc;
            boolean status_func = false;
            String Nacionalidade = (String) cbxNacionalidades.getSelectedItem();
            id_atc = Integer.parseInt(txtid.getText());
            nome_atc = txfNome.getText();
            Apelido_atc = txfApelido.getText();

            if (sim.isSelected()) {
                status_func = true;
            } else if (nao.isSelected()) {
                status_func = false;
            }

            Genero_atc = txfEndereco.getText();
            Endereco_atc = txfEndereco.getText();
            Senha_atc = txfPassword.getText();
            Telefone_atc = txfTelefone.getText();
            BI_atc = txfBI.getText();
            Email_atc = txfEmail.getText();
            data = new SimpleDateFormat("dd-MM-yyyy");
            Nascimento_atc = data.format(jDateChooserdata.getDate());

            /////////////////////////////////////////////////
            Pessoa objfuncionariodto = new Pessoa();
            objfuncionariodto.setNome(nome_atc);
            objfuncionariodto.setApelido(Apelido_atc);
            objfuncionariodto.setStatus_Pessoa(status_func);
            objfuncionariodto.setNacionalidade(Nacionalidade);
            objfuncionariodto.setEndereço(Endereco_atc);
            objfuncionariodto.setGenero(Genero_atc);
            objfuncionariodto.setPassword(Senha_atc);
            objfuncionariodto.setNrDeTelofone(Telefone_atc);
            objfuncionariodto.setNumeroDeIdentificacao(BI_atc);
            objfuncionariodto.seteMail(Email_atc);
            objfuncionariodto.setDataNascimento(Nascimento_atc);
            objfuncionariodto.setIdPessoa(id_atc);
            Pessoa_Funcionario_DAO objfuncionariodao = new Pessoa_Funcionario_DAO();
            objfuncionariodao.atualizarFunc(objfuncionariodto);
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



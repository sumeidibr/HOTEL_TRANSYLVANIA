/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template**/

package VIEW;

import DAO.Reserva_Cliente_DAO;
import DTO.Reserva;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import java.awt.Font;import DAO.Quarto_DAO;
import DTO.Quarto_DTO;import javax.swing.JScrollPane;
import javax.swing.table.JTableHeader;


/**
 *
 * @author steli
 */
public class Tela_FUNC_Menu implements ActionListener{

    ArrayList<Reserva> lista = new ArrayList<>();
    JPanel panel1 = new JPanel(null);
    JLayeredPane panel2 = new JLayeredPane();
    JTableHeader tema;
    JPanel paneEscolherQuartos = new JPanel();
    JPanel paneVerEstadoDaReserva = new JPanel();
    JPanel paneAtualizarReserva = new JPanel();
    JLabel lbl1 = new JLabel("LAYER 1");
    JLabel lbl2 = new JLabel("LAYER 2");
    JLabel lbl3 = new JLabel("LAYER 3");
    JLabel lbl4 = new JLabel("LAYER 4");


    //////////// quarto ////////////////////////
    String[] paises = {"Quarto_Queen","Quarto_King","Quarto_Twin", "Quarto_Padrao"};
    JList lista_paises = new JList(paises);
    JLabel bandeira = new JLabel("");
    JLabel  lbQuarto, lbDescricao;
    JTextArea Descricao;
    JTextField txtNome, txtid;
    JRadioButton disponivel, Nao_disponivel;
    ButtonGroup estado ;
    JButton btnAtualizar, btnlistar, btncarregar, btneditar;
    JTable tabela;

    public  JButton listar = new JButton("Listar Reservas");
    JLabel titulo = new JLabel();

    Color verde_0 = new Color(115, 227, 188);
    Color verde_1 = new Color(52, 210, 156);

    Color verde_3 = new Color(17, 115, 82);
    Color verde_4 = new Color(10, 110, 76);

    Color aqua_0 = new Color(118, 180, 173, 207);
    Color aqua_1 = new Color(33, 150, 146);
    Color aqua_2 = new Color(14, 100, 84);
    Color aqua_3 = new Color(9, 82, 79, 237);
    Color aqua_4 = new Color(4, 68, 65);
    Color aqua_5 = new Color(1, 51, 49);
    Color aqua_6 = new Color(0, 47, 45);


    Color verde_2 = new Color(21, 152, 116);
    Color branco = new Color(250, 250, 250, 255);
    Color branco1 = new Color(227, 226, 226, 255);
    Color transparente = new Color(217, 217, 217, 0);


    Color WhiteSmokee = new Color(205, 232, 232, 255);

    Color fundo = new Color(210, 232, 232, 255);

    Color pasillo = new Color(219, 224, 224, 195);

    Font fontee  = new Font("sarala", Font.HANGING_BASELINE, 18);
    Font fonte  = new Font("sarala", Font.ITALIC, 18);




    JTextField txtTipo,
    txtLocalizacao,

    txtNumero_quarto,
    txtCapacidade;




    public JLabel lblDiscri = new JLabel("<html><h1 style='margin-left: 40px;'>MENU FUNCIONARIO</h1></html>");
    private JTextField yass = new JTextField("PARTE DE FAZER RESERVA");
    private JTextField yass1 = new JTextField("PARTE DE FAZER ESTADO DA RESERVA");
    private JTextField yass2 = new JTextField("PARTE DE FAZER ATUALIZAR RESERVA");

JTable TabelaReservas = new JTable();

    //setSize(700,600);
    private JButton btnVoltar = new JButton("Voltar");

    private JButton btnEstadoReserva = new JButton("<html>Modificar  Quarto</html>");
    private JButton btnAtualizarReserva = new JButton("<html>Reservas Ativas<html>");

    //paneil de entrada permuta
//    private JLabel lblNome = new JLabel("Nome");
//    private JLabel lblApelido = new JLabel("Apelido");
//    private JLabel lblEmail = new JLabel("E-mail");
//    private JTextField txfNome = new JTextField();
//    private JTextField txfApelido = new JTextField();
//    private JTextField txfEmail = new JTextField();
//    ImageIcon teste = new ImageIcon(getClass().getResource("images.png"));
//    JLabel lblImage = new JLabel(teste);

    Font fonteeee  = new Font("sarala", Font.BOLD, 15);
    Border bordaTracejada = BorderFactory.createDashedBorder(aqua_3, 2, 1, 0, true);
    public Tela_FUNC_Menu(){
        visualizar();
        listarQuarto();
    }


    public void visualizar(){

        panel2.setLayout(null);
        paneVerEstadoDaReserva.setLayout(null);


        lbl1.setOpaque(true);
        lbl1.setBounds(400, 100, 100, 30);

        lbl2.setOpaque(true);
        lbl2.setBounds(400, 100, 100, 30);

        lbl3.setOpaque(true);
        lbl3.setBounds(400, 100, 100, 30);

        lbl4.setOpaque(true);
        lbl4.setBounds(400, 100, 100, 30);

        //Parte de Cima
        lblDiscri.setBackground(verde_2);
        lblDiscri.setForeground(Color.white);
        lblDiscri.setBounds(0,0,1000,45);
        lblDiscri.setOpaque(true);

        panel1.setBounds(0,45,200,655);
        panel1.setBackground(verde_2);

        panel2.setBounds(200, 45, 800, 655);
        panel2.setBackground(verde_2);
        //panel2.add(lbl1);
        panel2.setLayout(null);
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



//////////////////////////  TABELA ////////////////////////////
        Object[][] linhas = {{}};
        String[] colunas = {"Id", "Data_entrada", "Data_saida", "Cod_reserva", "Endereço", "Status", "Quarto", "Titular", "Nr_Hospedes", "Nr_Adultos", "Nr_Crianças", "Serviços_Add", "Total", "Quantidade", "Mes_entrada"};
        DefaultTableModel model = new DefaultTableModel(linhas, colunas);



        TabelaReservas = new JTable(model);
        JScrollPane barra = new JScrollPane(TabelaReservas);
        paneAtualizarReserva.add(barra).setBounds(20, 80, 735, 180);
        listar.setBounds(21,310,110,35);
        listar.setBackground(Color.white);
        listar.setForeground(aqua_5);
        listar.setBorder(bordaTracejada);
         paneAtualizarReserva.add(listar);
         paneAtualizarReserva.add(listar);
         paneAtualizarReserva.setLayout(null);

        JLabel tituloReserva = new JLabel("Reservas");

        tituloReserva.setBounds(140,40,200,220);
        tituloReserva.setFont(fonte);
        paneAtualizarReserva.add(tituloReserva);





        ////////////////////////////////////////////////////


/////////////////// Quartos /////////////////////////////
        paneEscolherQuartos.setBounds(200, 45, 800, 655);
        paneEscolherQuartos.setBackground(fundo);
        paneEscolherQuartos.add(lbl2);


//        paneEscolherQuartos.add(bandeira);
//        bandeira.setBounds(150,10,800,800);
//        lista_paises.setBounds(0,10,350,800);

        JPanel principal = new JPanel();
        principal.setLayout(null);
        principal.setBounds(0,0,770,200);
        principal.add(lista_paises);
        principal.add(bandeira);
        principal.add(titulo);
        principal.setBackground(null);



        titulo.setText("<html><p style='text-align: center;'>CATEGORIAS</p></html>");
        titulo.setBounds(75,42,300,30);
        titulo.setFont(fonte);
        titulo.setForeground(null);


        lista_paises.setBounds(70,80,220,180);
        lista_paises.setFont(fonte);
        lista_paises.setBackground(null);
        lista_paises.setListData(paises);


        bandeira.setBounds(300,2,500,210);
//        bandeira.setBackground(Color.red);



//        paneVerEstadoDaReserva.add(principal);
//        paneEscolherQuartos.add(principal);
//      add(BorderLayout.WEST,lista);
//      add(BorderLayout.PAGE_END,bandeira);


        btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setBounds(420,340,100,30);
        btnAtualizar.setBackground(Color.white);
        btnAtualizar.setForeground(aqua_5);
        btnAtualizar.setBorder(bordaTracejada);

        btnlistar = new JButton("Listar");
        btnlistar.setBounds(470,340,100,30);
        btnlistar.setVisible(false);
        btnlistar.setBackground(Color.white);
        btnlistar.setForeground(aqua_5);


        btneditar = new JButton("Editar");
        btneditar.setBounds(550,340,100,30);
        btneditar.setBackground(Color.white);
        btneditar.setForeground(aqua_5);
        btneditar.setBorder(bordaTracejada);

        btncarregar = new JButton("Carregar");
        btncarregar.setBounds(680,340,100,30);
        btncarregar.setBackground(Color.white);
        btncarregar.setForeground(aqua_5);
        btncarregar.setBorder(bordaTracejada);

        lbQuarto = new JLabel("Preço:");
        lbQuarto.setBounds(60,185,100,100);
        lbQuarto.setFont(fonte);

        lbDescricao = new JLabel("Descriçao:");
        lbDescricao.setBounds(20,240,140,100);
        lbDescricao.setFont(fonte);


        // Tabela quarto
        String[][] colunaas = {{}};
        String[] linhass = {"Id", "Tipo", "Descricao","Localizaçao", "Disponibilidade","Nr_Quarto", "Capacidade", "Preco_noite"};

        DefaultTableModel modelb = new DefaultTableModel(colunaas, linhass);
        tabela = new JTable(modelb);
        JScrollPane barraa = new JScrollPane(tabela);
        barraa.setBounds(40,430,700,100);




        Descricao = new JTextArea("");
        Descricao.setBounds(130,280,270,100);
        Descricao.setEnabled(false);
        Descricao.setLineWrap(true);
        Descricao.setWrapStyleWord(true);
        Descricao.setBorder(bordaTracejada);

        txtNome = new JTextField();
        txtNome.setBounds(130,220,100,30);
        txtNome.setEnabled(false);
        txtNome.setBorder(bordaTracejada);

        txtTipo = new JTextField();
        txtLocalizacao = new JTextField();
        txtNumero_quarto = new JTextField();
        txtCapacidade = new  JTextField();

        txtTipo.setBounds(10,330,100,10);
        txtLocalizacao.setBounds(30,310,100,10);
        txtNumero_quarto.setBounds(50,360,100,10);
        txtCapacidade.setBounds(3,390,100,10);

        txtTipo.setVisible(false);
        txtLocalizacao.setVisible(false);
        txtNumero_quarto.setVisible(false);
        txtCapacidade.setVisible(false);

         disponivel = new JRadioButton();
         Nao_disponivel = new JRadioButton();
         estado = new ButtonGroup();
         disponivel.setBounds(120,320,50,50);
        Nao_disponivel.setBounds(120,340,50,50);


        disponivel.setVisible(false);
        Nao_disponivel.setVisible(false);

        txtid = new JTextField();
        txtid.setBounds(450,60,100,20);
        txtid.setEnabled(false);
        txtid.setVisible(false);
        paneVerEstadoDaReserva.add(txtNome);
        paneVerEstadoDaReserva.add(lbQuarto);
        paneVerEstadoDaReserva.add(Descricao);
        paneVerEstadoDaReserva.add(lbDescricao);
        paneVerEstadoDaReserva.add(btnAtualizar);
        paneVerEstadoDaReserva.add(btnlistar);
        paneVerEstadoDaReserva.add(txtid);
        paneVerEstadoDaReserva.add(btncarregar);
        paneVerEstadoDaReserva.add(btneditar);
        paneVerEstadoDaReserva.add(lista_paises);
        paneVerEstadoDaReserva.add(bandeira);
        paneVerEstadoDaReserva.add(barraa);
        paneVerEstadoDaReserva.add(principal);
        paneVerEstadoDaReserva.add(disponivel);
        paneVerEstadoDaReserva.add(txtTipo);
        paneVerEstadoDaReserva.add(txtLocalizacao);
        paneVerEstadoDaReserva.add(txtNumero_quarto);
        paneVerEstadoDaReserva.add(txtCapacidade);
        paneVerEstadoDaReserva.add(Nao_disponivel);


        btnEstadoReserva.setFont(fonteeee);
        btnAtualizarReserva.setFont(fonteeee);


        lista_paises.addListSelectionListener(e->{
            int index = lista_paises.getSelectedIndex();

            if(index==0){
                String pais = paises[index];
                bandeira.setIcon(new ImageIcon(getClass().getResource( pais+".png" )));

                txtNome.setText("2300.00");
                Descricao.setText("Um cama com colchão queen e vista para o mar.");
                Descricao.setEnabled(false);
                txtNome.setEnabled(false);


            }

            if(index==1){
                String pais = paises[index];
                bandeira.setIcon(new ImageIcon(getClass().getResource( pais+".png" )));

                txtNome.setText("2000");
                Descricao.setText("1 cama com colchão King. Acesso a varanda.");
                Descricao.setEnabled(false);
                txtNome.setEnabled(false);
                txtNome.setForeground(Color.red);
            }

            if(index==2){
                String pais = paises[index];
                bandeira.setIcon(new ImageIcon(getClass().getResource( pais+".png" )));


                txtNome.setText("1000");
                Descricao.setText("Quarto com duas camas com colchão twin. ");
                Descricao.setEnabled(false);
                txtNome.setEnabled(false);
            }

            if(index==3){
                String pais = paises[index];
                bandeira.setIcon(new ImageIcon(getClass().getResource( pais+".png" )));


                txtNome.setText("1500");
                Descricao.setText("Quarto com uma cama e vista para o mar.");
                Descricao.setEnabled(false);
                txtNome.setEnabled(false);
            }



        });


        btnAtualizar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AtualizarQuarto();
                listarQuarto();
            }
        });

        btneditar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Descricao.setEnabled(true);
                txtNome.setEnabled(true);
            }
        });

        btncarregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarCampos();
            }
        });

        btnlistar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                listarQuarto();
                carregarCampos();
            }
        });


        ////////////////// quartos ////////////////


        paneAtualizarReserva.setBounds(200, 45, 800, 655);
        paneAtualizarReserva.setBackground(fundo);
        paneAtualizarReserva.add(lbl3);

        paneVerEstadoDaReserva.setBounds(200, 45, 800, 655);
        paneVerEstadoDaReserva.setBackground(fundo);
        paneVerEstadoDaReserva.add(lbl4);


        btnAtualizarReserva.setForeground(Color.white);
        btnAtualizarReserva.setBackground(verde_2);
        btnAtualizarReserva.setBounds(0,120,200,35);
        panel1.add(btnAtualizarReserva);

        btnEstadoReserva.setForeground(Color.white);
        btnEstadoReserva.setBackground(verde_2);
        btnEstadoReserva.setBounds(0,200,200,35);
        panel1.add(btnEstadoReserva);

        btnVoltar.setForeground(Color.white);
        btnVoltar.setBackground(verde_2);
        btnVoltar.setBounds(0,270,200,35);
        panel1.add(btnVoltar);


        listar.addActionListener(this);
        btnAtualizarReserva.addActionListener(this);
        btnEstadoReserva.addActionListener(this);
        btnVoltar.addActionListener(this);
        Tela_Principal objTela_Principal = new Tela_Principal();
        objTela_Principal.setTitle("Tela Cliente Menu");
        objTela_Principal.add(lblDiscri);
        objTela_Principal.add(panel1);
        objTela_Principal.add(panel2);

        btnAtualizarReserva.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnAtualizarReserva.setBackground(verde_1);
                btnEstadoReserva.setBackground(verde_2);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
        btnAtualizarReserva.setBackground(verde_1);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
        btnAtualizarReserva.setBackground(verde_2);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        btnEstadoReserva.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnEstadoReserva.setBackground(verde_1);
                btnAtualizarReserva.setBackground(verde_2);
            }

            @Override
            public void mousePressed(MouseEvent e) {
//                btnEstadoReserva.setBackground(verde_1);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                btnEstadoReserva.setBackground(verde_1);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnEstadoReserva.setBackground(verde_2);
            }

            @Override
            public void mouseExited(MouseEvent e) {
//                btnEstadoReserva.setBackground(verde_2);
            }
        });


    }


    public static void main(String[] args) {
        new Tela_FUNC_Logar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnEstadoReserva){
            panel2.removeAll();
            panel2.add(paneVerEstadoDaReserva);
            panel2.validate();
            panel2.revalidate();


        }
        if(e.getSource()== btnVoltar){
            new Tela_FUNC_Logar();

        }
        if(e.getSource()== btnAtualizarReserva){
            panel2.removeAll();
            panel2.add(paneAtualizarReserva);
            panel2.validate();
            panel2.revalidate();

        }

        if(e.getSource()== listar){
           listar();
        }
    }

    private void listar() {
        try {
            Reserva_Cliente_DAO objreservadao = new Reserva_Cliente_DAO();
            DefaultTableModel model = (DefaultTableModel) TabelaReservas.getModel();
            model.setNumRows(0);

            ArrayList<Reserva> lista = objreservadao.PesquisarReserva();

            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[]{
                        lista.get(i).getIdReserva(),
                        lista.get(i).getData_checkIn(),
                        lista.get(i).getData_checkOut(),
                        lista.get(i).getCod_reserva(),
                        lista.get(i).isStatusReserva(),
                        lista.get(i).getQuarto(),
                        lista.get(i).getTitular(),
                        lista.get(i).getNr_hospedes(),
                        lista.get(i).getNr_adultos(),
                        lista.get(i).getNr_crianças(),
                        lista.get(i).getNr_diasEstadia(),
                        lista.get(i).getServicos_adicionais(),
                        lista.get(i).getTotal_pagar()
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "LIstar valores VIEW" + e);
        }
    }

    public void AtualizarQuarto(){
        int id , capacidade;
        String  descricao, localizacao, numero_quarto, tipo;
        Float preco_noite;
       Boolean  estado;


        id = Integer.parseInt(txtid.getText());
        preco_noite = Float.parseFloat(txtNome.getText());
        descricao = Descricao.getText();
        localizacao = txtLocalizacao.getText();
        numero_quarto = txtNumero_quarto.getText();
        tipo = txtTipo.getText();
        capacidade = Integer.parseInt(txtCapacidade.getText());
        if(disponivel.isSelected()){
            estado = Boolean.parseBoolean(disponivel.getText());
        }else {
            estado = Boolean.parseBoolean(Nao_disponivel.getText());
        }

        Quarto_DTO o = new Quarto_DTO();
        o.setId(id);
        o.setTipo(tipo);
        o.setDescricao(descricao);
        o.setLocalizacao(localizacao);
        o.setDisponibilidade(estado);
        o.setNumero_quarto(numero_quarto);
        o.setCapacidade(capacidade);
        o.setPreco_noite(preco_noite);


        Quarto_DAO a = new Quarto_DAO();
        a.AtualizarFuncionario(o);
    }


    private void listarQuarto() {
        try {
            Quarto_DAO objfuncionariodao = new Quarto_DAO();
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);

            ArrayList<Quarto_DTO> lista = objfuncionariodao.PesquisarFuncionario();

            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[]{
                        lista.get(i).getId(),
                        lista.get(i).getTipo(),
                        lista.get(i).getDescricao(),
                        lista.get(i).getLocalizacao(),
                        lista.get(i).isDisponibilidade(),
                        lista.get(i).getNumero_quarto(),
                        lista.get(i).getCapacidade(),
                        lista.get(i).getPreco_noite(),

                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "LIstar valores VIEW" + e);
        }
    }

    private void carregarCampos() {
        int setar = tabela.getSelectedRow();
        txtid.setText(tabela.getModel().getValueAt(setar, 0).toString());
        txtTipo.setText(tabela.getModel().getValueAt(setar, 1).toString());
        Descricao.setText(tabela.getModel().getValueAt(setar, 2).toString());
        txtLocalizacao.setText(tabela.getModel().getValueAt(setar, 3).toString());
        if (disponivel.isSelected()){
           disponivel.setText(tabela.getModel().getValueAt(setar, 4).toString());
        }else{
           Nao_disponivel.setText(tabela.getModel().getValueAt(setar, 4).toString());
        }
        txtNumero_quarto.setText(tabela.getModel().getValueAt(setar, 5).toString());
        txtCapacidade.setText(tabela.getModel().getValueAt(setar, 6).toString());
        txtNome.setText(tabela.getModel().getValueAt(setar, 7).toString());
    }
}

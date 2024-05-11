/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template**/

package VIEW;

import DAO.Connection_DAO;
import DAO.Reserva_Cliente_DAO;
import DTO.Reserva;
import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

/**
 *
 * @author steli
 */
public class Tela_Cliente_Menu implements ActionListener{

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;


    JPanel panel1 = new JPanel(null);
    JLayeredPane panel2 = new JLayeredPane();

    JPanel paneEscolherQuartos = new JPanel();
    JPanel paneVerEstadoDaReserva = new JPanel(null);
    JPanel paneAtualizarReserva = new JPanel(null);


    private JLabel lblDiscri = new JLabel("<html><h1 style='margin-left: 40px;'>MENU</h1></html>");
    private JTextField yass = new JTextField("PARTE DE FAZER RESERVA");
    private JTextField yass1 = new JTextField("PARTE DE FAZER ESTADO DA RESERVA");
    private JTextField yass2 = new JTextField("PARTE DE FAZER ATUALIZAR RESERVA");



    //setSize(700,600);

    private JButton btnFazerReserva = new JButton("Fazer Reserva");
    private JButton btnVoltar = new JButton("Voltar");
private JTextField txfTotalFin = new JTextField();
private JLabel lblTotalFin = new JLabel("TOTAL");
private JLabel lblMts = new JLabel("MTS");
 float recebePreco;
    private JButton btnEstadoReserva = new JButton("Estado da Reserva");
    private JButton btnAtualizarReserva = new JButton("Atualizar Reserva");

    //paneil de entrada permuta
    private JLabel lblNome = new JLabel("Nome");
    private JLabel lblApelido = new JLabel("Apelido");
    private JLabel lblEmail = new JLabel("E-mail");
    public JTextField txfNome = new JTextField();
    private JTextField txfApelido = new JTextField();
    public JTextField txfEmail = new JTextField();
    ImageIcon teste = new ImageIcon(getClass().getResource("images.png"));
    JLabel lblImage = new JLabel(teste);

    //VER detalhes da Reserva e a Alterar detalhes
    private JLabel lblCodiReserva = new JLabel("Cod. da Reserva");
    private JLabel lblTexto = new JLabel("<html><h2> Detalhes da Reserva </h2></html>");
    private JLabel lblQuarto= new JLabel("Quarto");
    private JLabel lblNrHospe = new JLabel("Nr. de Hospedes");
    private JLabel lblDataCheckIN= new JLabel("Data checkIn");
    private JLabel lblDataOut= new JLabel("Data checkOut");
    private JLabel lblNrCrian= new JLabel("Nr. de Crianças");
    private JLabel lblNrAdult= new JLabel("Nr. de Adultos");

    private JTextField txfCodReserva = new JTextField();
    private JTextField txfQuarto = new JTextField();
    private JTextField txfNurHosp = new JTextField();
    private JTextField txfDataIn = new JTextField();
    private JTextField txfDataOut = new JTextField();
    private JTextField txfNrCrianc = new JTextField();
    private JTextField txfNrAdults = new JTextField();
   // private JPanel paneVerEstadoDaReserva = new JPanel(null);


  //  private JLabel lblServico = new JLabel("Servicos Add");
    JCheckBox cbxLavandaria = new JCheckBox("Lavandaria");
    JCheckBox cbxSalaoFestas = new JCheckBox("Salao De Festas");
    JCheckBox cbxWifi = new JCheckBox("Wi-Fi");
    JCheckBox cbxGinasio = new JCheckBox("Ginasio");
    JCheckBox cbxParque = new JCheckBox("Parque Infatil");
    private JDateChooser jDateChooserdata = new JDateChooser();
    private JButton btnAtualizar = new JButton("Atualizar Reserva");
    private JLabel lblTexto1 = new JLabel("<html><h2> Atualizar Reserva </h2></html>");
    //////////////////////// CONTEÚDO ///////////////////
    JLabel lbl1 = new JLabel("Seja Bem-vindo ao Hotel Transylvania!");
    JLabel lbl2 = new JLabel("<html><p style='text-align: justify;'>É uma honra ter voce como nosso hospede e estamos ansiosos para proporcionar  uma</p></html>");
    JLabel lbl3 = new JLabel("<html><p style='text-align: justify;'>estadia agradável e confortavel. Estamos aqui para garantir que voce tenha tudo o que precisa</p></html>");

    JLabel lbl4 = new JLabel("<html><p style='text-align: justify;'>durante a sua estadia, desde acomodaçoes confortaveis á serviços excepcionais.</p></html>");
    JLabel lbl5 = new JLabel("<html><p style='text-align: justify;'>No caso de duvidas e sugestoes,  entre em contato com a nossa equipe que</p></html>");
    JLabel lbl6 = new JLabel("<html><p style='text-align: justify;'> estará a disposiçao para ajuda-lo em todos os momentos. Esperamos que voce</p></html>");
    JLabel lbl7 = new JLabel("<html><p style='text-align: justify;'>desfrute da sua estadia e que crie experiencias incríveis. Obrigado por escolher o nosso hotel!</p></html>");

   float preco6;





    Color verde_0 = new Color(115, 227, 188);
    Color verde_1 = new Color(52, 210, 156);

    Color verde_3 = new Color(17, 115, 82);
    Color verde_4 = new Color(10, 110, 76);

    Color aqua_0 = new Color(118, 236, 222);
    Color aqua_1 = new Color(32, 134, 133);
    Color aqua_2 = new Color(14, 100, 84);
    Color aqua_3 = new Color(11, 94, 91, 237);
    Color aqua_4 = new Color(4, 68, 65);
    Color aqua_5 = new Color(1, 51, 49);

    Color aqua_0_transp = new Color(118, 236, 222, 207);
    Color aqua_1_transp = new Color(47, 182, 178, 219);
    Color aqua_2_transp = new Color(14, 100, 84, 216);
    Color aqua_3_transp = new Color(9, 82, 79, 237);
    Color aqua_4_transp = new Color(4, 68, 65, 228);
    Color aqua_5_transp = new Color(1, 51, 49, 236);

    Color WhiteSmokee = new Color(159, 231, 227, 236);

    Color fundo = new Color(213, 238, 238, 255);

    Font fonte  = new Font("sarala", Font.HANGING_BASELINE, 18);
    Font fonte_1  = new Font("sarala", Font.HANGING_BASELINE, 14);



    Color verde_2 = new Color(21, 152, 116);
    Color branco = new Color(250, 250, 250, 255);
    Color branco1 = new Color(227, 226, 226, 255);
    Color transparente = new Color(217, 217, 217, 0);
    Font fonteeee  = new Font("sarala", Font.BOLD, 15);
    public Tela_Cliente_Menu(){
        visualizar();
    }

    public void visualizar(){

        //Parte de Cima
        lblDiscri.setForeground(Color.white);
        lblDiscri.setBackground(verde_2);
        lblDiscri.setForeground(Color.white);
        lblDiscri.setBounds(0,0,1000,45);
        lblDiscri.setOpaque(true);

        panel1.setBounds(0,45,200,655);


        panel2.setBounds(200, 45, 800, 655);


        lblImage.setBounds(580,100,450,150);
        lbl1.setBounds(300,250,620,30);
        lbl2.setBounds(300,280,640,30);
        lbl3.setBounds(300,310,640,30);
        lbl4.setBounds(300,340,640,30);
        lbl5.setBounds(300,370,680,30);
        lbl6.setBounds(300,400,640,30);
        lbl7.setBounds(300,430,680,30);
        panel2.add(lblImage);
        panel2.add(lbl1);
        panel2.add(lbl2);
        panel2.add(lbl3);
        panel2.add(lbl4);
        panel2.add(lbl5);
        panel2.add(lbl6);
        panel2.add(lbl7);
        lbl1.setFont(fonte_1);
        lbl2.setFont(fonte_1);
        lbl3.setFont(fonte_1);
        lbl4.setFont(fonte_1);
        lbl5.setFont(fonte_1);
        lbl6.setFont(fonte_1);
        lbl7.setFont(fonte_1);






//        //panel2.add(lbl1);
//        panel2.setLayout(null);
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

        paneEscolherQuartos.setBounds(200, 45, 800, 655);
        paneVerEstadoDaReserva.setBounds(200, 45, 800, 655);

        btnFazerReserva.setForeground(Color.white);
        btnFazerReserva.setBackground(verde_2);
        btnFazerReserva.setBounds(0,50,200,35);
        panel1.add(btnFazerReserva);

        btnAtualizarReserva.setForeground(Color.white);
        btnAtualizarReserva.setBackground( verde_2);
        btnAtualizarReserva.setBounds(0,120,200,35);
        panel1.add(btnAtualizarReserva);

        btnEstadoReserva.setForeground(Color.white);
        btnEstadoReserva.setBackground(verde_2);
        btnEstadoReserva.setBounds(0,200,200,35);
        panel1.add(btnEstadoReserva);

        btnVoltar.setForeground(Color.white);
        btnVoltar.setBackground(verde_2);
        btnVoltar.setBounds(0,270,200,35);

        btnVoltar.setFont(fonteeee);
        btnAtualizar.setFont(fonteeee);
        btnEstadoReserva.setFont(fonteeee);
        btnFazerReserva.setFont(fonteeee);
        btnAtualizarReserva.setFont(fonteeee);


        panel1.add(btnVoltar);

        btnFazerReserva.addActionListener(this);
        btnAtualizarReserva.addActionListener(this);
        btnEstadoReserva.addActionListener(this);
        btnVoltar.addActionListener(this);
        Tela_Principal objTela_Principal = new Tela_Principal();
        objTela_Principal.setTitle("Tela Cliente Menu");
        objTela_Principal.add(lblDiscri);
        objTela_Principal.add(panel1);
        objTela_Principal.add(panel2);

        ///estilos
        panel1.setBackground(verde_2);
        paneVerEstadoDaReserva.setBackground(fundo);
        paneEscolherQuartos.setBackground(fundo);
        panel2.setBackground(verde_2);





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


        btnAtualizarReserva.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnEstadoReserva.setBackground(verde_2);
                btnAtualizarReserva.setBackground(verde_1);
            }

            @Override
            public void mousePressed(MouseEvent e) {
//                btnEstadoReserva.setBackground(verde_1);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                btnEstadoReserva.setBackground(verde_2);
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
        if (e.getSource() == btnFazerReserva) {
        //    new Tela_Cliente_Select_Quartos();
//            panel2.removeAll();
//            panel2.add(paneEscolherQuartos);
//            panel2.validate();
//            panel2.revalidate();
            new Tela_Cliente_Select_Datas().visualizar();
        }
        if (e.getSource() == btnEstadoReserva) {
            verificarReserva();

        }
        if (e.getSource() == btnVoltar) {
            new Tela_Principal();
        }
        if (e.getSource() == btnAtualizarReserva) {
            panel2.removeAll();
            AtualizarReserva();
            panel2.add(paneAtualizarReserva);
            panel2.validate();
            panel2.revalidate();
        }
        if (e.getSource() == btnAtualizar) {
            try {
                atualizarDate();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            } catch (ExecutionException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    public void AtualizarReserva() {
        paneAtualizarReserva.setBounds(200, 45, 800, 655);
        paneAtualizarReserva.setBackground(fundo);

        lblTexto1.setBounds(400,45,200,50);

       // lblServico.setBounds(550,100,100,25);
        //paneAtualizarReserva.add(lblServico);
//        cbxLavandaria.setBounds(
//                550,140,100,25);
//        cbxSalaoFestas.setBounds(550,180,100,25);
//        cbxWifi.setBounds(550,220,100,25);
//        cbxGinasio.setBounds(550,260,100,25);
//        cbxParque.setBounds(550,300,100,25);
//
//        paneAtualizarReserva.add(cbxGinasio);
//        paneAtualizarReserva.add(cbxParque);
//        paneAtualizarReserva.add(cbxLavandaria);
//        paneAtualizarReserva.add(cbxSalaoFestas);
//        paneAtualizarReserva.add(cbxWifi);

        lblCodiReserva.setBounds(300,100,100,25);
        txfCodReserva.setBounds(410,100,100,25);
        lblQuarto.setBounds(300,140,100,25);
        txfQuarto.setBounds(410,140,100,25);
        lblNrHospe.setBounds(300,180,100,25);
        txfNurHosp.setBounds(410,180,100,25);
        lblNrAdult.setBounds(300,220,100,25);
        txfNrAdults.setBounds(410,220,100,25);
        lblNrCrian.setBounds(300,260,100,25);
        txfNrCrianc.setBounds(410,260,100,25);
        lblDataCheckIN.setBounds(300,300,100,25);
        txfDataIn.setBounds(410,300,100,25);
        lblDataOut.setBounds(300,340,100,25);
        jDateChooserdata.setBounds(410,340,100,25);
        txfCodReserva.setEnabled(false);
        txfQuarto.setEnabled(false);
        txfNrAdults.setEnabled(false);
        txfNrCrianc.setEnabled(false);
        txfNurHosp.setEnabled(false);
        txfDataIn.setEnabled(false);
        paneAtualizarReserva.add(txfDataIn);
        paneAtualizarReserva.add(jDateChooserdata);
        paneAtualizarReserva.add(txfNrAdults);
        paneAtualizarReserva.add(txfNrCrianc);
        paneAtualizarReserva.add(txfNurHosp);
        paneAtualizarReserva.add(txfCodReserva);
        paneAtualizarReserva.add(txfQuarto);
        paneAtualizarReserva.add(lblTexto1);
        paneAtualizarReserva.add(lblCodiReserva);
        paneAtualizarReserva.add(lblQuarto);
        paneAtualizarReserva.add(lblNrHospe);
        paneAtualizarReserva.add(lblNrAdult);
        paneAtualizarReserva.add(lblNrCrian);
        paneAtualizarReserva.add(lblDataOut);
        paneAtualizarReserva.add(lblDataCheckIN);
        btnAtualizar.setBounds(510,380,200,25);
        btnAtualizar.setBackground(verde_2);
        btnAtualizar.setForeground(Color.white);
        btnAtualizar.addActionListener(this);
        paneAtualizarReserva.add(btnAtualizar);
    }

    Tela_Principal obTela =  new Tela_Principal();
    public void verificarReserva(){
        panel2.removeAll();
        lblTexto.setBounds(300,35,200,50);
       // lblServico.setBounds(470,100,220,30);
        //paneVerEstadoDaReserva.add(lblServico);
//        cbxLavandaria.setBounds(470,140,120,30);
//        cbxSalaoFestas.setBounds(470,180,220,35);
//        cbxWifi.setBounds(470,220,220,35);
//        cbxGinasio.setBounds(470,260,220,35);
//        cbxParque.setBounds(470,300,220,35);

        lblTexto.setFont(fonte);
     //   lblServico.setFont(fonte);
        cbxLavandaria.setFont(fonte);
        cbxWifi.setFont(fonte);
        cbxSalaoFestas.setFont(fonte);
        cbxGinasio.setFont(fonte);
        cbxParque.setFont(fonte);

        lblTexto.setBackground(null);
      //  lblServico.setBackground(null);
//        cbxLavandaria.setBackground(null);
//        cbxWifi.setBackground(null);
//        cbxSalaoFestas.setBackground(null);
//        cbxGinasio.setBackground(null);
//        cbxParque.setBackground(null);
//
//        cbxLavandaria.setEnabled(false);
//        cbxWifi.setEnabled(false);
//        cbxGinasio.setEnabled(false);
//        cbxSalaoFestas.setEnabled(false);
//        cbxParque.setEnabled(false);

        paneVerEstadoDaReserva.add(cbxGinasio);
        paneVerEstadoDaReserva.add(cbxParque);
        paneVerEstadoDaReserva.add(cbxLavandaria);
        paneVerEstadoDaReserva.add(cbxSalaoFestas);
        paneVerEstadoDaReserva.add(cbxWifi);

        lblCodiReserva.setBounds(80,100,200,30);
        txfCodReserva.setBounds(250,100,130,30);
        lblQuarto.setBounds(80,140,200,30);
        txfQuarto.setBounds(250,140,130,30);
        lblNrHospe.setBounds(80,180,200,25);
        txfNurHosp.setBounds(250,180,130,30);
        lblNrAdult.setBounds(80,220,200,25);
        txfNrAdults.setBounds(250,220,130,30);
        lblNrCrian.setBounds(80,260,200,25);
        txfNrCrianc.setBounds(250,260,130,30);
        lblDataCheckIN.setBounds(80,300,200,25);
        lblDataOut.setBounds(80, 340, 200, 25);
        txfDataIn.setBounds(250,300,130,30);
        txfDataOut.setBounds(250,340,130,30);
        txfTotalFin.setBounds(250, 380, 130, 30);
        lblTotalFin.setBounds(80, 380, 130, 30);
        lblMts.setBounds(389, 380, 130, 30);
       // jDateChooserdata.setBounds(250,340,130,30);
        txfTotalFin.setEnabled(false);
        txfCodReserva.setEnabled(false);
        txfQuarto.setEnabled(false);
        txfNrAdults.setEnabled(false);
        txfNrCrianc.setEnabled(false);
        txfNurHosp.setEnabled(false);
        txfDataIn.setEnabled(false);
        txfDataOut.setEnabled(false);
       // jDateChooserdata.setEnabled(false);
        paneVerEstadoDaReserva.add(lblMts);
        paneVerEstadoDaReserva.add(txfTotalFin);
        paneVerEstadoDaReserva.add(lblTotalFin);
        paneVerEstadoDaReserva.add(txfDataIn);
        paneVerEstadoDaReserva.add(txfDataOut);
        paneVerEstadoDaReserva.add(txfNrAdults);
        paneVerEstadoDaReserva.add(txfNrCrianc);
        paneVerEstadoDaReserva.add(txfNurHosp);
        paneVerEstadoDaReserva.add(txfCodReserva);
        paneVerEstadoDaReserva.add(txfQuarto);
        paneVerEstadoDaReserva.add(lblTexto);
        paneVerEstadoDaReserva.add(lblCodiReserva);
        paneVerEstadoDaReserva.add(lblQuarto);
        paneVerEstadoDaReserva.add(lblNrHospe);
        paneVerEstadoDaReserva.add(lblNrAdult);
        paneVerEstadoDaReserva.add(lblNrCrian);
        paneVerEstadoDaReserva.add(lblDataOut);
        paneVerEstadoDaReserva.add(lblDataCheckIN);
      //  paneVerEstadoDaReserva.add(jDateChooserdata);
        panel2.add(paneVerEstadoDaReserva);
        detalhesReserva(obTela.princEmail());
        panel2.validate();
        panel2.revalidate();
        datasLimites();



    }


    /////////////////////////////////////////// METODO ATUALIZAR RESERVAS /////////////////////////////////////////
    private void atualizarDate() throws SQLException, ExecutionException, ClassNotFoundException {
        Reserva objReservaDTO = new Reserva();
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");

   //     float total_pagar = Float.parseFloat(txfTotalFin.getText())+(recebePreco*diasDiff(new Tela_Cliente_CheckIn().retornarData(), jDateChooserdata.getDate()));

        objReservaDTO.setData_checkOut(f.format(jDateChooserdata.getDate()));
        //objReservaDTO.setTotal_pagar(total_pagar);
        objReservaDTO.setCod_reserva(txfCodReserva.getText());

        Reserva_Cliente_DAO objReservaDAO = new Reserva_Cliente_DAO();
        objReservaDAO.atualizarReserva(objReservaDTO);
    }

    public void detalhesReserva(String email) {
        Connection conn;
        PreparedStatement pstm = null;
        ResultSet rs;
        String sql = "SELECT r.* FROM reservas r JOIN clientes c ON r.email_cliente = c.email WHERE c.email = ?";
        conn = new Connection_DAO().connect();

        try {
            pstm =  conn.prepareStatement(sql);
            pstm.setString(1, email);
            rs= pstm.executeQuery();
            while(rs.next()) {
                txfCodReserva.setText(rs.getString("cod_reserva"));
                txfQuarto.setText(rs.getString("quarto"));
                txfNurHosp.setText(String.valueOf(rs.getInt("nr_hospedes")));
                txfNrAdults.setText(String.valueOf(rs.getInt("nr_adultos")));
                txfNrCrianc.setText(String.valueOf(rs.getInt("nr_crianças")));
                txfDataIn.setText(rs.getString("data_entrada"));
                txfDataOut.setText(rs.getString("data_saida"));
                txfTotalFin.setText(String.valueOf(rs.getFloat("total_pagar")));
            }
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void levarPreco(float preco1) {
      recebePreco = preco1;
    }

        public int diasDiff(java.util.Date d1, Date d2) {
            int result =1;
            try{
                SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
                long diffInMillies = d2.getTime() - d1.getTime();
                long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                result = Math.toIntExact(diff);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }

        public void datasLimites() {

            Calendar minDate = Calendar.getInstance();
            minDate.set(Calendar.YEAR, 2023);
            minDate.set(Calendar.MONTH, Calendar.MAY);
            minDate.set(Calendar.DAY_OF_MONTH, Integer.parseInt(txfDataOut.getText().concat(String.valueOf(txfDataOut.getText().charAt(0)+txfDataOut.getText().charAt(1)))));
            jDateChooserdata.setMinSelectableDate(minDate.getTime());


            Calendar maxDate = Calendar.getInstance();
            maxDate.set(Calendar.YEAR, 2023);
            maxDate.set(Calendar.MONTH, Calendar.JUNE);
            maxDate.set(Calendar.DAY_OF_MONTH, 31);
            jDateChooserdata.setMaxSelectableDate(maxDate.getTime());

            Calendar initialDate = Calendar.getInstance();
            initialDate.set(Calendar.YEAR, 1999);
            initialDate.set(Calendar.MONTH, Calendar.JANUARY);
            initialDate.set(Calendar.DAY_OF_MONTH, 1);
            jDateChooserdata.setDate(initialDate.getTime());
        }
    }




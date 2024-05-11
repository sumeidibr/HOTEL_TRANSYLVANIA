/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;

/**
 *
 * @author steli
 */

import DAO.Connection_DAO;
import DAO.Reserva_Cliente_DAO;
import DTO.Reserva;
import com.toedter.calendar.JDateChooser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class  Tela_Cliente_CheckIn implements ActionListener{
    private JLabel lblCodiReserva = new JLabel("Codido da Reserva");
    private JLabel lblTexto1 = new JLabel("<html><h2> CHECKIN </h2></html>");
    private JLabel lblQuarto= new JLabel("Número do Quarto");
    private JLabel lblNrHospe = new JLabel("Número de Hospedes");
    float preco4;
    private JLabel lblDataCheckIN= new JLabel("Data de Entrada");
    private JLabel lblDataOut= new JLabel("Data de Saída");
    private JLabel lblNrCrian= new JLabel("Número de Crianças");
    private JLabel lblNrAdult= new JLabel("Número de Adultos");
    private JLabel lblTitular = new JLabel("Titular");

    private JTextField txfTitular = new JTextField();
    private JLabel lblCodReserva1 = new JLabel();
    private JTextField txfCodReserva = new JTextField();
    private JTextField txfQuarto = new JTextField();
    private JTextField txfNurHosp = new JTextField();
    private JDateChooser jDatEntrada = new JDateChooser();

    private JTextField txfNrCrianc = new JTextField();
    private JTextField txfNrAdults = new JTextField();
    private JLabel lblTotal = new JLabel("TOTAL");
    private JTextField txttotal = new JTextField();
    private JDateChooser jDatOut = new JDateChooser();
    private JPanel paneAtualizarReserva = new JPanel(null);
    private JLabel lblServico = new JLabel("Servicos Adicionais");
    JCheckBox cbxLavandaria = new JCheckBox("Lavandaria");
    JCheckBox cbxSalaoFestas = new JCheckBox("Salao De Festas");
    JCheckBox cbxWifi = new JCheckBox("Wi-Fi");
    JCheckBox cbxGinasio = new JCheckBox("Ginasio");
    JCheckBox cbxParque = new JCheckBox("Parque Infatil");
    private JButton btnAtualizar = new JButton("Fazer Reserva");
    private JButton btnCancelar = new JButton("Cancelar");
    Font fonte  = new Font("sarala", Font.HANGING_BASELINE, 18);
    Color fundo = new Color(213, 238, 238, 255);
    private JTextField txfDataIn = new JTextField();
    private JTextField txfDataOut = new JTextField();

    private JTextField txt_Conf_Email = new JTextField();

    private JLabel lblConf_Email = new JLabel("Email");
    private JLabel lblNome = new JLabel("Nome");
    private JLabel lblDiscri = new JLabel("<html><h1 style='margin-left: 40px;'>MENU</h1></html>");
    Color aqua_3 = new Color(11, 94, 91, 237);
    Color aqua_5 = new Color(1, 51, 49);
    private JPanel panel =  new JPanel(null);
    private float preco2;

    Color verde_2 = new Color(21, 152, 116);
    Color branco = new Color(250, 250, 250, 255);
    Color branco1 = new Color(227, 226, 226, 255);
    Color transparente = new Color(217, 217, 217, 0);
    Font fonteeee  = new Font("sarala", Font.BOLD, 15);

    public Tela_Cliente_CheckIn(){
        visualizar();
    }

    public void visualizar(){
        lblDiscri.setBackground(verde_2);
        lblDiscri.setForeground(Color.white);
        lblDiscri.setBounds(0,0,1000,45);
        lblDiscri.setOpaque(true);


        paneAtualizarReserva.add(lblDiscri);



//        setSize(1000,655);
//        setVisible(true);
//        setDefaultCloseOperation(3);
//        add(paneAtualizarReserva);
        paneAtualizarReserva.setBounds(200, 45, 800, 655);
        paneAtualizarReserva.setBackground(Color.red);


        paneAtualizarReserva.setBounds(200, 45, 800, 655);
        paneAtualizarReserva.setBackground(fundo);

        lblTexto1.setBounds(300,35,200,50);

        lblServico.setBounds(470,100,220,30);
        paneAtualizarReserva.add(lblServico);
        cbxLavandaria.setBounds(
                470,140,120,30);
        cbxSalaoFestas.setBounds(470,180,220,35);
        cbxWifi.setBounds(470,220,220,35);
        cbxGinasio.setBounds(470,260,220,35);
        cbxParque.setBounds(470,300,220,35);

        lblTexto1.setFont(fonte);
        lblServico.setFont(fonte);
        cbxLavandaria.setFont(fonte);
        cbxWifi.setFont(fonte);
        cbxSalaoFestas.setFont(fonte);
        cbxGinasio.setFont(fonte);
        cbxParque.setFont(fonte);


        lblTexto1.setBackground(null);
        lblServico.setBackground(null);
        cbxLavandaria.setBackground(null);
        cbxWifi.setBackground(null);
        cbxSalaoFestas.setBackground(null);
        cbxGinasio.setBackground(null);
        cbxParque.setBackground(null);

        cbxLavandaria.setEnabled(true);
        cbxWifi.setEnabled(true);
        cbxGinasio.setEnabled(true);
        cbxSalaoFestas.setEnabled(true);
        cbxParque.setEnabled(true);

        paneAtualizarReserva.add(cbxGinasio);
        paneAtualizarReserva.add(cbxParque);
        paneAtualizarReserva.add(cbxLavandaria);
        paneAtualizarReserva.add(cbxSalaoFestas);
        paneAtualizarReserva.add(cbxWifi);

        lblCodiReserva.setFont(fonte);
        lblQuarto.setFont(fonte);
        lblNrHospe.setFont(fonte);
        lblNrAdult.setFont(fonte);
        lblNrCrian.setFont(fonte);
        lblNome.setFont(fonte);
        lblDataCheckIN.setFont(fonte);
        lblDataOut.setFont(fonte);
        lblConf_Email.setFont(fonte);
        lblTotal.setFont(fonte);
        txttotal.setFont(fonte);


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
        jDatEntrada.setBounds(250,300,130,30);
        lblDataOut.setBounds(80,340,200,25);
        jDatOut.setBounds(250,340,130,30);
        txt_Conf_Email.setBounds(250,380,130,30);
        lblConf_Email.setBounds(80,380,130,30);
        txttotal.setBounds(80, 420, 130, 30);
        lblTotal.setBounds(250, 420, 130, 30);
        txfCodReserva.setEnabled(true);
        txfQuarto.setEnabled(true);
        txfNrAdults.setEnabled(true);
        txfNrCrianc.setEnabled(true);
        txfNurHosp.setEnabled(true);
        jDatEntrada.setEnabled(true);
        jDatOut.setEnabled(true);
        paneAtualizarReserva.add(jDatEntrada);
        paneAtualizarReserva.add(jDatOut);
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
        paneAtualizarReserva.add(txfDataIn);
        paneAtualizarReserva.add(txfDataOut);
        paneAtualizarReserva.add(txt_Conf_Email);
        paneAtualizarReserva.add(lblConf_Email);
        paneAtualizarReserva.add(lblTotal);
        paneAtualizarReserva.add(txttotal);
        paneAtualizarReserva.add(lblConf_Email);
        btnAtualizar.setBounds(560,450,140,35);
        btnCancelar.setBounds(400,450,140,35);

        btnAtualizar.setFont(fonteeee);
        btnCancelar.setFont(fonteeee);

        btnAtualizar.setBackground(verde_2);
        btnAtualizar.setForeground(Color.white);
        btnCancelar.setBackground(verde_2);
        btnCancelar.setForeground(Color.white);

        paneAtualizarReserva.add(btnAtualizar);
        paneAtualizarReserva.add(btnCancelar);

        Tela_Principal obj = new Tela_Principal();
        obj.add(paneAtualizarReserva);

       // Tela_Cliente_Select_Datas objSQ = new Tela_Cliente_Select_Datas();
      //  new Tela_Cliente_Select_Datas().settarDatas();
        btnAtualizar.addActionListener(this);
        btnCancelar.addActionListener(this);

        jDatEntrada.getDateEditor().addPropertyChangeListener(e -> {
            if ("date".equals(e.getPropertyName())) {
                LimitarDataChooser(jDatEntrada, jDatOut);
            }
        });
    }

    private static void LimitarDataChooser(JDateChooser dataEntrada, JDateChooser dataSaida) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataEntrada.getDate());

        Calendar today = Calendar.getInstance();
        if (calendar.before(today)) {
            calendar.setTime(today.getTime());
            dataEntrada.setDate(today.getTime());
        }
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        dataSaida.setMinSelectableDate(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH, 29);
        dataSaida.setMaxSelectableDate(calendar.getTime());
    }

    //// calcular dif de dias\\\\
    private int calcularDiferencaDias() {
        long diffDays=0;
        Date startDate = jDatEntrada.getDate();
        Date endDate = jDatOut.getDate();

        if (startDate != null && endDate != null) {
            LocalDate startLocalDate = startDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
            LocalDate endLocalDate = endDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

            diffDays = ChronoUnit.DAYS.between(startLocalDate, endLocalDate);

        }return (int) diffDays;
    }


    public static void main(String[] args) {
        new  Tela_Cliente_CheckIn();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnAtualizar){

            try {
                if(Integer.parseInt(txfNrCrianc.getText()) > 4) {
                    JOptionPane.showMessageDialog(null, "ERRO! O NUMERO MAXIMO DE CRIANCAS É 3!");
                }
                if(diasDiff(jDatEntrada.getDate(), jDatOut.getDate()) == 0) {
                    JOptionPane.showMessageDialog(null, "ERRO! O TEMPO MINIMO DE ESTADIA É DE 1 DIA!");
                }
                else {
                    txfNurHosp.setText(String.valueOf(Integer.parseInt(txfNrAdults.getText()) + Integer.parseInt(txfNrCrianc.getText())));
                    txfCodReserva.setText(codRandom());
                    txfCodReserva.setEnabled(false);
                    txfNurHosp.setEnabled(false);
                    txfQuarto.setEnabled(false);
                    txttotal.setEnabled(false);

                    cadastrarRes();
                    new Tela_Cliente_Menu().levarPreco(preco4);
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            } catch (ExecutionException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }

        }
        if(e.getSource()==btnCancelar){
            new Tela_Cliente_Select_Quartos();
        }

    }
    ////////////////////////////////////CADASTRAR RESERVA//////////////////////////////
    private void cadastrarRes() throws SQLException, ExecutionException, ClassNotFoundException {
        String data_entrada;
        String data_saida;
        String cod_reserva;
        boolean status_reserva;
        String quarto;
        String titular;
        int mes_entrada;
        int nr_hospedes;
        int nr_adultos, nr_crianças, nr_diasEstadia;

        String email_cli;

        ////////////////////////DATAS DOS DATE CHOOSERS //////////////////////////
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat g = new SimpleDateFormat("MM");
        Date m = new Date();
        mes_entrada = (m.getMonth() + 1);

        data_entrada = f.format(jDatEntrada.getDate());
        data_saida = f.format(jDatOut.getDate());

        /////////////////////// DIFERENCA DE DIAS ///////////////////////
        diasDiff(jDatEntrada.getDate(), jDatOut.getDate());
        cod_reserva = codRandom();
        status_reserva = true;
        quarto = txfQuarto.getText();
        titular = txfTitular.getText();
        nr_hospedes = Integer.parseInt(txfNurHosp.getText());
        nr_adultos = Integer.parseInt(txfNrAdults.getText());
        nr_crianças = Integer.parseInt(txfNrCrianc.getText());
        nr_diasEstadia = diasDiff(jDatEntrada.getDate(), jDatOut.getDate());

        // float  total_pagar = 10;
        email_cli = txt_Conf_Email.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        StringBuilder servs = new StringBuilder();


        if (cbxLavandaria.isSelected()) {
            servs.append(cbxLavandaria.getText());
            preco2 = preco2 + 500;
        } else
        if (cbxGinasio.isSelected()) {
            servs.append(cbxGinasio.getText());
            preco2 = preco2 + 400;
        } else
        if (cbxParque.isSelected()) {
            servs.append(cbxParque.getText());
            preco2 = preco2 + 300;
        } else
        if (cbxSalaoFestas.isSelected()) {
            servs.append(cbxSalaoFestas.getText());
            preco2 = preco2 + 200;
        }
        if (cbxWifi.isSelected()) {
            servs.append(cbxWifi.getText());
            preco2 = preco2 + 100;
        }
        preco4 = Float.parseFloat(txttotal.getText());
        float total_pagar = (Float.parseFloat(txttotal.getText())*nr_diasEstadia+preco2);
        txttotal.setText(String.valueOf(total_pagar));


        Reserva objReservaDTO = new Reserva();
        objReservaDTO.setData_checkIn(data_entrada);
        objReservaDTO.setData_checkOut(data_saida);
        objReservaDTO.setCod_reserva(cod_reserva);
        if(diasDiff(date, jDatEntrada.getDate()) == 0) {
            objReservaDTO.setStatusReserva(true);
        } else {
            objReservaDTO.setStatusReserva(false);
        }
        objReservaDTO.setQuarto(quarto);
        objReservaDTO.setTitular(titular);
        objReservaDTO.setNr_hospedes(nr_hospedes);
        objReservaDTO.setNr_adultos(nr_adultos);
        objReservaDTO.setNr_crianças(nr_crianças);
        objReservaDTO.setNr_diasEstadia(nr_diasEstadia);
        objReservaDTO.setServicos_adicionais(servs.toString());
        objReservaDTO.setTotal_pagar(total_pagar);
        objReservaDTO.setMesEntr(mes_entrada);
        objReservaDTO.setEmailCliente(email_cli);
        Reserva_Cliente_DAO objReservaDAO = new Reserva_Cliente_DAO();
        objReservaDAO.efectuarReserva(objReservaDTO);

    }


    ////////////////////////////////// METODO DIFERENÇA DE DIAS /////////////////////////////////////////
    public int diasDiff(Date d1, Date d2) {
        int result =1;
        try{
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
            long diffInMillies = d2.getTime() - d1.getTime();
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            result = Math.toIntExact(diff);
//            if(diff>30) {
//                JOptionPane.showMessageDialog(null, "ERRO! O TEMPO MAXIMO DE ESTADIA NO HOTEL É DE 30 DIAS!");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String codRandom() {
        Random r = new Random( System.currentTimeMillis() );
        return String.valueOf(10000 + r.nextInt(20000));
    }

    public void setPrecos(String preco) {
        txttotal.setText(preco);
    }
    public void nomeQuart(String nome,String preco) {
        txfQuarto.setText(nome);
        txttotal.setText(preco);
    }

    public void copiarCampos(int nrCriancas, int nrAdultos, Date d1, Date d2) {
        txfNrCrianc.setText(String.valueOf(nrCriancas));
        txfNrAdults.setText(String.valueOf(nrAdultos));
        jDatEntrada.setDate(d1);
        jDatOut.setDate(d2);
    }

    PreparedStatement pstm;
    Connection conn;

    ResultSet rs1;
    int k;

    boolean ver;


    public void copiarCampos(String nrCriancas, String nrAdultos, Date d1, Date d2) {
        txfNrCrianc.setText(nrCriancas);
        txfNrAdults.setText(nrAdultos);
        jDatEntrada.setDate(d1);
        jDatOut.setDate(d2);
    }

    public Date retornarData() {
        return jDatOut.getDate();
    }


}
  


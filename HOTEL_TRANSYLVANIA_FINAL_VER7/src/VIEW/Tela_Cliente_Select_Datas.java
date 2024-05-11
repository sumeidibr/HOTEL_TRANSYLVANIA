package VIEW;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tela_Cliente_Select_Datas implements ActionListener {


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

    JLabel titulo = new JLabel("SELECIONE AS DATAS E O NÚMERO DE HOSPEDES: ");
    private JLabel lblDataCheckIN= new JLabel("Data de Entrada");
    private JLabel lblDataOut= new JLabel("Data de Saída");
    JDateChooser data_entr = new JDateChooser();
    JDateChooser data_sai = new JDateChooser();
    private JLabel lblNrCrian= new JLabel("Número de Crianças");
    private JLabel lblNrAdult= new JLabel("Número de Adultos");

    private JTextField txfNrCrianc = new JTextField();
    private JTextField txfNrAdults = new JTextField();

    private JButton btnContinuar = new JButton("Continuar");
    private JButton btnCancelar = new JButton("Cancelar");

    private JLabel lblDiscri = new JLabel("<html><h1 style='margin-left: 40px;'>DETALHES DA RESERVA</h1></html>");

    private JPanel panelDates =  new JPanel(null);

    public Tela_Cliente_Select_Datas() {
        //visualizar();
    }

    public void visualizar() {
        panelDates.setBackground(fundo);
        titulo.setFont(fonte);
        lblNrAdult.setFont(fonte);
        lblNrCrian.setFont(fonte);
        lblDataCheckIN.setFont(fonte);
        lblDataOut.setFont(fonte);

        lblNrAdult.setBounds(80,220,200,25);
        lblNrCrian.setBounds(80,260,200,25);


        txfNrAdults.setBounds(250,220,130,30);
        txfNrCrianc.setBounds(250,260,130,30);

        lblDataCheckIN.setBounds(80,300,200,25);
        data_entr.setBounds(250,300,130,30);

        lblDataOut.setBounds(80,340,200,25);
        data_sai.setBounds(250,340,130,30);

        btnContinuar.setBounds(560,450,140,35);
        btnCancelar.setBounds(400,450,140,35);

        btnContinuar.setFont(fonteeee);
        btnCancelar.setFont(fonteeee);

        btnContinuar.setForeground(Color.white);
        btnContinuar.setBackground(verde_2);


        btnCancelar.setForeground(Color.white);
        btnCancelar.setBackground(verde_2);


        lblDiscri.setBackground(verde_2);
        lblDiscri.setForeground(Color.white);
        lblDiscri.setBounds(0,0,1000,45);
        lblDiscri.setOpaque(true);

        panelDates.add(lblNrAdult);
        panelDates.add(lblNrCrian);
        panelDates.add(data_entr);
        panelDates.add(data_sai);
        panelDates.add(txfNrAdults);
        panelDates.add(txfNrCrianc);
        panelDates.add(lblDataCheckIN);
        panelDates.add(lblDataOut);
        panelDates.add(btnContinuar);
        panelDates.add(btnCancelar);
        panelDates.add(lblDiscri);


        Tela_Principal obj = new Tela_Principal();
        obj.add(panelDates);

        btnContinuar.addActionListener( this);
        btnCancelar.addActionListener(this);


        data_entr.getDateEditor().addPropertyChangeListener(e -> {
            if ("date".equals(e.getPropertyName())) {
                LimitarDataChooser(data_entr, data_sai);
            }
        });

    }

    public static void main(String[] args) {
        Tela_Cliente_Select_Datas obj = new Tela_Cliente_Select_Datas();
        obj.visualizar();
      //  new Tela_Cliente_Select_Datas().visualizar();

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnContinuar) {
           // settarDatas();
            new Tela_Cliente_Select_Quartos().copiarCampos(txfNrCrianc.getText(), txfNrAdults.getText(), data_entr.getDate(), data_sai.getDate());
        }

        if(e.getSource() == btnCancelar) {
            new Tela_Cliente_Menu();
        }
    }

    ///////////////METODO DE COPIAR AS DATAS QUE O CLIENTE ESCOLHE PARA A PARTE DE
//    CHECK IN, PARA ELE NAO TER QUE ESCREVER DE NOVO
   public void settarDatas() {
   //    Tela_Cliente_Select_Quartos objSQ = new Tela_Cliente_Select_Quartos();
       int nrCri = Integer.parseInt(txfNrCrianc.getText());
       int nrAd = Integer.parseInt(txfNrAdults.getText());
       Date d1 = data_entr.getDate();
       Date d2 = data_sai.getDate();
       Tela_Cliente_CheckIn obj = new Tela_Cliente_CheckIn();
       obj.copiarCampos(nrCri,nrAd, d1 ,d2 );

    }

    //////////////////////METODOS PARA METER AS DATAS ESCOLHIDAS NO METODO DE DISPONIBILIDADE DE QUARTO
    public Date returnIni() {
       // SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        return data_entr.getDate();
    }

    public Date returnSai() {
      //  SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        return data_sai.getDate();
    }

    public void desactivarTela() {
        panelDates.setVisible(false);
    }

    ///metodo para definir limite de 30 dias de diferenca do primeiro para o segundo\\\\
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





}

package DTO;


public class Reserva {

    int IdReserva;
    boolean statusReserva;
    String quarto;
    String cod_reserva;
    String titular;
    String data_checkIn;
    String data_checkOut;
    int nr_hospedes;
    int nr_camasExtras;
    int nr_adultos;
    int nr_crianças;
    int nr_diasEstadia;
    String servicos_adicionais;
    float total_pagar;
    int MesEntr;

    String emailCliente;

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public int getMesEntr() {
        return MesEntr;
    }

    public void setMesEntr(int MesEntr) {
        this.MesEntr = MesEntr;
    }

    public String getData_checkIn() {
        return data_checkIn;
    }

    public void setData_checkIn(String data_checkIn) {
        this.data_checkIn = data_checkIn;
    }

    public String getData_checkOut() {
        return data_checkOut;
    }

    public void setData_checkOut(String data_checkOut) {
        this.data_checkOut = data_checkOut;
    }

    public String getCod_reserva() {
        return cod_reserva;
    }

    public void setCod_reserva(String cod_reserva) {
        this.cod_reserva = cod_reserva;
    }


    public int getNr_hospedes() {
        return nr_hospedes;
    }

    public void setNr_hospedes(int nr_hospedes) {
        this.nr_hospedes = nr_hospedes;
    }

    public int getNr_camasExtras() {
        return nr_camasExtras;
    }

    public void setNr_camasExtras(int nr_camasExtras) {
        this.nr_camasExtras = nr_camasExtras;
    }

    public int getNr_adultos() {
        return nr_adultos;
    }

    public void setNr_adultos(int nr_adultos) {
        this.nr_adultos = nr_adultos;
    }

    public int getNr_crianças() {
        return nr_crianças;
    }

    public void setNr_crianças(int nr_crianças) {
        this.nr_crianças = nr_crianças;
    }

    public int getNr_diasEstadia() {
        return nr_diasEstadia;
    }

    public void setNr_diasEstadia(int nr_diasEstadia) {
        this.nr_diasEstadia = nr_diasEstadia;
    }

    public String getServicos_adicionais() {
        return servicos_adicionais;
    }

    public void setServicos_adicionais(String servicos_adicionais) {
        this.servicos_adicionais = servicos_adicionais;
    }

    public float getTotal_pagar() {
        return total_pagar;
    }

    public void setTotal_pagar(float total_pagar) {
        this.total_pagar = total_pagar;
    }

    public int getIdReserva() {
        return IdReserva;
    }

    public void seIdrReserva(int nrReserva) {
        this.IdReserva = nrReserva;
    }

    public boolean isStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(boolean statusReserva) {
        this.statusReserva = statusReserva;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }




}
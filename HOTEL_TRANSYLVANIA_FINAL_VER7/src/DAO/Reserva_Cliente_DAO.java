package DAO;

import DTO.Reserva;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import javax.swing.JOptionPane;

    public class Reserva_Cliente_DAO {
        Connection conn;
        PreparedStatement pstm;
        ResultSet rs;
        Reserva objReservaCad = new Reserva();

        //////////////// CADASTRO DAS RESERVAS ////////////////////////

        public void efectuarReserva(Reserva objReservaCad) throws SQLException, ExecutionException, ClassNotFoundException {
            String sql = "insert into reservas(data_entrada, data_saida, cod_reserva, status_reserva, quarto, titular_reserva, nr_hospedes, nr_adultos, nr_crianças, nr_diasEstadia, servicos_adicionais, total_pagar, mes_entrada, email_cliente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            conn = new Connection_DAO().connect();
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, objReservaCad.getData_checkIn());
                pstm.setString(2, objReservaCad.getData_checkOut());
                pstm.setString(3, objReservaCad.getCod_reserva());
                pstm.setBoolean(4, objReservaCad.isStatusReserva());
                pstm.setString(5, objReservaCad.getQuarto());
                pstm.setString(6, objReservaCad.getTitular());
                pstm.setInt(7, objReservaCad.getNr_hospedes());
                pstm.setInt(8, objReservaCad.getNr_adultos());
                pstm.setInt(9, objReservaCad.getNr_crianças());
                pstm.setInt(10, objReservaCad.getNr_diasEstadia());
                pstm.setString(11, objReservaCad.getServicos_adicionais());
                pstm.setFloat(12, objReservaCad.getTotal_pagar());
                pstm.setInt(13, objReservaCad.getMesEntr());
                pstm.setString(14, objReservaCad.getEmailCliente());
                pstm.execute();
                pstm.close();
                JOptionPane.showMessageDialog(null, "RESERVA EFEICTUADA COM SUCESSO!: ");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "RESERVA_DAO: " + e);
            }
        }





        /////////////////////////// ELIMINAR RESERVA ///////////////////////////////
        public void EliminarReserva(Reserva objReservaDTO){

            //     objReservaDTO.setStatusReserva(false);
            String sql = "UPDATE reservas SET status_reserva = 0 WHERE cod_reserva = ?";

            try {
                conn = new Connection_DAO().connect();
                pstm = conn.prepareStatement(sql);
                pstm.setBoolean(1, objReservaDTO.isStatusReserva());
                //codigo da reserva que deseja "eliminar"
                pstm.setString(2, objReservaDTO.getCod_reserva());
                pstm.execute();
                pstm.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Eliminar DAO" + e);
            }
        }

        //////////////////////// ATUALIZAR DADOS DA RESERVA //////////////////////////


        public void atualizarReserva(Reserva objReservaDTO) throws SQLException, ExecutionException, ClassNotFoundException {
            String sql = "UPDATE reservas SET data_saida =? WHERE cod_reserva = ?";
            conn= new Connection_DAO().connect();
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, objReservaDTO.getData_checkOut());
                pstm.setString(2, objReservaDTO.getCod_reserva());
                pstm.execute();
                pstm.close();
                JOptionPane.showMessageDialog(null, "RESERVA ALTERADA COM SUCESSO! ");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Rersevas DAO Alterar: " + e);
            }
        }
        /////////////////// LISTAR RESERVAS /////////////////////////////////
        ArrayList<Reserva> lista = new ArrayList<>();

        public ArrayList<Reserva> PesquisarReserva() throws SQLException, ExecutionException, ClassNotFoundException {
            String sql = "select * from reservas where status_reserva = 1";
            conn = new Connection_DAO().connect();

            try {
                pstm =  conn.prepareStatement(sql);
                rs= pstm.executeQuery();

                while(rs.next()){
                    Reserva objReservaDTO = new Reserva();
                    objReservaDTO.seIdrReserva(rs.getInt("id_reserva"));
                    objReservaDTO.setData_checkIn(rs.getString("data_entrada"));
                    objReservaDTO.setData_checkOut(rs.getString("data_saida"));
                    objReservaDTO.setCod_reserva(rs.getString("cod_reserva"));
                    objReservaDTO.setStatusReserva(rs.getBoolean("status_reserva"));
                    objReservaDTO.setQuarto(rs.getString("quarto"));
                    objReservaDTO.setTitular(rs.getString("titular_reserva"));
                    objReservaDTO.setNr_hospedes(rs.getInt("nr_hospedes"));
                    objReservaDTO.setNr_adultos(rs.getInt("nr_adultos"));
                    objReservaDTO.setNr_crianças(rs.getInt("nr_crianças"));
                    objReservaDTO.setNr_diasEstadia(rs.getInt("nr_diasEstadia"));
                    objReservaDTO.setServicos_adicionais(rs.getString("servicos_adicionais"));
                    objReservaDTO.setTotal_pagar(rs.getFloat("total_pagar"));


                    lista.add(objReservaDTO);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Pesquisar funcionarioDao" +  e);
            }
            return lista;
        }





    }


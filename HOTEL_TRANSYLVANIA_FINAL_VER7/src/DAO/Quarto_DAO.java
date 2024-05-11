/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Quarto_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author $umeid_ibr
 */
public class Quarto_DAO {
  Connection conectando;
    PreparedStatement pstm;
    ResultSet rs;

    ArrayList<Quarto_DTO> lista = new ArrayList<>();
   public void AtualizarFuncionario(Quarto_DTO  objdto){
       String sql = "update quarto set Tipo = ? , Descricao=?, Localizacao=?,Disponibilidade=?, Numero_quarto=?, Capacidade=?, Preco_Noite=? where Id = ?";

       conectando = new Connection_DAO().connect();

        try {
            pstm = conectando.prepareStatement(sql);
            pstm.setString(1, objdto.getTipo());
            pstm.setString(2, objdto.getDescricao());
            pstm.setString(3, objdto.getLocalizacao());
            pstm.setBoolean(4, objdto.isDisponibilidade());
            pstm.setString(5, objdto.getNumero_quarto());
            pstm.setInt(6, objdto.getCapacidade());
            pstm.setFloat(7, objdto.getPreco_noite());
            pstm.setInt(8, objdto.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Quarto DAO Alterar: " + e);
        }
       
   }
    public ArrayList<Quarto_DTO> PesquisarFuncionario(){
       String sql = "select * from quarto";
       conectando = new Connection_DAO().connect();
       

       try {
          pstm =  conectando.prepareStatement(sql);
          rs= pstm.executeQuery();
          while(rs.next()){
              Quarto_DTO objfuncionariodto = new Quarto_DTO();
              objfuncionariodto.setId(rs.getInt("Id"));
              objfuncionariodto.setTipo(rs.getString("Tipo"));
              objfuncionariodto.setDescricao(rs.getString("Descricao"));
              objfuncionariodto.setLocalizacao(rs.getString("Localizacao"));
              objfuncionariodto.setDisponibilidade(rs.getBoolean("Disponibilidade"));
              objfuncionariodto.setNumero_quarto(rs.getString("Numero_Quarto"));
              objfuncionariodto.setCapacidade(rs.getInt("Capacidade"));
              objfuncionariodto.setPreco_noite(rs.getFloat("Preco_Noite"));
              lista.add(objfuncionariodto);
          }
          
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"Pesquisar Quarto_Dao" +  e);
       }
       return lista;
   }

    ResultSet rs1;


/////////////////////////DISPONIBILIDADE QUARTOS//////////////////////////////////
public ArrayList<String> obterNomeQuartoPorDatas(String dataInicio, String dataFim) {

   ArrayList<String> nomesQuartos = new ArrayList<>();
        String sql = "SELECT quarto FROM reservas WHERE STR_TO_DATE(?,'%d-%m-%Y') BETWEEN STR_TO_DATE(data_entrada,'%d-%m-%Y') AND STR_TO_DATE(data_saida,'%d-%m-%Y') OR STR_TO_DATE(?,'%d-%m-%Y') BETWEEN STR_TO_DATE(data_entrada,'%d-%m-%Y') AND STR_TO_DATE(data_saida,'%d-%m-%Y')";
        String nomeQuarto = "";
        conectando = new Connection_DAO().connect();
        try {
            pstm = conectando.prepareStatement(sql);
            pstm.setString(1, dataInicio);
            pstm.setString(2, dataFim);
            rs1 = pstm.executeQuery();
            while (rs1.next()) {
             nomeQuarto = rs1.getString("quarto");
             nomesQuartos.add(nomeQuarto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nomesQuartos;
    }


}

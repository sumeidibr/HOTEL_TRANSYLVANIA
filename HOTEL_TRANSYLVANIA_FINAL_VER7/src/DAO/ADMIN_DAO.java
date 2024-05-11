/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ADMIN_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ADMIN_DAO {
    
    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    
    ArrayList<ADMIN_DTO> lista = new ArrayList<>();
    
    public ResultSet Autenticacao_Admin(ADMIN_DTO objadmindto){
         rs = null ;
        conexao = new Connection_DAO().connect();
        
        try {
           String sql = "select * from Administradores where Email_Admin=? and Senha_Admin=?";
           pstm = conexao.prepareStatement(sql);
           pstm.setString(1, objadmindto.getAdmin());
           pstm.setString(2, objadmindto.getSenha_Admin());
           rs = pstm.executeQuery();
          return rs;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ADMIN_DAO:  " +  e);
            return null;
        }
        
        
    }
    
    
    public void Atualizar_Admin(ADMIN_DTO objadmindto){
        String sql = "update Administradores set Email_Admin=?,Senha_Admin=? where Id = ?";
        conexao = new Connection_DAO().connect();
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objadmindto.getAdmin());
            pstm.setString(2, objadmindto.getSenha_Admin());
            pstm.setInt(3, objadmindto.getId_Admin());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "ADMIN DAO Alterar: " + e);
        }
        
    }
    
    
    public ArrayList<ADMIN_DTO> Pesquisar_Admin(){
        String sql = "select * from Administradores";
        conexao = new Connection_DAO().connect();
        
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                ADMIN_DTO objadmindto = new ADMIN_DTO();
                objadmindto.setId_Admin(rs.getInt("Id"));
                objadmindto.setAdmin(rs.getString("Nome_Admin"));
                objadmindto.setSenha_Admin(rs.getString("Senha_Admin"));
             lista.add(objadmindto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pesquisar ADMIN DAO " + e);
        }
        return lista;
    }
        

   
    
}

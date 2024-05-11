package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Connection_DAO {
    //CRIAÇÃO E CONEXÃO COM A BASE DE DADOS

    public Connection connect(){

        Connection conn = null;

        try{
            String Url = "jdbc:mysql://localhost:3306/hotel_transylvaniaa?user=root&password=";
            conn = DriverManager.getConnection(Url);


        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro na Conexao DAO", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
}




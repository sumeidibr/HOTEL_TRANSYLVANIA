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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.*;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class  Tela_ADMIN_Relatorio_OcupacaoPorOrigem {
    public static void grafNacionalidades(String mes) {
        Connection conn;
        PreparedStatement pstm;
        ResultSet rs;
        DefaultPieDataset dados = new DefaultPieDataset();
        String sql = "SELECT Nacionalidade, COUNT(*) FROM clientes WHERE Mes_De_Cadastro = ? GROUP BY Nacionalidade";

        conn = new Connection_DAO().connect();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, mes);
            rs = pstm.executeQuery();

            while (rs.next()) {
                String nacionalidade = rs.getString("Nacionalidade");
                int contador = rs.getInt(2);
                String valores2 = nacionalidade ;
                dados.setValue(valores2, contador);

                JFreeChart grafnacional = ChartFactory.createPieChart("Frequencia das Nacionalidades em " + mes, dados, true, true, false);
                PiePlot valores = (PiePlot) grafnacional.getPlot();
                valores.setLabelGenerator(null);
                valores.setExplodePercent("Nacionalidade", 0.1);

                ChartFrame tela = new ChartFrame("Frequencia das Nacionalidades em " + mes, grafnacional);
                tela.pack();
                tela.setVisible(true);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO! IMPOSSIVEL DESENHAR GRAFICO!: " + e);
        }


    }
}


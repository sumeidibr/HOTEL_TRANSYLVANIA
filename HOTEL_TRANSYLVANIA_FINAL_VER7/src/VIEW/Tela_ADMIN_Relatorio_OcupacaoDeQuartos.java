/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;

import DAO.Connection_DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.*;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class  Tela_ADMIN_Relatorio_OcupacaoDeQuartos  {

    public void grafQuartos(String mes) {
        Connection conn;
        PreparedStatement pstm;
        ResultSet rs;
        DefaultPieDataset dados = new DefaultPieDataset();
        String sql = "SELECT quarto, COUNT(*) FROM reservas WHERE mes_entrada = ? GROUP BY quarto";
        conn = new Connection_DAO().connect();
        try {
            pstm = conn.prepareStatement(sql);
            //mes = mestxt.getText();
            pstm.setString(1, mes);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String quarto = rs.getString("quarto");
                int contador = rs.getInt(2);
                String valores2 = quarto + " (" + contador + ")";
                dados.setValue(valores2, contador);

                JFreeChart grafQuartos = ChartFactory.createPieChart("Frequencia da ocupacao dos quartos em " + mes, dados, true, true, false);
                PiePlot valores = (PiePlot) grafQuartos.getPlot();
                valores.setLabelGenerator(null);
                valores.setExplodePercent("quarto", 0.1);

                ChartFrame tela = new ChartFrame("Frequencia da ocupacao dos quartos em " + mes, grafQuartos);
                tela.pack();
                tela.setVisible(true);
                tela.setSize(700, 700);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (Exception l) {
            JOptionPane.showMessageDialog(null, "ERRO! IMPOSSIVEL DESENHAR GRAFICO!: " + l);
        }
    }

}


package Modelo;

import Utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ModeloTipo {
    
    Connection con;
    
    public ModeloTipo() {
        con = ConnectionFactory.getConnection();
    }

    public void addTipo(String tipo) {       
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO `tipo` (`id`, `descricao`) VALUES (NULL, ?)");
            stmt.setString(1, tipo);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tipo Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}

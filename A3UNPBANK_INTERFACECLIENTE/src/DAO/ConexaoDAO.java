package DAO;


/**
 * @author tosca
 */
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    
    public Connection unpbank(){
        Connection conn = null;
        
        try {
          String url = "jdbc:mysql://localhost:3306/unpbank?user=root&password=password";  
          conn = DriverManager.getConnection(url);
                  
        } catch (SQLException Erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + Erro.getMessage());
        }
        return conn;
        }
    }
    


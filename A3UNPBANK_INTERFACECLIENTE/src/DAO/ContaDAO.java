
package DAO;

import DTO.ContaDTO;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ContaDAO {
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario(ContaDTO objcontadto){
        conn = new ConexaoDAO().unpbank();
        
        try {
            
            String sql = "select * from contacorrente where id_conta = ? and senha_conta = ? ";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objcontadto.getId_conta());
            pstm.setString(2, objcontadto.getSenha_conta());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
                    
        } catch(SQLException Erro){
            JOptionPane.showMessageDialog(null, "ContaDAO" +Erro);
            return null;     
        }
        
        
        
    }
    
}

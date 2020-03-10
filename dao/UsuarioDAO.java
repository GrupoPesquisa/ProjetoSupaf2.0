
package dao;

import entity.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.sql.Connection;
/**
 *
 * @author aluno
 */
public class UsuarioDAO {
    
    public Usuario validarUsuario(String login, String senha) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT login, senha FROM usuario  WHERE login = ?  and senha = ?  ");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Usuario usuario = new Usuario (rs.getString("login"),rs.getString("senha"));
                return usuario;        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }
}

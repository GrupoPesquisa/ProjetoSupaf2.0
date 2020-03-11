package dao;
/**
 *
 * @author Joherveson
 */
import entity.Curso;
import entity.Endereco;
import entity.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class ProfessorDAO {

    public void adicionarProfessor(Professor professor) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO Endereco VALUES(?,?,?,?,?,?,?,?)");
            stmt.setLong(1, professor.getEndereco().getCodigo());
            stmt.setString(2, professor.getEndereco().getRua());
            stmt.setString(3, professor.getEndereco().getComplemento());
            stmt.setString(4, professor.getEndereco().getCidade());
            stmt.setString(5, professor.getEndereco().getBairro());
            stmt.setString(6, professor.getEndereco().getEstado());
            stmt.setLong(7, professor.getEndereco().getCep());
            stmt.setInt(8, professor.getEndereco().getNumero());
            
            stmt.executeUpdate();
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO Professor VALUES(?,?,?,?,?)");
            stmt.setInt(1, professor.getMatricula());
            stmt.setString(2, professor.getNome());
            stmt.setInt(3, professor.getCelular());
            stmt.setLong(4, professor.getEndereco().getCodigo());
            stmt.setInt(5, professor.getCurso().getCodigo());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public List<Professor> listarProfessor() {
        List<Professor> listaRetorno = new LinkedList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Professor p INNER JOIN endereco e ON (p.id_professor = e.id_endereco) INNER JOIN curso c ON (p.id_professor = c.id_curso)   ORDER  BY id_professor");
            rs = stmt.executeQuery();

            while (rs.next()) {
                 Professor professor = new Professor (rs.getInt("matricula"),rs.getInt("celular"),rs.getString("nome"),
                    new Endereco(rs.getInt("codigo"), rs.getString("rua"), rs.getString("complemento"), rs.getString("cidade"), rs.getString("bairro"),rs.getString("estado"),rs.getLong("cep"), rs.getInt("numero")),
                    new Curso(rs.getInt("codigo"),rs.getString("nome")));
                listaRetorno.add(professor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }


    public Professor getProfessorPeloCodigo(int matricula) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Professor WHERE matricula=?");
            stmt.setInt(1, matricula);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Professor professor = new Professor (rs.getInt("matricula"), rs.getInt("celular"),rs.getString("nome"),
                    new Endereco(rs.getInt("codigo"), rs.getString("rua"), rs.getString("complemento"), rs.getString("cidade"), rs.getString("bairro"),rs.getString("estado"),rs.getLong("cep"), rs.getInt("numero")),
                    new Curso(rs.getInt("codigo"),rs.getString("nome")));

                return professor;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }
   

    public void updateProfessor(Professor professor) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE Professor SET nome=?, celular=?, fk_id_endereco=?, fk_id_curso=? WHERE matricula=?");
            stmt.setString(1, professor.getNome());
            stmt.setInt(2, professor.getCelular());
            stmt.setLong(3, professor.getEndereco().getCodigo());
            stmt.setInt(4, professor.getCurso().getCodigo());
            stmt.setInt(5, professor.getMatricula());
           
           

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public void deletarProfessor(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM Professor WHERE matricula=?");
            stmt.setInt(1, codigo);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
}




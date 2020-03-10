package dao;


import entity.Curso;
import entity.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class TurmaDAO {
    

public void adicionarTurma(Turma turma) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO Turma VALUES(?,?,?)");
            stmt.setInt(1, turma.getCodigo());
            stmt.setString(2, turma.getNome());
            stmt.setInt(3, turma.getCurso().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public List<Turma> listarTurmas() {
        List<Turma> listaRetorno = new LinkedList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Turma t INNER JOIN Curso c ON ( t.id_turma = id_curso )" );
            rs = stmt.executeQuery();

            while (rs.next()) {
                Turma turma = new Turma(rs.getInt("id_turma"),
                        rs.getString("nome"), new Curso (rs.getInt("id_curso"),
                        rs.getString("nome")));
                listaRetorno.add(turma);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }

    public Turma getTurmaPeloCodigo(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Turma t INNER JOIN Curso c ON ( t.fk_id_curso = id_curso ) WHERE id_turma=?");
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Turma turma;
                turma = new Turma(rs.getInt("id_turma"),
                        rs.getString("nome"), new Curso (rs.getInt("id_curso"),
                        rs.getString("nome")));
                return turma;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }



    public void updateTurma(Turma turma) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE Turma SET nome=?, fk_id_curso=? WHERE id_turma=?");
            stmt.setString(1, turma.getNome());     
            stmt.setInt(2, turma.getCurso().getCodigo());
            stmt.setInt(3, turma.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public void deletarTurma(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM Turma WHERE id_turma=?");
            stmt.setInt(1, codigo);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
}


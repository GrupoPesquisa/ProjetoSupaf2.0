
package dao;

import entity.Aluno;
import entity.Curso;
import entity.Endereco;
import entity.Parq;
import entity.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ParqDAO {

    public void adicionarParq(Parq parq) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO par_q VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setLong(1, parq.getCodigo());
            stmt.setBoolean(2, parq.getProblCardiaco());
            stmt.setBoolean(3, parq.getDoresPeito());
            stmt.setBoolean(4, parq.getDesmaioFreq());
            stmt.setBoolean(5, parq.getDesmaioFreq());
            stmt.setBoolean(6, parq.getPressaoArt());
            stmt.setBoolean(7, parq.getRNPraticar());
            stmt.setBoolean(8, parq.getMais65Anos());
            stmt.setLong(9, parq.getAluno().getMatricula());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public List<Parq> listarParq() {
        List<Parq> listaRetorno = new LinkedList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM PARQ x INNER JOIN Aluno a ON (x.fk_id_aluno = a.id_aluno) INNER JOIN Endereco e ON (x.fk_id_aluno = e.id_endereco) INNER JOIN Curso c ON (x.fk_id_aluno = c.id_curso) INNER JOIN Turma t ON (x.fk_id_aluno = t.id_turma) INNER JOIN ParentescoAluno p ON (x.fk_id_aluno = p.id_Parentesco)   INNER JOIN Contato c ON (x.fk_id_aluno = c.id_contato)");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Parq parq = new Parq(rs.getLong("codigo"),rs.getBoolean("probl_cardiaco"),rs.getBoolean("dores_peito"), rs.getBoolean("desmaio_freq"),rs.getBoolean("pressao_art"),rs.getBoolean("p_osseo_articular"),rs.getBoolean("r_n_praticar"), rs.getBoolean("mais65anos"), 
                         new Aluno (rs.getLong("matricula"),rs.getString("nome"),rs.getDate("dataN"),rs.getInt("idade"),rs.getString("sexo"),rs.getString("celular"),rs.getString("email"),rs.getString("telefone"),
                        new Endereco(rs.getInt("id_endereco"), rs.getString("rua"), rs.getString("complemento"), rs.getString("cidade"), rs.getString("bairro"),rs.getString("estado"),rs.getInt("cep"), rs.getInt("numero")),
                        new Curso (rs.getInt("id_curso"),rs.getString("nome")), new Turma(rs.getInt("id_turma"),rs.getString("nome"), new Curso (rs.getInt("id_curso"), rs.getString("nome")))));   
                listaRetorno.add(parq);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }


    public Parq getParqPeloCodigo(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Parq WHERE id_parq=?");
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Parq parq; 
                parq = new Parq(rs.getLong("codigo"),rs.getBoolean("probl_cardiaco"),rs.getBoolean("dores_peito"),
                rs.getBoolean("desmaio_freq"),rs.getBoolean("pressao_art"),rs.getBoolean("p_osseo_articular"),rs.getBoolean("r_n_praticar"),
                rs.getBoolean("mais65anos"), 
                         new Aluno (rs.getLong("matricula"),rs.getString("nome"),rs.getDate("dataN"),rs.getInt("idade"),rs.getString("sexo"),rs.getString("celular"),rs.getString("email"),rs.getString("telefone"),
                        new Endereco(rs.getInt("id_endereco"), rs.getString("rua"), rs.getString("complemento"), rs.getString("cidade"), rs.getString("bairro"),rs.getString("estado"),rs.getInt("cep"), rs.getInt("numero")),
                        new Curso (rs.getInt("id_curso"),rs.getString("nome")), new Turma(rs.getInt("id_turma"),rs.getString("nome"), new Curso (rs.getInt("id_curso"), rs.getString("nome")))));   
                return parq;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }
   

    public void updateParq(Parq parq) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE par_q SET problema_cardiaco=?,dores_peito=?,desmaio_frequencia=?,pressao_arterial=?,p_osseo_articular=?,r_n_praticar=?,mais65Anos=?,fk_matricula=? WHERE id_parq=?");
            stmt.setBoolean(1, parq.getProblCardiaco());
            stmt.setBoolean(2, parq.getDoresPeito());
            stmt.setBoolean(3, parq.getDesmaioFreq());
            stmt.setBoolean(4, parq.getPressaoArt());
            stmt.setBoolean(5, parq.getProbOsseo());
            stmt.setBoolean(6, parq.getRNPraticar());
            stmt.setBoolean(7, parq.getMais65Anos());
            stmt.setLong(8, parq.getAluno().getMatricula());
            stmt.setLong(9, parq.getCodigo());

            

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public void deletarParq(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM par_q WHERE id_parq=?");
            stmt.setInt(1, codigo);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
}
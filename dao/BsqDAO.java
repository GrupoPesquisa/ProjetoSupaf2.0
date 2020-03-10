package dao;

import entity.Aluno;
import entity.Bsq;
import entity.Curso;
import entity.Endereco;
import entity.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class BsqDAO {

    public void adicionarBsq(Bsq bsq) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO Bsq VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setLong(1, bsq.getCodigo());
            stmt.setInt(2, bsq.getSentirIntediadoFF());
            stmt.setInt(3, bsq.getPreocupadoDieta());
            stmt.setInt(4, bsq.getParteCorpocqdG());
            stmt.setInt(5, bsq.getMedoFicarG());
            stmt.setInt(6, bsq.getSatisfeitoSentirG());
            stmt.setInt(7, bsq.getMalCorpoChorar());
            stmt.setInt(8, bsq.getCorrerCorpoBalanca());
            stmt.setInt(9, bsq.getHmagrosPreocupacaoFF());
            stmt.setInt(10, bsq.getPreocupacaoPcorpoEspalhar());
            stmt.setInt(11, bsq.getSentirgMenosComida());
            stmt.setInt(12, bsq.getFisicoHmComparar());
            stmt.setInt(13, bsq.getFisicoConcentracaoPartic());
            stmt.setInt(14, bsq.getNuBanhoCorpo());
            stmt.setInt(15, bsq.getEvitarRoupaFcorpo());
            stmt.setInt(16, bsq.getCortaPorcoesCorpo());
            stmt.setInt(17, bsq.getComerCaloriasSentirG());
            stmt.setInt(18, bsq.getParticSentirMalF());
            stmt.setInt(19, bsq.getSentirExcessoG());
            stmt.setInt(20, bsq.getVergonhaCorpo());
            stmt.setInt(21, bsq.getPreocupFisicoDieta());
            stmt.setInt(22, bsq.getSentirContenteEstomagoV());
            stmt.setInt(23, bsq.getFisicoFaltaAutocontrole());
            stmt.setInt(24, bsq.getPreocupPessoasVDobras());
            stmt.setInt(25, bsq.getAcharInjustoPessoasM());
            stmt.setInt(26, bsq.getVomitoSentirMagro());
            stmt.setInt(27, bsq.getAcompanhadoPEspaco());
            stmt.setInt(28, bsq.getPreocuparSurgirDobrasCor());
            stmt.setInt(29, bsq.getReflexoRelacaoFisica());
            stmt.setInt(30, bsq.getBeliscaCorpoGordura());
            stmt.setInt(31, bsq.getEvitarSituacoesVerCorp());
            stmt.setInt(32, bsq.getLaxantesSentirMagro());
            stmt.setInt(33, bsq.getConcienteFisicoCompanhiaPess());
            stmt.setInt(34, bsq.getPreocupacaoFisicoExercicio());          
            stmt.setLong(35, bsq.getAluno().getMatricula());
            
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public List<Bsq> listarBsq() {
        List<Bsq> listaRetorno = new LinkedList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement ("SELECT * FROM Bsq b INNER JOIN Aluno a ON (b.fk_id_aluno = a.id_aluno) INNER JOIN Endereco e ON (b.fk_id_aluno = e.id_endereco) INNER JOIN Curso c ON (b.fk_id_aluno = c.id_curso) INNER JOIN Turma t ON (b.fk_id_aluno = t.id_turma)");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Bsq bsq;
                bsq = new Bsq(rs.getLong("id_bsq"),rs.getInt("sentir_intediado_ff"),rs.getInt("preocupado_ff_dieta"),rs.getInt("parte_corpo_cqdg")
                ,rs.getInt("medo_ficar_g"),rs.getInt("satisfeito_sentir_g"),rs.getInt("mal_corpo_chorar"),rs.getInt("correr_corpo_balanca")
                ,rs.getInt("hmagros_preocupacao_ff"),rs.getInt("preocupacao_pcorpo_espalhar"),rs.getInt("sentirg_menos_comida")
                ,rs.getInt("fisico_hm_comparar"),rs.getInt("fisico_concentracao_partic"),rs.getInt("nu_banho_corpo"),rs.getInt("evitar_roupa_fcorpo")
                ,rs.getInt("corta_porcoes_corpo"),rs.getInt("comer_calorias_sentirg"),rs.getInt("partic_sentir_malf"),rs.getInt("sentir_excesso_g")
                ,rs.getInt("vergonha_corpo"),rs.getInt("preocup_fisico_dieta"),rs.getInt("sentir_contente_estomagoV"),rs.getInt("fisico_falta_autocontrole")
                ,rs.getInt("preocup_pessoasv_dobras"),rs.getInt("achar_injusto_pessoasm"),rs.getInt("vomito_sentir_magro"),rs.getInt("acompanhadop_espaco")
                ,rs.getInt("preocupar_surgir_dobrascor"),rs.getInt("reflexo_relacao_fisica"),rs.getInt("belisca_corpo_gordura"),rs.getInt("evitar_situacoes_verCorp"),rs.getInt("laxantes_sentir_magro"),rs.getInt("conciente_fisico_companhiapess"),rs.getInt("preocupacao_fisico_exercicio"), 
                        new Aluno (rs.getLong("matricula"),rs.getString("nome"),rs.getDate("dataN"),rs.getInt("idade"),rs.getString("sexo"),rs.getString("celular"),rs.getString("email"),rs.getString("telefone"),
                        new Endereco(rs.getLong("id_endereco"), rs.getString("rua"), rs.getString("cidade"), rs.getString("bairro"), rs.getString("complemento"),rs.getString("estado"),rs.getInt("cep"), rs.getInt("numero")),                       
                        new Curso (rs.getInt("id_curso"),rs.getString("nome")), 
                        new Turma(rs.getInt("id_turma"),rs.getString("nome"), 
                        new Curso (rs.getInt("id_curso"), rs.getString("nome")))));
                                }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }


    public Bsq getBsqPeloCodigo(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Bsq WHERE id_bsq=?");
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Bsq bsq;
                bsq = new  Bsq(rs.getLong("id_bsq"),rs.getInt("sentir_intediado_ff"),rs.getInt("preocupado_ff_dieta"),rs.getInt("parte_corpo_cqdg")
                ,rs.getInt("medo_ficar_g"),rs.getInt("satisfeito_sentir_g"),rs.getInt("mal_corpo_chorar"),rs.getInt("correr_corpo_balanca")
                ,rs.getInt("hmagros_preocupacao_ff"),rs.getInt("preocupacao_pcorpo_espalhar"),rs.getInt("sentirg_menos_comida")
                ,rs.getInt("fisico_hm_comparar"),rs.getInt("fisico_concentracao_partic"),rs.getInt("nu_banho_corpo"),rs.getInt("evitar_roupa_fcorpo")
                ,rs.getInt("corta_porcoes_corpo"),rs.getInt("comer_calorias_sentirg"),rs.getInt("partic_sentir_malf"),rs.getInt("sentir_excesso_g")
                ,rs.getInt("vergonha_corpo"),rs.getInt("preocup_fisico_dieta"),rs.getInt("sentir_contente_estomagoV"),rs.getInt("fisico_falta_autocontrole")
                ,rs.getInt("preocup_pessoasv_dobras"),rs.getInt("achar_injusto_pessoasm"),rs.getInt("vomito_sentir_magro"),rs.getInt("acompanhadop_espaco")
                ,rs.getInt("preocupar_surgir_dobrascor"),rs.getInt("reflexo_relacao_fisica"),rs.getInt("belisca_corpo_gordura"),rs.getInt("evitar_situacoes_verCorp"),rs.getInt("laxantes_sentir_magro"),rs.getInt("conciente_fisico_companhiapess"),rs.getInt("preocupacao_fisico_exercicio"),
                        new Aluno (rs.getLong("matricula"),rs.getString("nome"),rs.getDate("dataN"),rs.getInt("idade"),rs.getString("sexo"),rs.getString("celular"),rs.getString("email"),rs.getString("telefone"),
                        new Endereco(rs.getLong("id_endereco"), rs.getString("rua"), rs.getString("complemento"), rs.getString("cidade"), rs.getString("bairro"),rs.getString("estado"),rs.getInt("cep"), rs.getInt("numero")),
                        new Curso (rs.getInt("id_curso"),rs.getString("nome")), 
                        new Turma(rs.getInt("id_turma"),rs.getString("nome"), 
                        new Curso (rs.getInt("id_curso"), rs.getString("nome")))));
                return bsq;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }
   

    public void updateBsq(Bsq bsq) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE Bsq SET sentirIntediadoFF=?,preocupadoDieta=?,parteCorpocqdG=?,medoFicarG=?,satisfeitoSentirG=?,malCorpoChorar=?,correrCorpoBalanca=?,hmagrosPreocupacaoFF=?,preocupacaoPcorpoEspalhar=?,sentirgMenosComida=?,fisicoHmComparar=?,fisicoConcentracaoPartic=?,nuBanhoCorpo=?,evitarRoupaFcorpo=?,cortaPorcoesCorpo=?,comerCaloriasSentirG=?,particSentirMalF=?,sentirExcessoG=?,vergonhaCorpo=?,preocupFisicoDieta=?,sentirContenteEstomagoV=?,fisicoFaltaAutocontrole=?,fisicoFaltaAutocontrole=?,preocupPessoasVDobras=?,acharInjustoPessoasM=?,vomitoSentirMagro=?,acompanhadoPEspaco=?,preocuparSurgirDobrasCor=?,reflexoRelacaoFisica=?,beliscaCorpoGordura=?,evitarSituacoesVerCorp=?,laxantesSentirMagro=?,concienteFisicoCompanhiaPess=?,preocupacaoFisicoExercicio=?, aluno=?  WHERE id_bsq=?");
            stmt.setLong(1, bsq.getCodigo());
            stmt.setInt(2, bsq.getSentirIntediadoFF());
            stmt.setInt(3, bsq.getPreocupadoDieta());
            stmt.setInt(4, bsq.getParteCorpocqdG());
            stmt.setInt(5, bsq.getMedoFicarG());
            stmt.setInt(6, bsq.getSatisfeitoSentirG());
            stmt.setInt(7, bsq.getMalCorpoChorar());
            stmt.setInt(8, bsq.getCorrerCorpoBalanca());
            stmt.setInt(9, bsq.getHmagrosPreocupacaoFF());
            stmt.setInt(10, bsq.getPreocupacaoPcorpoEspalhar());
            stmt.setInt(11, bsq.getSentirgMenosComida());
            stmt.setInt(12, bsq.getFisicoHmComparar());
            stmt.setInt(13, bsq.getFisicoConcentracaoPartic());
            stmt.setInt(14, bsq.getNuBanhoCorpo());
            stmt.setInt(15, bsq.getEvitarRoupaFcorpo());
            stmt.setInt(16, bsq.getCortaPorcoesCorpo());
            stmt.setInt(17, bsq.getComerCaloriasSentirG());
            stmt.setInt(18, bsq.getParticSentirMalF());
            stmt.setInt(19, bsq.getSentirExcessoG());
            stmt.setInt(20, bsq.getVergonhaCorpo());
            stmt.setInt(21, bsq.getPreocupFisicoDieta());
            stmt.setInt(22, bsq.getSentirContenteEstomagoV());
            stmt.setInt(23, bsq.getFisicoFaltaAutocontrole());
            stmt.setInt(24, bsq.getPreocupPessoasVDobras());
            stmt.setInt(25, bsq.getAcharInjustoPessoasM());
            stmt.setInt(26, bsq.getVomitoSentirMagro());
            stmt.setInt(27, bsq.getAcompanhadoPEspaco());
            stmt.setInt(28, bsq.getPreocuparSurgirDobrasCor());
            stmt.setInt(29, bsq.getReflexoRelacaoFisica());
            stmt.setInt(30, bsq.getBeliscaCorpoGordura());
            stmt.setInt(31, bsq.getEvitarSituacoesVerCorp());
            stmt.setInt(32, bsq.getLaxantesSentirMagro());
            stmt.setInt(33, bsq.getConcienteFisicoCompanhiaPess());
            stmt.setInt(34, bsq.getPreocupacaoFisicoExercicio());          
            stmt.setLong(35, bsq.getAluno().getMatricula());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public void deletarBsq(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM Bsq WHERE id_bsq=?");
            stmt.setInt(1, codigo);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
}
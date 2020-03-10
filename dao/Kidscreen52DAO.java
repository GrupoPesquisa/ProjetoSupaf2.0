package dao;

import entity.Aluno;
import entity.AnimoEmocional;
import entity.AssuntosFinanceiros;
import entity.Curso;
import entity.Endereco;
import entity.Kidscreen52;
import entity.SaudeATF;
import entity.Sentimentos;
import entity.SeusAmigos;
import entity.SuaEscola;
import entity.TempoLivre;
import entity.Turma;
import entity.VidaFamiliar;
import entity.VoceEosDemais;
import entity.VoceMesmo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class Kidscreen52DAO {
   

public void adicionarKidscreen52(Kidscreen52 kidscreen52) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO kidscreen_52 VALUES(?,?,?,?,?,?)");
            stmt.setLong(1, kidscreen52.getCodigo());
            stmt.setDate(2, new Date (kidscreen52.getDataH().getTime()));
            stmt.setString(3,kidscreen52.getSexo());
            stmt.setString(4, kidscreen52.getDoencaCDeficiencia());
            stmt.setString(5,kidscreen52.getTipoD());
            stmt.setLong(6, kidscreen52.getAluno().getMatricula());
            
            stmt.executeUpdate();
            
            
            stmt = conexao.prepareStatement("INSERT INTO sentimentos VALUES(?,?,?,?,?,?,?)");
            stmt.setLong(1, kidscreen52.getCodigo());
            stmt.setInt(2, kidscreen52.getSentimentos().getDesfrutadoVida());
            stmt.setInt(3, kidscreen52.getSentimentos().getSsentidoContente());
            stmt.setInt(4, kidscreen52.getSentimentos().getSentidoSatisfeito());
            stmt.setInt(5, kidscreen52.getSentimentos().getEstadoHumor());
            stmt.setInt(6, kidscreen52.getSentimentos().getSentidoAlegre());
            stmt.setInt(7, kidscreen52.getSentimentos().getSeDivertido());

            stmt.executeUpdate();
            
            stmt = conexao.prepareStatement("INSERT INTO saude_atf VALUES(?,?,?,?,?)");
            stmt.setLong(1, kidscreen52.getCodigo());
            stmt.setInt(2, kidscreen52.getSaudeATF().getSuaSaude());
            stmt.setInt(3, kidscreen52.getSaudeATF().getSentidoBeF()); 
            stmt.setInt(4, kidscreen52.getSaudeATF().getFisicamenteAtv());
            stmt.setInt(5, kidscreen52.getSaudeATF().getPodidoCorrer());
            
            stmt.executeUpdate();
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO tempo_livre VALUES(?,?,?,?,?,?)");
            stmt.setLong(1, kidscreen52.getCodigo());
            stmt.setInt(2, kidscreen52.getTempoLivre().getTempoVcMesmo());
            stmt.setInt(3, kidscreen52.getTempoLivre().getFzrTempolivre());
            stmt.setInt(4, kidscreen52.getTempoLivre().getOportunidadeArLivre());
            stmt.setInt(5, kidscreen52.getTempoLivre().getTempoAmigos());
            stmt.setInt(6, kidscreen52.getTempoLivre().getEscolhidoTempoLivre());

            stmt.executeUpdate();
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO seus_amigos VALUES(?,?,?,?,?,?,?)");
            stmt.setLong(1, kidscreen52.getCodigo());
            stmt.setInt(2, kidscreen52.getSeusAmigos().getEstarAmigos());
            stmt.setInt(3, kidscreen52.getSeusAmigos().getRealizarTarefasJovens());
            stmt.setInt(4, kidscreen52.getSeusAmigos().getDivertidoAmigos());
            stmt.setInt(5, kidscreen52.getSeusAmigos().getAmigosAjudaOutros());
            stmt.setInt(6, kidscreen52.getSeusAmigos().getFalarTudoCamigos());
            stmt.setInt(7, kidscreen52.getSeusAmigos().getConfiancaAmigos());

            stmt.executeUpdate();
            
            stmt = conexao.prepareStatement("INSERT INTO animo_emocional VALUES(?,?,?,?,?,?,?,?)");
            stmt.setLong(1, kidscreen52.getCodigo());
            stmt.setInt(2, kidscreen52.getAnimoEmocional().getSensacaoFzrErrado());
            stmt.setInt(3, kidscreen52.getAnimoEmocional().getSentidoTriste()); 
            stmt.setInt(4, kidscreen52.getAnimoEmocional().getSentidoMalFzrnada());
            stmt.setInt(5, kidscreen52.getAnimoEmocional().getSensacaoVidaMal());
            stmt.setInt(6, kidscreen52.getAnimoEmocional().getSentidoCheioVida());
            stmt.setInt(7, kidscreen52.getAnimoEmocional().getSentidoSo());
            stmt.setInt(8, kidscreen52.getAnimoEmocional().getSentidoPressao());
           
            
            stmt.executeUpdate();
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO assuntos_financeiros VALUES(?,?,?,?)");
            stmt.setLong(1, kidscreen52.getCodigo());
            stmt.setInt(2, kidscreen52.getAssuntosFinanceiros().getDinheiroSuficiente());
            stmt.setInt(3, kidscreen52.getAssuntosFinanceiros().getDinheiroSuficienteGastos());
            stmt.setInt(4, kidscreen52.getAssuntosFinanceiros().getDinheiroSuficienteAmigos());
            
            stmt.executeUpdate();
            
            stmt = conexao.prepareStatement("INSERT INTO vida_familiar VALUES(?,?,?,?,?,?,?)");
            stmt.setLong(1, kidscreen52.getCodigo());
            stmt.setInt(2, kidscreen52.getVidaFamiliar().getEntendimentoPais());
            stmt.setInt(3, kidscreen52.getVidaFamiliar().getSentqueridoPais()); 
            stmt.setInt(4, kidscreen52.getVidaFamiliar().getFelizCasa());
            stmt.setInt(5, kidscreen52.getVidaFamiliar().getTempPais());
            stmt.setInt(6, kidscreen52.getVidaFamiliar().getTratJustoPais());
            stmt.setInt(7, kidscreen52.getVidaFamiliar().getDialogoPais());
            
            stmt.executeUpdate();
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO voce_mesmo VALUES(?,?,?,?,?,?)");
            stmt.setLong(1, kidscreen52.getCodigo());
            stmt.setInt(2, kidscreen52.getVoceMesmo().getContenteManeira());
            stmt.setInt(3, kidscreen52.getVoceMesmo().getContenteRoupas());
            stmt.setInt(4, kidscreen52.getVoceMesmo().getPreocupadoAspcto());
            stmt.setInt(5, kidscreen52.getVoceMesmo().getInvejaColegas());
            stmt.setInt(6, kidscreen52.getVoceMesmo().getParteCorpoMudar());

            stmt.executeUpdate();
            
            stmt = conexao.prepareStatement("INSERT INTO sua_escola VALUES(?,?,?,?,?,?,?)");
            stmt.setLong(1, kidscreen52.getCodigo());
            stmt.setInt(2, kidscreen52.getSuaEscola().getSentindoFelizEscola());
            stmt.setInt(3, kidscreen52.getSuaEscola().getBemNosEstudos()); 
            stmt.setInt(4, kidscreen52.getSuaEscola().getSatisfeitoCprofessores());
            stmt.setInt(5, kidscreen52.getSuaEscola().getPrestadoAtencaoAulas());
            stmt.setInt(6, kidscreen52.getSuaEscola().getGostairEscola());
            stmt.setInt(7, kidscreen52.getSuaEscola().getRelacaoCprofessores());
             
            stmt.executeUpdate();
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO voce_eosdemais VALUES(?,?,?,?)");
            stmt.setLong(1, kidscreen52.getCodigo());
            stmt.setInt(2, kidscreen52.getVoceEosDemais().getMedoRapazesMocas());
            stmt.setInt(3, kidscreen52.getVoceEosDemais().getRapazesZombadoVoce());
            stmt.setInt(4, kidscreen52.getVoceEosDemais().getRapEmocIntimidandoVoce());

            stmt.executeUpdate();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public List<Kidscreen52> listarKidscreen52() {
        List<Kidscreen52> listaRetorno = new LinkedList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM kidscreen_52 k INNER JOIN SaudeATF s ON (k.fk_id_SaudeATF = s.id_SaudeATF) INNER JOIN Sentimentos o ON (k.fk_id_Sentimentos = o.id_Sentimentos) INNER JOIN TempoLivre t ON (k.id_kidscreen52 = t.id_TempoLivre) INNER JOIN SeusAmigos x ON (k.id_kidscreen52 = x.id_SeusAmigos) INNER JOIN AnimoEmocional j ON (k.id_kidscreen52 = j.id_AnimoEmocional) INNER JOIN AssuntosFinanceiros f ON (k.id_kidscreen52 = f.id_AssuntosFinanceiros) INNER JOIN VidaFamiliar v ON (k.id_kidscreen52 = v.id_VidaFamiliar) INNER JOIN VoceMesmo r ON (k.id_kidscreen52 = r.id_VoceMesmo) INNER JOIN SuaEscola z ON (k.id_kidscreen52 = z.id_SuaEscola) INNER JOIN VoceEosDemais w ON (k.id_kidscreen52 = w.id_VoceEosDemais) INNER JOIN Aluno a ON (k.fk_id_aluno = a.id_aluno) INNER JOIN Endereco e ON (k.fk_id_aluno = e.id_endereco) INNER JOIN Curso c ON (k.fk_id_aluno = c.id_curso) INNER JOIN Turma t ON (k.fk_id_aluno = t.id_turma) INNER JOIN ParentescoAluno p ON (k.fk_id_aluno = p.id_Parentesco)");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Kidscreen52 kidscreen52;
                kidscreen52 = new Kidscreen52(rs.getLong("id_kid"),rs.getDate("datah"),rs.getString("sexo"), new SaudeATF(rs.getLong("id_saude"),rs.getInt("sua_saude"),rs.getInt("sentido_bef"),rs.getInt("fisicamente_atv"),rs.getInt("fisicamente_atv")),
                    new Sentimentos(rs.getLong("id_sentimentos"),rs.getInt("desfrutado_vida"),rs.getInt("sentido_contente"),rs.getInt("sentido_satisfeito"),rs.getInt("estado_humor"),rs.getInt("sentido_alegre"), rs.getInt("se_divertido")),
                    new TempoLivre(rs.getLong("id_amigos"),rs.getInt("tempo_vc_mesmo"),rs.getInt("fzrTempolivre"),rs.getInt("oportunidadeArLivre"),rs.getInt("tempoAmigos"),rs.getInt("escolhidoTempoLivre")),
                    new SeusAmigos(rs.getLong("id_amigos"),rs.getInt("estar_amigos"),rs.getInt("realizar_tarefas_jovens"),rs.getInt("divertidoAmigos"),rs.getInt("amigosAjudaOutros"),rs.getInt("falarTudoCamigos"),rs.getInt("confiancaAmigos")),
                    new AnimoEmocional(rs.getLong("codigo"),rs.getInt("sensacaoFzrErrado"),rs.getInt("sentidoTriste"),rs.getInt("sentidoMalFzrNada"),rs.getInt("sensacaoVidaMal"),rs.getInt("sentidoCheioVida"),rs.getInt("sentidoSo"),rs.getInt("sentidoPressao")),
                    new AssuntosFinanceiros(rs.getLong("codigo"),rs.getInt("dinheiroSuficiente"),rs.getInt("dinheiroSuficienteGastos"),rs.getInt("dinheiroSuficienteAmigos")),
                    new VidaFamiliar(rs.getLong("codigo"),rs.getInt("entendimentoPais"),rs.getInt("sentqueridoPais"),rs.getInt("felizCasa"),rs.getInt("tempPais"),rs.getInt("tratJustoPais"),rs.getInt("dialogoPais")),
                    new VoceMesmo(rs.getLong("codigo"),rs.getInt("contenteManeira"),rs.getInt("contenteRoupas"),rs.getInt("preocupadoAspcto"),rs.getInt("invejaColegas"),rs.getInt("parteCorpoMudar")),
                    new SuaEscola(rs.getLong("codigo"),rs.getInt("sentindoFelizEscola"),rs.getInt("bemNosEstudos"),rs.getInt("satisfeitoCprofessores"),rs.getInt("prestadoAtencaoAulas"),rs.getInt("gostairEscola"),rs.getInt("relacaoCprofessores")),
                    new VoceEosDemais(rs.getLong("codigo"),rs.getInt("medoRapazesMocas"),rs.getInt("rapazesZombadoVoce"),rs.getInt("rapEmocIntimidandoVoce")), rs.getString("DoencaCDeficiencia"), rs.getString("TipoD"),
                    new Aluno (rs.getLong("matricula"),rs.getString("nome"),rs.getDate("dataN"),rs.getInt("idade"),rs.getString("sexo"),rs.getString("celular"),rs.getString("email"),rs.getString("telefone"),
                    new Endereco(rs.getLong("id_endereco"), rs.getString("rua"), rs.getString("cidade"), rs.getString("bairro"), rs.getString("complemento"),rs.getString("estado"),rs.getInt("cep"), rs.getInt("numero")),                       
                    new Curso (rs.getInt("id_curso"),rs.getString("nome")), new Turma(rs.getInt("id_turma"),rs.getString("nome"), new Curso (rs.getInt("id_curso"), rs.getString("nome")))));
                listaRetorno.add(kidscreen52);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }

    public Kidscreen52 getKidscreen52PeloCodigo(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM kidscreen_52 WHERE id_kidscreen52=?");
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Kidscreen52 kidscreen52;
               kidscreen52 = new Kidscreen52(rs.getLong("id_kid"),rs.getDate("datah"),rs.getString("sexo"), new SaudeATF(rs.getLong("id_saude"),rs.getInt("sua_saude"),rs.getInt("sentido_bef"),rs.getInt("fisicamente_atv"),rs.getInt("fisicamente_atv")),
                    new Sentimentos(rs.getLong("id_sentimentos"),rs.getInt("desfrutado_vida"),rs.getInt("sentido_contente"),rs.getInt("sentido_satisfeito"),rs.getInt("estado_humor"),rs.getInt("sentido_alegre"), rs.getInt("se_divertido")),
                    new TempoLivre(rs.getLong("id_amigos"),rs.getInt("tempo_vc_mesmo"),rs.getInt("fzrTempolivre"),rs.getInt("oportunidadeArLivre"),rs.getInt("tempoAmigos"),rs.getInt("escolhidoTempoLivre")),
                    new SeusAmigos(rs.getLong("id_amigos"),rs.getInt("estar_amigos"),rs.getInt("realizar_tarefas_jovens"),rs.getInt("divertidoAmigos"),rs.getInt("amigosAjudaOutros"),rs.getInt("falarTudoCamigos"),rs.getInt("confiancaAmigos")),
                    new AnimoEmocional(rs.getLong("codigo"),rs.getInt("sensacaoFzrErrado"),rs.getInt("sentidoTriste"),rs.getInt("sentidoMalFzrNada"),rs.getInt("sensacaoVidaMal"),rs.getInt("sentidoCheioVida"),rs.getInt("sentidoSo"),rs.getInt("sentidoPressao")),
                    new AssuntosFinanceiros(rs.getLong("codigo"),rs.getInt("dinheiroSuficiente"),rs.getInt("dinheiroSuficienteGastos"),rs.getInt("dinheiroSuficienteAmigos")),
                    new VidaFamiliar(rs.getLong("codigo"),rs.getInt("entendimentoPais"),rs.getInt("sentqueridoPais"),rs.getInt("felizCasa"),rs.getInt("tempPais"),rs.getInt("tratJustoPais"),rs.getInt("dialogoPais")),
                    new VoceMesmo(rs.getLong("codigo"),rs.getInt("contenteManeira"),rs.getInt("contenteRoupas"),rs.getInt("preocupadoAspcto"),rs.getInt("invejaColegas"),rs.getInt("parteCorpoMudar")),
                    new SuaEscola(rs.getLong("codigo"),rs.getInt("sentindoFelizEscola"),rs.getInt("bemNosEstudos"),rs.getInt("satisfeitoCprofessores"),rs.getInt("prestadoAtencaoAulas"),rs.getInt("gostairEscola"),rs.getInt("relacaoCprofessores")),
                    new VoceEosDemais(rs.getLong("codigo"),rs.getInt("medoRapazesMocas"),rs.getInt("rapazesZombadoVoce"),rs.getInt("rapEmocIntimidandoVoce")), rs.getString("DoencaCDeficiencia"),rs.getString("TipoD"),
                     new Aluno (rs.getLong("matricula"),rs.getString("nome"),rs.getDate("dataN"),rs.getInt("idade"),rs.getString("sexo"),rs.getString("celular"),rs.getString("email"),rs.getString("telefone"),
                        new Endereco(rs.getLong("id_endereco"), rs.getString("rua"), rs.getString("complemento"), rs.getString("cidade"), rs.getString("bairro"),rs.getString("estado"),rs.getInt("cep"), rs.getInt("numero")),
                        new Curso (rs.getInt("id_curso"),rs.getString("nome")), new Turma(rs.getInt("id_turma"),rs.getString("nome"), new Curso (rs.getInt("id_curso"), rs.getString("nome")))));
                return kidscreen52;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }



    public void updateKidscreen52(Kidscreen52 kidscreen52) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE kidscreen_52 SET datah=?, sexo=?, doencac_deficiencia=?, tipod=?, fk_matricula=? WHERE id_kid=?");
            stmt.setLong(1, kidscreen52.getCodigo());
            stmt.setDate(2, (Date) kidscreen52.getDataH());
            stmt.setString(3,kidscreen52.getSexo());
            stmt.setString(4, kidscreen52.getDoencaCDeficiencia());
            stmt.setString(5,kidscreen52.getTipoD());
            stmt.setLong(6, kidscreen52.getAluno().getMatricula());
            stmt.executeUpdate();

            stmt.executeUpdate();
            
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE sentimentos SET desfrutado_vida=?, sentido_contente=?, sentido_satisfeito=?, estado_humor=?, sentido_alegre=?, se_divertido=? WHERE id_sentimentos=?");
            stmt.setLong(1, kidscreen52.getSentimentos().getDesfrutadoVida());
            stmt.setInt(2, kidscreen52.getSentimentos().getSsentidoContente());
            stmt.setInt(3, kidscreen52.getSentimentos().getSentidoSatisfeito());
            stmt.setInt(4, kidscreen52.getSentimentos().getEstadoHumor());
            stmt.setInt(5, kidscreen52.getSentimentos().getSentidoAlegre());
            stmt.setInt(6, kidscreen52.getSentimentos().getSeDivertido());
            stmt.setLong(7 , kidscreen52.getCodigo());

            stmt.executeUpdate();
            
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE saude_atf SET sua_saude=?, sentido_bef=?, fisicamente_atv=?, podido_correr=? WHERE id_saude=?");
            stmt.setLong(1, kidscreen52.getSaudeATF().getSuaSaude());
            stmt.setInt(2, kidscreen52.getSaudeATF().getSentidoBeF()); 
            stmt.setInt(3, kidscreen52.getSaudeATF().getFisicamenteAtv());
            stmt.setInt(4, kidscreen52.getSaudeATF().getPodidoCorrer());
            stmt.setLong(5, kidscreen52.getCodigo());
            stmt.executeUpdate();
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE tempo_livre SET tempo_vc_mesmo=?, fzr_tempo_livre=?, oportunidade_ar_livre=?, tempo_p_amigos=?, escolhido_tempo_livre=? WHERE id_tempo=?");
            stmt.setLong(1, kidscreen52.getTempoLivre().getTempoVcMesmo());
            stmt.setInt(2, kidscreen52.getTempoLivre().getFzrTempolivre());
            stmt.setInt(3, kidscreen52.getTempoLivre().getOportunidadeArLivre());
            stmt.setInt(4, kidscreen52.getTempoLivre().getTempoAmigos());
            stmt.setInt(5, kidscreen52.getTempoLivre().getEscolhidoTempoLivre());
            stmt.setLong(6, kidscreen52.getCodigo());

            stmt.executeUpdate();
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE seus_amigos SET estar_amigos=?, realizar_tarefas_jovens=?, divertido_camigos=?, amigos_ajuda_unsaooutros=?, falar_tudo_camigos=?, confianca_amigos =? WHERE id_amigos=?");
            stmt.setLong(1, kidscreen52.getSeusAmigos().getEstarAmigos());
            stmt.setInt(2, kidscreen52.getSeusAmigos().getRealizarTarefasJovens());
            stmt.setInt(3, kidscreen52.getSeusAmigos().getDivertidoAmigos());
            stmt.setInt(4, kidscreen52.getSeusAmigos().getAmigosAjudaOutros());
            stmt.setInt(5, kidscreen52.getSeusAmigos().getFalarTudoCamigos());
            stmt.setInt(6, kidscreen52.getSeusAmigos().getConfiancaAmigos());
            stmt.setLong(7, kidscreen52.getCodigo());

            stmt.executeUpdate();
            
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE animo_emocional  SET sensacao_fzr_errado =?,sentido_triste=?, sentido_mal_fzr_nada=?,sensacao_vida_mal=?,sentido_cheio_vida=?,sentido_so=?,sentido_pressao=? WHERE id_emocional=?");
            stmt.setLong(1, kidscreen52.getAnimoEmocional().getSensacaoFzrErrado());
            stmt.setInt(2, kidscreen52.getAnimoEmocional().getSentidoTriste()); 
            stmt.setInt(3, kidscreen52.getAnimoEmocional().getSentidoMalFzrnada());
            stmt.setInt(4, kidscreen52.getAnimoEmocional().getSensacaoVidaMal());
            stmt.setInt(5, kidscreen52.getAnimoEmocional().getSentidoCheioVida());
            stmt.setInt(6, kidscreen52.getAnimoEmocional().getSentidoSo());
            stmt.setInt(7, kidscreen52.getAnimoEmocional().getSentidoPressao());
            stmt.setLong(8, kidscreen52.getCodigo());
            
            stmt.executeUpdate();
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE assuntos_financeiros SET dinheiro_suficiente=?, dinheiro_suficiente_gastos=?,dinheiro_suficiente_amigos=? WHERE id_financa=?");
            
            stmt.setLong(1, kidscreen52.getAssuntosFinanceiros().getDinheiroSuficiente());
            stmt.setInt(2, kidscreen52.getAssuntosFinanceiros().getDinheiroSuficienteGastos());
            stmt.setInt(3, kidscreen52.getAssuntosFinanceiros().getDinheiroSuficienteAmigos());
            stmt.setLong(4, kidscreen52.getCodigo());
            
            stmt.executeUpdate();
            
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE vida_familiar SET entedimento_pais=?, sentquerido_pais=?,feliz_casa=?,temp_pais=?, trat_justo_pais=?,dialogo_pais=?  WHERE id_familia=?");
            stmt.setLong(1, kidscreen52.getVidaFamiliar().getEntendimentoPais());
            stmt.setInt(2, kidscreen52.getVidaFamiliar().getSentqueridoPais()); 
            stmt.setInt(3, kidscreen52.getVidaFamiliar().getFelizCasa());
            stmt.setInt(4, kidscreen52.getVidaFamiliar().getTempPais());
            stmt.setInt(5, kidscreen52.getVidaFamiliar().getTratJustoPais());
            stmt.setInt(6, kidscreen52.getVidaFamiliar().getDialogoPais());
            stmt.setLong(7, kidscreen52.getCodigo());
            
            stmt.executeUpdate();
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE voce_mesmo SET contente_maneira_ser=?, contente_roupas=?,preocupado_aspcto=?,inveja_colegas=?, parte_corpo_mudar=? WHERE id_voce=?");
            
            stmt.setLong(1, kidscreen52.getVoceMesmo().getContenteManeira());
            stmt.setInt(2, kidscreen52.getVoceMesmo().getContenteRoupas());
            stmt.setInt(3, kidscreen52.getVoceMesmo().getPreocupadoAspcto());
            stmt.setInt(4, kidscreen52.getVoceMesmo().getInvejaColegas());
            stmt.setInt(5, kidscreen52.getVoceMesmo().getParteCorpoMudar());
            stmt.setLong(6, kidscreen52.getCodigo());

            stmt.executeUpdate();
            
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE sua_escola SET sentido_feliz_escola=?, bem_nos_estudos=?, satisfeito_cprofessores=?,prestado_atencao_aulas=?, gosta_irescola=?, relacao_cprofessores=? WHERE id_escola=?");
            stmt.setLong(1, kidscreen52.getSuaEscola().getSentindoFelizEscola());
            stmt.setInt(2, kidscreen52.getSuaEscola().getBemNosEstudos()); 
            stmt.setInt(3, kidscreen52.getSuaEscola().getSatisfeitoCprofessores());
            stmt.setInt(4, kidscreen52.getSuaEscola().getPrestadoAtencaoAulas());
            stmt.setInt(5, kidscreen52.getSuaEscola().getGostairEscola());
            stmt.setInt(6, kidscreen52.getSuaEscola().getRelacaoCprofessores());
            stmt.setLong(7, kidscreen52.getCodigo());
             
            stmt.executeUpdate();
            
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE voce_eosdemais SET medo_rapazes_mocas=?, rapazes_zombado_voce=?,rapemoc_intimidando_voce=? WHERE id_voce=?");

            stmt.setLong(1, kidscreen52.getVoceEosDemais().getMedoRapazesMocas());
            stmt.setInt(2, kidscreen52.getVoceEosDemais().getRapazesZombadoVoce());
            stmt.setInt(3, kidscreen52.getVoceEosDemais().getRapEmocIntimidandoVoce());
            stmt.setLong(4, kidscreen52.getCodigo());

            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public void deletarKidscreen52(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM kidscreen_52 WHERE id_kid=?");
            stmt.setInt(1, codigo);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

   
}
package dao;

import entity.Aluno;
import entity.Curso;
import entity.Endereco;
import entity.IPAQ;
import entity.ParentescoAluno;
import entity.Turma;
import java.sql.Time;

public class Principal {
    public static void main(String[] args) {
        
        Endereco e = new Endereco(5, "Carlos Fernandes de Mendonça","Araçagi", "Favela","Perto da igreja","Paraíba",58270000,53);
        ParentescoAluno p = new ParentescoAluno (3,"Bartolomeu","Avô","bartolomeu@gmail.com",9841256);
        Curso o = new Curso(4,"Informatica");
        Turma t = new Turma (22,"3info",o);
        ///Aluno a = new Aluno(3,"jaime", 9645874,"joherversoncalixo@gmail.com",32712424,e,o,t,p);
        //professor professor = new Professor(1,985445145,"Barros",e,o);
//        Parq q = new Parq(3,true,true,true,false,false,true,true, a);
        //Bsq bsq = new Bsq(2,2,3,1,2,1,4,2,1,4,2,1,5,1,5,4,1,2,4,1,6,1,5,2,4,2,3,4,5,4,5,4,6,1,a);
        
       
       /* SaudeATF saude = new SaudeATF(1,2,1,2,1);
        Sentimentos sent = new Sentimentos(1,1,5,4,2,1,3);
        TempoLivre tp = new TempoLivre(1,2,1,2,1,2);
        SeusAmigos sa = new SeusAmigos(5,2,3,1,4,1,5);
        AnimoEmocional am = new AnimoEmocional(1,2,5,4,2,1,3,6);
        AssuntosFinanceiros af = new AssuntosFinanceiros(4,5,1,2);
        VidaFamiliar vf = new VidaFamiliar(5,4,3,6,1,2,4);
        VoceMesmo vm = new VoceMesmo(4,5,1,2,3,4);
        SuaEscola se = new SuaEscola(5,6,2,1,3,1,4);
        VoceEosDemais vd = new VoceEosDemais(2,2,1,2);*/
        
        
        
       
//       Kidscreen52 kid = new Kidscreen52(49,saude,sent,tp,sa,am,af,vf,vm,se,vd,true,a);
       
//        Kidscreen52DAO kiDAO = new Kidscreen52DAO();
//        kiDAO.adicionarKidscreen52(kid);
        Time time = Time.valueOf("10:59:59");
        //IPAQ i = new IPAQ(2,1,2,1,time,time, time, time,time,a);


//       CursoDAO cursoDao = new CursoDAO();
//       TurmaDAO dao = new TurmaDAO();
//       AlunoDAO alunoDao = new AlunoDAO();
//       ParqDAO parqDao = new ParqDAO();
       //BsqDAO bsqDAO = new BsqDAO();
       IpaqDAO ipaqDao = new IpaqDAO();
       //ProfessorDAO professorDao = new ProfessorDAO();
          
       //ipaqDao.adicionarIpaq(i);
//       parqDao.adicionarParq(q); 
//       alunoDao.adicionarAluno(a); 
//        dao.adicionarTurma(t);
//        cursoDao.adicionarCurso(o);
        //bsqDAO.adicionarBsq(bsq);
//       // kiDAO.adicionarKidscreen52(kid);
        //professorDao.adicionarProfessor(professor);
        
        //alunoDao.deletarAluno(90);
        //dao.deletarTurma(23);
        //cursoDao.deletarCurso(5);
        //parqDao.deletarParq(2);
        //bsqDAO.deletarBsq(2);
        //kiDAO.deletarKidscreen52(5);
        //ipaqDao.deletarIpaq(2);
        //professorDao.deletarProfessor(1);
        
        
       // System.out.println(alunoDao.listarAlunos());
       //System.out.println(dao.listarTurmas());
        //System.out.println(dao.getTurmaPeloCodigo(1));
        //System.out.println(bsqDAO.getBsqPeloCodigo(1));
        
        
//        System.out.println(alunoDao.listarAlunos());
        
        
        //parqDao.updateParq(q);
          //alunoDao.updateAluno(a);
          //dao.updateTurma(t);
          //cursoDao.updateCurso(o);
          //kiDAO.updateKidscreen52(kid);
          //ipaqDao.updateIpaq(i);
          //professorDao.updateProfessor(professor);
          
          
           //dao.getTurmaPeloCodigo();
          //cursoDao.getCursoPeloCodigo(1);
          //alunoDao.getAlunoPeloCodigo(2);
          //bsqDAO.getBsqPeloCodigo(1);

          //System.out.println(professorDao.getProfessorPeloCodigo(10));
          
           //System.out.println(dao.getTurmaPeloCodigo(22));
           //System.out.println(cursoDao.getCursoPeloCodigo(1));
//           System.out.println(alunoDao.getAlunoPeloCodigo(3));
        
        
    }

}

package entity;

public class SuaEscola {
    private Long codigo;
    private int sentindoFelizEscola, bemNosEstudos, satisfeitoCprofessores, prestadoAtencaoAulas, gostairEscola, relacaoCprofessores;
    
    public SuaEscola(Long codigo, int sentindoFelizEscola, int bemNosEstudos, int satisfeitoCprofessores, int prestadoAtencaoAulas, int gostairEscola, int relacaoCprofessores){
        this.codigo = codigo;
        this.sentindoFelizEscola = sentindoFelizEscola;
        this.bemNosEstudos = bemNosEstudos;
        this.satisfeitoCprofessores = satisfeitoCprofessores;
        this.prestadoAtencaoAulas = prestadoAtencaoAulas;
        this.gostairEscola = gostairEscola;
        this.relacaoCprofessores = relacaoCprofessores;
    }

    public SuaEscola() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    public int getSentindoFelizEscola(){
        return sentindoFelizEscola;
    } 
    public void setSentindoFelizEscola(int sentindoFelizEscola){
        this.sentindoFelizEscola = sentindoFelizEscola;
    }
    
    public int getBemNosEstudos(){
        return bemNosEstudos;
    } 
    public void setBemNosEstudos(int bemNosEstudos){
        this.bemNosEstudos = bemNosEstudos;
    }
    
    public int getSatisfeitoCprofessores(){
        return satisfeitoCprofessores;
    } 
    public void setSatisfeitoCprofessores(int satisfeitoCprofessores){
        this.satisfeitoCprofessores = satisfeitoCprofessores;
    }
    
    public int getPrestadoAtencaoAulas(){
        return prestadoAtencaoAulas;
    } 
    public void setPrestadoAtencaoAulas(int prestadoAtencaoAulas){
        this.prestadoAtencaoAulas = prestadoAtencaoAulas;
    }
    
    public int getGostairEscola(){
        return gostairEscola;
    } 
    public void setGostairEscola(int gostairEscola){
        this.gostairEscola = gostairEscola;
    }
    
    public int getRelacaoCprofessores(){
        return relacaoCprofessores;
    } 
    public void setRelacaoCprofessores(int relacaoCprofessores){
        this.relacaoCprofessores = relacaoCprofessores;
    }    
}

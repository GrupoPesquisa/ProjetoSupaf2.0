package entity;

public class Parq {
    private Long codigo;
    private Boolean problCardiaco, doresPeito, desmaioFreq, pressaoArt, probOsseo, RNPraticar, mais65Anos;
    private Aluno aluno;
    
    public Parq(Long codigo, boolean problCardiaco, boolean doresPeito, boolean desmaioFreq, boolean pressaoArt, boolean probOsseo, boolean RNPraticar, Boolean mais65Anos, Aluno aluno){
        this.codigo = codigo;
        this.problCardiaco = problCardiaco;
        this.doresPeito = doresPeito;
        this.desmaioFreq = desmaioFreq;
        this.probOsseo = probOsseo;
        this.pressaoArt = pressaoArt;
        this.RNPraticar = RNPraticar;
        this.mais65Anos = mais65Anos;
        this.aluno = aluno;
    }

    public Parq() {
        
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
     
    public Boolean getProblCardiaco(){
        return problCardiaco;
    }
    public void setProblCardiaco(boolean problCardiaco){
        this.problCardiaco = problCardiaco;
    }
    
    public Boolean getDoresPeito(){
        return doresPeito;
    }
    public void setDoresPeito(boolean doresPeito){
        this.doresPeito = doresPeito;
    }
    
    public Boolean getDesmaioFreq(){
        return desmaioFreq;
    }
    public void setDesmaioFreq(boolean desmaioFreq){
        this.desmaioFreq = desmaioFreq;
    }
    
    public Boolean getPressaoArt(){
        return pressaoArt;
    }
    public void setPressaoArt(boolean pressaoArt){
        this.pressaoArt = pressaoArt;
    }
    public Boolean getProbOsseo(){
        return RNPraticar;
    }
    public void setProbOsseo(boolean probOsseo){
        this.probOsseo = probOsseo;
    }
    
    public Boolean getRNPraticar(){
        return RNPraticar;
    }
    public void setRNPraticar(boolean RNPraticar){
        this.RNPraticar = RNPraticar;
    }
    
    public Boolean getMais65Anos(){
        return mais65Anos;
    }
    public void setMais65Anos(Boolean mais65Anos){
        this.mais65Anos = mais65Anos;
    }
    
    public Aluno getAluno(){
        return aluno;
    }
    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }
};

package entity;

public class SeusAmigos {
    private Long codigo;
    private int  estarAmigos, realizarTarefasJovens, divertidoAmigos, amigosAjudaOutros, falarTudoCamigos, confiancaAmigos ;
   
    public SeusAmigos( Long codigo, int estarAmigos, int realizarTarefasJovens, int divertidoAmigos, int amigosAjudaOutros, int falarTudoCamigos, int confiancaAmigos){
        this.codigo = codigo;
        this.estarAmigos = estarAmigos;
        this.realizarTarefasJovens = realizarTarefasJovens;
        this.divertidoAmigos = divertidoAmigos;
        this.amigosAjudaOutros = amigosAjudaOutros;
        this.falarTudoCamigos = falarTudoCamigos;
        this.confiancaAmigos = confiancaAmigos;
    }

    public SeusAmigos() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    public int getEstarAmigos(){
        return estarAmigos;
    }
    public void setEstarAmigos(int estarAmigos){
        this.estarAmigos = estarAmigos;
    }
   
    public int getRealizarTarefasJovens(){
        return realizarTarefasJovens;
    }
    public void setRealizarTarefasJovens(int realizarTarefasJovens){
        this.realizarTarefasJovens = realizarTarefasJovens;
    }
   
    public int getDivertidoAmigos(){
        return divertidoAmigos;
    }
    public void setDivertidoAmigos(int divertidoAmigos){
        this.divertidoAmigos = divertidoAmigos;
    }
   
    public int getAmigosAjudaOutros(){
        return amigosAjudaOutros;
    }
    public void setAmigosAjudaOutros(int amigosAjudaOutros){
        this.amigosAjudaOutros = amigosAjudaOutros;
    }
    public int getFalarTudoCamigos(){
        return falarTudoCamigos;
    }
    public void setFalarTudoCamigos(int falarTudoCamigos){
        this.falarTudoCamigos = falarTudoCamigos;
    }
    public int getConfiancaAmigos(){
        return confiancaAmigos;
    }
    public void setConfiancaAmigos(int confiancaAmigos){
        this.confiancaAmigos = confiancaAmigos;
    }
   
}

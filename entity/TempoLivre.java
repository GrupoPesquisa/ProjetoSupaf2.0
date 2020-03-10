package entity;

public class TempoLivre {
    private Long codigo;
    private int tempoVcMesmo, fzrTempolivre, oportunidadeArLivre, tempoAmigos, escolhidoTempoLivre ;
   
    public TempoLivre(Long codigo, int tempoVcMesmo, int fzrTempolivre, int oportunidadeArLivre, int tempoAmigos, int escolhidoTempoLivre){
        this.codigo = codigo;
        this.tempoVcMesmo = tempoVcMesmo;
        this.fzrTempolivre = fzrTempolivre;
        this.oportunidadeArLivre = oportunidadeArLivre;
        this.tempoAmigos = tempoAmigos;
        this.escolhidoTempoLivre = escolhidoTempoLivre;
    }

    public TempoLivre() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    public int getTempoVcMesmo(){
        return tempoVcMesmo;
    }
    public void setTempoVcMesmo(int tempoVcMesmo){
        this.tempoVcMesmo = tempoVcMesmo;
    }
   
    public int getFzrTempolivre(){
        return fzrTempolivre;
    }
    public void setFzrTempolivre(int fzrTempolivre){
        this.fzrTempolivre = fzrTempolivre;
    }
   
    public int getOportunidadeArLivre(){
        return oportunidadeArLivre;
    }
    public void setOportunidadeArLivre(int oportunidadeArLivre){
        this.oportunidadeArLivre = oportunidadeArLivre;
    }
   
    public int getTempoAmigos(){
        return tempoAmigos;
    }
    public void setTempoAmigos(int tempoAmigos){
        this.tempoAmigos = tempoAmigos;
    }
    public int getEscolhidoTempoLivre(){
        return escolhidoTempoLivre;
    }
    public void setEscolhidoTempoLivre(int escolhidoTempoLivre){
        this.escolhidoTempoLivre = escolhidoTempoLivre;
    }
   
}

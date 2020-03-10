package entity;

public class VoceEosDemais{
    private Long codigo;
    private int medoRapazesMocas, rapazesZombadoVoce, rapEmocIntimidandoVoce;

public VoceEosDemais(Long codigo, int medoRapazesMocas, int rapazesZombadoVoce, int rapEmocIntimidandoVoce){
    this.codigo = codigo;
    this.medoRapazesMocas = medoRapazesMocas;
    this.rapazesZombadoVoce = rapazesZombadoVoce;
    this.rapEmocIntimidandoVoce = rapEmocIntimidandoVoce;
}

    public VoceEosDemais() {
        
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    public int getMedoRapazesMocas(){
        return medoRapazesMocas;
    }

    public void setMedoRapazesMocas(int medoRapazesMocas){
        this.medoRapazesMocas = medoRapazesMocas;
    }

    public int getRapazesZombadoVoce(){
        return rapazesZombadoVoce;
    }

    public void setRapazesZombadoVoce(int rapazesZombadoVoce){
        this.rapazesZombadoVoce = rapazesZombadoVoce;
    }

    public int getRapEmocIntimidandoVoce(){
       return rapEmocIntimidandoVoce;
    }

    public void setRapEmocIntimidandoVoce(int rapEmocIntimidandoVoce){
        this.rapEmocIntimidandoVoce = rapEmocIntimidandoVoce;
    }
}
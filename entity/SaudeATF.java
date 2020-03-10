package entity;

public class SaudeATF{
    private Long codigo;
    private int  suaSaude, sentidoBeF, fisicamenteAtv, podidoCorrer;


public SaudeATF(Long codigo, int suaSaude, int sentidoBeF,int fisicamenteAtv, int podidoCorrer){
this.codigo = codigo;
this.suaSaude = suaSaude;
this.sentidoBeF = sentidoBeF;
this.fisicamenteAtv = fisicamenteAtv;
this.podidoCorrer = podidoCorrer;
}

    public SaudeATF() {
    }

public Long getCodigo() {
    return codigo;
}

public void setCodigo(Long codigo) {
    this.codigo = codigo;
}

public int getSuaSaude(){
    return suaSaude;
}
public void setSuaSaude(int suaSaude){
    this.suaSaude = suaSaude;
}

public int getSentidoBeF(){
    return sentidoBeF;
}
public void setSentidoBeF(int sentidoBeF){
    this.sentidoBeF = sentidoBeF;
}

public int getFisicamenteAtv(){
    return fisicamenteAtv;
}
public void setFisicamenteAtv(int fisicamenteAtv){
    this.fisicamenteAtv = fisicamenteAtv;
}

public int getPodidoCorrer(){
    return podidoCorrer;
}
public void setPodidoCorrer(int podidoCorrer){
    this.podidoCorrer = podidoCorrer;
}
}

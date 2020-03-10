package entity;

public class AnimoEmocional {
    private Long codigo;
    private int sensacaoFzrErrado, sentidoTriste, sentidoMalFzrNada, sensacaoVidaMal, sentidoCheioVida, sentidoSo, sentidoPressao;

public AnimoEmocional(Long codigo, int sensacaoFzrErrado, int sentidoTriste, int sentidoMalFzrNada, int sensacaoVidaMal, int sentidoCheioVida, int sentidoSo, int sentidoPressao){
this.codigo = codigo;
this.sensacaoFzrErrado = sensacaoFzrErrado;
this.sentidoTriste = sentidoTriste;
this.sentidoMalFzrNada = sentidoMalFzrNada;
this.sensacaoVidaMal = sensacaoVidaMal;
this.sentidoCheioVida = sentidoCheioVida;
this.sentidoSo = sentidoSo;
this.sentidoPressao = sentidoPressao;
}

    public AnimoEmocional() {
        
    }

public Long getCodigo() {
    return codigo;
}

public void setCodigo(Long codigo) {
    this.codigo = codigo;
}

public int getSensacaoFzrErrado(){
 return sensacaoFzrErrado;
}
public void setSensacaoFzrErrado(int sensacaoFzrErrado){
this.sensacaoFzrErrado = sensacaoFzrErrado;
}


public int getSentidoTriste(){
 return sentidoTriste;
}
public void setSentidoTriste(int sentidoTriste){
this.sentidoTriste = sentidoTriste;
}


public int getSentidoMalFzrnada(){
 return sentidoMalFzrNada;
}
public void setSentidoMalFzrnada(int sentidoMalFzrNada){
this.sentidoMalFzrNada = sentidoMalFzrNada;
}


public int getSensacaoVidaMal(){
 return sensacaoVidaMal;
}
public void setSensacaoVidaMal(int sensacaoVidaMal){
this.sensacaoVidaMal = sensacaoVidaMal;
}


public int getSentidoCheioVida(){
 return sentidoCheioVida;
}
public void setSentidoCheioVida(int sentidoCheioVida){
this.sentidoCheioVida = sentidoCheioVida;
}


public int getSentidoSo(){
 return sentidoSo;
}
public void setSentidoSo(int sentidoSo){
this.sentidoSo = sentidoSo;
}


public int getSentidoPressao(){
 return sentidoPressao;
}
public void setSentidoPressao(int sentidoPressao){
this.sentidoPressao = sentidoPressao;
}

}

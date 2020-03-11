package entity;

public class Endereco {
    private long codigo, cep;
    private String rua, complemento, cidade, bairro, estado;
    private int  numero;
   
    public Endereco(long codigo, String rua, String cidade, String bairro, String complemento, String estado, Long cep, int numero){
        this.codigo = codigo;
        this.rua = rua;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
        this.numero = numero;              
    }

    public Endereco() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    
    public String getRua(){
        return rua;
    }  
    public void setRua(String rua){
        this.rua = rua;
    }
   
    public String getComplemento(){
        return complemento;
    }  
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
   
    public String getCidade(){
        return cidade;
    }  
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
   
    public String getBairro(){
        return bairro;
    }  
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
   
    public String getEstado(){
        return estado;
    }  
    public void setEstado(String estado){
        this.estado = estado;
    }
   
    public Long getCep(){
        return cep;
    }  
    public void setCep(Long cep){
        this.cep = cep;
    }
   
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
}

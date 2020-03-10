package entity;

public class Contato {
    private int codigo, fone, celular;
    private String email;
    
    public Contato(int codigo, int fone, int celular, String email){
        this.codigo = codigo;
        this.fone = fone;
        this.celular = celular;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getFone(){
        return fone;
    } 
    public void setFone(int fone){
        this.fone = fone;
    }
    
    public int getCelular(){
        return celular;
    }  
    public void setCelular(int celular){
        this.celular = celular;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
}

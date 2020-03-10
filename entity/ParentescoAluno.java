package entity;

public class ParentescoAluno {
    private int codigo;
    private String nome, parentesco, email;
    private int celular;
    
    public ParentescoAluno(int codigo, String nome, String parentesco, String email,  int  celular){
        this.codigo = codigo;
        this.nome = nome;
        this.parentesco = parentesco;
        this.celular = celular;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getParentesco(){
        return parentesco;
    }
    public void setParentesco(String parentesco){
        this.parentesco = parentesco;
    }
    
    public String getEmail(){
        return email;
    } 
    public void setEmail(String email){
        this.email = email;
    }
    
    public int getCelular(){
        return celular;
    }
    public void setCelular(int celular){
        this.celular = celular;
    }
    
}


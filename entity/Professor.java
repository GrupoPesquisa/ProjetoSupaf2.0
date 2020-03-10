package entity;

public class Professor{
    private int matricula;
    private String nome;
    private int celular;
    private Endereco endereco;
    private Curso curso;
    public Professor(int matricula,int celular, String nome, Endereco endereco, Curso curso){
        this.matricula = matricula;
        this.nome = nome;
        this.celular = celular;
        this.endereco = endereco;
        this.curso = curso;
        
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
   
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
   
    public Endereco getEndereco(){
        return endereco;
    }    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
   
    public Curso getCurso(){
        return curso;
    }
    public void setCurso(Curso curso){
        this.curso = curso;
    }
}
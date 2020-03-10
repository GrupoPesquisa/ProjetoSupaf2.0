package entity;

public class Turma{
    private int codigo;
    private String nome;
    private Curso curso;
    public Turma(int codigo, String nome, Curso curso){
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;      
    }

    public Turma() {
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
   
    public Curso getCurso(){
        return curso;
    }
    public void setCurso(Curso curso){
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Turma{" + "codigo=" + codigo + ", nome=" + nome + ", curso=" + curso + '}';
    }
    
    
}
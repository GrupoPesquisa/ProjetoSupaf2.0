package entity;

import java.util.Date;

public class Aluno{
    private long matricula;
    private String nome;
    private Date dataN;
    private int idade;
    private String sexo;
    private String celular;
    private String email;
    private String telefone;
    private Endereco endereco;
    private Curso curso;
    private Turma turma;
    
    public Aluno( Long matricula, String nome, Date dataN,int idade ,String sexo,String celular, String email, String telefone, Endereco endereco, Curso curso, Turma turma){
        this.matricula = matricula;
        this.nome = nome;
        this.dataN = dataN;
        this.idade = idade;
        this.sexo = sexo;
        this.celular = celular;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.curso = curso;
        this.turma = turma;
    }

    public Aluno() {
    }

   
    public Long getMatricula(){
        return matricula;
    }
    public void setMatricula(Long matricula){
        this.matricula = matricula;
    }
   
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Date getDataN() {
        return dataN;
    }

    public void setDataN(Date dataN) {
        this.dataN = dataN;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
   
    public Turma getTurma(){
        return turma;
    }
    public void setTurma(Turma turma){
        this.turma = turma;
    }
   
}

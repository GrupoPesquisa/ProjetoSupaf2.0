
package entity;


public class IPAQ {
    private Long codigo;
    private int diasCaminhou, ativModerada, ativVigorosa, tempoAtivModerada;
    private String horasCaminhou, tempoAtivVigorosa, tempoGastoSentado1, tempoGastoSentadofds;
    private Aluno aluno;

    public IPAQ(Long codigo, int diasCaminhou, int ativModerada, int ativVigorosa, String horasCaminhou, int tempoAtivModerada, String tempoAtivVigorosa, String tempoGastoSentado1, String tempoGastoSentadofds, Aluno aluno) {
        this.codigo = codigo;
        this.diasCaminhou = diasCaminhou;
        this.ativModerada = ativModerada;
        this.ativVigorosa = ativVigorosa;
        this.horasCaminhou = horasCaminhou;
        this.tempoAtivModerada = tempoAtivModerada;
        this.tempoAtivVigorosa = tempoAtivVigorosa;
        this.tempoGastoSentado1 = tempoGastoSentado1;
        this.tempoGastoSentadofds = tempoGastoSentadofds;
        this.aluno = aluno;
    }

    public IPAQ() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public int getDiasCaminhou() {
        return diasCaminhou;
    }

    public void setDiasCaminhou(int diasCaminhou) {
        this.diasCaminhou = diasCaminhou;
    }

    public int getAtivModerada() {
        return ativModerada;
    }

    public void setAtivModerada(int ativModerada) {
        this.ativModerada = ativModerada;
    }

    public int getAtivVigorosa() {
        return ativVigorosa;
    }

    public void setAtivVigorosa(int ativVigorosa) {
        this.ativVigorosa = ativVigorosa;
    }

    public String getHorasCaminhou() {
        return horasCaminhou;
    }

    public void setHorasCaminhou(String horasCaminhou) {
        this.horasCaminhou = horasCaminhou;
    }

    public int getTempoAtivModerada() {
        return tempoAtivModerada;
    }

    public void setTempoAtivModerada(int tempoAtivModerada) {
        this.tempoAtivModerada = tempoAtivModerada;
    }

    public String getTempoAtivVigorosa() {
        return tempoAtivVigorosa;
    }

    public void setTempoAtivVigorosa(String tempoAtivVigorosa) {
        this.tempoAtivVigorosa = tempoAtivVigorosa;
    }

    public String getTempoGastoSentado1() {
        return tempoGastoSentado1;
    }

    public void setTempoGastoSentado1(String tempoGastoSentado1) {
        this.tempoGastoSentado1 = tempoGastoSentado1;
    }

    public String getTempoGastoSentadofds() {
        return tempoGastoSentadofds;
    }

    public void setTempoGastoSentadofds(String tempoGastoSentadofds) {
        this.tempoGastoSentadofds = tempoGastoSentadofds;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}

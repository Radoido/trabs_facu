public interface IColegio {
    public String getNome();
    public void setNome(String nome);    
    public Turma[] getTurmas();
    public void setTurmas(Turma[] turmas);
    public int getQtdeTurmas();
    public void setQtdeTurmas(int qtdeTurmas);
    public void inserirTurma(Turma turma);
    public Turma getUltimaTurma();
    public String getNomeDisciplinaMaiorMedia();
    public String getNomeDisciplinaMenorMedia();
    public double getMediaTurmas();    
}

public class Analista extends Funcionario {
    private String tecnica;
    private int experiencia;

    public Analista() {
        this("", 0, "", 0, 0.0, "", 0);

    }

    public Analista(String nome, int numeroDependentes, String endereco, int idade, double salario, String tecnica,
            int experiencia) {
        super(nome, numeroDependentes, endereco, idade, salario);
        this.tecnica = tecnica;
        this.experiencia = experiencia;

    }

    // metodo aumenta salario
    @Override
    public void aumentaSalario() {
        if (getNumeroDependentes() > 2 && experiencia > 3) {
            setSalario(getSalario() + (getSalario() * 0.1));
        }
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

}
public class AdministradorBD extends Funcionario {
    private String bancoDeDados;
    private int formacao;

    public AdministradorBD() {
        this("", 0, "", 0, 0.0, "", 0);

    }

    public AdministradorBD(String nome, int numeroDependentes, String endereco, int idade, double salario,
            String bancoDeDados,
            int formacao) {
        super(nome, numeroDependentes, endereco, idade, salario);
        this.bancoDeDados = bancoDeDados;
        this.formacao = formacao;

    }

    // metodo aumenta salario
    @Override
    public void aumentaSalario() {
        if (formacao > 0) {
            setSalario(getSalario() + (getSalario() * 0.05));
        }
    }

    public String getBancoDeDados() {
        return bancoDeDados;
    }

    public void setBancoDeDados(String bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public int getFormacao() {
        return formacao;
    }

    public void setFormacao(int formacao) {
        this.formacao = formacao;
    }

}
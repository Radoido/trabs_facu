public abstract class Funcionario {
    private String nome;
    private int numeroDependentes;
    private String endereco;
    private int idade;
    private double salario;

    public Funcionario() {
        this.nome = "";
        this.numeroDependentes = 0;
        this.endereco = "";
        this.idade = 0;
        this.salario = 0.0;

    }

    public Funcionario(String nome, int numeroDependentes, String endereco, int idade, double salario) {
        this.nome = nome;
        this.numeroDependentes = numeroDependentes;
        this.endereco = endereco;
        this.idade = idade;
        this.salario = salario;
        aumentaSalario();
    }

    // metodo aumenta salario
    public void aumentaSalario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
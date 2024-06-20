public class Desenvolvedor extends Funcionario {
    private String area;
    private int experiencia;

    public Desenvolvedor() {
        this("", 0, "", 0, 0.0, "", 0);

    }

    public Desenvolvedor(String nome, int numeroDependentes, String endereco, int idade, double salario, String area,
            int experiencia) {
        super(nome, numeroDependentes, endereco, idade, salario);
        this.area = area;
        this.experiencia = experiencia;

    }

    // metodo aumenta salario
    @Override
    public void aumentaSalario() {
        if (getNumeroDependentes() < 2 && experiencia >= 5) {
            setSalario(getSalario() + (getSalario() * 0.15));
        }
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

}
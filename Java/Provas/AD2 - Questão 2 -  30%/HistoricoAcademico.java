import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HistoricoAcademico {
    private int matricula;
    private String nome;
    private String situacao;

    public HistoricoAcademico() {
        this(0, "", "");
    }

    public HistoricoAcademico(int matricula, String nome, String situacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.situacao = situacao;

    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    // metodo writeRegistro
    public void writeRegistro() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(matricula + "." + nome))) {
            writer.write(matricula + "\n");
            writer.write(nome + "\n");
            writer.write(situacao + "\n");
        } catch (IOException e) {
            System.err.println("Erro ao escrever o arquivo: " + e.getMessage());
        }
    }

    // metodo readRegistro
    public void readRegistro() {
        try (BufferedReader reader = new BufferedReader(new FileReader(matricula + "." + nome))) {
            matricula = Integer.parseInt(reader.readLine());
            nome = reader.readLine();
            situacao = reader.readLine();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    // metodo printRegistro
    public void printRegistro() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Situação: " + situacao);
    }
}

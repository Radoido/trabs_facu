import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner fileScanner = new Scanner(new File("file.in"))) {
            while (fileScanner.hasNext()) {
                int matricula = Integer.parseInt(fileScanner.nextLine().trim());
                String nome = fileScanner.nextLine().trim();
                String situacao = fileScanner.nextLine().trim();

                HistoricoAcademico historico = new HistoricoAcademico(matricula, nome, situacao);
                historico.writeRegistro();
                historico.readRegistro();
                historico.printRegistro();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}

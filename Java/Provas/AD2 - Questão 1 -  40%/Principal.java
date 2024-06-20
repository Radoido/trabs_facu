
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        // Testa um vetor de pessoas
        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(
                    "Digite o tipo do funcionário que deseja incluir (1-Analista/2-Desenvolvedor/3-AdministradorBD):");
            int tipo = Integer.parseInt(scanner.nextLine());
            if (tipo == 1) {
                // Entrada dos dados do analista
                Analista novo = new Analista();
                System.out.println("Digite o nome do analista:");
                novo.setNome(scanner.nextLine());
                System.out.println("Digite o número de depedentes:");
                novo.setNumeroDependentes(Integer.parseInt(scanner.nextLine()));
                System.out.println("Digite o endereço:");
                novo.setEndereco(scanner.nextLine());
                System.out.println("Digite a idade:");
                novo.setIdade(Integer.parseInt(scanner.nextLine()));
                // Salário base da tabela do RH
                novo.setSalario(1500.00);
                System.out.println("Digite a técnica de análise utilizada:");
                novo.setTecnica(scanner.nextLine());
                System.out.println("Digite o tempo de experência:");
                novo.setExperiencia(Integer.parseInt(scanner.nextLine()));
                funcionarios[i] = novo;
            } else {
                if (tipo == 2) {
                    // Entrada dos dados do desenvolvedor
                    Desenvolvedor novo = new Desenvolvedor();
                    System.out.println("Digite o nome do desenvolvedor:");
                    novo.setNome(scanner.nextLine());
                    System.out.println("Digite o número de depedentes:");
                    novo.setNumeroDependentes(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Digite o endereço:");
                    novo.setEndereco(scanner.nextLine());
                    System.out.println("Digite a idade:");
                    novo.setIdade(Integer.parseInt(scanner.nextLine()));
                    // Salário base da tabela do RH
                    novo.setSalario(1600.00);
                    System.out.println("Digite a área de desenvolvimento:");
                    novo.setArea(scanner.nextLine());
                    System.out.println("Digite o tempo de experência:");
                    novo.setExperiencia(Integer.parseInt(scanner.nextLine()));
                    funcionarios[i] = novo;

                } else {
                    if (tipo == 3) {
                        // Entrada dos dados do administrador do bd
                        AdministradorBD novo = new AdministradorBD();
                        System.out.println("Digite o nome do administrador do bd:");
                        novo.setNome(scanner.nextLine());
                        System.out.println("Digite o número de depedentes:");
                        novo.setNumeroDependentes(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Digite o endereço:");
                        novo.setEndereco(scanner.nextLine());
                        System.out.println("Digite a idade:");
                        novo.setIdade(Integer.parseInt(scanner.nextLine()));
                        novo.setSalario(1550.00);
                        System.out.println("Digite o nome do BD utilizado:");
                        novo.setBancoDeDados(scanner.nextLine());
                        System.out.println("Digite se tem formação superio (0-Não/1-Sim):");
                        novo.setFormacao(Integer.parseInt(scanner.nextLine()));
                        funcionarios[i] = novo;
                    } else {
                        System.out.println("Tipo de funcionário inválido");
                    }
                }
            }
        }

        // Calculando a folha de pagamento antes do aumento
        double total1 = 0;
        for (int i = 0; i < 5; i++) {
            total1 = total1 + funcionarios[i].getSalario();
        }
        System.out.println("O total da folha de pagamento antes do aumento é:" + total1);

        // Aumentando os salários
        for (int i = 0; i < 5; i++) {
            funcionarios[i].aumentaSalario();
        }

        // Calculando a folha de pagamento depois do aumento
        double total2 = 0;
        for (int i = 0; i < 5; i++) {
            total2 = total2 + funcionarios[i].getSalario();
        }
        System.out.println("O total da folha de pagamento depois do aumento é:" + total2);
    }
}

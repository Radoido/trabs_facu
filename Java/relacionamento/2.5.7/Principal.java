import java.util.Scanner;

public class Principal {
    
    public static void main(String args[]) {
        //Objeto para a entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        //Realiza a leitura do salário base e abono do gerente
        System.out.println("Digite o salario base do gerente:");
        double salarioBase = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o abono do gerente:");
        double abono = Double.parseDouble(scanner.nextLine());
        
        //Declara e instância um gerente com o salário base lido.
        Gerente g1 = new Gerente(salarioBase, abono);
        
        //Recupera o valor do salário total do gerente
        System.out.println(g1.getSalarioTotal());
    }    
}
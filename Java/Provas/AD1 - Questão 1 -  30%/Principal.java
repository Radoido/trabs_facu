import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {

        //Objeto para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Declara e instância um objeto chamado ret1 da classe Retângulo
        Retangulo ret1 = new Retangulo();

        //Realiza a leitura da largura e altura para o objeto ret1
        System.out.print("Digite a largura:");
        ret1.setLargura(scanner.nextDouble());
        System.out.print("Digite a altura:");
        ret1.setAltura(scanner.nextDouble());

        System.out.println(ret1.mostrarDados());
        System.out.println("Perimetro: " + ret1.getPerimetro());
        System.out.println("Area: " + ret1.getArea());

        System.out.println("Incrementando a largura do retangulo:");
        ret1.incrementaLargura();
        System.out.println("Incrementando a altura do retangulo:");
        ret1.incrementaAltura();
        System.out.println("Dados apos incremento:" + ret1.mostrarDados());

        System.out.println("Decrementando a largura do retangulo:");
        ret1.decrementaLargura();
        System.out.println("Decrementando a altura do retangulo:");
        ret1.decrementaAltura();
        System.out.println("Dados apos decremento:" + ret1.mostrarDados());
    }
}

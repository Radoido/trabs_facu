
import java.util.Scanner;

public class Principal {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String entrada = scanner.nextLine();
    Dict<String, Integer> contadorDeNomes = new SortedArrayDict<>();
    String[] nomes = entrada.split(",");

    for (int i = 0; i < nomes.length; i++) {
      contadorDeNomes.put(nomes[i], i);

      if (nomes[i] == contadorDeNomes.toString()) {

      }

    }
    System.out.println(contadorDeNomes.toString());
  }
}

// Verifica se há um empate

/*
 * Ana,Pedro,Ana,Paulo,Ana,Ana,Ana,Ana,Paulo,Vicente,Pedro
 */
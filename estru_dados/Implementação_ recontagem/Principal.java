
import java.util.Scanner;

public class Principal {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String entrada = scanner.nextLine();
    Dict<String, Integer> map = new SortedArrayDict<>();

    String nomes[] = entrada.split(",");
    String[] lista = new String[nomes.length];


      //verifica quantas vezes um nome é repetido 
      for (int i = 0; i < nomes.length; i++) {
        int x = 0;
        for (int j = 0; j < nomes.length; j++) {
          if (nomes[i].equals(nomes[j])) {

            x++;

          }

        }
        map.put(nomes[i], x);
      }
    }
  }
}

/*
 * String vencedor = "";
 * int empate = 0;
 * int maior = 0;
 * 
 * for (int i = 0; i < nomes.length; i++) {
 * for (int j = 0; j < nomes.length; j++) {
 * if (map.get(nomes[i]) > (map.get(nomes[j]))) {
 * maior = map.get(nomes[i]);
 * vencedor = nomes[i];
 * System.out.println("maior: "+maior);
 * 
 * 
 * 
 * } else if (map.get(nomes[i]) == (map.get(nomes[j])) && nomes[i] != nomes[j]){
 * empate = map.get(nomes[i]);
 * System.out.println("empate: " + nomes[i] + " "+ nomes[j]);
 * }
 * 
 * }
 * 
 * }
 * if (empate >= maior){
 * System.out.println("Segundo turno!");
 * 
 * }else{
 * System.out.println(vencedor);
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * }}
 * /*
 * Ana,Pedro,Ana,Paulo,Ana,Ana,Ana,Ana,Paulo,Vicente,Pedro
 */
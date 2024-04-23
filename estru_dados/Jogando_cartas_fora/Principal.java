import java.util.Scanner;
public class Principal {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {            
        int entrada = scanner.nextInt();
        List remain = new ArrayList();
        List discarded = new ArrayList();



        System.out.println("Discarded:" +discarded.toString()+"; Remaining:"+remain.toString());
      }
}
import java.util.Scanner;
public class Principal {


    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {            
        String entrada=scanner.nextLine();; //recebe a string de entrada
        int resposta = 0;
        //insira o seu código aqui
        Stack<String> pilha = new ArrayStack<>();
        
        for ( int i=0; i < entrada.length(); i++ ){


            if (entrada.substring(i,i+1).equals("<")){
                pilha.push(entrada.substring(i,i+1));

            }else if (entrada.substring(i,i+1).equals(">") && !pilha.isEmpty()){
                pilha.pop();
                resposta += 1;
            }
        }

        System.out.println(resposta);
       
    }

}


import java.util.Scanner;
public class Principal {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {            
        String entrada=scanner.nextLine();; //recebe a string de entrada
        int val = 0;
        Stack<Integer> pilha = new ArrayStack<>();


        for ( int i=0; i < entrada.length(); i++ ){              

           if (entrada.substring(i,i+1).equals("+")){
                
                int a = 0;
                //pilha.push(pilha.top()*2);
                a = pilha.pop();
                val = pilha.top() + a;
                pilha.push(a);
                pilha.push(val);

           
            }else if (entrada.substring(i,i+1).equals("D")){
                //pilha.push(pilha.top()*2);
                val = pilha.top()*2;
                pilha.push(val);
                
            }else if (entrada.substring(i,i+1).equals("C")){
                pilha.pop();


            }else if (entrada.substring(i,i+1).equals("-")){
                pilha.push(-(Integer.parseInt(entrada.substring(i+1, i+2))));
                i++;
            
            }else if (entrada.substring(i,i+1).equals(",")){
               int b = 0 ; 
               i += b;
            
            }else{

                pilha.push(Integer.parseInt(entrada.substring(i, i+1)));

                
            }
        }
        int a = 0;
        val = pilha.size();

        for (int i = 0; i < val; i++){
//            System.out.println("size" + pilha.size());
            a += pilha.pop(); 
            

            
        }

        System.out.println(a);

           
    }
}



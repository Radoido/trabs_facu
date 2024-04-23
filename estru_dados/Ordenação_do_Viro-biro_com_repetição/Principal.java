import java.util.Scanner;
public class Principal {
    static Scanner scanner = new Scanner(System.in);
   

    public static int[] sort(int[] entrada1) {   
        int [] aux = new int[entrada1.length];
        int [] out = new int[entrada1.length];

        for (int i=0; i<entrada1.length; i++ ){
            int x = 0;
            for (int f=0; f<entrada1.length; f++){
                if (entrada1[i] > entrada1[f] ){
                    x++;
                }
            }
            aux[i] = x;
        }

        
        for (int i =0; i<entrada1.length; i++){
            int x = aux[i];
            if (out[x] == entrada1[i]){
                x+=1;
                out[x] = entrada1[i];


            }else{
                out[x] = entrada1[i];

            }

        }
/*  verificação com ZERO
        int [] out = new int[entrada1.length];
        for (int i =0; i<entrada1.length; i++){
            int x = aux[i];
            if (out[x] == 0){
                out[x] = entrada1[i];
                
            }else{
                x+=1;
                out[x] = entrada1[i];
            }
        }
*/
        return ( out );
    }

    public static void main(String[] args) {
        String entrada=scanner.nextLine(); //recebe a string de entrada
        String [] in = entrada.split(","); 
        int [] entrada1 = new int[in.length];
        for (int i=0; i<in.length; i++){
            entrada1[i] = Integer.valueOf(in[i]);
        }
        sort(entrada1);

        printArray ("",sort(entrada1));
    }
    public static void printArray (String desc, int[] in){
        String tmp="[";
        for (int i:in) tmp+=i+", ";
        System.out.println(tmp.substring(0, tmp.length()-2)+"]");
    }
}
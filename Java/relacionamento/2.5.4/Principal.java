

public class Principal {



    public static void main(String[] args) {
        Motor mt1 = new Motor("v8", 2.0);
//        Motor mt2 = new Motor("v6", 1.8);
//        Motor mt3 = new Motor("v12", 5.8);

        Carro c1 = new Carro("VW", mt1);

        System.out.println(c1.getMotorizacao());
        System.out.println(mt1);
    }
    
}

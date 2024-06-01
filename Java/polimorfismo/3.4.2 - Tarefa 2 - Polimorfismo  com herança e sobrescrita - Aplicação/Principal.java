public class Principal {

    public static void main(String[] args) {

        //Declara e instância uma conta com o saldo de 2000
        Conta conta = new Conta(2000);
        System.out.println("Saldo conta: " + conta.getSaldo());
        
        //Declara e instância uma conta corrente com saldo 0 e 30 de taxa de serviço
        //Declara e instância uma conta poupanca com saldo de 200 e 10 de juros
        ContaPoupanca cp = new ContaPoupanca(200,10);
        ContaCorrente cc = new ContaCorrente(0,30);

        System.out.println("Saldo conta corrente: " + cc.getSaldo());
        System.out.println("Saldo conta poupanca: " + cp.getSaldo());

        cc.setDeposito(2000);
        System.out.println("Saldo conta poupança: " + conta.getSaldo());
        cp.setDeposito(1000);
        System.out.println("Saldo conta corrente: " + cc.getSaldo());
        System.out.println("Saldo conta poupança: " + cp.getSaldo());
        System.out.println("Saldo conta poupança: " + cp.getSaldo());
        System.out.println("Saldo conta poupança: " + conta.getSaldo());         
        //Declara um vetor de contas
        Conta recursos[] = new Conta[7];
        recursos[0] = cc;
        recursos[1] = cp;
        recursos[2] = new ContaCorrente(1000,10);
        recursos[3] = new ContaPoupanca(5056.0 , 20); 
        recursos[4] = new ContaCorrente(13240,50);
        recursos[5] = new ContaPoupanca(50.0 , 29.0);
        recursos[6] = new ContaCorrente(10,0);
       // recursos[7] = conta;
        
        //Calcula o saldo total das contas
        double total  = 0;
        for (int i = 0; i < 7; i++) {            
            total = total + recursos[i].getSaldo();            
        }

        System.out.println("Saldo total: " + total);
    }
}

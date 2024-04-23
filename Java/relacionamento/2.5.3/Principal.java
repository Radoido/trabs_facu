public class Principal {

    public static void main(String[] args) {
        Cliente objetoCliente = new Cliente("marcus", "123", 23);
        ContaBancaria objetoConta = new ContaBancaria(4321, 123);
        ContaBancaria objetoConta2 = new ContaBancaria(4321, 123);
        ContaBancaria objetoConta3 = new ContaBancaria(4321, 123);
        Cliente objetoCliente2 = new Cliente("rafael", "321", 21);
        


        objetoConta.abrirConta(objetoCliente, 2, 3214);
        objetoConta2.abrirConta(objetoCliente, 2432, 3214);
        objetoConta3.abrirConta(objetoCliente2, 244, 3214);
        objetoCliente2.vincularConta(objetoConta);
        objetoCliente.vincularConta(objetoConta);
        objetoCliente.vincularConta(objetoConta3);
        objetoCliente.vincularConta(objetoConta2);
        System.out.println(objetoConta2.mostrarSaldo());
        System.out.println("conta 3 :"+objetoConta3.mostrarSaldo());
        System.out.println(objetoCliente.getTotalContas());
        


   

    }
}
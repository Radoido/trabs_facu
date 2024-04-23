public class ContaBancaria{

    private int numero;
    private int agencia;
    private double saldo;
    private double limite;

    private Cliente titular;

    
    //construtor sem parametro
    public ContaBancaria(){
        this.numero = 0;
        this.agencia = 0;
        this.saldo = 0.0;
        this.limite = 0.0;

    }

    //construtor com parametros
    public ContaBancaria(int numero, int agencia, double saldo, double limite){
        setAgencia(agencia);
        setNumero(numero);
        setSaldo(saldo);
        setLimite(limite);

    }

    //metodos
    public void abrirConta(Cliente titular, double saldo, double limite){
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;

    }

    public void sacar(double valor){
        this.saldo = saldo - valor; 

    }

    public void depositar(double valor){
        this.saldo = saldo + valor;
    }
    
    public String mostrarSaldo(){
        return "Saldo da conta: " + numero + " e de R$ " + saldo;
    }
    


    //metodos get's
    public Cliente getTitular(){
        return titular;
    }

    public int getNumero(){
        return numero;
    }
    
    public int getAgencia(){
        return agencia;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public double getLimite(){
        return limite;
    }


    //metodos set's
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }


   
   
}

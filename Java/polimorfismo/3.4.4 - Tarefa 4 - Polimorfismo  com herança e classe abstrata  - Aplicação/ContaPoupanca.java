public class ContaPoupanca extends Conta{

    private double saldo;
    private double juros;


    public ContaPoupanca(){
        this("",0.0,0.0);
    }

    public ContaPoupanca(String nome, double saldo, double juros){
        super(nome);
        this.saldo = saldo;
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSJuros(){
        return saldo + (saldo*(juros/100));
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void setDeposito(double deposito){
        this.saldo = (getSaldo() + deposito);
    
    }

}
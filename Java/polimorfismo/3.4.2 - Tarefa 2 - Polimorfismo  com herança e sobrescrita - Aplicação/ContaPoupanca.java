public class ContaPoupanca extends Conta{

    private double juros;


    public ContaPoupanca(){
        this(0,0.0);
    }

    public ContaPoupanca(double saldo, double juros){
        super(saldo);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getSaldo(){
        return super.getSaldo()+((juros/100)*super.getSaldo());
    }

    public void setDeposito(double deposito){
        super.setSaldo(super.getSaldo() + deposito);
    
    }
}
public class ContaCorrente implements ISaldo{

    private double saldo;
    private double taxaServico;

    public ContaCorrente(){
        this(0.0,0.0);
    }

    public ContaCorrente(double saldo, double taxaServico){
        this.saldo = saldo;
        this.taxaServico = taxaServico;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    public double getSaldo() {
        return saldo + (saldo*(taxaServico/100));
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void setDeposito(double deposito){
        this.saldo = (saldo+deposito);
    }


    

}
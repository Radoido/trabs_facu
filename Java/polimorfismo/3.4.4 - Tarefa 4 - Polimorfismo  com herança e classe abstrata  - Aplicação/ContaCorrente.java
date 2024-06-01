public class ContaCorrente extends Conta{

    private double saldo;
    private double taxaServico;

    public ContaCorrente(){
        this("", 0.0,0.0);
    }

    public ContaCorrente(String nome, double saldo, double taxaServico){
        super(nome);
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
        setSaldo(getSaldo()+deposito);
    }


    

}
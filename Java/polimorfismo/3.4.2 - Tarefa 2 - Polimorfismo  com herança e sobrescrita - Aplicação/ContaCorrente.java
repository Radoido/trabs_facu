public class ContaCorrente extends Conta{

    private double taxaServico;

    public ContaCorrente(){
        this(0,0.0);
    }

    public ContaCorrente(double saldo, double taxaServico){
        super(saldo);
        this.taxaServico = taxaServico;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    public double getSaldo(){
        return super.getSaldo() - (super.getSaldo()*(getTaxaServico()/100));
    }

    public void setDeposito(double deposito){
        super.setSaldo(super.getSaldo()+deposito);
    }
    

}
public class Gerente extends Funcionario{
    
    private double abono;
    


    public Gerente(double salarioBase, double abono) {
        super(salarioBase);
        this.abono = abono;
    }

    
    public double getSalarioTotal(){
        return (getSalarioBase()-getAbono());
    }
    
    
    
    
    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }   

    
}

public class Calculadora {
    private double numero1;
    private double numero2;

    public Calculadora(){
        setNumero1(0);
        setNumero2(0);
    }

    public Calculadora(double numero1, double numero2){
        setNumero1(numero1);
        setNumero2(numero2);
        
    }

    public double getNumero1(){
        return numero1;

    }

    public double getNumero2(){
        return numero2;

    }

    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }

    public double getSoma(){
        return (numero1+numero2);
    }
    public double getDiferença(){
        return (numero1-numero2);
    }
    public double getProduto(){
        return (numero1*numero2);
    }
    public double getQuociente(){
        return (numero1/numero2);
    }

    


}

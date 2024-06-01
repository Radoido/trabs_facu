public class Triangulo implements ICalculo{
    
    private String cor;
    private double altura;
    private double base;


    public Triangulo() {
        this.cor = "";
        this.altura = 0;
        this.base = 0;
    }

    public Triangulo(String cor, double altura, double base) {
        this.cor = cor;
        this.altura = altura;
        this.base = base;
    }

    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getArea(){
        return ((getBase()*getAltura())/2);
    }



  

    
}
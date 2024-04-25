public class Triangulo extends FiguraGeometrica{
    
    private double altura;
    private double base;


    public Triangulo() {
        this.altura = 0;
        this.base = 0;
    }


    public Triangulo(String nome, double altura, double base) {
        super(nome);
        this.altura = altura;
        this.base = base;
    }

    public double getArea(){
        return ((getBase()*getAltura())/2);
    }

    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }

    
  

    
}
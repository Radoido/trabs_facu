public class Triangulo implements ITriangulo {
    public double base;
    public double altura;


    public Triangulo(){
        this.base = 0;
        this.altura = 0; 

    }

    public Triangulo(double base, double altura) {
        base(base);
        altura(altura);

    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return(altura*base)/2;

    }
}
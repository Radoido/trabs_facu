public class Triangulo implements ITriangulo{
    //Atributos
    public double base;
    public double altura;


    public Triangulo(){
        this.base = 0;
        this.altura = 0;
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //gets e sets
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    //Calcula a área
    public double getArea() {
        return (base*altura)/2;
    }

}

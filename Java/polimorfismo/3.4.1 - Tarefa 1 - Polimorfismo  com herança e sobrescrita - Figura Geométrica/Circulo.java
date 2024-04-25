public class Circulo extends FiguraGeometrica{

    private double raio;


    public Circulo(){
        this.raio = 0;

    }

    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }

    public double getArea(){
        return (((raio*raio)*3.14));
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    
}
public class Circulo extends FiguraGeometrica{

    private double raio;


    public Circulo(){
        this("", 0);

    }

    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }

    public double getArea(){
        return ((raio*raio)*Math.PI);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    
}
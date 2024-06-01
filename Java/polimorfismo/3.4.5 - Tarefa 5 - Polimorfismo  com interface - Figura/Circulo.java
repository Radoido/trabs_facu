public class Circulo implements ICalculo{

    private String cor;
    private double raio;


    public Circulo(){
        this.cor = "";
        this.raio = 0;

    }

    public Circulo(String cor, double raio){
        this.cor = cor;
        this.raio = raio;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea(){
        return ((raio*raio)*Math.PI);
    }




    
    
    
}
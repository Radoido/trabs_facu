public abstract class FiguraGeometrica {

    private String nome;
    private String cor;

    public FiguraGeometrica(){
        this.cor = "";

    }

    public FiguraGeometrica(String cor){
        this.cor = cor;
    }


    public abstract double getArea();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}   
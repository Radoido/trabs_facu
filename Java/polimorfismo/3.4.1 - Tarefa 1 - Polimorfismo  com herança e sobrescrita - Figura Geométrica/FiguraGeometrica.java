public class FiguraGeometrica {

    private String nome;
    private String cor;

    public FiguraGeometrica(){
        this.nome = "";
        this.cor = "";

    }

    public FiguraGeometrica(String nome){
        this.nome = nome;
    }


    public double getArea(){
        return (0);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
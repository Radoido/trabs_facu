public class Veiculo {
    public String modelo;
    public String cor;
    public int numeroDeRodas;

    
    public Veiculo(){
        this.modelo = "";
        this.cor = "";
        this.numeroDeRodas = 0;

    }

    public Veiculo(String modelo, String cor, int numeroDeRodas){
        this.modelo = modelo;
        this.cor  = cor;
        this.numeroDeRodas = numeroDeRodas;
    }



}

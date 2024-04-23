
public class FabricaVeiculos {
    // Atributos
    public String tipoVeiculo;
    public String modelo;
    public String cor;
    public int numeroDeRodas;

    // Construtor
    public FabricaVeiculos(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;

    }

    // Método fabricaCarro
    public Veiculo fabricaCarro() {
       return new Veiculo(modelo,"vermelho", 4);
    
    }
    
    // Método fabricaMoto
    public Veiculo fabricaMoto() {
       return new Veiculo(modelo, "azul", 2 );
     
    }

    // Método fabricaCaminhao
    public Veiculo fabricaCaminhao() {
       return new Veiculo(modelo, "preto", 6 );
    
    }

    public void setModelo(String modelo){
        this.modelo = modelo;

    }

}


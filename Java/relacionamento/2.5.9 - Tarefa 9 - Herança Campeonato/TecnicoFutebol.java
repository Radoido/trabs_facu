// Classe TecnicoFutebol herda de Tecnico
class TecnicoFutebol extends Tecnico {

    private String estilo;

    public TecnicoFutebol(String nome, int idade, String cargo, String estilo) {
        super(nome, idade, cargo);
        this.estilo = estilo;
    }

    public void exibirEstilo() {
        System.out.println("Estilo: " + estilo);
    }
}
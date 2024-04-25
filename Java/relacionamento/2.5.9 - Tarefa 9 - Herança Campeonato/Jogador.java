// Classe Jogador herda de Pessoa
class Jogador extends Pessoa {

    private String posicao;

    public Jogador(String nome, int idade, String posicao) {
        super(nome, idade);
        this.posicao = posicao;
    }

    public void exibirPosicao() {
        System.out.println("Posição: " + posicao);
    }
}
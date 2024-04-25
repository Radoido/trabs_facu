// Classe Loja como classe base
class Loja {

    public String nome;
    public String endereco;
    
    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

    }

    public void comprarNaLoja(String produto) {
        System.out.println("Você comprou algo na loja: " + nome);
    }

    public void receberProduto() {
        System.out.println( "Produto recebido na loja: " + nome);
    }
}
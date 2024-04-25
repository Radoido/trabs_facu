// Classe LojaVirtual herda de Loja
class LojaVirtual extends Loja {

    private String website;
    
    public LojaVirtual(String nome, String endereco, String website) {
        super(nome, endereco);
        this.website = website;
    }

    public void falarChatbot(String nomeLojaVirtual) {
        System.out.println("Chatbot da loja virtual " + nomeLojaVirtual + " diz: 'Olá! Em que posso ajudar hoje?'");
        
    }

    
}
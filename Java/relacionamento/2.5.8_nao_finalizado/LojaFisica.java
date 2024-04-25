// Classe LojaFisica herda de Loja
class LojaFisica extends Loja {

    private int numeroFuncionarios; 
    
    public LojaFisica(String nome, String endereco, int numeroFuncionarios) {
        super(nome, endereco);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void falarAtendente(String nomeLojaFisica) {
        System.out.println("Atendente da loja física " + nomeLojaFisica + " diz: 'Posso ajudar em algo?'");
    }


}
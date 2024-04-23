public class Cliente {
    
    private String nome;
    private String cpf;
    private int idade;
    private int qtdeContas;

    private ContaBancaria[] contas;


    public Cliente(){
        this.nome = "";
        this.cpf = "";
        this.idade = 0;
        this.qtdeContas = 0;
        this.contas = new ContaBancaria[5];
    }

    public Cliente(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.contas = new ContaBancaria[5];
        this.qtdeContas = 0;
    }

    public void vincularConta(ContaBancaria conta){
        if (qtdeContas >= 5){
           return;

        }else{
            contas[qtdeContas] = conta;
            qtdeContas++;
        }
    }    

    public double getTotalContas(){
        double total = 0.0;
        for (int i=0; i<qtdeContas; i++){
            total += contas[i].getSaldo();
        }
        
        return total;
        
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public int getIdade(){
        return idade;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQtdeContas() {
        return qtdeContas;
    }

    public void setQtdeContas(int qtdeContas) {
        this.qtdeContas = qtdeContas;
    }

    public ContaBancaria[] getContas() {
        return contas;
    }

    public void setContas(ContaBancaria[] contas) {
        this.contas = contas;
    }
       
}
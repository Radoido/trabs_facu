public abstract class Conta{

    private String nome;


    public Conta(){
        this.nome = "";
    }

    public Conta(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo(){
        return (0.0);
    }

    


}
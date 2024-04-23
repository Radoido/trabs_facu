public class Pessoa {
    
    private String nome;
    private int idade;
    //Outros atributos vão aqui!
    
    public Pessoa(){
        this("",0);
    }
    
    public Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //Outros métodos vão aqui!
    private Endereco endereco;


    public Endereco getEndereco(){
        return endereco;

    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;

    }
    


}

  

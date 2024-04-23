public class Funcionario implements IFuncionario{
   private int matricula;
   private String nome;
   
   //Construtor sem parâmetros   
   public Funcionario(){
    setMatricula(0);
    setNome("");
  }
   
   //Construtor com parâmetros
   public Funcionario(int matricula, String nome){
    setMatricula(matricula);
    setNome(nome);
   }


   //set’s
   public void setMatricula(int matricula){
     this.matricula = matricula;
   }
   public void setNome(String nome){
     this.nome = nome;
   }
   //gets’s
   public int getMatricula(){
     return matricula;
   }
   public String getNome(){
     return nome;
   }
}
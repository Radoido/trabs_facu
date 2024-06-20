import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {

        //Objeto para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Declara e instância um objeto chamado colegio1 da classe Colegio
        Colegio colegio1 = new Colegio("Alfa");
        System.out.println("Criando o colegio:" + colegio1.getNome());
        
        
        Turma t1 = new Turma("Programacao orientada a objetos", 10.0);
        System.out.println("Criando a turma de " + t1.getNomeDisciplina() + " e média " + t1.getMediaNota());
        Turma t2 = new Turma("Estrutura de dados", 9.5);
        System.out.println("Criando a turma de " + t2.getNomeDisciplina() + " e média " + t2.getMediaNota());
        Turma t3 = new Turma("Banco de dados", 9.0);
        System.out.println("Criando a turma de " + t3.getNomeDisciplina() + " e média " + t3.getMediaNota());
        
        //Insere as turmas no colégio        
        colegio1.inserirTurma(t1);
        System.out.println("Inserindo a turma " + t1.getNomeDisciplina() + " no colégio " +  colegio1.getNome());
        colegio1.inserirTurma(t2);
        System.out.println("Inserindo a turma " + t2.getNomeDisciplina() + " no colégio " +  colegio1.getNome());
        colegio1.inserirTurma(t3);
        System.out.println("Inserindo a turma " + t3.getNomeDisciplina() + " no colégio " +  colegio1.getNome());

        //Saida dos dados
        System.out.println("Ultima turma incluida: " + colegio1.getUltimaTurma().getNomeDisciplina() + " com média " + colegio1.getUltimaTurma().getMediaNota());
        System.out.println("Disciplina com maior media:" + colegio1.getNomeDisciplinaMaiorMedia());
        System.out.println("Disciplina com menor media:" + colegio1.getNomeDisciplinaMenorMedia());
        
        //Retorna da media das turmas
        System.out.println("Media das turmas:" + colegio1.getMediaTurmas());
    }
}

from aluno import *


def main():
    print("bem vindo a matricula")

    a = aluno(input("digite o nome do aluno: "), '', int(input("digite o telefone do aluno: ")), input("digite o curso do aluno: "))
    a.set_dataNascimento(int(input("digite o dia de nascimento: ")), int(input("digite o mes de nascimento: ")), int(input("digite o ano de nascimento: ")))

    x=1

    while x > 0:
        x = 0
        print("--------------------")
        print("o que deseja fazer?")
        print("1 - adicionar disciplina")
        print("2 - remover disciplina")
        print("3 - mudar situação da disciplina")
        print("4 - ver aluno")
        print("5 - ver idade")
        print("6 - ver situação da disciplina")
        print("0 - sair")
        print("--------------------")

        x = int(input())

        if x == 1:
            nome = ""
            print("digite a disciplina que deseja adicionar")
            while nome == "":
                nome = input()
                if (nome):
                    a.set_disciplinas(nome)
                elif (nome in a.get_disciplinas()):
                    nome = ""
                    print("disciplina já cadastrada")
                else:
                    nome = ""
                    print("digite um nome válido")

            print(a.get_disciplinas())
            print("--------------------")


        elif x == 2:
            if a.get_disciplinas() == {}:
                print("não há disciplinas para remover")
                continue
            print("digite a disciplina que deseja remover")
            a.rmv_disciplina(input())
            print(a.get_disciplinas())
            print("--------------------")


        elif x == 3:
            print("digite a disciplina que deseja mudar a situação")
            if a.get_disciplinas() == {} or a.get_disciplinas() == None:
                print("Disciplina não encontrada")
                continue
            nome = input()
            print("digite a situação que deseja")
            print("1 - aprovado")
            print("2 - reprovado")
            print("3 - cancelado")
            print("4 - matriculado")
            a.set_situacao(nome, int(input()))
            print(a.get_disciplinas())
            print("--------------------")


        elif x == 4:
            print(a.get_aluno())
            print("--------------------")


        elif x == 5:
            print(a.get_idade())
            print("--------------------")

        elif x == 6:
            print("digite a disciplina que deseja ver a situação")
            print(a.get_situacao(input()))
            print("--------------------")

        elif x == 0:
            print("até mais")
            break

if __name__ == "__main__":
    main()

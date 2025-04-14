class aluno:
    def __init__(self, nome = str, dataNascimento = str, telefone = int, curso = str):
        self.nome = nome
        self.dataNascimento = dataNascimento
        self.telefone = telefone
        self.curso = curso
        self.disciplinas = {}

    def __str__(self):
        return f"Nome: {self.nome}\n data de nascimento: {self.dataNascimento}\n telefone: {self.telefone}\n curso: {self.curso}\n disciplinas: {self.disciplinas}"
    
    def set_disciplinas(self, nome):
        if nome == " ":
            print("Digite um nome válido")
        if nome in self.disciplinas:
            print("Disciplina já cadastrada")
            return self.disciplinas
        self.disciplinas[nome] = "matriculado"
        return self.disciplinas

    def set_situacao(self, nome, x):
        if x == 1:
            self.disciplinas[nome] = "aprovado"
        elif x == 2:
            self.disciplinas[nome] = "reprovado" 
        elif x == 3:
            self.disciplinas[nome] = "cancelado" 
        elif x == 4:
            self.disciplinas[nome] = "matriculado" 
        else:
            print("Valor inválido")
            return 
        
    def set_dataNascimento(self, dia, mes, ano):

        if dia > 31 or mes > 12:
            print("Data inválida")
            return 
        if dia == '' or mes == '' or ano == '':
            print("Data inválida")
            return 
        if dia and mes and ano:
            self.dataNascimento = f"{dia}/{mes}/{ano}"
            return self.dataNascimento
    
    def get_aluno(self):
        return (f"Nome: {self.nome}\n Data de nascimento {self.dataNascimento}\n Telefone: {self.telefone}\n Curso: {self.curso} \n Disciplinas: {self.disciplinas or 'nenhuma disciplina cadastrada'}")

    def get_disciplina(self):
        if self.disciplinas == {}:
            print("nenhuma disciplina cadastrada")
            return
        else:
            return self.disciplinas   

    def get_situacao(self, nome):
        return f"{nome}: {self.disciplinas[nome]}"
    
    def get_idade(self):
        if self.dataNascimento:
            _, _, ano = self.dataNascimento.split('/')
            return (2025 - int(ano))
        else:
            print("Data de nascimento indisponível")
            self.set_dataNascimento(input("digite o dia de nascimento: "), input("digite o mes de nascimento: "), input("digite o ano de nascimento: "))
            return 
        
    def rmv_disciplina(self, nome):
        self.disciplinas.pop(nome)
        return self.disciplinas
    
a = aluno('Rafael', '24/10/2002', 123456789, 'TADS')
print(f"Aluno:\n {a.get_aluno()}")
print(f"Idade: {a.get_idade()}")
print('Adicionando disciplinas')
a.set_disciplinas('Dados')
a.set_disciplinas('Web')
a.set_disciplinas('Redes')
print(f"Disciplinas do aluno {a.get_disciplina()}")
print('Alterando situacao da disciplina')
a.set_situacao('Redes', 2)
print(f"{a.get_situacao('Redes')}")
print('Removendo disciplina')
a.rmv_disciplina('Dados')
print(f"Disciplinas do aluno {a.get_disciplina()}")
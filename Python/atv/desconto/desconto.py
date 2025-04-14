qtdItem = int(input("quantos itens? "))
preco = float(input("qual o valor total? "))
pagamento = int(input(f""))


def tipoVenda(qtdItem, preco, pagamento):
    while (pagamento := input("qual a forma de pagamento?\n 1-a vista 2-a prazo")) not in [1,2]:
        print("forma de pagamento invalida. digite 1 - pagemnto a vista ou 2 - pagamento a prazo")

    
    if pagamento == 1:
        if qtdItem <= 5:
            preco = preco - ((5 / 100) * preco)  # Desconto de 5%
        elif qtdItem <= 10:
            preco = preco - ((10 / 100) * preco)  # Desconto de 10%
        else:
            preco = preco - ((15 / 100) * preco)  # Desconto de 15%

        return f"Com o desconto, o valor fica R${preco:.2f}"

    else:
        if qtdItem <= 5:
            preco = preco + ((5 / 100) * preco)
        elif qtdItem <= 10:
            preco = preco + ((10 / 100) * preco)
        else:
            preco = preco + ((15 / 100) * preco)
        return f"com o acrescimo o valor fica {preco}"

venda = tipoVenda(qtdItem, preco, pagamento)
print (venda)



CPF = list(input("digite o CPF aqui: "))
CPF_STRING = " ".join(CPF)

def validacao_cpf():
  if len(CPF) == 11:
    n1 = int(CPF[0]) * 10
    n2 = int(CPF[1]) * 9
    n3 = int(CPF[2]) * 8
    n4 = int(CPF[3]) * 7
    n5 = int(CPF[4]) * 6
    n6 = int(CPF[5]) * 5
    n7 = int(CPF[6]) * 4
    n8 = int(CPF[7]) * 3
    n9 = int(CPF[8]) * 2

    p1 = int(CPF[0]) * 11
    p2 = int(CPF[1]) * 10
    p3 = int(CPF[2]) * 9
    p4 = int(CPF[3]) * 8
    p5 = int(CPF[4]) * 7
    p6 = int(CPF[5]) * 6
    p7 = int(CPF[6]) * 5
    p8 = int(CPF[7]) * 4
    p9 = int(CPF[8]) * 3
    p0 = int(CPF[9]) * 2

    soma1 = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9)
    resto1 = soma1 % 11

    soma2 = (p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 + p9 + p0)
    resto2 = soma2 % 11

    primeironum1 = False
    primeironum2 = False
    segundonum1 = False
    segundonum2 = False

    if (resto1 <= 1) and (int(CPF[9]) == 0) :
      primeironum1 = True
    if (11 - resto1 == int(CPF[9])):
      primeironum2 = True

    if (resto2 <= 1) and (int(CPF[10]) == 0) :
      segundonum1 = True
    if (11 - resto2 == int(CPF[10])):
      segundonum2 = True


    if (primeironum1 == True or primeironum2 == True) and (segundonum1 == True or segundonum2 == True):
      print(f"O CPF de numero: %s é valido" %(CPF_STRING))
    else:
      print(f"O CPF de numero: %s é invalido" %(CPF_STRING))


validacao_cpf()


### 695.785.123-09
### 62606318714
### 11144477735


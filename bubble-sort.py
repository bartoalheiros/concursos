#SERPRO - Cebraspe 2023 (Analista de Sistemas)

numeros = [5, 1, 4, 2, 8]

def ordenacao(numeros):
  
  for x in range(len(numeros)-1):
    for y in range(len(numeros)-1):
      
      if(numeros[y]>numeros[y+1]):

        temp = numeros[y]
        numeros[y] = numeros[y+1]
        numeros[y+1] = temp

  return numeros

print("\nLista Desordenada: ")
print (numeros,"\n")

result = ordenacao(numeros)
print("Lista Ordenada:")
print (numeros,"\n")
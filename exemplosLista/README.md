## Listas

- Lista é uma estrutura de dados:

    - Homogênea(dados do mesmo tipo)

    - Ordenada(Elementos acessados por meio de posições)

    - Inicia vazia, e seus elementos são alocados sob demanda

    - Cada eleento ocupa um "nó" (ou nodo) da lista

- Tipo(interface): List

- Classes que implementam: ArrayList, LinkedList, etc.

- Vantagens:
    - Tamanho variável
    
    - Failidade para se ralizar inserções e deleções

- Desvantagens:
    - Acesso sequencial aos elementos


# Tamanho da lista:
    - size()

# Inserir elemento na lista: 
    - add(obj). add(int, obj)

# Remover elementos da lista:
    - remove(obj), remov(int), removeIF(Predicate)    

# Encotrar posição de elemento:
    - indexOF(obj), lastIndexOf(obj)

# Filtrar lista com base em predicado:
    - List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectores.toList())

# Encontre primeira ocorência com base em predicado:
    - Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null)
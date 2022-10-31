## Exercico de Lista

Fazer um prohgrama para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.

Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem autalizada dos funionários, conforme exemplos.

Lembre-se de alicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode ser aumentado com base em uma opção de aumento por porcenagem dada.

# Exemplo

    - Pergunta.
    
        Quantos empregados serão registados?
    
        * Pegar o valor digitado e solicitar as seguintes informações:

            Empregado #1: Número sequencial da quantidade de funcionário digitados acima.

            Id: Número

            Nome: Nome do funcionário

            Salário: Salário bruto do funcionário 
        
        Solicitar numero do ID do funcionário que que ajustar o salário.

            Digite o ID do empregado que terá aumento salarial:

            Criar um IF aqui:
                
                Caso o ID digitado não tenha deve ser apresentado a seguinte mensagem:
                
                    - Este id não existe!
            
            Se o Id existe solicitar a digitação do percentual.

                    - Digite o percentual:
        
        Lista de funcionários:

        ID - Nome - Salario
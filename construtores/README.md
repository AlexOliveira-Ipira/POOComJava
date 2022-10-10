## Metodo Construtor

Utilizando o mesmo APP produtoEstoque para implementar o construtor, sendo feito um construtor padão e dois customizados.

## Construtor padrão
    public Produto(){

    }

## Construtores customizados

No primeiro foi colocado todos os argumentos e no segundo apenas dois argumentos da classe.
    
    public Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }


package entities;

public class Produtos {

    private String nome;
    private double preco;


    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getpreco() {
        return preco;
    }


    public void setpreco(double preco) {
        this.preco = preco;
    }

    
    
    
}

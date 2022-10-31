package entities;

public class Funcionarios {
    private int id;
    private String nome;
    private Double salario;

    
    public Funcionarios() {
    }


    public Funcionarios(int id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }


    public int getId() {
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Double getSalario() {
        return salario;
    }


    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void ajusteSalario(double precentual){
        salario += salario * precentual / 100.0;
    }

    @Override
    public String toString() {
        return "ID: " 
        + id
        + ", Nome: "
        + nome 
        + ", Salário: " 
        + String.format("%.2f", salario);
    }

    
}

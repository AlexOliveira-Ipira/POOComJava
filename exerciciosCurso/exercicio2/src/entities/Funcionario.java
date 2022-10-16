package entities;

/**
 * Funcionario
 */
public class Funcionario {
    private String name;
    private double salario;
    private double imposto;

    public double salarioSemImposto(){
        return salario - imposto;
    }

    public void reajusteSalario(double percentual){
        salario += salario * percentual / 100.0;
    }

    @Override
    public String toString() {
        return "Funcionario " + name + " , " + salarioSemImposto();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getTaxa() {
        return imposto;
    }
    public void setTaxa(double imposto) {
        this.imposto = imposto;
    }

    
    
}
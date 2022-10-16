package entitis;

public class Alunos {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
   
    public double totalNotas(){
        return nota1 + nota2 + nota3;
   }

    public Double notasFaltando(){
        if(totalNotas() >= 60.0){
            return 0.0;
        }else{
            return 60.0 - totalNotas();
        }
    }

    @Override
    public String toString() {
        return "Nota final " + totalNotas() ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leitruraDados = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Nome funcionário : ");
        funcionario.setName(leitruraDados.nextLine());
        System.out.print("Valor do salário : ");
        funcionario.setSalario(leitruraDados.nextDouble());
        System.out.print("Imposto : ");
        funcionario.setTaxa(leitruraDados.nextDouble());

        System.out.println();
        System.out.println(funcionario);
        System.out.println();
        System.out.print("Entre com o percentual de ajuste :");
        double percentual = leitruraDados.nextDouble();
        funcionario.reajusteSalario(percentual);

        System.out.println();
        System.out.println("Atualziação dos daods " + funcionario);


        leitruraDados.close();
    }
}

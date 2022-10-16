package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leituraDados = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Entre com a area do retângulo: ");
        System.out.print("Largura ");
        retangulo.setAltura(leituraDados.nextDouble());
        System.out.print("Altura ");
        retangulo.setLargura(leituraDados.nextDouble());
        System.out.println();

        System.out.printf("Area = %.2f%n", retangulo.area());
        System.out.printf("Perimetro  = %.2f%n",retangulo.perimetro());
        System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
        

        leituraDados.close();
    }
}

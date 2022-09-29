package application;

import java.util.Locale;
import java.util.Scanner;

import application.entities.Triangle;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner leituraDados = new Scanner(System.in);
        
        Triangle x , y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:  ");
        x.a = leituraDados.nextDouble();
        x.b = leituraDados.nextDouble();
        x.c = leituraDados.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        y.a = leituraDados.nextDouble();
        y.b = leituraDados.nextDouble();
        y.c = leituraDados.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("riangle X area: %.4f%n", areaX);
        System.out.printf("riangle Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }
        System.out.println("Larger area: Y");
       



        leituraDados.close();
    }
}

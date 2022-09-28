package application;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner leituraDados = new Scanner(System.in);
       double xA , xB, xC , yA, yB, yC;

       System.out.println("Enter the measures of triangle X:  ");
       xA = leituraDados.nextDouble();
       xB = leituraDados.nextDouble();
       xC = leituraDados.nextDouble();

       System.out.println("Enter the measures of triangle y: ");
       yA = leituraDados.nextDouble();
       yB = leituraDados.nextDouble();
       yC = leituraDados.nextDouble();

       double p = (xA + xB + xC) / 2.0;
       double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

       p = (yA + yB + yC) / 2.0;
       double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

       System.out.printf("riangle X area: %.4f%n", areaX);
       System.out.printf("riangle Y area: %.4f%n", areaY);

       if (areaX > areaY){
        System.out.println("Larger area: X");
       }
       System.out.println("Larger area: Y");
       



       leituraDados.close();
    }
}

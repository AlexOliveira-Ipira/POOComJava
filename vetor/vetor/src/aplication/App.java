package aplication;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas para calcular a média: ");
        int n = leituraDados.nextInt();
        double[] vect = new double[n];

        for(int i = 0 ; i < n ; i++){
            int posicao = i + 1;
            System.out.print("Digite a " + posicao + " altura: ");
            vect[i] = leituraDados.nextDouble();            
        }
    
        double soma = 0.0;
        for(int i = 0 ; i < n ; i++){
            soma += vect[i];
        }
        double media = soma / n;
        System.out.println();
        System.out.printf("A media das alturas é %.2f%n", media);
      
        leituraDados.close();
    }
}
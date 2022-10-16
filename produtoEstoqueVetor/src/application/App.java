package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class App {
    public static void main(String[] args) throws Exception {
       Locale.setDefault(Locale.US);
       Scanner leituraDados = new Scanner(System.in);

       System.out.print("Entre com a quantidade de produtos a ser lançados: ");
       int n = leituraDados.nextInt();
       
       Produtos[] vect = new Produtos[n];

       for(int i = 0 ; i < vect.length; i++){
        leituraDados.nextLine();
        int posicaoProduto = i + 1;
        System.out.println("Entre com os dados do " + posicaoProduto + " produto. ");
        System.out.print("Nome: ");
        String nome = leituraDados.nextLine();
        System.out.print("Preço: ");
        double preco = leituraDados.nextDouble();
        vect[i] = new Produtos(nome, preco);
       }

       double soma = 0.0;
       for(int i = 0; i < vect.length; i++){
            soma += vect[i].getpreco();
       }

       double media = soma / vect.length;
       System.out.println();
       System.out.printf("A médica dos valores é %.2f%n", media);

       leituraDados.close();

       
    }
}

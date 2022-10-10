package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.Produto;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leituraDados = new Scanner(System.in);
        

        System.out.println("Enter product data:  ");
        System.out.print("Name: ");
        String name =(leituraDados.nextLine());
        System.out.print("Price: ");
        Double price = (leituraDados.nextDouble());
        System.out.print("Quantity: ");
        int qtde = (leituraDados.nextInt());

        Produto produto = new Produto(name, price, qtde);

        System.out.println();
        System.out.println("produto data: " + produto);

        System.out.println();
        System.out.print("Enter the number of produtos to be added in stock: ");
        int entQuantity = leituraDados.nextInt();
        produto.addQuantity(entQuantity);

        System.out.println();
        System.out.println("Update data: " + produto);

        System.out.println();
        System.out.print("Enter the number of produtos to be removed from stock: ");
        int saiQuantity = leituraDados.nextInt();
        produto.removeProducts(saiQuantity);

        System.out.println();
        System.out.println("Update data: " + produto);

        
        leituraDados.close();
    }
}


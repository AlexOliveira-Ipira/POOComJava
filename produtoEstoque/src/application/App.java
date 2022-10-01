package application;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

import entitis.Product;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leituraDados = new Scanner(System.in);
        
        Product product = new Product();
        System.out.println("Enter product data:  ");
        System.out.print("Name: ");
        product.setName(leituraDados.nextLine());
        System.out.print("Price: ");
        product.setPrice(leituraDados.nextDouble());
        System.out.print("Quantity: ");
        product.setQuantity(leituraDados.nextInt());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int entQuantity = leituraDados.nextInt();
        product.addQuantity(entQuantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        int saiQuantity = leituraDados.nextInt();
        product.removeProducts(saiQuantity);

        System.out.println();
        System.out.println("Update data: " + product);

        
        leituraDados.close();
    }
}


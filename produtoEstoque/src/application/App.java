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

        System.out.println(product);
        
        leituraDados.close();
    }
}


package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.Product;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leituraDados = new Scanner(System.in);
        
        Product product = new Product();
        System.out.println("Enter product data:  ");
        System.out.print("Name: ");
        product.name = leituraDados.nextLine();
        System.out.print("Price: ");
        product.price = leituraDados.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = leituraDados.nextInt();

        System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        
        leituraDados.close();
    }
}


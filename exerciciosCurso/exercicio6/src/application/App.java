package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner entraDados = new Scanner(System.in);

        Aluguel[] quartos = new Aluguel[10];

        System.out.print("Quantos quartos quer alugar? ");
        int qtdQuartos = entraDados.nextInt();

        for (int i = 1; i <=qtdQuartos ; i++){
            System.out.println();
            System.out.println("Aluguel "  + i +  ':');
            System.out.print("Nome: ");
            entraDados.nextLine();
            String nome = entraDados.nextLine();
            System.out.print("Email: ");
            String email = entraDados.next();
            System.out.print("Quarto: ");
            int numeroQuarto = entraDados.nextInt();
            System.out.println();

            quartos[numeroQuarto] = new Aluguel(nome, email);
        }

        System.out.println();
        System.out.println("Quartos alugados: ");

        for (int i = 0; i < 10; i++){
            if(quartos[i] != null){
                System.out.println(i + ": " + quartos[i]);
            }
        }
        entraDados.close();
    }
}

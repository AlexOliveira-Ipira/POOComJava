package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner leituradados = new Scanner(System.in);

        Conta conta;

        System.out.print("Entre com o número da conta: ");
        int contaNumero = leituradados.nextInt();
        leituradados.nextLine();
        System.out.print("Entre com o nome do titular: ");
        String titular = leituradados.nextLine();
        System.out.print("Tem deposito inicial (s/n): ");
        char resposta = leituradados.next().charAt(0);

        if(resposta == 's'){
            System.out.print("Entre com o deposito inicial: ");
            double depositoInicial = leituradados.nextDouble();
            conta = new Conta(contaNumero, titular, depositoInicial);

        }else{
            conta = new Conta(contaNumero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com valor de deposito: ");
        double valorDeposito = leituradados.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados atualizado com sucesso.");
        System.out.println(conta);

        System.out.println();
        System.out.println("O saque tem uma taxa de $ 5.00.");
        System.out.print("Entre com valor de saque: ");
        double valorSaque = leituradados.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Dados atualizado com sucesso.");
        System.out.println(conta);

       leituradados.close();
    }
}

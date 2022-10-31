package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner entraDados = new Scanner(System.in);

        List<Funcionarios> listaFuncionario = new ArrayList<>();

        System.out.print("Quantos empregados serão registados? ");
        int qtdFuncionario = entraDados.nextInt();

        // Solicitando entrada de dados
        for (int x = 0 ; x < qtdFuncionario; x++){
            System.out.println();
            System.out.println("Funcionario # " + (x + 1) + " :");

            System.out.print("ID: ");
            int id = entraDados.nextInt();
            while(hasId(listaFuncionario, id)){
                System.out.print("Id já existe, digite outro numero: ");
				id = entraDados.nextInt();
            }

            System.out.print("Nome: ");
            entraDados.nextLine();
            String nome = entraDados.nextLine();        
            System.out.print("Salário: ");
            Double salario = entraDados.nextDouble();
            listaFuncionario.add(new Funcionarios(id, nome, salario));
        }
        System.out.println(); 
        System.out.println("Lista de Funcionários");
        for(Funcionarios funcionario : listaFuncionario){                   
            System.out.println(funcionario);
        }      
        entraDados.close();
    }

    private static boolean hasId(List<Funcionarios> list, int id) {
        Funcionarios codId = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return codId != null;
    }
}

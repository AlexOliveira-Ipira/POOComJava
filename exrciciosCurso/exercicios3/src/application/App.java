package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.Alunos;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leituraDados = new Scanner(System.in);

        Alunos alunos = new Alunos();

        System.out.print("Entre com o nome do aluno: ");
        alunos.setNome(leituraDados.nextLine());
        System.out.print("Entre com a nota do primeiro semestre: ");
        alunos.setNota1(leituraDados.nextDouble());
        System.out.print("Entre com a nota do segunda semestre: ");
        alunos.setNota2(leituraDados.nextDouble());
        System.out.print("Entre com a nota do terceiro semestre: ");
        alunos.setNota3(leituraDados.nextDouble());
        System.out.println();

        System.out.println(alunos);
        if(alunos.totalNotas() >= 60){         
            System.out.println("Passou");
        }else{
            System.out.println("Não passou");
            System.out.printf("Faltaram " + alunos.notasFaltando() + " pontos");
        }
       


        leituraDados.close();
    }
}
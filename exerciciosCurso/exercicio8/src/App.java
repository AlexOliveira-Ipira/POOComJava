import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entraDados = new Scanner(System.in);
        
        System.out.print("Entre com um número para criar a matriz: ");
        int matrizNumero = entraDados.nextInt();
        int[][] matriz = new int[matrizNumero][matrizNumero];

        for (int i=0; i<matrizNumero; i++){
            System.out.println("Entre com o valor da " + (i + 1) + " Linha");
            for(int j = 0; j <matrizNumero; j++){
                matriz[i][j] = entraDados.nextInt();
            }
        }
        System.out.println();
        System.out.println("Numeros na diagonal: ");
        for(int i=0; i <matrizNumero ; i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        System.out.println();
        int contador = 0;
        for (int i=0; i<matrizNumero; i++){
            for(int j = 0; j <matrizNumero; j++){
                if(matriz[i][j] < 0){
                    contador++;
                }
            }
        }
        System.out.println("Quantidade de numeros negativos da matriz: " + contador);

        entraDados.close();
    }
}

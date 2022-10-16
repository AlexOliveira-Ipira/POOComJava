import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leituraDados= new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = leituraDados.nextInt();

        int[] vectN = new int[n];

        for(int i = 0 ; i < vectN.length; i++){
            System.out.print("Digite um numero: ");
            vectN[i] = leituraDados.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for(int i = 0 ; i < vectN.length; i++){
            if(vectN[i] < 0){
                System.out.println(vectN[i]);
            }
        }

        leituraDados.close();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        String[] frutas = new String[]{"Uva", "Laranja", "Melão"};

        //Uso do for padrão
        System.out.println("Impressão com laço for padrão.");
        for (int i = 0; i < frutas.length; i ++){
            System.out.println(frutas[i]);
        }

        System.out.println("-------------------------");

        //Usando o for each
        System.out.println("Impressão usando for each");
        for(String fruta : frutas){
            System.out.println(fruta);
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("-------------------------------------");
        // Declarar lista de Números Inteiros
        List<Integer> listInteiros = new ArrayList<>();

        // Adicionando valores a lista
        System.out.println("Exemplo de lista Integer.");
        int[] numeros = {1,2,3,4};   
        for(int numero : numeros){
            listInteiros.add(numero);
        }
        //Imprimindo toda a lista
        for(int x : listInteiros){
            System.out.println(x);
        }
        System.out.println("-------------------------------------");
        System.out.println("Exemplo de lista String.");

        // Declarar lista de String
        List<String> frutas = new ArrayList<>();

        frutas.add("Manga");
        frutas.add("Abacaxi");
        frutas.add("Melão");
        frutas.add("Laranja");

        for(String fruta : frutas ){
            System.out.println(fruta);
        }
        System.out.println("-------------------------------------");
        //Inserindo elemento em uma determinada posição.
        System.out.println("Inserindo a fruta Damasco na lista");
        frutas.add(2, "Damasco");
        for(String fruta : frutas ){
            System.out.println(fruta);
        }
        System.out.println("-------------------------------------");
        //Removendo elemento da lista
        System.out.println("Removendo o Abacaxi da lista");
        frutas.remove("Abacaxi");
        for(String fruta : frutas ){
            System.out.println(fruta);
        }
        System.out.println("-------------------------------------");
        System.out.println("Removendo objeto da lista por posição");
        frutas.remove(2);
        for(String fruta : frutas ){
            System.out.println(fruta);
        }
        //Refazendo a lista
        System.out.println("-------------------------------------");
        System.out.println("Refazendo a lista");
        List<String> novaLista = new ArrayList<>();
        novaLista.add("Manga");
        novaLista.add("Abacaxi");
        novaLista.add("Melão");
        novaLista.add("Laranja");
        novaLista.add("Abacate");

        for(String x : novaLista ){
            System.out.println(x);
        }
        System.out.println("-------------------------------------");
        //Removendo da lista utilizando um predicado
        System.out.println("Remover todas as frutas que começa com M");
        novaLista.removeIf(x -> x.charAt(0) == 'M');
        for(String x : novaLista ){
            System.out.println(x);
        }
        System.out.println("-------------------------------------");
        //Encontrar a posição de um elemento
        System.out.println("Encontrar a posição de um elemento");
        System.out.println("Index of Laranja: " +  novaLista.indexOf("Laranja"));
        System.out.println("Elemento não encontrado");
        System.out.println("Index of Manga: " +  novaLista.indexOf("Manga"));

        System.out.println("-------------------------------------");
        //Filtrar utilizando a primeira letra
        System.out.println("Filtrar utilizando a primeia letra A");
        List<String> filtro = novaLista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String f : filtro ){
            System.out.println(f);
        }
        System.out.println("-------------------------------------");
        //Encontrar elemento na lista
        System.out.println("Encontrar elemento na lista");
        String nomeFruta = novaLista.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
        System.out.println(nomeFruta);
    }
}

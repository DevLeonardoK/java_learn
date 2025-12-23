package java_pleno.stream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Leonardo Reis");
        listaNomes.add("Leonardo Kremer");
        listaNomes.add("Julia Reis");
        listaNomes.add("Julia Kremer");

        List<String> nomeLeonardo = listaNomes.stream().filter(nome -> nome.strip().startsWith("Leonardo")).toList();

        System.out.println(nomeLeonardo);

        List<String> nomesUpper = listaNomes.stream().map(String::toUpperCase).toList();
        System.out.println(nomesUpper);

        String nomes = listaNomes.stream().filter(nome -> nome.startsWith("Leonardo")).map(String::toUpperCase).map(nome -> nome.replaceAll(" ", "")).reduce("",(a,b)-> a + b);
        System.out.println(nomes);

    }
}

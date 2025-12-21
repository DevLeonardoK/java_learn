package java_pleno.exercicio_estrutura_2;
import java.util.*;
public class setMain {
    public static void main(String[] args) {
        Set<String> setString = new LinkedHashSet<>();
        setString.add("Leonardo");
        setString.add("Elaine");
        setString.add("Leonardo");
        System.out.println(setString);

        List<String> setStringOrdenada = new ArrayList<>(setString);
        Collections.sort(setStringOrdenada);
        System.out.println(setStringOrdenada);

        TreeSet<Integer> setInteger = new TreeSet<>();
        setInteger.add(1);
        setInteger.add(10);
        System.out.println(setInteger.last());
        System.out.println(setInteger.first());

        Set<String> palavras = new TreeSet<>();
        String p = "testando todas as palavras possiveis testando todos os nome possiveis";
        for (String r : p.split(" ")){
            palavras.add(r.strip());
            System.out.println(palavras);
        }
        System.out.println(palavras);
    }
}

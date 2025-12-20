package java_pleno.exercicios_estrutura_dados;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class set {
    public static void main(String[] args) {
        //Lista sem valores reptidos e sem indice
        //HashSet - rapida mas nao mantem ordem
        //LinkedHashset - mantem a ordem de inserção
        //TreeSet - mantem ordenado automaticamente
        //Quando repete o valor, ele ignora e nao insere na lista

        //HashSet e HashMap usam hashtable = array que passa a posicao para codigo hash e a posicao guarda uma lista de valores que cairam ali
        //caso caia na mesma posicao de hash, é utilizado o equal por baixo dos panos

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(1);
        setInteger.add(4);
        System.out.println(setInteger);

        //Ordenação
        Set<String>setString = new TreeSet<>();
        setString.add("Elaine");
        setString.add("Leonardo");
        setString.add("Abigael");
        System.out.println(setString);






    }
}

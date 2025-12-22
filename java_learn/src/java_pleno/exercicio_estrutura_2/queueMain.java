package java_pleno.exercicio_estrutura_2;

import java.util.*;

public class queueMain {
    public static void main(String[] args) {
        Queue<String> listaPessoas = new LinkedList<>();
        listaPessoas.add("Leonardo");
        listaPessoas.add("Elaine");
        listaPessoas.add("Julia");
        //System.out.println(new ArrayList<>(listaPessoas).getFirst());
        //System.out.println(new ArrayList<>(listaPessoas).getLast());

        for (String r : listaPessoas){
            System.out.println(listaPessoas);
            listaPessoas.remove();
            System.out.println(listaPessoas);

        }



    }
}

package java_pleno;

//Map - chave valor
//Set - não permite duplicatas
//List - lista ordenada com elementos duplicados
//Queue - Filas usadas para processamento

import java.util.*;


public class Main {
    public static void main(String[] args) {

        //List<String> list = List.of("apple", "banana", "cherry"); Passando valores fixos

        //Passando valores alternados e podendo ser duplicados
        List<String> list = new ArrayList<>();
        list.add("Moto");
        list.add("Leonardo");
        list.add("Moto");

        System.out.println("List: " + list);

        //Lista que não pode valores duplicados
        Set<String> set = new HashSet<>(); //HashSet - implementação mais utilizada
        set.add("Moto");
        set.add("Leonardo");
        set.add("Moto");
        System.out.println("Set: " + set);

        //Verificar se existe no set
        System.out.println("Existe 'Leonardo': " + set.contains("Leonardo"));
        System.out.println("Existe 'Julia': " + set.contains("Julia"));

        //Map
        Map<String,String> map = new HashMap<>();
        map.put("nome", "Leonardo");
        map.put("surname","Kremer");
        System.out.println("Map: " + map.get("nome"));

        //Verificar se existe no map
        System.out.println("Existe key 'nome': " + map.containsKey("nome"));
        System.out.println("Existe value 'Leonardo': " + map.containsValue("Leonardo"));


        //Fila
        Queue<String> queue = new LinkedList<>(); //LinkedList = Listas encadeadas - posicao atual da lista, aponta para proxima e para a posicao anterior
        queue.add("Leonardo");
        queue.add("Kremer");
        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.peek()); //acessa o primeiro mas nao remove
        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.poll()); //acessa o primeiro e remove o valor
        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.remove());
        System.out.println("Queue: " + queue.remove()); //A ideia igual do poll, porem lança uma exception quando retorna null

        List lista = new ArrayList<>();
        lista.add("Texto");

        String nome = (String) lista.get(0);

        //Pode ocorre essa falha
        lista.add(10);

    }
}

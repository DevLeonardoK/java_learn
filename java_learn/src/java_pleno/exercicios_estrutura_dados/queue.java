package java_pleno.exercicios_estrutura_dados;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        //Primeiro que entra, Primeiro que sai
        //add, pool (remove da lista), peek(primeiro), remove(lança exception quando null), offer(add)
        //LinkedList - sao duplamente ligadas
        //linked list - mantem ordem de inserção

        Queue<String> listaPacientes = new LinkedList<>();
        listaPacientes.add("Leonardo");
        listaPacientes.add("Elaine");
        listaPacientes.add("Júlia");

        //Lista completa
        System.out.println(listaPacientes);

        //Lista com peek - primeiro
        System.out.println("Primeiro da fila: " +listaPacientes.peek());
        //Primeiro valor a ser removido
        listaPacientes.poll();
        System.out.println("Lista com o primeiro valor removido: " +listaPacientes);
        //Lista com o segundo valor a ser removido
        listaPacientes.poll();
        System.out.println("Lista com o segundo valor removido: " +listaPacientes.poll());

        //Tentar remover com exception
        //listaPacientes.remove();
        //Se remover vai ser null a lista, entao vai retornar erro;


        //lista ordenação
        Queue<Number> queueOrdenada = new PriorityQueue<>();
        queueOrdenada.add(10);
        queueOrdenada.add(30);
        queueOrdenada.add(20);

        System.out.println(queueOrdenada.poll());

        System.out.println(queueOrdenada.poll());


        System.out.println(queueOrdenada.poll());


    }
}

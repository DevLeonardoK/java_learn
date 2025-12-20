package java_pleno.exercicios_estrutura_dados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {
        //Lista ordenada - Pode duplicar elementos
        //LinkedList - server para alterações frequentes na lista
        //Toda implemntação da interface List permite itens duplicados e ordenados

        //Definição mais simples
        List<Integer> listaNumeros =  Arrays.asList(1,2,3);
        List<String> listaString = Arrays.asList("Amabile","Bernardo", "Rafaela","Fabio","Cesar");

        System.out.println(listaString);

        //ordem alfabetica
        Collections.sort(listaString);
        System.out.println(listaString);


//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
    }
    }

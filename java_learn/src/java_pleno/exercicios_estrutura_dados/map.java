package java_pleno.exercicios_estrutura_dados;
import java.util.*;
public class map {
    public static void main(String[] args) {
        //map é a estratégia de chave/valor ex: {"nome":"Leonardo"}
        //a chave nao pode repetir, mas o valor pode
        //implementações: hashmap - muito usado mas nao garante ordem
        //linkedhashmap - mantem ordem da insercao
        //treeMap - ordena pela chave

        Map<String, Integer> mapIdades = new HashMap<>();
        mapIdades.put("Leonardo", 19);
        mapIdades.put("João", 13);
        mapIdades.put("Júlia", 17);
        //Caso colocar uma chave repetida, ele sobreescreve o valor

        mapIdades.put("João", 16);
        System.out.println(mapIdades);

        Map<String, Integer> contadorPalavra  = new LinkedHashMap<>();
        contadorPalavra.put("palavra1", 2);
        contadorPalavra.put("palavra2", 3);
        contadorPalavra.put("palavra1",4);

        System.out.println(contadorPalavra.get("palavra1"));

    }
}


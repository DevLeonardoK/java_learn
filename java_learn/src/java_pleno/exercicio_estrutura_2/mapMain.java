package java_pleno.exercicio_estrutura_2;

import java.util.*;

public class mapMain {
    public static void main(String[] args) {
        Map<String, Integer> pessoaIdade = new HashMap<>();
        pessoaIdade.put("Elaine", 40);
        pessoaIdade.put("Leonardo", 20);

        pessoaIdade.put("Elaine",41);
        //System.out.println(pessoaIdade.keySet());
        //System.out.println(pessoaIdade.values());

        //System.out.println(Collections.max(pessoaIdade.values()));
        //System.out.println(Collections.min(pessoaIdade.values()));

        String frase = "ola, tudo certo, ola";
        Map<String, Integer> contadorPalavras = new HashMap<>();
        for (String r : frase.split(",")){
            if (contadorPalavras.containsKey(r.strip())){
                contadorPalavras.put(r.strip(), contadorPalavras.get(r.strip())+1);
            }else{
                contadorPalavras.put(r.strip(), 1);
            }
        }

        //System.out.println(contadorPalavras);

        Map<String, List<Integer>> alunoNota = new HashMap<>();
        //iniciando a lista de valores como value
        alunoNota.put("Leonardo", new ArrayList<>());
        alunoNota.get("Leonardo").add(10);
        alunoNota.get("Leonardo").add(10);
        alunoNota.get("Leonardo").add(10);
        int notaMedia = 0;
        for (int i : alunoNota.get("Leonardo")){
            notaMedia += i;

        }
        //System.out.println(notaMedia / (alunoNota.get("Leonardo").size()));

        Map<Integer, Integer> cache = new LinkedHashMap<>();

        for (int r = 0; r<=10; r++){
            cache.put(r, r+1);
            if (cache.size() == 5){
                System.out.println("Cache original: " + cache);
                cache.remove(0);
               break;
            }

        }

        System.out.println(cache);

    }
}

package java_pleno.exercicio_estrutura_2;
import exercicios_primeira_parte.Pessoa;

import java.util.*;
public class listNivel1 {
    public static void main(String[] args) {
        double soma = 0;
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));
        for (int i : list1){
            soma += i;
        }
        System.out.println(soma/list1.size());


        List<String> nomes = new ArrayList<>();
        nomes.add("Leonardo");
        nomes.add("Psi");

        nomes.removeIf(n -> n.length() <4);

        List<String> vogais = Arrays.asList("a", "e", "i", "o", "u");
        String existe = "";
        String indexAtual = "";
        String nomeFinal = "";
        for (String r : nomes){
            nomeFinal = r;
            for (String j : vogais){
                if (r.contains(j)){
                    indexAtual = String.valueOf(r.charAt(r.indexOf(j)));
                    nomeFinal = nomeFinal.replace(indexAtual, "");
                }
            }
            System.out.println("Nome sem vogal: " +nomeFinal);
        }


        List<Aluno> alunos = new ArrayList<>();
        Aluno p1 = new Aluno("Leonardo", 20.0);
        Aluno p2 = new Aluno("Alex", 23.0);

        alunos.add(p1);
        alunos.add(p2);

        alunos.sort(Comparator.comparingDouble((Aluno p) -> p.nota)
                .thenComparing(p -> p.nome));

        System.out.println(alunos.getFirst().nome);



    }
}

class Aluno{
    String nome;
    Double nota;

    public Aluno(String nome, Double nota){
        this.nome = nome;
        this.nota = nota;
    }
}
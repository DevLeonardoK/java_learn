package java_pleno.stream.collect_collectors;
import java.util.*;
import java.util.stream.Collectors;


public class ex3 {
    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Mouse", "Periférico", 80.0),
                new Produto("Teclado", "Periférico", 150.0),
                new Produto("Monitor", "Display", 900.0),
                new Produto("TV", "Display", 2000.0),
                new Produto("SSD", "Armazenamento", 300.0),
                new Produto("HD", "Armazenamento", 250.0)
        );

       Map<String, String> listaProdutos = produtos.stream().collect(Collectors.groupingBy(f->f.categoria, Collectors.mapping(f->f.nome, Collectors.joining(", "))));
       System.out.println(listaProdutos);

    }
}

class Produto{
    String nome;
    String categoria;
    Double preco;

    public Produto(String nome, String categoria, Double preco){
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

}
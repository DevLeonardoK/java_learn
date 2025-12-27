package java_pleno;
import java.util.*;
import java.util.stream.Collectors;

public class exercicioStream {
    public static void main(String[] args) {
        //1
        List<String> listaNomes = Arrays.asList("Leonardo", "Ana", "Juliana", "Carlos", "Bianca", "João");
        List<String> nomesMaiores = new ArrayList<>(listaNomes.stream().map(String::toUpperCase).filter(nome -> nome.length() > 4).toList());
        Collections.sort(nomesMaiores);
        //System.out.println(nomesMaiores);

        //2
        Produto p1 = new Produto("caixa", 10);
        Produto p2 = new Produto("carrinho", 101);
        Produto p3 = new Produto("garrafa", 200);

        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);

        List<String> listaFiltrada = listaProdutos.stream().filter(produto -> produto.preco > 100).map(produto -> produto.nome).toList();
        //System.out.println(listaFiltrada);

        //3
        List<String> palavras = Arrays.asList(
                "azul", "amarelo", "verde", "vermelho", "rosa", "roxo", "cinza"
        );

        Map<Integer, List<String>> palavrasQuantidade = new HashMap<>(palavras.stream().collect(Collectors.groupingBy(String::length)));
        //System.out.println(palavrasQuantidade);

        //4
        List<Integer> numeros = Arrays.asList(8, 2, 10, 4, 15, 6);
        Integer numeroSoma = numeros.stream().reduce(0, (Integer a, Integer b) -> a + b);
        //System.out.println(numeroSoma);
        Integer numeroMax = numeros.stream().reduce(0, Integer::max);
        //System.out.println(numeroMax);


        //5
        List<Funcionario> funcionarios = Arrays.asList(
            new Funcionario("Leonardo", 2100.0, "TI"),
            new Funcionario("Rafaela", 3000.0, "Comércio"),
            new Funcionario("André", 8000.0, "Vendas"),
            new Funcionario("Guilherme", 15000.0, "TI")
        );

        //Double mediaSalarioTi = funcionarios.stream().filter(funcionario -> funcionario.departamento.equals("TI")).map(funcionario -> funcionario.salario).reduce(0.0, Double::sum);
        //System.out.println(mediaSalarioTi / (funcionarios.stream().filter(funcionario -> funcionario.departamento.equals("TI")).count()));

        Double media = funcionarios.stream().filter(f -> f.departamento.equals("TI")).collect(Collectors.averagingDouble(f -> f.salario));
        System.out.println(media);

    }}


class Produto{
    String nome;
    Integer preco;

    public Produto(String nome, Integer preco){
        this.nome = nome;
        this.preco = preco;

    }
}

class Funcionario {
    String nome;
    Double salario;
    String departamento;

    public Funcionario(String nome, Double salario, String departamento){
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

}
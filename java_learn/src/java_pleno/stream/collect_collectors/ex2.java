package java_pleno.stream.collect_collectors;
import java.util.*;
import java.util.stream.Collectors;

public class ex2 {
    public static void main(String[] args) {
        List<Funcionario2> funcionarios = Arrays.asList(
                new Funcionario2("Lara", "Financeiro", 4000),
                new Funcionario2("Miguel", "TI", 6500),
                new Funcionario2("Paulo", "Vendas", 3200),
                new Funcionario2("Sofia", "TI", 7000)
        );

        Map<String, Integer> funcionarioSalario = funcionarios.stream().collect(Collectors.toMap(f -> f.nome, f -> f.salario));
        System.out.println(funcionarioSalario);
    }
}

class Funcionario2{
    String nome;
    String departamento;
    Integer salario;

    public Funcionario2(String nome,  String departamento,Integer salario){
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;

    }

}
package java_pleno.stream.collect_collectors;
import java.util.*;
import java.util.stream.Collectors;

public class ex1 {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Ana", "TI", 5000),
                new Funcionario("Bruno", "RH", 3500),
                new Funcionario("Carlos", "TI", 6000),
                new Funcionario("Denise", "Marketing", 4000),
                new Funcionario("Eduardo", "TI", 5500),
                new Funcionario("Fernanda", "RH", 4200)
        );

        Map<String, Long> empresa = funcionarios.stream().collect(Collectors.groupingBy(f -> f.departamento, Collectors.counting()));
        System.out.println(empresa);

    }
}

class Funcionario{
    String nome;
    String departamento;
    Integer salario;

    public Funcionario(String nome,  String departamento,Integer salario){
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;

    }

}
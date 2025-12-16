package exercicios_segunda_parte.trabalhador;

public class Main {
    public static void main(String[] args) {

        Desenvolvedor dev1 = new Desenvolvedor();
        dev1.setNome("Leonardo");
        dev1.setMatricula(12345);
        dev1.setSalarioBase(500.50);
        dev1.trabalhar();
        dev1.exibirInfo();
        dev1.calcularSalario();

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Julia");
        gerente1.setMatricula(678910);
        gerente1.setSalarioBase(12023.10);
        gerente1.trabalhar();
        gerente1.exibirInfo();
        gerente1.calcularSalario();

    }
}

abstract class Funcionario implements InterfaceTrabalhador {

    private String nome;
    private Integer matricula;
    private Double salarioBase;

    public Funcionario() {
    }

    ; //Class vazia para utilizar set e gets

    public Funcionario(String nome, Integer matricula, Double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("SalarioBase: " + this.getSalarioBase());
    }
}

class Desenvolvedor extends Funcionario {

    public Desenvolvedor() {
    }

    ;

    public Desenvolvedor(String nome, Integer matricula, Double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor trabalhando");
    }

    @Override
    public void calcularSalario() {
        System.out.println("Salário: " + (this.getSalarioBase() + 1000));
    }
}

class Gerente extends Funcionario {

    public Gerente() {
    }

    ;

    public Gerente(String nome, Integer matricula, Double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente trabalhando");
    }

    @Override
    public void calcularSalario() {
        System.out.println("Salário: " + (this.getSalarioBase() + 2000));
    }
}
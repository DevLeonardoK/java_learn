public class Pessoa {
    public static void main(String[] args){
        PessoaHumana pessoa1 = new PessoaHumana("Leonardo", 19, 1.65, true);
        pessoa1.existir();

    }
}

class PessoaHumana{
    String nome;
    Integer idade;
    Double altura;
    Boolean empregado;

    public PessoaHumana(String nome, Integer idade, Double altura, Boolean empregado){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.empregado = empregado;
    }

    public void existir(){
        System.out.println("Eu sou: " + this.nome + ". Tenho " + this.idade + " anos. Tenho essa altura: " + this.altura + "m. Atualmente eu trabalho: " + this.empregado);
    }

}

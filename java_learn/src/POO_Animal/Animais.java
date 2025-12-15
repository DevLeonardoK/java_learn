package POO_Animal;

public class Animais {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("TIAO", true, 7);
        cachorro.emitirSom();

        Gato gato = new Gato("THIEF", true, 7);
        gato.emitirSom();


    }
}

class Animal implements Interface_Metodos{
    String nome;
    Boolean temPelo;
    Integer idade;

    public Animal(String nome, Boolean temPelo, Integer idade){
        this.nome = nome;
        this.temPelo = temPelo;
        this.idade = idade;
    }

    @Override
    public void emitirSom(){
        System.out.println("O animal possui um som");
    }

}

class Cachorro extends Animal {

    public Cachorro(String nome, Boolean temPelo, Integer idade){
        super(nome, temPelo, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("Esse é o som do animal:  au au");
    }


}


class Gato extends Animal {

    public Gato(String nome, Boolean temPelo, Integer idade){
        super(nome, temPelo, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("Esse é o som do animal: miau-miau");
    }

}
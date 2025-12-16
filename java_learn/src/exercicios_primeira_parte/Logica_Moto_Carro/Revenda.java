package exercicios_primeira_parte.Logica_Moto_Carro;

public class Revenda {
    public static void main(String[] args) {

        Moto moto1 = new Moto("XYZ", 2012, "Azul", 12000, "Hibrido");
        moto1.ligar();

        Carro carro1 = new Carro("BMW", 2020, "Prata", 30000, "Combustao");
        carro1.ligar();

        Carro carroBatido = null;

        try{
            carroBatido.ligar();
        } catch (NullPointerException exception){ //Vai capturar quando uma aplicação tentar passar null, onde precisa de objeto
            System.out.println("Carro estourado batido");
        }


    }
}

class Veiculo implements Moto_Carro_Interface{
    String modelo;
    Integer ano;
    String cor;
    Integer km;
    String tipo;

    public Veiculo(String modelo, Integer ano, String cor, Integer km, String tipo){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.km = km;
        this.tipo = tipo;
    }

    @Override
    public void ligar(){
        System.out.println("O veiculo emite um som");
    }
}

class Moto extends Veiculo{
    public Moto(String modelo, Integer ano, String cor, Integer km, String tipo){
        super(modelo, ano, cor, km, tipo);
    }
    @Override
    public void ligar(){
        System.out.println("RAMM, MOTO LIGADA !");
    }
}

class Carro extends Veiculo{
    public Carro(String modelo, Integer ano, String cor, Integer km, String tipo){
        super(modelo, ano, cor, km, tipo);
    }

    @Override
    public void ligar(){
        System.out.println("VRUMM, CARRO LIGADO!");
    }
}
package POO_Carro;

public class Carro {
    public static void main(String[] args){

        Veiculos carro1 = new Veiculos("BMW","X3", 2014);
        carro1.exibirInfo();

        Veiculos carro2 = new Veiculos("FIAT","PALIO", 2008);
        carro2.exibirInfo();

    }
}

class Veiculos implements Interface_Metodos{
    String marca;
    String modelo;
    Integer ano;

    public Veiculos(String marca, String modelo, Integer ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }



}

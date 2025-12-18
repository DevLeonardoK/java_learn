package exercicios_segunda_parte.formas_geometricas;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        retangulo.setCor("Azul");
        retangulo.largura = 4.0;
        retangulo.altura = 5.0;
        retangulo.exibir();
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        System.out.println("----------------------------------------------------");

        Circulo circulo = new Circulo();
        circulo.setCor("Vermelho");
        circulo.raio = 20;
        circulo.exibir();
        circulo.calcularArea();
        circulo.calcularPerimetro();


    }
}

abstract class FormaGeometrica implements InterfaceForma {
    private String cor;

    public FormaGeometrica() {
    }

    ;

    public FormaGeometrica(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}

class Retangulo extends FormaGeometrica {
    Double largura;
    Double altura;

    public Retangulo() {
    }

    ;

    public Retangulo(String cor, Double largura, Double altura) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public void calcularArea() {
        var resultadoArea = largura * altura;
        System.out.println("A área do retângulo: " + resultadoArea);
    }

    @Override
    public void calcularPerimetro() {
        var resultadoPerimetro = 2 * (largura + altura);
        System.out.println("O perimetro do retângulo: " + resultadoPerimetro);
    }

    @Override
    public void exibir() {
        System.out.println("A cor do retângulo é: " + getCor());
    }
}

class Circulo extends FormaGeometrica {
    Integer raio;

    public Circulo(){};

    public Circulo(String cor, Integer raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        var resultadoAreaCirculo = 3.14 * (Math.pow(raio, 2));
        System.out.println("Área do circulo: " + resultadoAreaCirculo);
    }

    @Override

    public void calcularPerimetro() {
        var resultadoPerimetroCirculo = 3.14 * 2 * raio;
        System.out.println("Perimetro do circulo: " + resultadoPerimetroCirculo);
    }

    @Override
    public void exibir() {
        System.out.println("A cor do quadrado é: " + getCor());
    }


}
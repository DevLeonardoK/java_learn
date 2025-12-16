package exercicios_primeira_parte;

public class Matematica {
    public static void main(String[] args){
        int numero1 = 15;
        int numero2 = 10;

        Double numero1Double = Double.valueOf(numero1);
        Double numero2Double = (double) numero2;

        System.out.println("A soma dos números: " + (numero1+numero2));
        System.out.println("A subtração dos números: " + (numero1-numero2));
        System.out.println("A divisão do n1 por n2: " + (numero1Double/numero2Double) );
        System.out.println("A multiplicação dos números: " + (numero1*numero2));
    }
}

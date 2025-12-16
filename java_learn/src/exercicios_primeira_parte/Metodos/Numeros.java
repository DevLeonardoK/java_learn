package exercicios_primeira_parte.Metodos;
import java.util.Scanner;
public class Numeros implements Matematica{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        Double numero1 = input.nextDouble();
        System.out.println("Digite o segundo número: ");
        Double numero2 = input.nextDouble();
        System.out.println("Digite o número, para validar se é IMPAR ou PAR: ");
        Integer numero3 = input.nextInt();

        Numeros numeros = new Numeros();

        numeros.somar(numero1, numero2);
        numeros.verificarPar(numero3);

    }

    @Override
    public void somar(Double numero1, Double numero2){
        System.out.print("Soma dos números: " + "("+numero1+")"+  "("+numero2+") é: "+(numero1 + numero2));

    }

    @Override
    public void verificarPar(Integer numero){
        if(numero%2 == 0){
            System.out.println("O número " + numero + " é PAR");
        }else{
            System.out.println("O número " + numero + " é IMPAR");
        }

    }
}

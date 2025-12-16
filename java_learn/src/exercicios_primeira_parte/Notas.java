package exercicios_primeira_parte;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual sua nota final: ");
        Double nota = input.nextDouble();

        if (nota >= 7){
            System.out.println("Aprovado !");
        }else if(nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado!");
        }

    }
}

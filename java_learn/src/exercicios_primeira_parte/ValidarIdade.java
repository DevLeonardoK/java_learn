package exercicios_primeira_parte;

import java.util.Scanner;

public class ValidarIdade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");

        Integer idade = input.nextInt();
        if(idade >= 18){
            System.out.println("Você é maior de idade !");
        }else{
            System.out.println("Você é menor de idade !");
        }
    }
}

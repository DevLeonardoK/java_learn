package Logica_Notas;

public class Notas {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Leonardo", 7.7, 4.5, 8.6);
        aluno1.calcularMedia();
    }
}

class Aluno implements  logicaInterface{
    String nome;
    double nota1;
    double nota2;
    double nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    @Override
    public void calcularMedia(){
        double media;
        media = (this.nota1+this.nota2+this.nota3)/3;
        if (media >=7){
            System.out.println(media + " Passou");
        }else if(media >5 && media <7){
            System.out.println(media + " Recuperação");
        }else{
            System.out.println(media + " Reprovado");
        }
    }
}
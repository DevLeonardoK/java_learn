package java_pleno.records;

public class main {
    public static void main(String[] args) {
        Sapato tenis = new Sapato("Nike", "Runner", 40);
        System.out.println(tenis.marca().equals("Nike"));
    }
}

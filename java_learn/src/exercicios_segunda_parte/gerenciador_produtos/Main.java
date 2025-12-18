package exercicios_segunda_parte.gerenciador_produtos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        produtoEletronico.setNome("Celular");
        produtoEletronico.setPreco(100);
        produtoEletronico.setEstoque(10);
        produtoEletronico.setDesconto(1);
        produtoEletronico.garantiaEmMeses = 12345;
        produtoEletronico.aplicarDesconto(produtoEletronico.getDesconto());
        produtoEletronico.exibir();

        System.out.println("-----------------------------------------------------");
        ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio();
        produtoAlimenticio.setNome("Celular");
        produtoAlimenticio.setPreco(50);
        produtoAlimenticio.setEstoque(10);
        produtoAlimenticio.setDesconto(1);
        produtoAlimenticio.dataValidade = "01/12/31";
        produtoAlimenticio.aplicarDesconto(produtoAlimenticio.getDesconto());
        produtoAlimenticio.exibir();


        ArrayList<ProdutoBase> lista = new ArrayList<>();
        lista.add(produtoEletronico);
        System.out.println(lista.get(0).getNome());

    }
}

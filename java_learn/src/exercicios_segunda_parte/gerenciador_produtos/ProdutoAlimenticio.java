package exercicios_segunda_parte.gerenciador_produtos;

public class ProdutoAlimenticio extends ProdutoBase{
    String dataValidade;

    public ProdutoAlimenticio(){};

    public ProdutoAlimenticio(String nome, double preco, int estoque, double desconto, String dataValidade){

        setNome(nome);
        setPreco(preco);
        setEstoque(estoque);
        setDesconto(desconto);

        this.dataValidade = dataValidade;
    }

    @Override
    public void exibir(){
        System.out.println("Produto alimenticio (nome): " + getNome());
        aplicarDesconto(getDesconto());
        System.out.println("Produto alimenticio (preco com desconto): " + (getPreco() - getDesconto()));
        System.out.println("Produto alimenticio (estoque): " + getEstoque());
        System.out.println("Produto alimenticio (dataValidae): " + dataValidade);



    }

}

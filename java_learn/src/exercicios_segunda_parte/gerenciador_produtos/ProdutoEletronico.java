package exercicios_segunda_parte.gerenciador_produtos;

public class ProdutoEletronico extends ProdutoBase{

    int garantiaEmMeses;

    public ProdutoEletronico(){};

    public ProdutoEletronico(String nome, double preco, int estoque, double desconto, int garantiaEmMeses){
        //super(nome, preco, estoque, desconto);
        setNome(nome);
        setPreco(preco);
        setEstoque(estoque);
        setDesconto(desconto);
        this.garantiaEmMeses = garantiaEmMeses;
    }

    @Override
    public void exibir(){
        System.out.println("Produto eletronico (nome): " + getNome());
        aplicarDesconto(getDesconto());
        System.out.println("Produto eletronico (preco com desconto): " + (getPreco() - getDesconto()));
        System.out.println("Produto eletronico (estoque): " + getEstoque());
        System.out.println("Produto eletronico (garantia): " + garantiaEmMeses);

    }

}

package exercicios_segunda_parte.gerenciador_produtos;

public abstract class ProdutoBase implements InterfaceProduto {
    private String nome;
    private double preco;
    private int estoque;
    private double desconto = 0.0;

    public ProdutoBase(){

    }

    //getters
    public String getNome(){
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getEstoque(){
        return estoque;
    }
    public double getDesconto(){
        return desconto;
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    //Metodos
    @Override
    public double obterPreco(){
        var resultado = getPreco() * (1- getDesconto()/100);
        return resultado;
    }

    @Override
    public void aplicarDesconto(double desconto){
        setDesconto(desconto);
    }

}

package exercicios_segunda_parte.gerenciador_produtos;

public interface InterfaceProduto {
    double obterPreco();
    void aplicarDesconto(double percentual);
    void exibir();
}

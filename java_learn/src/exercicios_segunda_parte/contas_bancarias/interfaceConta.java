package exercicios_segunda_parte.contas_bancarias;
//Intereface os metodos são implicitos abstratos
public interface interfaceConta {
    void depositar(Double valor);
    void sacar(Double valor);
    void obterSaldo();
}

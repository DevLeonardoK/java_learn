package exercicios_segunda_parte.contas_bancarias;

import exercicios_segunda_parte.trabalhador.InterfaceTrabalhador;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(100.0);
        contaPoupanca.sacar(10.0);
        contaPoupanca.depositar(1.1);
        System.out.println(contaPoupanca.getSaldo());

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(100.0);
        contaCorrente.sacar(10.0);
        contaCorrente.depositar(1.1);
        System.out.println(contaCorrente.getSaldo());

    }
}

abstract class ContaBancaria implements interfaceConta{
    private String titular;
    private Integer numeroConta;
    private Double saldo;

    public ContaBancaria(){};

    public ContaBancaria(String titular, Integer numeroConta, Double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public Integer getNumeroConta(){
        return numeroConta;
    }

    public Double getSaldo(){
        return saldo;
    };

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setNumeroConta(Integer numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    @Override
    public void depositar(Double valor){
        System.out.println("Seu saldo aumentou para: " + (this.saldo += valor));
    }

}

class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(){};

    public ContaPoupanca(String titular, Integer numeroConta, Double saldo){
        super(titular, numeroConta, saldo);
    }


    @Override
    public void sacar(Double valor){
        setSaldo(getSaldo() - ((getSaldo()+valor)*0.01));
        System.out.println("Saldo: " + getSaldo());
    }

    @Override
    public void obterSaldo() {
        setSaldo(getSaldo() + (getSaldo()*0.005));
        System.out.println("Saldo: " + getSaldo() );

    }
}

class ContaCorrente extends ContaBancaria{

    public ContaCorrente(){};

    public ContaCorrente(String titular, Integer numeroConta, Double saldo){
        super(titular, numeroConta, saldo);
    }

    @Override
    public void sacar(Double valor){
        setSaldo(getSaldo()-valor - 5);
        System.out.println("Saldo: " + getSaldo());
    }

    @Override
    public void obterSaldo() {
        System.out.println("Saldo: " + getSaldo() );
    }

}
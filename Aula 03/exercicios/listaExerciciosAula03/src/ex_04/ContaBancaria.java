package lista2.ex_04;

public class ContaBancaria {
    public String numeroConta;
    public double saldo;

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo -= valor;
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
}

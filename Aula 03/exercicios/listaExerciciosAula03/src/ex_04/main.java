package lista2.ex_04;

import lista2.ex_03.Pessoa;

public class main {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("1234", 1000);
        conta.depositar(1000);
        conta.sacar(500);
        System.out.println(conta.saldo);
    }
}
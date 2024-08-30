package lista2.ex_09;

import lista2.ex_07.Aluno;

public class main {
    public static void main(String[] args) {
        Produto produto = new Produto("Computador", 1000, 10);
        produto.aumentarEstoque(5);
        produto.diminuirEstoque(3);
        System.out.println("O produto "+produto.nome+" tem "+produto.quantidade+" unidades em estoque.");
    }
}
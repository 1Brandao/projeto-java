package lista2.ex_21;

import lista2.ex_16.Loja;

public class main {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Industrial", 10, "Branca");
        cozinha.prepararComida();
        cozinha.limparCozinha();
    }
}
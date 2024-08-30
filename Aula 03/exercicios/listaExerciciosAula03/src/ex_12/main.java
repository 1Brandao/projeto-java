package lista2.ex_12;

import lista2.ex_11.Cidade;

public class main {
    public static void main(String[] args) {
        Filme filme = new Filme("O Poderoso Chefão", "Francis Ford Coppola", 175.0);
        filme.inicarFilme();
        filme.pausarFilme(30.0);
        filme.pausarFilme(47.5);
    }
}
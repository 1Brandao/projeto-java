package lista2.ex_19;

import lista2.ex_17.Animal;

public class main {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("O Senhor dos Anéis", "J. R. R. Tolkien", 10.0);
        livro.abrirLivro();
        livro.fecharLivro();
    }
}
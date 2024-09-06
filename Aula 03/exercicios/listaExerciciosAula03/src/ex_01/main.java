package lista2.ex_01;

public class main {
    public static void main(String[] args){
        Livro livro = new Livro("Jogos Vorazes", "Suzanne Collins", 240);

        livro.abrirLivro(livro.aberto);
        livro.ler();
        System.out.println(livro.toString());
    }
}
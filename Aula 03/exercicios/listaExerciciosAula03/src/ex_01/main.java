package lista2.ex_01;

public class main {
    public static void main(String[] args){
        Livro livro = new Livro(240, "Senhor dos aneis", "JK Roling");

        livro.abrirLivro(livro.titulo);
        livro.ler(livro.nrPaginas);
    }
}
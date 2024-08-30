package lista2.ex_01;

// Crie uma classe chamada Livro com atributos como titulo, autor,
// e numeroDePaginas. Adicione métodos para abrir o livro e ler uma página.

public class Livro {
    private String titulo;
    private String autor;
    private Integer nrPaginas;
    private Boolean aberto = false;


    public Livro(Integer nrPaginas, String titulo, String autor) {
        this.nrPaginas = nrPaginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    public void abrirLivro(Boolean aberto){
        if (aberto == ) {
            this.aberto;
        } else {
            System.out.println("O livro " + titulo + " foi aberto");
        }
    }

    public void ler(int pagina){
        System.out.println("Voce esta na pagina " + pagina);
    }
}

package ex_01;

// Crie uma classe chamada Livro com atributos como titulo, autor,
// e numeroDePaginas. Adicione métodos para abrir o livro e ler uma página.

public class Livro {
    public String titulo;
    public String autor;
    public Integer nrPaginas;
    public Integer paginaAtual;
    public Boolean aberto = false;


    public Livro(String titulo, String autor, Integer nrPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.nrPaginas = nrPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
    }

    public void abrirLivro(Boolean aberto){
        if (!this.aberto) {
            this.aberto = true;
            System.out.println("O livro foi aberto");
        } else {
            System.out.println("O livro " + titulo + " já foi aberto");
        }
    }

    public void ler(Integer paginaAtual, Integer nrPaginas){
        if (this.aberto) {
            if (this.paginaAtual < this.nrPaginas) {
                System.out.println("Você está na página " + this.paginaAtual);
                this.paginaAtual++;
            } else {
                System.out.println("Livro concluído");
            }
        }else {
            System.out.println("Você precisa abrir o livro antes de ler");
        }
    }
}

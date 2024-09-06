package lista2.ex_01;

// Crie uma classe chamada Livro com atributos como titulo, autor,
// e numeroDePaginas. Adicione métodos para abrir o livro e ler uma página.

public class Livro {
    private String titulo;
    private String autor;
    private Integer nrPaginas;
    private Integer paginaAtual;
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
            System.out.println("O livro "  + this.titulo + " foi aberto");
        } else {
            System.out.println("O livro " + titulo + " já foi aberto");
        }
    }

    public void ler(){
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("Titulo invalido!");
        }else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isEmpty()) {
            System.out.println("Nome invalido!");
        }else {
            this.autor = autor;
        }
    }

    public Integer getNrPaginas() {
        return nrPaginas;
    }

    public void setNrPaginas(Integer nrPaginas) {
        if (nrPaginas == null || nrPaginas < 0) {
            System.out.println("Numero de paginas invalido!");
        }else {
            this.nrPaginas = nrPaginas;
        }

    }

    @Override
    public String toString() {
        return """
                Titulo: %s
                Autor: %s
                Paginas: %s
                """.formatted(titulo, autor, nrPaginas);
    }
}


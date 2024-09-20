package Exercicio02;

import java.util.ArrayList;

public class Livro {
    private String autor;
    private String titulo;
    private List<Pagina> paginas;

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = new ArrayList<>();
    }

    public void adicionarPagina(String conteudo) {
        int numero = paginas.size() + 1;
        Pagina pagina = new Pagina(conteudo, numero);

    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        }else {
            System.out.println("Titulo inválido!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Título: ").append(titulo).append("\n");
        sb.append("Autor: ").append(autor).append("\n");
        sb.append("Paginas: ").append("\n");

        for (Pagina pagina: paginas) {
            sb.append(pagina).append("\n");
        }

        return sb.toString();
    }
}

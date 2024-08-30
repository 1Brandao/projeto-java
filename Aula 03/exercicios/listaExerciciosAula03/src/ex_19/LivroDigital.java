package lista2.ex_19;

public class LivroDigital {
    public String titulo;
    public String autor;
    public double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo){
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void abrirLivro(){
        System.out.println("Livro aberto.");
    }

    public void fecharLivro(){
        System.out.println("Livro fechado.");
    }
}

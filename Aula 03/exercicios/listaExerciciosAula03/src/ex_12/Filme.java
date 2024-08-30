package lista2.ex_12;

public class Filme {
    public String titulo;
    public String diretor;
    public double duracao;

    public Filme(String titulo, String diretor, double duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void inicarFilme(){
        System.out.println("O filme foi iniciado");
    }

    public void pausarFilme(double minuto){
        System.out.println("O filme "+titulo+" foi pausado no minuto: " + minuto);
    }
}

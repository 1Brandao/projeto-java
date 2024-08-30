package lista2.ex_15;

public class Jogo {
    public String jogo;
    public String genero;
    public double preco;

    public Jogo(String jogo, String genero, double preco){
        this.jogo = jogo;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciarJogo(){
        System.out.println("Jogo iniciado.");
    }

    public void pausarJogo(){
        System.out.println("Jogo pausado.");
    }
}

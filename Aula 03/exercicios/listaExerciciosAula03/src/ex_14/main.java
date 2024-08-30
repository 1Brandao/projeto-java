package ex_14;


public class main {
    public static void main(String[] args) {
        Time time = new Time("Santos", "Fabio carille", 25);
        time.contratarJogador();
        time.demitirJogador();
        time.demitirJogador();
        System.out.println("O time "+time.nome+" tem "+time.numeroDeJogadores+" jogadores.");
    }
}
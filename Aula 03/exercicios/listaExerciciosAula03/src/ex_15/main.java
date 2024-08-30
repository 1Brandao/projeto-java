package lista2.ex_15;

import lista2.ex_14.Time;

public class main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("The Witcher 3", "RPG", 100.0);
        jogo.iniciarJogo();
        jogo.pausarJogo();
    }
}
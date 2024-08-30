package lista2.ex_14;

public class Time {
    public String nome;
    public String tecnico;
    public int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores){
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void contratarJogador(){
        System.out.println("Jogador contratado.");
        numeroDeJogadores += 1;
    }

    public void demitirJogador(){
        System.out.println("Jogador demitido.");
        numeroDeJogadores -= 1;
    }
}

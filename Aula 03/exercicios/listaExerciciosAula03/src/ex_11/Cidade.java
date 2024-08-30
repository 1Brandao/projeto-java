package lista2.ex_11;

public class Cidade {
    public String nome;
    public int populacao;
    public String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int populacao){
        this.populacao += populacao;
    }

    public void diminuirPopulacao(int populacao){
        this.populacao -= populacao;
    }
}

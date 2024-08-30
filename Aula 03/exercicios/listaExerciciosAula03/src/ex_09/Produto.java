package lista2.ex_09;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void aumentarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void diminuirEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

}

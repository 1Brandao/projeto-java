package lista2.ex_21;

public class Cozinha {
    public String tipo;
    public int quantPessoas;
    public String cor;

    public Cozinha(String tipo, int quantPessoas, String cor) {
        this.tipo = tipo;
        this.quantPessoas = quantPessoas;
        this.cor = cor;
    }

    public void prepararComida() {
        System.out.println("Preparando comida na cozinha");
    }

    public void limparCozinha() {
        System.out.println("Limpando a cozinha");
    }
}

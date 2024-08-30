package lista2.ex_16;

public class Loja {
    public String nome;
    public String endereco;
    public String telefone;

    public Loja(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void abrirLoja(){
        System.out.println("Loja aberta.");
    }

    public void fecharLoja(){
        System.out.println("Loja fechada.");
    }
}

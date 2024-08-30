package lista2.ex_03;

public class Pessoa {
    public String nome;
    public int idade;
    public int altura;

    public Pessoa(String nome, int idade, int altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresetarPessoa(){
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nAltura: " + this.altura);
    }
}

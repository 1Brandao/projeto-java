package lista2.ex_05;

public class Cachorro {
    public String nome;
    public String raca;
    public int idade;

    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir(){
        System.out.println("Au au");
    }
    public void correr(){
        System.out.println("Correndo");
    }
}

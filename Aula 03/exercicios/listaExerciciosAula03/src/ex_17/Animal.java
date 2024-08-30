package lista2.ex_17;

public class Animal {
    public String especie;
    public int idade;
    public double peso;

    public Animal(String especie, int idade, double peso){
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void alimentar(){
        System.out.println("Animal alimentado.");
    }

    public void dormir(){
        System.out.println("Animal dormindo.");
    }
}

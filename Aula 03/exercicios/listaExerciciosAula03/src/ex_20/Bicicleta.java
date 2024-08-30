package lista2.ex_20;

public class Bicicleta {
    public String marca;
    public String modelo;
    public int tamanhoRoda;

    public Bicicleta(String marca, String modelo, int tamanhoRoda){
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar(){
        System.out.println("Bicicleta pedalando.");
    }

    public void frear(){
        System.out.println("Bicicleta freando.");
    }
}

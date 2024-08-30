package lista2.ex_02;

public class Celular {
    public String marca;
    public String modelo;
    public int capacidadeBateria;

    public Celular(String marca, String modelo, int capacidadeBateria){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public void ligar(){
        System.out.println("O celular " + this.marca + " " + this.modelo + " foi ligado");
    }

    public void desligar(){
        System.out.println("O celular " + this.marca + " " + this.modelo + " foi desligado");
    }
}

package ex_02;

// Defina uma classe Celular com atributos como marca, modelo, e 
// capacidadeBateria. Adicione métodos para ligar e desligar o celular.

public class Celular {
    private String marca;
    private String modelo;
    private Integer capacidadeBateria;
    private Boolean status;

    public Celular(String marca, String modelo, Integer capacidadeBateria, Boolean status){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.status = status;
    }

    public void ligar(){
        if (this.status == false) {
            this.status = true;
            System.out.println("O celular " + this.marca + " " + this.modelo + " foi ligado");
        } else {
            System.out.println("O celular " + this.marca + " " + this.modelo + " já ligado");
        }
    }

    public void desligar(){
        System.out.println("O celular " + this.marca + " " + this.modelo + " foi desligado");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(Integer capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return """
                Celular:
                Marca: %s
                modelo: %s
                capacidadeBateria: %s
                status: %s
                """.formatted(marca, modelo, capacidadeBateria, status);
    }
}

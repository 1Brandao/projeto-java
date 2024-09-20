import java.sql.SQLOutput;

public class Motor {
    private Integer cilindradas;
    private String modelo;
    private TipoCombustivel tipoCombustivel;
    private Integer rpm;
    private Integer potencia;
    private Boolean ligado;

    public Motor(Integer cilindradas, String modelo, TipoCombustivel tipoCombustivel, Integer rpm, Integer potencia, Boolean ligado) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.potencia = potencia;
        this.ligado = ligado;
    }

    protected void ligar() {
        if (!ligado) {
            this.ligado = true;
            System.out.println("Ligando motor...");
        }else {
            System.out.println("Motor já está ligado");
        }
    }

    protected void desligar() {
        if (ligado) {
            System.out.println("Desligando motor...");;
            this.ligado = false;
        }else {
            System.out.println("Já está desligado");
        }
    }

    protected void aumentarPotencia(Integer incremento) {
        if (ligado) {
            this.potencia += incremento;
            System.out.println("Potencia aumentada em " + incremento + "Potencia atual: " + potencia);
        }else {
            System.out.println("O carro está desligado");
        }
    }

    protected void reduzirPotencia(Integer decremento) {
        if (ligado) {
            this.potencia -= decremento;
            System.out.println("Potencia diminuida em " + decremento + "Potencia atual: " + potencia);
        }else {               
            System.out.println("O carro está desligado");
        }
    }

    protected void acelerar(Integer incrementoRpm) {
        if (ligado) {
            this.rpm += incrementoRpm;
            System.out.println("Velocidade do carro aumentando RPM atual: " + rpm);
        }else {
             System.out.println("O carro está desligado");
        }
    }

    protected void reduzirRpm(Integer decrementoRpm) {

    }

}

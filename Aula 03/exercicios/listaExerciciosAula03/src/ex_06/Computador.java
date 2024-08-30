package lista2.ex_06;

public class Computador {
    public String processador;
    public int memoriaRam;
    public int armazenamento;

    public Computador(String processador, int memoriaRam, int armazenamento){
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    public void ligar(){
        System.out.println("Ligando");
    }
    public void desligar(){
        System.out.println("Desligando");
    }
}

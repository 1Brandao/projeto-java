package lista2.ex_10;

public class Veiculo {
    public String tipo;
    public String placa;
    public String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer(){
        System.out.println("Veículo abastecido.");
    }

    public void lavarVeiculo(){
        System.out.println("Veículo lavado.");
    }
}

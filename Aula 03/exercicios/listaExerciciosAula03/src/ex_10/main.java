package lista2.ex_10;

import lista2.ex_09.Produto;

public class main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "ABC-1234", "Preto");
        veiculo.abastecer();
        veiculo.lavarVeiculo();
    }
}
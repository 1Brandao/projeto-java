package lista2.ex_16;

import lista2.ex_15.Jogo;

public class main {
    public static void main(String[] args) {
        Loja loja = new Loja("Loja do Giovani", "Rua do Giovani", "44998428989");
        loja.abrirLoja();
        loja.fecharLoja();
    }
}
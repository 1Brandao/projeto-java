package lista2.ex_02;

import lista2.ex_01.Livro;

public class main {
    public static void main(String[] args){
        Celular celular = new Celular("Samsung", "Galaxy S20", 5000);

        celular.ligar();
        celular.desligar();
    }
}
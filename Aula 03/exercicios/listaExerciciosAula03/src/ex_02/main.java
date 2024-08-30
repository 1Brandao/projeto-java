package ex_02;

public class main {
    public static void main(String[] args){
        Celular celular = new Celular("Apple", "Iphone 13", 3240, false);

        celular.ligar();
        celular.desligar();
        System.out.println(celular.toString());
    }
}
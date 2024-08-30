package lista2.ex_22;

import lista2.ex_21.Cozinha;

public class main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa", "123456789", 10);
        empresa.contratarFuncionario();
        empresa.demitirFuncionario();
        empresa.contratarFuncionario();
        empresa.mostrarFuncionarios();
    }
}
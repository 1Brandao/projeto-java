package lista2.ex_22;

public class Empresa {
    public String nome;
    public String cnpj;
    public int numeroFuncionarios;

    public Empresa(String nome, String cnpj, int numeroFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratarFuncionario() {
        System.out.println("Contratando funcionário");
        this.numeroFuncionarios++;
    }

    public void demitirFuncionario() {
        System.out.println("Demitindo funcionário");
        this.numeroFuncionarios--;
    }

    public void mostrarFuncionarios(){
        System.out.println("Na empresa tem " + this.numeroFuncionarios + " funcionários");
    }
}

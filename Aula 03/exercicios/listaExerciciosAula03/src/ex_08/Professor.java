package lista2.ex_08;

public class Professor {
    public String nome;
    public double salario;
    public String disciplina;

    public Professor(String nome, double salario, String disciplina) {
        this.nome = nome;
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public void darAula(){
        System.out.println("O professor "+this.nome+" está dando aula de "+this.disciplina);
    }

    public void corrigirProvas(){
        System.out.println("O professor "+this.nome+" está corrigindo provas de "+this.disciplina);
    }
}

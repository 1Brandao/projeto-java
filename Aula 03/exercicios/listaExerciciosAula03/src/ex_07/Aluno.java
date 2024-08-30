package lista2.ex_07;

public class Aluno {
    public String nome;
    public String matricula;
    public String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public int calcularMedia(int n1, int n2){
        return (n1 + n2) / 2;
    }
}

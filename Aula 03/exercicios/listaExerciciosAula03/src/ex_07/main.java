package ex_07;


public class main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "123", "Computação");
        int media = aluno.calcularMedia(10, 4);
        System.out.println("O Aluno "+aluno.nome+" teve uma média de: " + media);
    }
}
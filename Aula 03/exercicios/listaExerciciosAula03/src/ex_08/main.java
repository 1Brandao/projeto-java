package lista2.ex_08;

import lista2.ex_07.Aluno;

public class main {
    public static void main(String[] args) {
        Professor professor = new Professor("Jhoni", 10000, "POO");
        professor.darAula();
        professor.corrigirProvas();
    }
}
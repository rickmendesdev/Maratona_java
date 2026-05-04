package com.henrique.maratonajava.javacore.Fassociação.Exercicio.test;
import com.henrique.maratonajava.javacore.Fassociação.Exercicio.domain.Aluno;
import com.henrique.maratonajava.javacore.Fassociação.Exercicio.domain.Seminario;
import com.henrique.maratonajava.javacore.Fassociação.Exercicio.domain.Professor;
import com.henrique.maratonajava.javacore.Fassociação.Exercicio.domain.Local;
public class Gerenciamento {
    public static void main(String[] args) {
        Local local = new Local("Rua 45");
        Professor professor = new Professor("Henrique", "Java", null);
        Aluno aluno1 = new Aluno("Maria", 20, null);
        Aluno aluno2 = new Aluno("João", 22, null);
        Aluno[] alunos = {aluno1, aluno2};
        Seminario seminario = new Seminario("Maratona Java", professor, alunos, local);
        professor.setSeminarios(new Seminario[]{seminario});
        aluno1.setSeminarios(seminario);
        aluno2.setSeminarios(seminario);
        seminario.imprime();
    }
    
}

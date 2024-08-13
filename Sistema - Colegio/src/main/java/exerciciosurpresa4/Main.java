package exerciciosurpresa4;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        // Criar instâncias de objetos
        Curso curso = new Curso("Ciências da Computação");
        Turma turma1 = new Turma("T1", new Professor("Marco", LocalDate.of(1980, 1, 1), "Computação"), new Disciplina("POO"));
        Turma turma2 = new Turma("T2", new Professor("Saulo", LocalDate.of(1985, 1, 1), "DCC"), new Disciplina("ED"));
        Aluno aluno1 = new Aluno("Daniel", LocalDate.of(2000, 9, 20), 101);
        Aluno aluno2 = new Aluno("Renan", LocalDate.of(2000, 9, 20), 102);

        // Adicionar objetos aos cursos e turmas
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);
        turma1.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);

        // Responder às perguntas
        System.out.println("1) Nome do professor da Turma T1: " + turma1.getProfessor().getNome());
        System.out.println("2) Nomes dos alunos da Turma T2: " + turma2.obterNomesAlunos());
        System.out.println("3) Nomes dos professores que lecionam em alguma turma do curso: " + curso.obterNomesProfessores());
        System.out.println("4) Nomes dos alunos que estão em alguma turma do curso: " + curso.obterNomesAlunos());
        System.out.println("5) Nomes dos alunos registrados no curso: " + curso.obterNomesAlunos());
        System.out.println("6) Disciplinas em alguma turma do curso: " + curso.obterDisciplinasDeAlgumaTurma());
        
        // Simulando verificação se um aluno está em uma turma (pergunta 7)
        System.out.println("7) O aluno1 está na Turma T1? " + turma1.alunoNaTurma(aluno1));

        // Simulando verificação se um aluno está em um curso (pergunta 8)
        System.out.println("8) O aluno2 está no curso? " + curso.verificarAlunoEmCurso(aluno2));

        // Simulando verificação se uma turma está em um curso (pergunta 9)
        System.out.println("9) A Turma T1 está no curso? " + curso.verificarTurmaNoCurso(turma1));

        // Simulando exclusão de um aluno de uma turma (pergunta 10)
        System.out.println("10) Excluindo Aluno 1 da Turma T1...");
        turma1.removerAluno(aluno1);
        System.out.println("Nomes dos alunos da Turma T1 após a exclusão: " + turma1.obterNomesAlunos());

        // Simulando exclusão de uma turma do curso (pergunta 11)
        System.out.println("11) Excluindo a Turma T2 do curso...");
        curso.removerTurma(turma2);
        System.out.println("Turmas no curso após a exclusão: " + curso.obterNomesTurmas());

        // Simulando exclusão de um aluno do curso (pergunta 12)
        System.out.println("12) Excluindo Aluno 2 do curso...");
        curso.removerAluno(aluno2);
        System.out.println("Nomes dos alunos no curso após a exclusão: " + curso.obterNomesAlunos());
    }
}

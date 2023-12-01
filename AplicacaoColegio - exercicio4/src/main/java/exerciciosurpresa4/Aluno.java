package exerciciosurpresa4;

import java.time.LocalDate;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, LocalDate dataNascimento, int matricula) {
        super(nome, dataNascimento);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean alunoNaTurma(Turma turma) {
        return turma.getAlunos().contains(this);
    }

    public boolean alunoNoCurso(Curso curso) {
        for (Turma turma : curso.getTurmas()) {
            if (turma.getAlunos().contains(this)) {
                return true;
            }
        }
        return false;
    }

    public void removerAlunoDeTurma(Turma turma) {
        turma.removerAluno(this);
    }
}
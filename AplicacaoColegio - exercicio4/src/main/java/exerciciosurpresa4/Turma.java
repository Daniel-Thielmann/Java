package exerciciosurpresa4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Turma {

    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;
    private String codigo;

    public Turma(String codigo, Professor professor, Disciplina disciplina) {
        this.codigo = codigo;
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<String> obterNomesAlunos() {
        return alunos.stream()
                .map(Aluno::getNome)
                .collect(Collectors.toList());
    }

    public boolean alunoNaTurma(Aluno aluno) {
        return alunos.contains(aluno);
    }

    public boolean alunoNoCurso(Curso curso, Aluno aluno) {
        for (Turma turma : curso.getTurmas()) {
            if (turma.getAlunos().contains(aluno)) {
                return true;
            }
        }
        return false;
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
}

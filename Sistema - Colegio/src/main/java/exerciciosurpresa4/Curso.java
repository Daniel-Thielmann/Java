package exerciciosurpresa4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Curso {

    private String nome;
    private List<Aluno> alunos;
    private List<Turma> turmas;

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.turmas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public List<String> obterNomesAlunos() {
        return alunos.stream()
                .map(Aluno::getNome)
                .collect(Collectors.toList());
    }

    public List<String> obterNomesTurmas() {
        return turmas.stream()
                .map(Turma::getCodigo)
                .collect(Collectors.toList());
    }

    public List<Disciplina> obterDisciplinasDeAlgumaTurma() {
        return turmas.stream()
                .map(Turma::getDisciplina)
                .collect(Collectors.toList());
    }

    public List<String> obterNomesProfessores() {
        return turmas.stream()
                .map(Turma::getProfessor)
                .map(Professor::getNome)
                .distinct()
                .collect(Collectors.toList());
    }

    public boolean verificarAlunoEmCurso(Aluno aluno) {
        return alunos.contains(aluno);
    }

    public boolean verificarTurmaNoCurso(Turma turma) {
        return turmas.contains(turma);
    }

    public void removerTurma(Turma turma) {
        turmas.remove(turma);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
}

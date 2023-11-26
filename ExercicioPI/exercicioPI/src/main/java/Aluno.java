package main.java;

public class Aluno extends Pessoa {

    private Curso curso;
    private Coordenacao coordenacao;

    public Aluno(String nome, Escolaridade escolaridade, Cidade cidade, Curso curso) {
        super(nome, escolaridade, cidade);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNaturalidadeAluno() // D)
    {
        return getNaturalidade().getPais();
    }

    public String getEstadoAluno() //F)
    {
        return getEstado().getEstado();
    }

    public Coordenacao getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Coordenacao coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getCoordenadorCursoAluno() //H)
    {
        return curso.getCoordenacao().getNome();
    }
}

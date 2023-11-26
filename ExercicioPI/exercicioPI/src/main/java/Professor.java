package main.java;

public class Professor extends Pessoa {

    private Curso curso;
    private String disciplina;
    private Direcao direcao;
    private Coordenacao coordenacao;

    public Professor(String nome, Escolaridade escolaridade, Cidade cidade, Curso curso, String disciplina) {
        super(nome, escolaridade, cidade);
        this.curso = curso;
        this.disciplina = disciplina;
    }

    public Coordenacao getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Coordenacao coordenacao) {
        this.coordenacao = coordenacao;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public String getEscolaridadeProfessor() // A)
    {
        return getEscolaridade().getNivel();
    }

    public String getCidadeNascimentoProfessor() // E)
    {
        return getCidade().getCidade();
    }

    public String getTipoEnsinoProfessor() // G)
    {
        return curso.getTipoEnsino().getNivelEnsino();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDiretorProfessor(){ // I)
        return getDirecao().getNomeDiretor();
    }

    public String getCoordenadorProfessor(){ //J)
        return getCoordenacao().getNome();
    }

}

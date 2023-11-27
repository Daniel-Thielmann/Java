package exercicioPI;

public class Curso {

    private Professor professor;
    private TipoEnsino tipoEnsino;
    private Escola escola;
    private Coordenacao coordenacao;

    public Curso(Professor professor, TipoEnsino tipoEnsino, Escola escola, Coordenacao coordenacao) {
        this.professor = professor;
        this.tipoEnsino = tipoEnsino;
        this.escola = escola;
        this.coordenacao = coordenacao;
    }

    public Curso(String string) {
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public Coordenacao getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Coordenacao coordenacao) {
        this.coordenacao = coordenacao;
    }
}

package exercicioPI;

public class Escola {

    private Professor professor;
    private Cidade cidade;
    private Direcao direcao;

    public Escola(Professor professor, Cidade cidade) {
        this.professor = professor;
        this.cidade = cidade;
    }

    public Professor getDiretor() {
        return professor;
    }

    public void setDiretor(Professor professor) {
        this.professor = professor;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

     public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }
}

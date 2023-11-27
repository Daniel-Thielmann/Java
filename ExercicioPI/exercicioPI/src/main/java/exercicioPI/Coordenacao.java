package exercicioPI;

public class Coordenacao {

    private Pessoa pessoa;
    private Curso curso;
    private String areaCoordenacao;
    private String nome;

    public Coordenacao(String nome, Escolaridade escolaridade, Cidade cidade, Curso curso, String areaCoordenacao) {
        this.pessoa = new Pessoa(nome, escolaridade, cidade);
        this.curso = curso;
        this.areaCoordenacao = areaCoordenacao;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscolaridadeCoordenador() // B)
    {
        return pessoa.getEscolaridade().getNivel();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getAreaCoordenacao() {
        return areaCoordenacao;
    }

    public void setAreaCoordenacao(String areaCoordenacao) {
        this.areaCoordenacao = areaCoordenacao;
    }
}

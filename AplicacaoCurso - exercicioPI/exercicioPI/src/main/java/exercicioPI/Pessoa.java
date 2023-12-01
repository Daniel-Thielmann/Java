package exercicioPI;

public class Pessoa {
    
    private String nome;
    private Escolaridade escolaridade;
    private Cidade cidade;
    private Naturalidade naturalidade;
    private Estado estado;
    private Coordenacao coordenador;

    public Pessoa(String nome, Escolaridade escolaridade, Cidade cidade)
    {
        this.escolaridade = escolaridade;
        this.cidade = cidade;
        this.nome = nome;
    }

    public Coordenacao getCoordenacao()
    {
        return coordenador;
    }

    public void setCoordenacao(Coordenacao coordenador)
    {
        this.coordenador = coordenador;
    }
    
    public Escolaridade getEscolaridade()
    {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Naturalidade getNaturalidade()
    {
        return naturalidade;
    }

      public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setNaturalidade(Naturalidade naturalidade)
    {
        this.naturalidade = naturalidade;
    }

    public Cidade getCidade()
    {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

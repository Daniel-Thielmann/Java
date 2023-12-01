package exercicio9_3_4;

public class Funcionario {

    private Filial coordenacao;
    private Departamento alocacao;
    private Escolaridade escolaridade;
    private String nome;

    public Funcionario(Filial coordenacao, Departamento alocacao, Escolaridade escolaridade, String nome) {
        this.coordenacao = coordenacao;
        this.alocacao = alocacao;
        this.escolaridade = escolaridade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getPaisAlocacao() // Resposta número 2
    {
        if (this.alocacao != null && this.alocacao.getEmpresa() != null && this.alocacao.getEmpresa().getGrupo() != null
                && this.alocacao.getEmpresa().getGrupo().getSede() != null) {
            return this.alocacao.getEmpresa().getGrupo().getSede().getNome();
        } else {
            return "País de alocação não disponível para este funcionário.";
        }
    }

    public String getEstadoFilialFuncionario() // Resposta número 3
    {
        if (this.coordenacao != null && this.coordenacao.getCidade() != null
                && this.coordenacao.getCidade().getEstado() != null) {
            return this.coordenacao.getCidade().getEstado().getNome();
        } else {
            return "Estado da filial não disponível para este funcionário.";
        }
    }
}

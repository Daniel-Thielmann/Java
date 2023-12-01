package org.example;

public class Funcionario {

    private Filial coordenacao;
    private Departamento alocacao;
    private Escolaridade escolaridade;

    public Funcionario(Filial coordenacao, Departamento alocacao, Escolaridade escolaridade) {
        this.coordenacao = coordenacao;
        this.alocacao = alocacao;
        this.escolaridade = escolaridade;
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
    package org.example;

    public class Pais {

        private String nome;

        public Pais(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getPaisAlocacaoFuncionario() {
            return
        }
    }
}

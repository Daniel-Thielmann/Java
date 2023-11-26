package main.java;

public class Direcao {

    private String nomeDiretor;
    private String cargo;

    public Direcao(String nomeDiretor, String cargo) {
        this.nomeDiretor = nomeDiretor;
        this.cargo = cargo;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

package exercicioPI;

public class Cidade {

    private Estado estado;
    private String cidade;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Cidade(Estado estado) {
        this.estado = estado;
    }

    public Cidade(String string) {
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}

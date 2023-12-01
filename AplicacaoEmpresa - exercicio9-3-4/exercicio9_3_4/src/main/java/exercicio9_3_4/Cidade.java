package exercicio9_3_4;

public class Cidade {

    private Estado estado;
    private String nome;

    public Cidade(Estado estado, String nome) {
        this.estado = estado;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}

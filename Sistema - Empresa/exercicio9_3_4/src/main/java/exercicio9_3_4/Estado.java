package exercicio9_3_4;

public class Estado {

    private Pais pais;
    private String nome;

    public Estado(Pais pais, String nome) {
        this.pais = pais;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}

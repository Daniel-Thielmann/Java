import java.util.HashSet;
import java.util.Set;

public class Filme {
    private String titulo;
    private int ano;
    private String produtora;
    private String paisOrigem;
    private String duracao;
    private Genero genero;
    private Set<Papel> papeis;

    public Filme(String titulo, int ano, String produtora, String paisOrigem, String duracao, Genero genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.produtora = produtora;
        this.paisOrigem = paisOrigem;
        this.duracao = duracao;
        this.genero = genero;
        this.papeis = new HashSet<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void addPapel(Papel papel) {
        papeis.add(papel);
    }

    public Set<Papel> getPapeis() {
        return papeis;
    }
}

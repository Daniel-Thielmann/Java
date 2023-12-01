public abstract class MaterialBiblioteca {

    protected String titulo;
    protected int diaPublicacao;
    protected int mesPublicacao;
    protected int anoPublicacao;

    public abstract String calcularDataDevolucao();

    public MaterialBiblioteca(String titulo, int diaPublicacao, int mesPublicacao, int anoPublicacao) {
        this.titulo = titulo;
        this.diaPublicacao = diaPublicacao;
        this.mesPublicacao = mesPublicacao;
        this.anoPublicacao = anoPublicacao;
    }
}

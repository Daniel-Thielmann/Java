import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sessao {
    private Date dataSessao;
    private String horaSessao;
    private String estadoSessao;
    private Filme filme;
    private Sala sala;
    private List<Ingresso> ingressosVendidos;

    public Sessao(Date dataSessao, String horaSessao, Filme filme, Sala sala) {
        this.dataSessao = dataSessao;
        this.horaSessao = horaSessao;
        this.filme = filme;
        this.sala = sala;
        this.estadoSessao = "Aberta";
        this.ingressosVendidos = new ArrayList<>();
    }

    public Date getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(Date dataSessao) {
        this.dataSessao = dataSessao;
    }

    public String getHoraSessao() {
        return horaSessao;
    }

    public void setHoraSessao(String horaSessao) {
        this.horaSessao = horaSessao;
    }

    public String getEstadoSessao() {
        return estadoSessao;
    }

    public void setEstadoSessao(String estadoSessao) {
        this.estadoSessao = estadoSessao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getIngressosComprados() {
        return ingressosVendidos.size();
    }

    public int getIngressosRestantes() {
        return sala.getCapacidade() - ingressosVendidos.size();
    }

    public void venderIngresso(Ingresso ingresso) {
        if (getIngressosRestantes() > 0) {
            ingressosVendidos.add(ingresso);
            System.out.println("Ingresso vendido com sucesso!");
        } else {
            System.out.println("Não há mais ingressos disponíveis.");
        }
    }

    public void exibirSessao() {
        System.out.println("Sessão:");
        System.out.println("Data: " + dataSessao);
        System.out.println("Hora: " + horaSessao);
        System.out.println("Estado: " + estadoSessao);
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Sala: " + sala.getNomeSala());
        System.out.println("Ingressos Comprados: " + getIngressosComprados());
        System.out.println("Ingressos Restantes: " + getIngressosRestantes());
    }
}

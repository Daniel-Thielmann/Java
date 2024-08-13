import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Criação de objetos
        Genero genero = new Genero("Ação");

        Ator ator1 = new Ator("Chris Evans", "Protagonista", 40, 'M', "Americana");
        Ator ator2 = new Ator("Scarlett Johansson", "Co-protagonista", 38, 'F', "Americana");

        Direcao direcao = new Direcao("Joe Russo", "Diretor", "Direção Geral");

        Producao producao1 = new Producao("Kevin Feige", "Produtor", "Produção Executiva");
        Producao producao2 = new Producao("Victoria Alonso", "Produtora", "Produção Executiva");

        Filme filme = new Filme("Vingadores: Ultimato", 2019, "Marvel Studios", "EUA", "3h", genero);
        filme.addPapel(ator1);
        filme.addPapel(ator2);
        filme.addPapel(direcao);
        filme.addPapel(producao1);
        filme.addPapel(producao2);

        Sala sala = new Sala(1, "Sala IMAX", 100);

        Sessao sessao = new Sessao(new Date(), "18:00", filme, sala);

        Ingresso ingresso1 = new Ingresso(1, 10, "Inteira", 50.0f, "2024-08-12 16:00");
        Ingresso ingresso2 = new Ingresso(2, 15, "Meia-entrada", 25.0f, "2024-08-12 16:10");

        // Exibir sessão antes da venda
        sessao.exibirSessao();

        // Venda de ingressos
        sessao.venderIngresso(ingresso1);
        sessao.venderIngresso(ingresso2);

        // Exibir sessão após a venda
        sessao.exibirSessao();

        // Imprimir ingressos
        ingresso1.imprimirIngresso();
        ingresso2.imprimirIngresso();
    }
}

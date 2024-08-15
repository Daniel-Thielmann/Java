import java.util.Date;

//Aluno: Daniel Alves Thielmann - 202165020AB

public class Principal {
    public static void main(String[] args) {
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

        
        System.out.println("ANTES DA VENDA");
        sessao.exibirSessao();
        System.out.println("\n");


        System.out.println("VENDEU INGRESSOS?");
        sessao.venderIngresso(ingresso1);
        sessao.venderIngresso(ingresso2);
        System.out.println("\n");


        System.out.println("APÓS A VENDA");
        sessao.exibirSessao();
        System.out.println("\n");


        System.out.println("IMPRIMIR INGRESSOS");
        ingresso1.imprimirIngresso();
        System.out.println("\n");
        ingresso2.imprimirIngresso();
    }
}

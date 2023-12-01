package exercicioSemNum;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private int qtdEstoque;
    private float precoUnit;
    private int estoqueMax;
    private int estoqueMin;
    private List<String> historico = new ArrayList<>();

    public Produto(String nome, int qtdEstoque, float precoUnit, int estoqueMin, int estoqueMax) {
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
        this.precoUnit = precoUnit;
        this.estoqueMin = estoqueMin;
        this.estoqueMax = estoqueMax;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public int getEstoqueMax() {
        return estoqueMax;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public List<String> getHistorico() {
        return historico;
    }

    public boolean debitarEstoque(int quantidade) {
        if (!verificarEstoqueInsuficiente(quantidade)) {
            qtdEstoque -= quantidade;
            registrarHistorico("Débito de estoque: " + quantidade + " unidades");
            return true;
        } else {
            return false;
        }
    }

    public boolean creditarEstoque(int quantidade) {
        if (!verificarEstoqueExcedente(quantidade)) {
            qtdEstoque += quantidade;
            registrarHistorico("Crédito de estoque: " + quantidade + " unidades");
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarEstoqueBaixo() {
        if (qtdEstoque < estoqueMin) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarEstoqueInsuficiente(int quantidade) {
        if (quantidade > qtdEstoque) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarEstoqueExcedente(int quantidade) {
        if (quantidade + qtdEstoque > estoqueMax) {
            return true;
        } else {
            return false;
        }
    }

    public float calcularValorVenda(int quantidade) {
        return precoUnit * quantidade;
    }

    public boolean vender(String dataTransacao, Cliente cliente, int quantidade) {
        if (!verificarEstoqueInsuficiente(quantidade)) {
            debitarEstoque(quantidade);
            Venda venda = new Venda(dataTransacao, this, quantidade, cliente);
            registrarHistorico(venda.toString());
            return true;
        } else {
            return false;
        }
    }

    public boolean comprar(String dataTransacao, Fornecedor fornecedor, int quantidade, int precoUnit) {
        if (!verificarEstoqueExcedente(quantidade)) {
            creditarEstoque(quantidade);
            Compra compra = new Compra(dataTransacao, this, fornecedor, quantidade, precoUnit);
            registrarHistorico(compra.toString());
            return true;
        } else {
            return false;
        }
    }

    public void registrarHistorico(String transacao) {
        historico.add(transacao);
    }

    public void exibirHistorico() {
        for (String transacao : historico) {
            System.out.println(transacao);
        }
    }
}

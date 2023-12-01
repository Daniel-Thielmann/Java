package exercicio9_3_4;

public class Filial {

    private Cidade cidade;
    private Empresa empresa;

    public Filial(Cidade cidade, Empresa empresa) {
        this.cidade = cidade;
        this.empresa = empresa;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNomeDiretorEmpresaFilial() // Resposta número 5
    {
        if (this.getEmpresa() != null && this.getEmpresa().getDiretor() != null) {
            return this.getEmpresa().getDiretor().getNome(); 
        } else {
            return "Nome do diretor não disponível para esta filial.";
        }
    }
}

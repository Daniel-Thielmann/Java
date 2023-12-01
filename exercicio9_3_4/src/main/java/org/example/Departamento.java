package org.example;

public class Departamento {

    private Funcionario chefia;
    private Empresa empresa;

    public Departamento(Funcionario chefia, Empresa empresa) {
        this.chefia = chefia;
        this.empresa = empresa;
    }

    public Funcionario getChefia() {
        return chefia;
    }

    public void setChefia(Funcionario chefia) {
        this.chefia = chefia;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}

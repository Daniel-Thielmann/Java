package exercicio9_3_4;

public class Empresa {

    private Grupo grupo;
    private Funcionario diretor;

    public Empresa(Grupo grupo, Funcionario diretor) {
        this.grupo = grupo;
        this.diretor = diretor;
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}

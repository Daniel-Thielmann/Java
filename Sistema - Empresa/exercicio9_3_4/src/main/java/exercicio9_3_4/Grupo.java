package exercicio9_3_4;

public class Grupo {

    private Pais sede;
    private Funcionario presidente;

    public Grupo(Pais sede, Funcionario presidente) {
        this.sede = sede;
        this.presidente = presidente;
    }

    public Pais getSede() {
        return sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public String getEscolaridadePresidenteGrupo() // Resposta número 1
    {
        if (this.presidente != null && this.presidente.getEscolaridade() != null) {
            return this.presidente.getEscolaridade().getNivelEscolaridade();
        } else {
            return "Escolaridade não disponível para o presidente do grupo.";
        }
    }
}

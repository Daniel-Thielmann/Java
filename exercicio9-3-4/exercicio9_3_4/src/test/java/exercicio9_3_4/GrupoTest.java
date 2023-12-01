package exercicio9_3_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    void deveRetornarEscolaridadePresidenteGrupo() {
        Escolaridade escolaridadePresidente = new Escolaridade("Doutorado");
        Funcionario presidente = new Funcionario(null, null, escolaridadePresidente, "Presidente Grupo");
        Pais pais = new Pais("Brasil");
        Grupo grupo = new Grupo(pais, presidente);
        assertEquals("Doutorado", grupo.getEscolaridadePresidenteGrupo());
    }

    @Test
    void deveRetornarEscolaridadePresidenteGrupoSemEscolaridade() {
        Funcionario presidente = new Funcionario(null, null, null, "Presidente Grupo");
        Pais pais = new Pais("Brasil");
        Grupo grupo = new Grupo(pais, presidente);
        assertEquals("Escolaridade não disponível para o presidente do grupo.", grupo.getEscolaridadePresidenteGrupo());
    }

    @Test
    void deveRetornarEscolaridadePresidenteGrupoSemPresidente() {
        Pais pais = new Pais("Brasil");
        Grupo grupo = new Grupo(pais, null);
        assertEquals("Escolaridade não disponível para o presidente do grupo.", grupo.getEscolaridadePresidenteGrupo());
    }
}

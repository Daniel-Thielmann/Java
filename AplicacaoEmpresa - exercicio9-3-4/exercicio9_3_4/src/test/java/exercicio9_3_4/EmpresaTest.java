package exercicio9_3_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarNomeDiretorEmpresa() {
        Funcionario diretor = new Funcionario(null, null, null, "Nome Diretor");
        Empresa empresa = new Empresa(null, diretor);
        assertEquals("Nome Diretor", empresa.getDiretor().getNome());
    }

    @Test
    void deveRetornarNomeDiretorEmpresaNaoDisponivel() {
        Empresa empresa = new Empresa(null, null);
        assertNull(empresa.getDiretor());
    }

    @Test
    void deveRetornarGrupoEmpresa() {
        Grupo grupo = new Grupo(new Pais("Brasil"), null);
        Empresa empresa = new Empresa(grupo, null);
        assertEquals("Brasil", empresa.getGrupo().getSede().getNome());
    }

    @Test
    void deveRetornarGrupoEmpresaNaoDisponivel() {
        Empresa empresa = new Empresa(null, null);
        assertNull(empresa.getGrupo());
    }
}

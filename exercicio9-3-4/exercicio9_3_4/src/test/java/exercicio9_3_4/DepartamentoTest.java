package exercicio9_3_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarEscolaridadeChefeDepto() {
        Escolaridade escolaridadeChefe = new Escolaridade("Doutorado");
        Funcionario chefe = new Funcionario(null, null, escolaridadeChefe, "Chefe Departamento");
        Empresa empresa = new Empresa(new Grupo(new Pais("Brasil"), chefe), chefe);
        Departamento departamento = new Departamento(chefe, empresa);
        assertEquals("Doutorado", departamento.getEscolaridadeChefeDepto());
    }

    @Test
    void deveRetornarEscolaridadeChefeDeptoSemEscolaridade() {
        Funcionario chefe = new Funcionario(null, null, null, "Chefe Departamento");
        Empresa empresa = new Empresa(new Grupo(new Pais("Brasil"), chefe), chefe);
        Departamento departamento = new Departamento(chefe, empresa);
        assertEquals("Escolaridade não disponível para o chefe do departamento.", departamento.getEscolaridadeChefeDepto());
    }

    @Test
    void deveRetornarEscolaridadeChefeDeptoSemChefe() {
        Empresa empresa = new Empresa(new Grupo(new Pais("Brasil"), null), null);
        Departamento departamento = new Departamento(null, empresa);
        assertEquals("Escolaridade não disponível para o chefe do departamento.", departamento.getEscolaridadeChefeDepto());
    }
}

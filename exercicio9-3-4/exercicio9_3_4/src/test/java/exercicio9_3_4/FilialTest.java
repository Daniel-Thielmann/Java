package exercicio9_3_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void deveRetornarNomeDiretorEmpresaFilial() {
        Funcionario diretor = new Funcionario(null, null, null, "Nome Diretor");
        Empresa empresa = new Empresa(null, diretor);
        Filial filial = new Filial(null, empresa);
        assertEquals("Nome Diretor", filial.getNomeDiretorEmpresaFilial());
    }

    @Test
    void deveRetornarNomeDiretorEmpresaFilialNaoDisponivel() {
        Filial filial = new Filial(null, null);
        assertEquals("Nome do diretor não disponível para esta filial.", filial.getNomeDiretorEmpresaFilial());
    }

    @Test
    void deveRetornarNomeDiretorEmpresaFilialNaoDisponivelSemDiretor() {
        Empresa empresa = new Empresa(null, null);
        Filial filial = new Filial(null, empresa);
        assertEquals("Nome do diretor não disponível para esta filial.", filial.getNomeDiretorEmpresaFilial());
    }
}

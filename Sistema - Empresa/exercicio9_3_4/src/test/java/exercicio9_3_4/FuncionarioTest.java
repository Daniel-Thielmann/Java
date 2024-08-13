package exercicio9_3_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPaisAlocacao() {
        Pais paisSede = new Pais("Brasil");
        Grupo grupo = new Grupo(paisSede, null);
        Empresa empresa = new Empresa(grupo, null);
        Departamento departamento = new Departamento(null, empresa);
        Estado estadoFilial = new Estado(paisSede, "Minas Gerais");
        Cidade cidadeFilial = new Cidade(estadoFilial, "Cidade");
        Filial filial = new Filial(cidadeFilial, empresa);
        Funcionario funcionario = new Funcionario(filial, departamento, null, "Nome Funcionário");
        assertEquals("Brasil", funcionario.getPaisAlocacao());
    }

    @Test
    void deveRetornarEstadoFilialFuncionario() {
        Estado estadoFilial = new Estado(new Pais("Brasil"), "Minas Gerais");
        Cidade cidadeFilial = new Cidade(estadoFilial, "Cidade");
        Filial filial = new Filial(cidadeFilial, null);
        Funcionario funcionario = new Funcionario(filial, null, null, "Nome Funcionário");
        assertEquals("Minas Gerais", funcionario.getEstadoFilialFuncionario());
    }

    @Test
    void deveRetornarPaisAlocacaoNaoDisponivel() {
        Funcionario funcionario = new Funcionario(null, null, null, "Nome Funcionário");
        assertEquals("País de alocação não disponível para este funcionário.", funcionario.getPaisAlocacao());
    }

    @Test
    void deveRetornarEstadoFilialFuncionarioNaoDisponivel() {
        Funcionario funcionario = new Funcionario(null, null, null, "Nome Funcionário");
        assertEquals("Estado da filial não disponível para este funcionário.", funcionario.getEstadoFilialFuncionario());
    }
}

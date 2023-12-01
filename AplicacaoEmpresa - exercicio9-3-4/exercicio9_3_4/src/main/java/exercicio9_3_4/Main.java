package exercicio9_3_4;

public class Main {
    public static void main(String[] args) {
        
        Pais paisSede = new Pais("Brasil");
        Escolaridade doutorado = new Escolaridade("Doutorado");
        Funcionario presidente = new Funcionario(null, null, doutorado, "Daniel Thielmann");

        Grupo grupo = new Grupo(paisSede, presidente);
        Empresa empresa = new Empresa(grupo, presidente);

        Estado estadoFilial = new Estado(paisSede, "Minas Gerais");
        Cidade cidadeFilial = new Cidade(estadoFilial, "Cidade");
        Filial filial = new Filial(cidadeFilial, empresa);

        Departamento departamento = new Departamento(presidente, empresa);

        Escolaridade mestrado = new Escolaridade("Mestrado");
        Funcionario funcionario = new Funcionario(filial, departamento, mestrado, "Nome Funcionário");

        System.out.println("1) Escolaridade do presidente do grupo: " + grupo.getEscolaridadePresidenteGrupo());
        System.out.println("2) País de alocação do funcionário: " + funcionario.getPaisAlocacao());
        System.out.println("3) Estado da filial do funcionário: " + funcionario.getEstadoFilialFuncionario());
        System.out.println("4) Escolaridade do chefe do departamento: " + departamento.getEscolaridadeChefeDepto());
        System.out.println("5) Nome do diretor da empresa de uma filial: " + filial.getNomeDiretorEmpresaFilial());
    }
}

package exercicio9_3_4;

public class Main {
    public static void main(String[] args) {
        
        Pais paisSede = new Pais("Brasil");
        Funcionario presidente = new Funcionario(null, null, new Escolaridade("Doutorado"), "Nome Presidente");

        Grupo grupo = new Grupo(paisSede, presidente);
        Empresa empresa = new Empresa(grupo, presidente);

        Estado estadoFilial = new Estado(paisSede, "Estado da Filial");
        Cidade cidadeFilial = new Cidade(estadoFilial, "Cidade");
        Filial filial = new Filial(cidadeFilial, empresa);

        Departamento departamento = new Departamento(presidente, empresa);

        Funcionario funcionario = new Funcionario(filial, departamento, new Escolaridade("Mestrado"), "Nome Funcionário");

        System.out.println("Escolaridade do presidente do grupo: " + grupo.getEscolaridadePresidenteGrupo());
        System.out.println("País de alocação do funcionário: " + funcionario.getPaisAlocacao());
        System.out.println("Estado da filial do funcionário: " + funcionario.getEstadoFilialFuncionario());
        System.out.println("Escolaridade do chefe do departamento: " + departamento.getEscolaridadeChefeDepto());
        System.out.println("Nome do diretor da empresa de uma filial: " + filial.getNomeDiretorEmpresaFilial());
    }
}

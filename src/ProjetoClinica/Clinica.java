package ProjetoClinica;

public class Clinica {
    public static void main(String args[]){

        Paciente paciente = new Paciente();
        paciente.nome = "Fulano";
        paciente.endereco = "Jurunas";
        paciente.numeroCartao = 12345;

        Medico medico = new Medico();
        medico.nome = "Pedro";
        medico.endereco = "Umarizal";
        medico.crm = 12312;
        medico.especialidade = "Cardiologista";

        AtendimentoMedico atendimento = new AtendimentoMedico();
        atendimento.dataConsulta = 12/12/2019;
        atendimento.paciente = paciente;
        atendimento.medico = medico;

    }





}

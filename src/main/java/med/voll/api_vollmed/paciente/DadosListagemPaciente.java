package med.voll.api_vollmed.paciente;

public record DadosListagemPaciente(
        String nome,
        String email,
        String cpf
) {

    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }

}

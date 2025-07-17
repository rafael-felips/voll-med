package med.voll.api_vollmed.paciente;

import med.voll.api_vollmed.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String cpf, Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getEndereco());
    }
}

package med.voll.api_vollmed.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api_vollmed.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}

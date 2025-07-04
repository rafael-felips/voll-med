package med.voll.api_vollmed.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api_vollmed.endereco.DadosEndereco;

public record DadosAtualzacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}

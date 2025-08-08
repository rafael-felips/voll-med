package med.voll.api_vollmed.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api_vollmed.domain.endereco.DadosEndereco;

public record DadosAtualzacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}

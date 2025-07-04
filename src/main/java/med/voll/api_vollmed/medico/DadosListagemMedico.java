package med.voll.api_vollmed.medico;

public record DadosListagemMedico(
        Long id,
        String nome,
        String email,
        String crm,
        Boolean ativo,
        Especialidade especialidade
) {

    public DadosListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getAtivo(), medico.getEspecialidade());
    }
}

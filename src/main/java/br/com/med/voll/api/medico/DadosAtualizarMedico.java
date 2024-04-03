package br.com.med.voll.api.medico;

import br.com.med.voll.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {


}

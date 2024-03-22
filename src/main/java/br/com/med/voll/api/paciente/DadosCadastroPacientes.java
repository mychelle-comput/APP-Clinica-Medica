package br.com.med.voll.api.paciente;

import br.com.med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPacientes(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}

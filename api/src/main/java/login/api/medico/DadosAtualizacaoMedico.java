package login.api.medico;

import login.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(Long id, String nome, String telefone, DadosEndereco endereco) {
}

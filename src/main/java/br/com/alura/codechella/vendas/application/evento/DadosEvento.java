package br.com.alura.codechella.vendas.application.evento;

import br.com.alura.codechella.vendas.domain.evento.Categoria;
import br.com.alura.codechella.vendas.application.ingresso.DadosCadastroTipoIngresso;
import br.com.alura.codechella.DadosEndereco;

import java.time.LocalDateTime;
import java.util.List;

public record DadosEvento(
        Long id,
        Categoria categoria,
        String descricao,
        DadosEndereco endereco,
        LocalDateTime data,
        List<DadosCadastroTipoIngresso> tipoIngressos
) {
}

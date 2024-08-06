package br.com.alura.codechella.vendas.application.venda;

import br.com.alura.codechella.vendas.application.ingresso.DadosTipoIngresso;
import br.com.alura.codechella.vendas.application.usuario.DadosUsuario;

import java.util.List;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}

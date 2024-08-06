package br.com.alura.codechella.application.venda;

import br.com.alura.codechella.application.ingresso.DadosTipoIngresso;
import br.com.alura.codechella.application.usuario.DadosUsuario;

import java.util.List;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}

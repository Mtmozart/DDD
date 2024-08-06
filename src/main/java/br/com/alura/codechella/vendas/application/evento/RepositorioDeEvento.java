package br.com.alura.codechella.vendas.application.evento;

import br.com.alura.codechella.vendas.domain.evento.Endereco;
import br.com.alura.codechella.vendas.domain.evento.Evento;

public interface RepositorioDeEvento {
    Evento buscarEventoPorCidade(Endereco cep);
}

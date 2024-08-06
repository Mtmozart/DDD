package br.com.alura.codechella.vendas.application.usuario;

import java.time.LocalDate;

public record DadosUsuario(
        Long id,
        String cpf,
        String nome,
        LocalDate nascimento,
        String email
) {
}

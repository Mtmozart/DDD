package br.com.alura.codechella.vendas.application.usuario;

import br.com.alura.codechella.vendas.infra.usuario.Usuario;

public interface EnviarCupomDesconto {
   void enviarPara(Usuario usuario);
}

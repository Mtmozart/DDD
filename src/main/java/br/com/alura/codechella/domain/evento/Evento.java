package br.com.alura.codechella.domain.evento;

import br.com.alura.codechella.domain.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Evento {
    private UUID uuid;
    private Categoria categoria;
    private String descricao;
    private LocalDateTime data;
    private Endereco endereco;
    private List<TipoIngresso> tipoIngressos = new ArrayList<>();

    public Evento(Categoria categoria, String descricao, LocalDateTime data, Endereco endereco) {
        geraIdentificadorUnico();
        this.categoria = categoria;
        this.descricao = descricao;
        this.data = data;
        this.endereco = endereco;
    }

    private void geraIdentificadorUnico() {
        this.uuid = UUID.randomUUID();
    }

    public void incluirNovoTipoIngressoAoEvento(TipoIngresso tipoIngresso){
        this.tipoIngressos.add(tipoIngresso);
    }

    public void aumentarNumeroDeIngressosPorTipo(){
        //exemplo de mudança
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<TipoIngresso> getTipoIngressos() {
        return tipoIngressos;
    }
}

package com.devsuperior.desafio_capitulo_2.entities;

import java.time.Instant;
import java.util.Objects;

public class Bloco {
    private Integer id;
    private Instant inicio;
    private Instant fim;

    public Bloco() {}

    public Bloco(Integer id, Instant inicio, Instant fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getInicio() {
        return inicio;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }

    public Instant getFim() {
        return fim;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Bloco bloco = (Bloco) o;
        return Objects.equals(getId(), bloco.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}

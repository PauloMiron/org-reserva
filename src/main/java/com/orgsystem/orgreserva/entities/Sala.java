package com.orgsystem.orgreserva.entities;

import java.time.Instant;
import java.util.Date;

public class Sala extends Agenda{

    private String nome;

    public Sala(){}

    public Sala(Date dataAgendamento, Instant instanteInicial, Instant instanteFinal, String nome) {
        super(dataAgendamento, instanteInicial, instanteFinal);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

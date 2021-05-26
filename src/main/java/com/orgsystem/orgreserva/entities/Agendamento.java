package com.orgsystem.orgreserva.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
import java.util.Date;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dataAgendamento;
    private Instant InstanteInicial;
    private Instant InstanteFinal;

    public Agendamento(){ }

    public Agendamento(Date dataAgendamento, Instant instanteInicial, Instant instanteFinal) {
        this.dataAgendamento = dataAgendamento;
        InstanteInicial = instanteInicial;
        InstanteFinal = instanteFinal;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Instant getInstanteInicial() {
        return InstanteInicial;
    }

    public void setInstanteInicial(Instant instanteInicial) {
        InstanteInicial = instanteInicial;
    }

    public Instant getInstanteFinal() {
        return InstanteFinal;
    }

    public void setInstanteFinal(Instant instanteFinal) {
        InstanteFinal = instanteFinal;
    }
}

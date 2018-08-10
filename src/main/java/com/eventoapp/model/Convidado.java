package com.eventoapp.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Criado por douglas.santos em 08/08/2018
 */
@Entity
public class Convidado {

    @Id
    @NotEmpty
    private String rg;
    @NotEmpty
    private String nomeConvidado;

    //Muitos convidados para um evento
    @ManyToOne
    private Evento evento;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}


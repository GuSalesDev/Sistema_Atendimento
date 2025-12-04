package com.sisatender.model;
import java.time.LocalDateTime;

public class Atendimento {
    private int id;
    private Person pessoa;
    private LocalDateTime dataHora;

    public Atendimento(int id, Person pessoa, LocalDateTime dataHora) {
        this.id = id;
        this.pessoa = pessoa;
        this.dataHora = dataHora;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPessoa() {
        return pessoa;
    }

    public void setPessoa(Person pessoa) {
        this.pessoa = pessoa;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Atendimento, " +
                "id: " + id +
                ", pessoa: " + pessoa.getNome() +
                ", data e hora; " + dataHora +
                '}';
    }


}

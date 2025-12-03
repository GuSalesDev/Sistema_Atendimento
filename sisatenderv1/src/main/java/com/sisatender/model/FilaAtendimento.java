package com.sisatender.model;
import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {
    private Queue<Atendimento> fila;

    public FilaAtendimento() {
        this.fila = new LinkedList<>();
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        fila.add(atendimento);
    }

    public Atendimento atenderProximo() {
        return fila.poll();
    }

    public int tamanhoFila() {
        return fila.size();
    }

}

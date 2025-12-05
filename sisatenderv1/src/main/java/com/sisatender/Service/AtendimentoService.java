package com.sisatender.service;

import com.sisatender.model.Atendimento;
import com.sisatender.model.FilaAtendimento;
import com.sisatender.model.Person;

import java.time.LocalDateTime;

public class AtendimentoService {

    private final FilaAtendimento fila = new FilaAtendimento();

    public Atendimento criarAtendimento(Person pessoa) {
        Atendimento atendimento = new Atendimento(
                fila.tamanhoFila() + 1,
                pessoa,
                LocalDateTime.now()
        );
        fila.adicionarAtendimento(atendimento);
        return atendimento;
    }

    public Atendimento atenderProximo() {
        return fila.atenderProximo();
    }

    public int tamanhoFila() {
        return fila.tamanhoFila();
    }
}

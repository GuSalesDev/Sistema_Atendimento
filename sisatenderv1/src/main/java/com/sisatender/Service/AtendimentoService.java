package com.sisatender.service;

import com.sisatender.model.Atendimento;
import com.sisatender.model.FilaAtendimento;
import com.sisatender.model.Person;
import exception.FilaVazia;
import java.time.LocalDateTime;

public class AtendimentoService implements IAtendimentoService {

    private final FilaAtendimento fila = new FilaAtendimento();
   
    @Override
    public void criarAtendimento(Person pessoa) {
        Atendimento atendimento = new Atendimento(
                fila.tamanhoFila() + 1,
                pessoa,
                LocalDateTime.now()
        );
        fila.adicionarAtendimento(atendimento);
    }
    @Override
    public Atendimento atenderProximo() {
        return fila.atenderProximo();
    }

    @Override
    public int tamanhoFila() {
        return fila.tamanhoFila();
    }

    @Override
    public Atendimento atenderProximoErro() {
        Atendimento atendimento = fila.atenderProximo();
        if (atendimento == null) {
            throw new FilaVazia();
        }
        return atendimento;
    }
}

package com.sisatender.service;

import com.sisatender.model.Person;
import com.sisatender.model.Atendimento;

public interface IAtendimentoService {

    void criarAtendimento(Person pessoa);

    Atendimento atenderProximo();

    int tamanhoFila();

    Atendimento atenderProximoErro();
}


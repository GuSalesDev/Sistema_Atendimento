package com.sisatender.service;

import com.sisatender.model.Person;
import exception.PessoaJaRegistrada;
import exception.PessoaNaoEncontrada;

import java.util.List;

public interface IPersonService {

    Person registrarPessoa(String nome, String cpf, String telefone, String email, int idade)
            throws PessoaJaRegistrada;

    List<Person> listarPessoas();

    Person buscarPorId(int id);

    Person buscarPorIdOuErro(int id) throws PessoaNaoEncontrada;
}

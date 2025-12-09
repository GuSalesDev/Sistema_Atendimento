package com.sisatender.service;

import com.sisatender.model.Person;
import exception.PessoaJaRegistrada;
import exception.PessoaNaoEncontrada;

import java.util.ArrayList;
import java.util.List;

public class PersonService implements IPersonService {

    private final List<Person> pessoas = new ArrayList<>();

    @Override
    public Person registrarPessoa(String nome, String cpf, String telefone, String email, int idade) {

        boolean existe = pessoas.stream()
                .anyMatch(p -> p.getCpf().equals(cpf));

        if (existe) {
            throw new PessoaJaRegistrada(cpf);
        }

        Person pessoa = new Person(
                pessoas.size() + 1,
                nome,
                cpf,
                telefone,
                email,
                idade
        );

        pessoas.add(pessoa);
        System.out.println("Pessoa registrada com sucesso!");
        return pessoa;
    }

    @Override
    public List<Person> listarPessoas() {
        return pessoas;
    }

    @Override
    public Person buscarPorId(int id) {
        return pessoas.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Person buscarPorIdOuErro(int id) {
        Person pessoa = buscarPorId(id);
        if (pessoa == null) {
            throw new PessoaNaoEncontrada(id);
        }
        return pessoa;
    }
}

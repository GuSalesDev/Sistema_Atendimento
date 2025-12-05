package com.sisatender.service;

import com.sisatender.model.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonService {

    private final List<Person> pessoas = new ArrayList<>();

    public Person registrarPessoa(String nome, String cpf, String telefone, String email, int idade) {
        Person p = new Person(pessoas.size() + 1, nome, cpf, telefone, email, idade);
        pessoas.add(p);
        return p;
    }

    public List<Person> listarPessoas() {
        return pessoas;
    }

    public Person buscarPorId(int id) {
        return pessoas.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}

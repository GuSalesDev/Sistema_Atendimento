package com.sisatender;
import com.sisatender.service.*;
import exception.*;


public class MenuController {

    private final InputService input = new InputService();
    private final PersonService personService = new PersonService();
    private final AtendimentoService atendimentoService = new AtendimentoService();

 public void iniciar() {

    while (true) {
        try {
            System.out.println("\n1 - Registrar pessoa");
            System.out.println("2 - Agendar atendimento");
            System.out.println("3 - Atender próximo");
            System.out.println("4 - Ver tamanho da fila");
            System.out.println("0 - Sair");

            int opcao = input.nextInt("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> registrarPessoa();
                case 2 -> agendar();
                case 3 -> atender();
                case 4 -> System.out.println("Fila atual: " + atendimentoService.tamanhoFila());
                case 0 -> { return; }
                default -> System.out.println("Opção inválida.");
            }

        } catch (AtendimentoException e) {

            System.out.println("\nErro: " + e.getMessage());
        }
    }
}

    private void registrarPessoa() {
        String nome = input.nextLine("Nome: ");
        String cpf = input.nextLine("CPF: ");
        String telefone = input.nextLine("Telefone: ");
        String email = input.nextLine("Email: ");
        int idade = input.nextInt("Idade: ");

        personService.registrarPessoa(nome, cpf, telefone, email, idade);
    }

    private void agendar() {
        personService.listarPessoas().forEach(
                p -> System.out.println(p.getId() + " - " + p.getNome())
        );
        int id = input.nextInt("Digite o ID: ");

        var pessoa = personService.buscarPorId(id);
        if (pessoa != null) {
            atendimentoService.criarAtendimento(pessoa);
            System.out.println("Agendado.");
        }
    }

    private void atender() {
        var a = atendimentoService.atenderProximo();
        if (a != null) {
            System.out.println("Atendendo: " + a.getPessoa().getNome());
        } else {
            System.out.println("Fila vazia.");
        }
    }
}

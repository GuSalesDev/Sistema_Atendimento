package com.sisatender.Service;
import com.sisatender.model.Atendimento;
import com.sisatender.model.FilaAtendimento;
import com.sisatender.model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtendimentoService {

    private FilaAtendimento filaAtendimento;
    private List<Person> pessoas;
    private Scanner scanner;

    public AtendimentoService() {
        this.filaAtendimento = new FilaAtendimento();
        this.pessoas = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void registrarPessoa() {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        System.out.print("Digite a idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        Person pessoa = new Person(pessoas.size() + 1, nome, cpf, telefone, email, idade);
        pessoas.add(pessoa);
        System.out.println("Pessoa registrada com sucesso!");
    }

    public void listarPessoas() {
        System.out.println("Lista de Pessoas:");
        for (Person pessoa : pessoas) {
            System.out.println(pessoa.getId() + ": " + pessoa.getNome());
        }
    }

    public Person selecionarPessoa() {
        listarPessoas();
        System.out.print("Digite o ID da pessoa para atendimento: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Person pessoa : pessoas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        System.out.println("Pessoa não encontrada.");
        return null;
    }

    public void agendarAtendimento() {
        Person pessoa = selecionarPessoa();
        if (pessoa != null) {
            Atendimento atendimento = new Atendimento(filaAtendimento.tamanhoFila() + 1, pessoa, java.time.LocalDateTime.now());
            filaAtendimento.adicionarAtendimento(atendimento);
            System.out.println("Atendimento agendado para " + pessoa.getNome());
        }
    }

    public void atenderProximo() {
        Atendimento atendimento = filaAtendimento.atenderProximo();
        if (atendimento != null) {
            System.out.println("Atendendo: " + atendimento);
        } else {
            System.out.println("Nenhum atendimento na fila.");
        }
    }

    public void mostrarTamanhoFila() {
        System.out.println("Número de atendimentos na fila: " + filaAtendimento.tamanhoFila());
    }

    public void iniciar() {
    while (true) {
        System.out.println("\n=== MENU ===");
        System.out.println("1 - Registrar pessoa");
        System.out.println("2 - Listar pessoas");
        System.out.println("3 - Agendar atendimento");
        System.out.println("4 - Atender próximo");
        System.out.println("5 - Ver tamanho da fila");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");

        String opcao = scanner.nextLine();

        switch (opcao) {
            case "1" -> registrarPessoa();
            case "2" -> listarPessoas();
            case "3" -> agendarAtendimento();
            case "4" -> atenderProximo();
            case "5" -> mostrarTamanhoFila();
            case "0" -> {
                System.out.println("Saindo...");
                return;
            }
            default -> System.out.println("Opção inválida!");
        }
    }
}


    


}

package exception;


public class PessoaNaoEncontrada extends RuntimeException {
    public PessoaNaoEncontrada(int id) {
        super("Pessoa com ID " + id + " nao encontrada.");
    }

}

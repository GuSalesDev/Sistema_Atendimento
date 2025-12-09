package exception;

public class PessoaJaRegistrada extends AtendimentoException {
    public PessoaJaRegistrada(String cpf) {
        super("Já existe uma pessoa registrada com o CPF: " + cpf);
    }
}

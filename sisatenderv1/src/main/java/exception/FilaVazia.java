package exception;

public class FilaVazia extends RuntimeException {
    public FilaVazia() {
        super("A fila esta vazia.");
    }

}

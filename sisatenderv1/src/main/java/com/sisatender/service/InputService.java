package com.sisatender.service;

import exception.EntradaInvalida;
import java.util.Scanner;

public class InputService {

    private final Scanner scanner = new Scanner(System.in);

    public String nextLine(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public int nextInt(String mensagem) {
        System.out.print(mensagem);
        return Integer.parseInt(scanner.nextLine());
    }

    public int nextIntComValidacao(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                throw new EntradaInvalida("Entrada invalida. Por favor, insira um numero inteiro.");
            }
        }
    }
}

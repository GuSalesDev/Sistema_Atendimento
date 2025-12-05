package com.sisatender.service;

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
}

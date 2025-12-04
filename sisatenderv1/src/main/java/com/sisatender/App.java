package com.sisatender;

import com.sisatender.Service.AtendimentoService;

public class App {
    public static void main(String[] args) {
        AtendimentoService sistema = new AtendimentoService();
        sistema.iniciar();
    }
}

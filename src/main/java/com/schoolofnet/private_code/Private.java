package com.schoolofnet.private_code;

public class Private {
    // Não existe modificadores de acesso para classe
    // Private visa manter determinadas propriedades atributos ou método para uso dentro da classe
    // Conceito de encapsulamento
    private String name;

    public Private() {
        print();
        System.out.println("Private class");
    }

    private void print() {
        System.out.println("Private print method");
    }
}

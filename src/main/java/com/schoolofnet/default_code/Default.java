package com.schoolofnet.default_code;

public class Default {
    // Default ou No modify ele é expresso pela ausência dos outros modificadores
    // Caso de uso: Outras classes dentro do mesmo pacote podem acessar os campos padrões,
    // mais o restante do código não

    Integer age;

    public Default() {
        this.age = 10;
        System.out.println("Default class age: " + this.age);
    }

}

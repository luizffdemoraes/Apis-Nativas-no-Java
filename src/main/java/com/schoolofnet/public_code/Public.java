package com.schoolofnet.public_code;

import com.schoolofnet.Info;

// Utilizar o metodo de reflection ou api que realiza leitura e trabalha outras logicas
@Info(createdBy = "Wesley")
public class Public {


    // O acesso e liberado para qualquer lugar do software.
    public Public() {
        System.out.println("Public class");
    }

    @Override
    public String toString() {
        return "Public class toString()";
    }
}

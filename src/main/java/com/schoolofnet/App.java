package com.schoolofnet;

import com.schoolofnet.public_code.Public;

public class App {
    public static void main(String[] args) {

        // Classe Object
        // Qualquer tipo de objeto vem sobrescrito de Object ela e a raiz de hierarquia das classes
        // Ela sempre vai ser usada diretamente ou indiretamente.
        Object obj = new Object();
        Public publicCode = new Public();

        System.out.println(obj.toString());
        System.out.println(publicCode.toString());

        System.out.println("Hello World!");
    }
}

package com.schoolofnet;

import com.schoolofnet.private_code.Private;
import com.schoolofnet.protected_code.Protected;
import com.schoolofnet.public_code.Public;

public class App {
    public static void main(String[] args) {
        new Public();
        new Private();
        new Protected();

        System.out.println( "Hello World!" );
    }
}

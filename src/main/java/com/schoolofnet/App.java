package com.schoolofnet;

import com.schoolofnet.private_code.Private;
import com.schoolofnet.public_code.Public;

public class App {
    public static void main(String[] args) {
        new Public();
        new Private();

        System.out.println( "Hello World!" );
    }
}

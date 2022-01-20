package com.schoolofnet;

import com.schoolofnet.public_code.Public;

import java.lang.annotation.Annotation;

public class App {
    public static void main(String[] args) {

        Class<Public> obj = Public.class;

        // Reflection
       if (obj.isAnnotationPresent(Info.class)) {
           Annotation annotation = obj.getAnnotation(Info.class);
           Info info = (Info) annotation;

           System.out.println(info.createdBy());
       }


        // Classes Wrappers
        // Classes que tem a herança de Object
        // Existência dos métodos de Object.

//      |  Tipo primitivo  | Tipos Wrappers |
//      |  int             | Integer        |
//      |  boolean         | Boolean        |
//      |  double          | Double         |
//      |  float           | Float          |
//      |  long            | Long           |

        Integer one = 0;

        // existencia dos metodos objects

        // Classe Object
        // Qualquer tipo de /objeto vem sobrescrito de Object ela e a raiz de hierarquia das classes
        // Ela sempre vai ser usada diretamente ou indiretamente.
//        Object obj = new Object();
//        Public publicCode = new Public();
//
//        System.out.println(obj.toString());
//        System.out.println(publicCode.toString());

        System.out.println("Hello World!");
    }
}

package com.schoolofnet;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Info {
    // Criar anotação
    // @Target() ->  Especifica o tipo de elemento, que essa notação será colocada seja um parametro, atributo, metodo contrutor, variavel local ou anotação
    // @Retention() -> Ela vai dizer se vai esternder um retenção  para seu código fonte no momento de runtime ou class
    // @Documented -> Se ela vai ser mencionada no java docs uma implementação de biblioteca onde tem a documentação do projeto

    String createdBy() default "Leonan";

}

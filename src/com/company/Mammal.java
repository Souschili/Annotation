package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//аннотация
@Target(ElementType.TYPE)                   //если заменить на Field то придется руками прописывать каждое поле
@Retention(RetentionPolicy.RUNTIME)
public @interface Mammal {

    public String Color() default "black";  //по умолчанию то есть необязательно указывать параметры
    public String Voice() default "Waargh"; // Орки рулят ,чем краснее тем лучше!!!
    public int Age();
    public String [] Tags();                    //обязательный параметр
}

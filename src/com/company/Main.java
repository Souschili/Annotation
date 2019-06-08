package com.company;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
	// write your code her
        // добавляем наш зверинец .все ясень пень наследники что позволяет вписать в массив Animal
       Animal [] zverinec ={new Cat(),new Dog(),new Elephant(),new Begemot()};

       //в цикле чекаем каждый элемент наше зверинца (массива)
        for(Animal item:zverinec)
        {
            // дергаем Массив аннотаций для зверушки
            Annotation [] annotations=item.getClass().getAnnotations();
            for (Annotation annotation : annotations) {
                // Получаем имя аннотации отрубил мы информативней выведем
                //System.out.println(annotation.annotationType().getSimpleName());
                if (annotation instanceof Mammal) {
                  // если нужная аннотация есть то выводим на экран
                    Mammal mam=(Mammal)(annotation); //не врубился что тут происходит ,но похоже на преобразование
                    System.out.println("Класс "+ item.getClass().getSimpleName() +" реализирует аннотацию Mamal :");
                    System.out.println("Color: "+ mam.Color());
                    System.out.println("Voice: "+ mam.Voice());
                    System.out.println("Age: "+mam.Age());
                    System.out.println("Color: "+ mam.Color());
                    System.out.print("Характеристики : ");
                    for( String e : mam.Tags() ){
                        //получаем список Tags
                        System.out.print(e+" ");
                    }
                }


            }
            System.out.println();


        }




    }
}

package com.company.HomeWork6;

public class AnimalTest {
    public static void main(String[] args) {

        //Создаем котов
        int count = (int) (Math.random()*5);
        Cat [] cat = new Cat[count];

        for (int i = 0; i < count; i++) {
            cat[i] = new Cat("Кот","Васька"+(i+1),180 + (int) (Math.random()*30),i);
            System.out.println((i+1)+")кот " + " " + cat[i].getName()+" бег: "+cat[i].getRun()+" метров, заплыв: "
                            +cat[i].getSwimm()+" метров" );
            cat[i].say();
        }
        //Создаем собак
        count = (int) (Math.random()*5);
        Dog [] dog = new Dog[count];
        for (int i = 0; i < count; i++) {
            dog[i] = new Dog("Собака ","Луна"+(i+1),(int) (Math.random()*1000),(int) (Math.random()*30));
            System.out.println((i+1)+")собака " + " " + dog[i].getName()+" бег: "+dog[i].getRun()+" метров, заплыв: "
                    +dog[i].getSwimm()+" метров" );
            dog[i].say();
        }
        // Выводим количество созданных котов, собак и итого животных
        System.out.println("Создано " + Cat.cnt + " котов");
        System.out.println("Создано " + Dog.cnt + " собак");
        System.out.println("Всего создано "+ Animal.cnt+ " животных");







    }

}

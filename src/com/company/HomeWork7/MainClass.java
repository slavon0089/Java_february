package com.company.HomeWork7;

public class MainClass {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 20);
        Cat cat2 = new Cat("Лео", 100);
        Cat cat3 = new Cat("Соня", 20);
        Cat cat4 = new Cat("Кузя", 30);
        Cat cat5 = new Cat("Васька", 20);
        Plate plate = new Plate(100);
        plate.info();
        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        cat4.eat(plate);
        cat5.eat(plate);
        plate.setFood(21);
        plate.info();
    }

}

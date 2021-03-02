package com.company.HomeWork6;

public class Dog extends Animal{

    public static int cnt = 0;

    public Dog(String animal_type, String name, int run, int swimm) {
        super(animal_type, name, run,swimm);
        cnt++;
    }

    @Override
    public void say() {

        //условия дле бега и плавания собаки
        if(this.getRun() >500) {
            System.out.println(getAnimal_type() + " " + getName() + " " + "Не может бежать больше 500 метров");
        } else
            System.out.println(getAnimal_type() + " " + getName() + " " +"пробежал " + getRun() + " метров");
        if (this.getSwimm() > 10) {
            System.out.println(getAnimal_type() + getName() + " не может плыть больше 10 метров");
        } else
            System.out.println(getAnimal_type() + " " + getName() + " " +"проплыл " + " " + getSwimm() + " метров" );

    }
    }


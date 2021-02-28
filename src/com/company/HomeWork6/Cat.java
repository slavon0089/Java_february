package com.company.HomeWork6;

public class Cat extends Animal {

    public static int cnt = 0;

    public Cat(String animal_type, String name, int run, int swimm) {
        super(animal_type, name, run, swimm);
        cnt++;
    }

    @Override

    //условия дле бега и плавания кота
    public void say() {
        if (this.getRun() > 200) {
            System.out.println(getAnimal_type() + " " + getName() + " " + "Не может бежать больше 200метров");
        } else
            System.out.println(getAnimal_type() + " " + getName() + " " + "Пробежал " + getRun() + " метров");
        if (this.getSwimm() >= 0) {
            System.out.println("Котик не плавает");
        }


    }
}


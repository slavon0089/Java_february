package com.company.HomeWork7;

public class Cat {

    private String name;
    boolean fullEat = false;
    public int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {


        if (this.appetite <= p.food ){
            p.decreaseFood(appetite);
            fullEat = true;
            System.out.println("Кот "+ name +" поел "+fullEat);
        } else {
            System.out.println("В миске мало еды, кот "+ name +" остался голодным");
        }
        }

    }



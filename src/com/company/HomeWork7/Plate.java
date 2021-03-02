package com.company.HomeWork7;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {

        food -= n;

    }

    public void setFood(int n) {
        food += n;
        System.out.println("В миску досыпали " +n +" еды");
    }

    public void info() {
        System.out.println("В тарелке еды: " + food);
    }
}

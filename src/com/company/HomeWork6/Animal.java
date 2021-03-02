package com.company.HomeWork6;

public class Animal {
    public String animal_type;
    public String name;
    public int run;
    public int swimm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwimm() {
        return swimm;
    }

    public void setSwimm(int swimm) {
        this.swimm = swimm;
    }

    public Animal(){
    }

    //наследуемые параметры от животного

    public static int cnt = 0;
    public Animal (String animal_type, String name, int run, int swimm){
        this.animal_type = animal_type;
        this.name = name;
        this.run = run;
        this.swimm = swimm;
        cnt++;

    }


    public void say(){

    }



}

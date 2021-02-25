package com.company;

public class HomeWork5 {
 //Конструктор класса должен заполнять эти поля при создании объекта
    public static void main(String[] args) {
        //4. Создать массив из 5 сотрудников
        Employers[] employersArr = new Employers[5];
        employersArr[0] = new Employers("Ivan Ivanov","Tester","Ivan@gmail.com","+79165475742",50000,41);
        employersArr[1] = new Employers("John Wick","QA","boss007@gmail.com","+375298745874",45000,38);
        employersArr[2] = new Employers("Alex Burger","Java Dev","AlexBurger@gmail.com","+15875695",120000,42);
        employersArr[3] = new Employers("Main Call","DevOps","DevMain@gmail.com","+14785444",90000,29);
        employersArr[4] = new Employers("Katya Markova","QA","KatyaOficcial@gmail.com","+3185765462",50000,33);


        for (int i = 0; i < 5; i++) {
            if(employersArr[i].age >40)
            employersArr[i].allInfo();

        }
    }


}

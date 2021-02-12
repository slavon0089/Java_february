package com.company;

import java.sql.SQLOutput;

public class HomeWork1 {



    public static void main(String[] args) {
        //2. Создать переменные всех пройденных типов данных и инициализировать их значения.

        byte byteVar = -128;
        short shortVar = -32768;
        int intVar = 1949879874;
        long longVar = 1685768765L;

        float floatVar = 123.4865f;
        double doubleVar = 98746.4687d;

        char charVar = '*';
        boolean booleanVar = true;

        calc(1,3,5,6);

    }

//3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//где a, b, c, d – аргументы этого метода, имеющие тип float.
    static float  calc(float a, float b, float c, float d){
        float rez = a * (b + (c / d));
        System.out.println(rez);
        return rez;
    }
//4. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

    static boolean checkNumber1020 (int a, int b){
        int sum = a + b;
        if (sum>=10 && sum<=20){
            return true;
        } else{
            return false;
        }
    }

//5. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

    public static void numberPositive(int number){
        if(number>=0){
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

// 6. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static void trueNumber (int number){
        if(number>=0){
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }
// 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
// Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void helloName (String name){
        System.out.println("Привет"+name);

    }



}

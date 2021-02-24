package com.company;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    /**
     * 1. Написать программу, которая загадывает случайное число от 0 до 9 и
     * пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен
     * сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
     * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     * */

    public static void generateNumber(){
        while (true) {
            int guessNumber = (int)(Math.random()*10);
            Scanner in = new Scanner(System.in);
            System.out.println(guessNumber);
            for (int i = 0; i < 3; i++) {
                int userNumber = in.nextInt();


                if (userNumber == guessNumber) {
                    System.out.println("You are right");
                    break;
                }
                if (userNumber < guessNumber)
                    System.out.println("Your number is so small");
                if (userNumber > guessNumber)
                    System.out.println("Your number is so big");
                System.out.println("attempts left: " + (2 - i));
            }
            System.out.println("one more time? 1-yes 2-no");
            int choose = in.nextInt();
            if(choose == 2)
                break;
        }
    }

    public static void main(String[] args) {

        generateNumber();
    }


    }










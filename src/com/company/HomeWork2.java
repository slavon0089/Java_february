package com.company;

import java.util.Arrays;

public class HomeWork2 {

    public static void inversArray(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i]+1) % 2;
        }
    }

    public static int[][] diagonalMatrix(int n){
        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
            matrix[i][n-i-1] = 1;
        }
        return matrix;

    }

    public static void threeArray(int[] array){
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            j =j+ 3;
            array[i] = array[i]+j;

        }

    }

    public static void smallNumbers(int[] array){
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<6)
                array[i]=array[i]*2;

        }

    }

    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] array = new int[]{0,1,1,0};
        inversArray(array);
        System.out.println(Arrays.toString(array));

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int [] newArray = new int[]{0,0,0,0,0,0,0,0};
        threeArray(newArray);
        System.out.println(Arrays.toString(newArray));

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        int[] multiArray = new int []{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        smallNumbers(multiArray);
        System.out.println(Arrays.toString(multiArray));



        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] matrix = diagonalMatrix(5);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

    }





}

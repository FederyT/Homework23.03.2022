package ru.skypro;

import javax.naming.Name;
import java.io.IOException;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }

    //Задание 1=========================================================

    public static void task1() {
        int year = 2015;
        solutionForYear(year);

    }

    public static int solutionForYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }
        return year;
    }


    //  Задание 2==================================================
    public static void task2() {

        decision(2015, 1);
    }

    public static void decision(int clientDeviceYear, int clientOs) {


        if (clientDeviceYear < 2015 && clientOs == 1)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
    }

/*
    public static void task2() {
        String osName = "iOS";
        int clientOS = getClientOS(osName);

    }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
        */




    //Задание 3==================================================

    public static void task3() {

        problemSolution(11, 1);
    }
    public static void problemSolution (int deliveryDistance, int distanceOne) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:" + distanceOne);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:" + distanceOne * 2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней:" + distanceOne * 3);
        } else if (deliveryDistance >= 100) {
            System.out.println("Забирайте сами, нам невыгодно)))");
        }
    }


//Задание 4==================================================

    public static void task4() {
        String str = "aabccddefgghiijjkk";
        letsStart(new String[]{"aabccddefgghiijjkk"});

    }
    public static void  letsStart   (String[] a){
            String abc = "aabccddefgghiijjkk";
            int aff = abc.length();
            int i=0;
            while(i<aff-2){
                String tcv = abc.substring(i, i+1);
                String c = abc.substring(i+1,i+2);
                if(tcv.equals(c)){
                    System.out.println( "Дублирующиеся буквы :" + abc.substring(i,i+1));
                }
                i++;
            }
        }





    //Задание 5==================================================
    public static void task5() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        fullName(reverseFullName);
    }


        public static void fullName( char [] reverseFullName){
            for (int i = reverseFullName.length - 1; i >= 0; i--)
                System.out.print(reverseFullName[i]);
        }

    }


















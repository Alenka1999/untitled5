package com.skypro;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int clientOS = 0;
        float clientOS1 = 1.0f;
        if (clientOS == 0 || clientOS1 == 1.0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        int clientAndroid = 1;
        if (clientAndroid == 1) {
            System.out.println("Установите приложение для Android по ссылке");
        }

        // Задача 2
        int clientAndroid1 = 1;
        int clientDeviceYear = 2015;
        if (clientAndroid1 < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения Android по ссылке");
        }
        int clientOs = 0;
        int clientDeviceYear1 = 2015;
        if (clientOs < clientDeviceYear1) {
            System.out.println("Установите облегченную версию приложения iOS по ссылке");
        }

        // Задача 3
        int year = 2021;
        int OneLeapYear = 1584;
        boolean leapyear = (
                year > 1584 &&
                        (year % 4 == 0 && year % 100 != 0)
        );
        if (leapyear) {
            System.out.println("2021 год является високосным");
        } else {
            System.out.println("2021 год не является високосным");
        }

        // Задача 5
        int monthNumber = 14;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зимние месяцы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенние месяцы");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летние месяцы");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенние месяцы");
            default:
                System.out.println("Такого месяца не существует");


        }

        // Задача 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка 24 часа");
        } else {
            if (deliveryDistance >= 20 && deliveryDistance <= 60) {
                System.out.println("Доставка 24 часа + еще 1 день");
            } else {
                if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                    System.out.println("Доставка 24 часа + еще 2 дня");
                } else {
                    System.out.println("Доставка не осуществляется");
                }
            }

        }
    }
}









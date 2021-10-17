package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // task 1
        int n = 0;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        // task 2
        int numberFriday = 1;
        int daysMonth = 31;
        while (numberFriday <= 31) {
            System.out.println("Сегодня пятница - " + numberFriday + " число, пора готовить отчет");
            numberFriday = numberFriday + 7;
        }
        // task 3

        int currentYear = 2021;
        int startYear = currentYear - 200;
        int finishYear = currentYear + 100;

        for (int i = startYear; i <= finishYear; i = i + 79) {
            System.out.println(i);
        }

        //task 4

        for (int i = 1; i <= 30; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + "ping-pong");
            } else if (i % 3 == 0) {
                System.out.println(i + "ping ");
            } else if (i % 5 == 0) {
                System.out.println(i + "pong");
            } else
                System.out.println(i);

        }

        // task 5

        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber;

        System.out.print(firstNumber + " " + secondNumber + " ");

        for (int i = 0; i <= 10; i++) {
            thirdNumber = firstNumber + secondNumber;
            System.out.print(thirdNumber + " ");
            firstNumber = secondNumber;
            secondNumber = thirdNumber;


        }


    }
}

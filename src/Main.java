public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1:");
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total += 15000;
            System.out.println("Месяц " + month++ + " сумма накоплений равна " + total);
        }
    }

    public static void task2() {
        System.out.println("Задача 2:");
        int a = 1;
        int b = 10;
        while (a <= 10) {
            System.out.print(a++ + " ");
        }
        System.out.println();
        while (b >= 1) {
            System.out.print(b-- + " ");
        }
    }

    public static void task3() {
        int totalPopulation = 12_000_000;
        int totalGrowth = 17_000;
        int totalDecline = 8_000;
        int year = 2022;
        while (year <= 2032) {
            totalPopulation += totalGrowth - totalDecline;
            year++;
            System.out.println("Год " + year + " , численность населения составляет " + totalPopulation);
        }
    }

    public static void task4() {
        int total = 0;
        int deposit = 15_000;
        int month = 1;
        while (total < 12_000_000) {
            total += (total / 100) * 7;
            total += total + deposit;
            month++;
            System.out.println("Месяц " + month + " сумма " + total);
        }
    }

    public static void task5() {
        int total = 0;
        int deposit = 15_000;
        int month = 1;
        while (total < 12_000_000) {
            total += (total / 100) * 7;
            total += total + deposit;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма " + total);
            }
        }
    }

    public static void task6() {
        int total = 0;
        int deposit = 15_000;
        int month = 1;
        while (month != 108) {
            total += (total / 100) * 7;
            total += total + deposit;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма " + total);
            }
        }
    }

    public static void task7() {
        int month = 1;
        int friday = 5;
        while (month <= 31 && friday <= 31) {
            System.out.println("Сегодня пятница " + friday + "-у число. Необходимо подготовить отчет");
            month++;
            friday += 7;
        }
    }

    public static void task8() {
        int year = 2022;
        while (year < 2122){
            year++;
            if (year%79==0){
                System.out.println("Год " + year + " прилета кометы");
            }
        }
    }
}
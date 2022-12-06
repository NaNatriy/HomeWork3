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
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int money = 29000;
        int mount = 0;
        for (int i = 0; i <= 12; i++) {
            mount = mount + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + mount + " рублей».");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int money = 29000;
        int mount = 0;
        for (int i = 0; i <= 12; i++) {
            mount = mount + money / 100;
            mount = mount + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + mount + " рублей».");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        int sum;
        int a = 1;
        int b = 0;
        for (int i = 0; i <= 11; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    public static void task11() {
        System.out.println("Задача 11");
        int money = 15000;
        int total = 0;
        int mount = 0;
        int percent;
        while (total < 2459000) {
            percent = total / 100;
            total = total + money + percent;
            mount = mount + 1;
            System.out.println("Месяц " + mount + ", сумма накоплений равна " + total + " рублей.");
            System.out.println("Накоплений за весь период " + percent);
        }
    }

    public static void task12() {
        System.out.println("Задача 12");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a = a + 1;
        }
        System.out.println();
        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task13() {
        System.out.println("Задача 13");
        int population = 12_000_000;
        int spawn = 17;
        int dead = 8;
        int people;
        for (int i = 1; i <= 10; i++) {
            people = (population / 1000 * spawn) - (population / 1000 * dead);
            population = population + people;
            System.out.println("Год " + i + ", численность населения составляет " + population + ".");
        }
    }

    public static void task14() {
        System.out.println("Задача 14");
        int money = 15000;
        int total = 0;
        int month = 0;
        while (total <= 12_000_000) {
            month += 1;
            total += total / 100 * 7;
            total += money;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task15() {
        System.out.println("Задача 15");
        int money = 15000;
        int total = 0;
        int month = 0;
        while (total <= 12_000_000) {
            month++;
            total += total / 100 * 7;
            total += money;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
            }
        }
    }

    public static void task16() {
        System.out.println("Задача 16");
        int money = 15000;
        int total = 0;
        int years = 9;
        int month = 1;
        int months = years * 12;
        while (month <= months) {
            total += total / 100 * 7;
            total += money;
            if (month % 6 == 0) {
                System.out.println(month + " месяц, сумма накоплений равна " + total + " рублей.");
            }
            month++;
        }
    }

    public static void task17() {
        System.out.println("Задача 17");
        for (int i = 5; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task18() {
        System.out.println("Задача 18");
        int comet = 79;
        int year = 1896;
        while (year <= 2054) {
            System.out.println(year);
            year += comet;
        }
    }
}
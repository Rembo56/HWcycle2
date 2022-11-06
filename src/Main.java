public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Задача 8 День 2 переделанная задача

        int saveMoney1 = 15000;
        int total = 0;
        int i = 0;

        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + saveMoney1;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }


        // Задача 2


        int a = 0;
        while (a <= 9) {
            a++;
            System.out.print(" " + a);
        }

        System.out.println();

        for (int w = 10; w >= 1; w--) {
            System.out.printf(" " + w);
        }
        System.out.println();


        // Задача 3

        int y = 12_000_000;
        int bornYear = y / 1000 * 17;
        int deadYear = y / 1000 * 8;
        int incPeople = bornYear - deadYear;
        int r = 1;
        y = incPeople + y;
        System.out.println("Год " + r + " численность населения составляет " + y);

        while (r <= 9) {
            r = r + 1;
            y = incPeople + y;
            bornYear = y / 1000 * 17;
            deadYear = y / 1000 * 8;
            incPeople = bornYear - deadYear;


            System.out.println("Год " + r + " численность населения составляет " + y);

        }
        System.out.println();

        // Задача 4

        int saveBank = 15000;
        int m = 1;
        saveBank = saveBank + saveBank * 7 / 100;
        System.out.println("Месяц " + m + " сумма накоплений равна " + saveBank + " рублей");

        while (saveBank <= 12000000) {
            saveBank = saveBank + saveBank * 7 / 100;
            m = m + 1;
            System.out.println("Месяц " + m + " сумма накоплений равна " + saveBank + " рублей");
        }


        System.out.println();


        // Задача 5

        saveBank = 15000;
        m = 1;
        saveBank = saveBank + saveBank * 7 / 100;
        //System.out.println("Месяц " + m + " сумма накоплений равна " + save + " рублей");

        while (saveBank <= 12000000) {
            saveBank = saveBank + saveBank * 7 / 100;
            m = m + 1;
            if (m % 6 == 0) {
                System.out.println("Месяц " + m + " сумма накоплений равна " + saveBank + " рублей");
            }

        }

        System.out.println();


        // Задача 6

        saveBank = 15000;

        for (int p = 1; p <= 108; p++) {
            saveBank = saveBank + saveBank * 7 / 100;
            if (p % 6 == 0) {
                System.out.println("Месяц " + p + " сумма накоплений равна " + saveBank + " рублей");
            }
        }
        System.out.println();

        // Задача 7

        for (int l = 1; l <= 31; l = l + 7) {

            System.out.println("Сегодня пятницa " + l + "е число,необходимо предоставить отчёт");
        }



    //  Задача 8


    int year = 1830;

        while(year<2100){

        year++;
        if (year % 79 == 0) {
            System.out.println(year);
        }
    }


    // Задача 9

        for(int v = 1;v<=10;v++){
        System.out.println("2*" + v + "=" + 2 * v);
    }
}
}


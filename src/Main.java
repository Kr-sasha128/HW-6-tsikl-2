public class Main {
    public static void main(String[] args) {
//        int salary = 65535;
//        int total = 0;
//        int i = 0;
//        for (; total < 1_000_000; i++) {
//            total = total + total / 100;
//            total = total + salary;
//            if (i % 5 == 0) {
//                System.out.println("Месяц " + i + " Итого " + total);
//            }
//        }
//        System.out.println(total);
//            int start = 5;
//            while (start > 0) {
//                System.out.println(start);
//                start--;
//            }
//            int days = 10;
//
//            if (days == 0) {
//                System.out.println("Желаем приятной поездки!");
//            } else {
//                for (; days > 0; ) {
//                    days--;
//                    System.out.println("До конца поездки осталось " + days + " дней.");
//                }
//                System.out.println("Путешествие окончено. Пора возвращаться домой.");
//            }
//        Задача 1
        int saving = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + saving;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей ");
        }
//        Задача 2
        int q = 1;
        while (q <= 10) {
            System.out.print(q + " ");
            q++;
        }
        System.out.println();
        for (q = 10; q > 0; q--) {
            System.out.print(q + " ");
        }
        System.out.println();
//        Задача 3
        int y = 12_000_000;
        for (int t = 2024; t < 2024 + 10; t++) {
            int birthRate = y * 17 / 1000;
            int mortality = y * 8 / 1000;
            y = y + birthRate - mortality;
            System.out.println("Год " + t + " численность населения составляет " + y);
        }
        //        Задача 4 + 5
        int contribution = 15000;
        double procent = 7d / 100;
        int requiredAmount = 12_000_000;
        total = contribution;
        int month = 0;
        while (total < requiredAmount) {
            total = (int) (total * (1 + procent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Накопления за " + month + " месяц равны " + total);
            }
        }
//        Задача 6
        month = 0;
        total = contribution;
        int months = 9 * 12;
        while (month <= months) {
            total = (int) (total * (1 + procent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Накопления за " + month + " месяц равны " + total);
            }
        }
//        Задача 7
        int number = 3;
        while (number <= 31) {
            System.out.println("Сегодня пятница " + number + "-е число. Необходимо подготовить отчет.");
            number += 7;
        }
//        Задача 8
        int currentYear = 2024;
        int periodicity = 79;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int yare = 0; yare < endYear; yare += periodicity) {
            if (yare > startYear) {
                System.out.println(yare);
            }
        }
    }
}
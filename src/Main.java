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
        int start = 5;
        do {System.out.println (start);
            start = start - 1;
        }
        while (start > 0);
    }
}
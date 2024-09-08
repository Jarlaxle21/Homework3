public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        task1();
        System.out.println("Task 2:");
        task2();
        System.out.println("Task 3:");
        task3();
        System.out.println("Task 4:");
        task4();
        System.out.println("Task 5:");
        task5();
        System.out.println("Task 6:");
        task6();
        System.out.println("Task 7:");
        task7();
        System.out.println("Task 8:");
        task8();
    }

    public static void task1() {
        int alpha = 4576;
        byte beta = 23;
        short gamma = 243;
        long delta = 23592L;
        float epsilon = 22.3f;
        double dzeta = 6912.4;

        System.out.println("Значение переменной: 'alpha' с типом int равно: " + alpha);
        System.out.println("Значение переменной: 'beta' с типом byte равно: " + beta);
        System.out.println("Значение переменной: 'gamma' с типом short равно: " + gamma);
        System.out.println("Значение переменной: 'delta' с типом long равно: " + delta);
        System.out.println("Значение переменной: 'epsilon' с типом float равно: " + epsilon);
        System.out.println("Значение переменной: 'dzeta' с типом double равно: " + dzeta);
    }

    public static void task2() {
        int alpha = 569;
        int alphaTwo = 27897;
        byte beta = 67;
        short gamma = -159;
        long delta = 987678965549L;
        float epsilon = 27.12f;
        double dzeta = 2.786;

        System.out.println("Значение переменной: 'alpha' с типом int равно: " + alpha);
        System.out.println("Значение переменной: 'alphaTwo' с типом int равно: " + alphaTwo);
        System.out.println("Значение переменной: 'beta' с типом byte равно: " + beta);
        System.out.println("Значение переменной: 'gamma' с типом short равно: " + gamma);
        System.out.println("Значение переменной: 'delta' с типом long равно: " + delta);
        System.out.println("Значение переменной: 'epsilon' с типом float равно: " + epsilon);
        System.out.println("Значение переменной: 'dzeta' с типом double равно: " + dzeta);
    }

    public static void task3() {
        int classOne = 23;
        int classTwo = 27;
        int classThree = 30;
        int totalPaper = 480;
        int paperForOnePupil = totalPaper / (classOne + classThree + classTwo);
        System.out.println("На каждого ученика расчитано " + paperForOnePupil + " литов бумаги");
    }

    public static void task4() {
        int perMinute = 16 / 2;
        int perTwentyMinutes = perMinute * 20;
        int perDay = perTwentyMinutes * 3 * 24;
        int perThreeDays = perDay * 3;
        int perMonth = perThreeDays * 10;
        System.out.println("За 20 минут машина произвела " + perTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + perDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + perThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + perMonth + " штук бутылок");
    }

    public static void task5() {
        int paintWhiteForOneClass = 2;
        int paintBrownForOneClass = 4;
        int totalPaintForOneSchool = 120;
        int numberClasses = totalPaintForOneSchool / (paintBrownForOneClass + paintWhiteForOneClass);
        int totalPaintWhite = numberClasses * paintWhiteForOneClass;
        int totalPaintBrown = numberClasses * paintBrownForOneClass;
        System.out.println("В школе, где "
                + numberClasses + " классов, нужно "
                + totalPaintWhite + " банок белой краски и "
                + totalPaintBrown + " банок коричневой краски.");
    }

    public static void task6() {
        int oneBananaGR = 80;
        int numberBananas = 5;
        int bananasGr = oneBananaGR * numberBananas;

        int milkOneMlToGr = 105 / 100;
        int milkSize = 200;
        int milkGr = milkSize * milkOneMlToGr;

        int numberIceCream = 2;
        int oneIceCreamGr = 100;
        int iceCreamGr = numberIceCream * oneIceCreamGr;

        int numberEggs = 4;
        int oneEggGr = 70;
        int eggGr = numberEggs * oneEggGr;

        double oneKgInGr = 0.001;
        int totalInGr = bananasGr + milkGr + iceCreamGr + eggGr;
        double totalInKg = totalInGr * oneKgInGr;

        System.out.println("Общий вес в граммах: " + totalInGr);
        System.out.println("Общий вес в килограммах: " + totalInKg);
    }

    public static void task7() {
        int minWeightLossPerDay = 250;
        int maxWeightLossPerDay = 500;
        double oneKgInGr = 0.001;
        int weightLossGoalInKg = 7;
        double weightLossGoalInGr = weightLossGoalInKg / oneKgInGr;

        int minDays = (int) weightLossGoalInGr / minWeightLossPerDay;
        int maxDays = (int) weightLossGoalInGr / maxWeightLossPerDay;
        ;
        double avgDays = (minDays + maxDays) / 2;
        System.out.println("Минимальное количество дней на похудение: " + minDays);
        System.out.println("Максимальное количество дней на похудение: " + maxDays);
        System.out.println("Среднее количество дней на похудение: " + avgDays);
    }

    public static void task8() {
        int mashasSalary = 67760;
        int denisesSalary = 83690;
        int christinasSalary = 76230;
        int supplementSalaryPercent = 10;
        double supplementSalaryMasha = (double) mashasSalary / supplementSalaryPercent;
        double supplementSalaryDenis = (double) denisesSalary / supplementSalaryPercent;
        double supplementSalaryChristina = (double) christinasSalary / supplementSalaryPercent;
        double newMashasSalary = mashasSalary + supplementSalaryMasha;
        double newDenisesSalary = denisesSalary + supplementSalaryDenis;
        double newChristinasSalary = christinasSalary + supplementSalaryChristina;
        System.out.println("Маша теперь получает "
                + newMashasSalary + " рублей. Годовой доход вырос на "
                + supplementSalaryMasha + " рублей");
        System.out.println("Денис теперь получает "
                + newDenisesSalary + " рублей. Годовой доход вырос на "
                + supplementSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает "
                + newChristinasSalary + " рублей. Годовой доход вырос на "
                + supplementSalaryChristina + " рублей");
    }
}
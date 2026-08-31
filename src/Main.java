
public class Main {
    public static void main(String[] args) {


        // ЗАДАЧА 1: Переменные базовых типов

        System.out.println("--- ЗАДАЧА 1 ---");
        int integerNumber = 40000;
        byte byteValue = 22;
        short shortNumber = 1500;
        long bigLong = 1234567890L;
        float floatValue = 3.75f;
        double doubleValue = 99.99;

        System.out.println("Значение переменной integerNumber с типом int равно " + integerNumber);
        System.out.println("Значение переменной byteValue с типом byte равно " + byteValue);
        System.out.println("Значение переменной shortNumber с типом short равно " + shortNumber);
        System.out.println("Значение переменной bigLong с типом long равно " + bigLong);
        System.out.println("Значение переменной floatValue с типом float равно " + floatValue);
        System.out.println("Значение переменной doubleValue с типом double равно " + doubleValue);
        System.out.println();


        // ЗАДАЧА 2: Подбор типов данных

        System.out.println("--- ЗАДАЧА 2 ---");
        float value1 = 27.12f;
        long value2 = 987678965549L;
        double value3 = 2.786;
        short value4 = 569;
        short value5 = -159;
        int value6 = 27897;
        byte value7 = 67;

        System.out.println("Переменные задачи 2 успешно инициализированы.");
        System.out.println();



        // ЗАДАЧА 3: Подсчет листов бумаги

        System.out.println("--- ЗАДАЧА 3 ---");
        int lyudmilaStudents = 23;
        int annaStudents = 27;
        int ekaterinaStudents = 30;
        int totalSheets = 480;

        int totalStudents = lyudmilaStudents + annaStudents + ekaterinaStudents;
        int sheetsPerStudent = totalSheets / totalStudents;

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги.");
        System.out.println();



        // ЗАДАЧА 4: Производительность машины бутылок

        System.out.println("--- ЗАДАЧА 4 ---");
        int bottlesInTwoMinutes = 16;
        int bottlesPerMinute = bottlesInTwoMinutes / 2;

        int minutesIn20Minutes = 20;
        int minutesInDay = 24 * 60;
        int minutesIn3Days = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;

        int bottlesIn20Min = bottlesPerMinute * minutesIn20Minutes;
        int bottlesInDay = bottlesPerMinute * minutesInDay;
        int bottlesIn3Days = bottlesPerMinute * minutesIn3Days;
        int bottlesInMonth = bottlesPerMinute * minutesInMonth;

        System.out.println("За 20 минут машина произвела " + bottlesIn20Min + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок.");
        System.out.println();



        // ЗАДАЧА 5: Расход краски на ремонт

        System.out.println("--- ЗАДАЧА 5 ---");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int totalCansPerClass = whiteCansPerClass + brownCansPerClass;
        int totalClasses = totalCans / totalCansPerClass;

        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans +
                " банок белой краски и " + totalBrownCans + " банок коричневой краски.");
        System.out.println();



        // ЗАДАЧА 6: Подсчет веса спортзавтрака

        System.out.println("--- ЗАДАЧА 6 ---");
        int bananasWeight = 5 * 80;
        int milkWeight = (200 / 100) * 105;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;

        int totalWeightInGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double totalWeightInKg = totalWeightInGrams / 1000.0;

        System.out.println("Общий вес спортзавтрака в граммах: " + totalWeightInGrams + " г.");
        System.out.println("Общий вес спортзавтрака в килограммах: " + totalWeightInKg + " кг.");
        System.out.println();



        // ЗАДАЧА 7: Дни для похудения спортсмена

        System.out.println("--- ЗАДАЧА 7 ---");
        int weightToLoseKg = 7;
        int weightToLoseGrams = weightToLoseKg * 1000;

        int minLossPerDay = 250;
        int maxLossPerDay = 500;

        int daysAtMinLoss = weightToLoseGrams / minLossPerDay;
        int daysAtMaxLoss = weightToLoseGrams / maxLossPerDay;
        int averageDays = (daysAtMinLoss + daysAtMaxLoss) / 2;

        System.out.println("Если спортсмен будет терять по 250 грамм в день, уйдет: " + daysAtMinLoss + " дней.");
        System.out.println("Если спортсмен будет терять по 500 грамм в день, уйдет: " + daysAtMaxLoss + " дней.");
        System.out.println("В среднем на похудение может потребоваться: " + averageDays + " день.");
        System.out.println();


        // ЗАДАЧА 8: Повышение зарплаты на 10%

        System.out.println("--- ЗАДАЧА 8 ---");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int mashaNewSalary = mashaSalary + (mashaSalary / 10);
        int denisNewSalary = denisSalary + (denisSalary / 10);
        int kristinaNewSalary = kristinaSalary + (kristinaSalary / 10);

        int mashaAnnualIncrease = (mashaNewSalary - mashaSalary) * 12;
        int denisAnnualIncrease = (denisNewSalary - denisSalary) * 12;
        int kristinaAnnualIncrease = (kristinaNewSalary - kristinaSalary) * 12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaAnnualIncrease + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualIncrease + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaAnnualIncrease + " рублей.");
    }
}

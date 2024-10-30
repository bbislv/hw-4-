public class Main {
    public static void main(String[] args) {
        int myInt = 11;
        byte myByte = 1;
        short myShort = 20;
        long myLong = 5784905;
        float myFloat = 1.7f;
        double myDouble = 3.5;
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной mybyte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        int f = 27897;
        byte g = 67;

        var studentOfClass1 = 23;
        var studentOfClass2 = 27;
        var studentOfClass3 = 30;
        var totalSheets = 480;
        var totalStudents = studentOfClass1 + studentOfClass2 + studentOfClass3;
        System.out.println(totalStudents);
        var sheetsPerStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика расчитано " + sheetsPerStudent + " листов бумаги");

        var bottlesPerMinute = 8;
        var minutesInDay = 1440;
        var minutesIn3Day = minutesInDay * 3;
        var minutesIn30Day = minutesInDay *30;
        var bottlesIn20Minutes = bottlesPerMinute * 20;
        var bottlesInDay = bottlesPerMinute * 1440;
        var bottlesIn3Days = minutesIn3Day * bottlesPerMinute;
        var bottlesIn30Day = minutesIn30Day * bottlesPerMinute;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок" );
        System.out.println("За 1 день машина произвела " + bottlesInDay + " штук бутылок" );
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок" );
        System.out.println("За 30 дней машина произвела " + bottlesIn30Day + " штук бутылок" );

        var totalCans = 120;
        var whiteCansPerClass = 2;
        var brownCansPerClass = 4;
        var totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        var totalWhiteCans = totalClasses * whiteCansPerClass;
        var totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        var bananaCount = 5;
        var bananaWeightGramm = 80;
        var milkVolume = 200;
        var iceCreamGramm = 2 * 100;
        var eggCount = 4;
        var eggWeightGramm = 70;
        var totalWeight = (bananaCount * bananaWeightGramm) + (milkVolume * 105 / 100) + iceCreamGramm + (eggCount * eggWeightGramm);
        var totalWeightKg =  totalWeight / 1000.0;
        System.out.println("Общий вес завтрака: " + totalWeight + " грамм или " + totalWeightKg + " киллограм");

        var weightLossGoalKg = 7;
        var dailyWeightLossLowKg = 0.25;
        var dailyWeightLossHighKg = 0.5;
        var daysLow = (weightLossGoalKg / dailyWeightLossLowKg);
        var daysHigh = (weightLossGoalKg / dailyWeightLossHighKg);
        var daysAverage = (daysLow + daysHigh) / 2;
        System.out.println("Для походения на " + weightLossGoalKg + " кг при потери веса " + dailyWeightLossLowKg + " кг в день нужно " + daysLow + " дней");
        System.out.println("Для походения на " + weightLossGoalKg + " кг при потери веса " + dailyWeightLossHighKg + " кг в день нужно " + daysHigh + " дней");
        System.out.println("В среднем потребуется " + daysAverage + " дней для похудения " + weightLossGoalKg + " кг");

        var mashaSalary = 67760;
        var denisSalary = 83690;
        var kristanaSalary = 76230;
        var mashaNewSalary = (mashaSalary * 1.1);
        var denisNewSalary = (denisSalary * 1.1);
        var kristanaNewSalary = (kristanaSalary * 1.1);
        var mashaAnnualIncomeBefore = mashaSalary * 12;
        var denisAnnualIncomeBefore = denisSalary * 12;
        var kristinaAnnualIncomeBefore = kristanaSalary * 12;
        var mashaAnnualIncomeAfter = mashaNewSalary * 12;
        var denisAnnualIncomeAfter = denisNewSalary * 12;
        var kristinaAnnualIncomeAfter = kristanaNewSalary * 12;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + (mashaAnnualIncomeAfter - mashaAnnualIncomeBefore) + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + (denisAnnualIncomeAfter - denisAnnualIncomeBefore) + " рублей");
        System.out.println("Кристина теперь получает " + kristanaNewSalary + " рублей. Годовой доход вырос на " + (kristinaAnnualIncomeAfter - kristinaAnnualIncomeBefore) + " рублей");

    }
}
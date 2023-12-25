
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1");
        byte hanSolo = 127;
        System.out.println("Значение переменной Han Solo с типом byte равно " + hanSolo);
        short lukeSkywalker = 32676;
        System.out.println("Значение переменной Luke Skywalker с типом short равно " + lukeSkywalker);
        int chewbacca = 2147483647;
        System.out.println("Значение переменной Chewbacca с типом int равно " + chewbacca);
        long darthVader = 922337203685477999L;
        System.out.println("Значение переменной Darth Vader с типом long равно " + darthVader);
        float obiWanKenobi = 0.1234567f;
        System.out.println("Значение переменной Obi-Wan Kenobi с типом float равно " + obiWanKenobi);
        double yoda = 0.12345678911234567d;
        System.out.println("Значение переменной Yoda с типом double равно " + yoda);

        System.out.println(" Задача 2");
        float obiWanKenobi1 = 27.12f;
        System.out.println("Значение переменной Obi-Wan Kenobi с типом float равно " + obiWanKenobi1);
        long darthVader1 = 987678965549L;
        System.out.println("Значение переменной Darth Vader с типом long равно " + darthVader1);
        float yoda1 = 2.786f;
        System.out.println("Значение переменной Yoda с типом float равно " + yoda1);
        short lukeSkywalker1 = 569;
        System.out.println("Значение переменной Luke Skywalker с типом short равно " + lukeSkywalker1);
        short chewbacca1 = -159;
        System.out.println("Значение переменной Chewbacca с типом short равно " + chewbacca1);
        int bobaFett1 = 27897;
        System.out.println("Значение переменной Boba Fett с типом int равно " + bobaFett1);
        byte hanSolo1 = 67;
        System.out.println("Значение переменной Han Solo с типом byte равно " + hanSolo1);

        System.out.println(" Задача 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper = 480;
        byte papersPerStudent = (byte) (paper / (lp + as + ea));
        System.out.println("На каждого ученика расчитано " + papersPerStudent + " листов бумаги");

        System.out.println(" Задача 4");
        byte bottlesPerTwoMinute = 16;
        byte bottlesPerOneMinute = (byte) (bottlesPerTwoMinute / 2);
        short bottlesPerTwentyMinute = (short) (bottlesPerOneMinute * 20);
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinute + " бутылок");
        short bottlesPerDay = (short) (bottlesPerOneMinute * 1440);
        System.out.println("За сутки машина произвела " + bottlesPerDay + " бутылок");
        int bottlesPerThreeDay = (int) (bottlesPerDay * 3);
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDay + " бутылок");
        int bottlesPerMonth = (int) (bottlesPerDay * 30);
        System.out.println("За 30 дней машина произвела " + bottlesPerMonth + " бутылок");

        System.out.println(" Задача 5");
        byte totalCansOfPaint = 120;
        byte whiteCansOfPaintPerOneClass = 2;
        byte brownCansOfPaintPerOneClass = 4;
        byte allClass = (byte) (totalCansOfPaint / (whiteCansOfPaintPerOneClass + brownCansOfPaintPerOneClass));
        byte whiteCans = (byte) (allClass * whiteCansOfPaintPerOneClass);
        byte brownCans = (byte) (allClass * brownCansOfPaintPerOneClass);
        System.out.println("В школе, где " + allClass + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");

        System.out.println(" Задача 6");
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        short milkShakeG = (short) ((banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4));
        float milkShakeKg = milkShakeG / (float)1000;
        System.out.println("Вес спортивного завтра составил " + milkShakeG + " грамм или " + milkShakeKg + " килограмм");

        System.out.println(" Задача 7");
        short needTotalLoseWeight = 7000;
        short minLoseWeight = 250;
        short maxLoseWeight = 500;
        byte daysSpent250 = (byte) (needTotalLoseWeight / minLoseWeight);
        byte daysSpent500 = (byte) (needTotalLoseWeight / maxLoseWeight);
        byte avgDaysSpent = (byte) ((daysSpent250 + daysSpent500) / 2);
        System.out.println("Если спортсмен будет терять 250гр в день, то у него уйдет " + daysSpent250 + " дней на достижение желаемого результата, если 500гр в день, то уйдет " + daysSpent500 + " дней. В среднем уйдет " + avgDaysSpent + " день для достижения желаемого результата");

        System.out.println(" Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float masha10 = masha * (float)1.1;
        float denis10 = denis * (float)1.1;
        float kristina10 = kristina * (float)1.1;
        int mashaEar = (int) (masha * 12);
        int denisEar = (int) (denis * 12);
        int kristinaEar = (int) (kristina * 12);
        int mashaEar10 = (int) (masha10 * 12);
        int denisEar10 = (int) (denis10 * 12);
        int kristinaEar10 = (int) (kristina10 * 12);
        int differenceMasha = (int) (mashaEar10 - mashaEar);
        int differenceDenis = (int) (denisEar10 - denisEar);
        int differenceKristina = (int) (kristinaEar10 - kristinaEar);
        System.out.println("Зарплата Маши увеличилась до " + masha10 + " рублей в месяц. За год Маша стала зарабатывать " + mashaEar10 + " рублей, вместо " + mashaEar + " рублей как в старом году. Разница в годовой зп составила " + differenceMasha + " рублей");
        System.out.println("Зарплата Дениса увеличилась до " + denis10 + " рублей в месяц. За год Денис стал зарабатывать " + denisEar10 + " рублей, вместо " + denisEar + " рублей как в старом году. Разница в годовой зп составила " + differenceDenis + " рублей");
        System.out.println("Зарплата Кристины увеличилась до " + kristina10 + " рублей в месяц. За год Кристина стала зарабатывать " + kristinaEar10 + " рублей, вместо " + kristinaEar + " рублей как в старом году. Разница в годовой зп составила " + differenceKristina + " рублей");

    }
}
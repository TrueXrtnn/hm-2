public class Main {
    public static void main (String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        System.out.println("Задача 1");
        int dog=8;
        byte cat=3;
        short paper=7637;
        long car=1203120982348l;
        float pen= 2.654F;
        double pencle=5.1239123;
        System.out.println("Значение переменной dog с типом int равно " + dog);
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        System.out.println("Значение переменной paper с типом short равно " + paper);
        System.out.println("Значение переменной car с типом long равно " + car);
        System.out.println("Значение переменной pen с типом float равно " + pen);
        System.out.println("Значение переменной pencle с типом double равно " + pencle);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float dog = 27.12f;
        long cat=987678965549l;
        float paper = 2.786f;
        short car = 569;
        short pen = -159;
        int chair = 27897;
        byte table = 67;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(car);
        System.out.println(pen);
        System.out.println(chair);
        System.out.println(table);
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte LudmilaStudents = 23;
        byte AnnaStudents = 27;
        byte EkaterinaStudents = 30;
        short PaperForStudents = 480;
        int PaperForOneStudents;
        PaperForOneStudents = PaperForStudents/(LudmilaStudents+EkaterinaStudents+AnnaStudents);
System.out.println("На каждого ученика расчитано "+PaperForOneStudents+" листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int bottles = 16;
        System.out.println("За 2 минуты машина произвела "+bottles+" штук бутылок");
        bottles = bottles*10;
        System.out.println("За 20 минуты машина произвела "+bottles+" штук бутылок");
        bottles= bottles * 3 * 24;
        System.out.println("За сутки машина произвела "+bottles+" штук бутылок");
        bottles= bottles*3;
        System.out.println("За 3 дня машина произвела "+bottles+" штук бутылок");
        bottles=bottles*10;
        System.out.println("За месяц машина произвела "+bottles+" штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte CansOfPaint = 120;
        byte CansForClassroom=2+4;
        int NumberForClasses = CansOfPaint/CansForClassroom;
        int WhiteCans=2*NumberForClasses;
        int BrownCans=4*NumberForClasses;
        System.out.println("В школе, где "+NumberForClasses+ " классов нужно "+WhiteCans+" банок белой краски и "+BrownCans+" банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6");
        short BananaWeight = 5*80;
        short MilkWeight = 2*105;
        short IceCreamWeight = 2*100;
        short EggWeight = 4*70;
        int SmoothiesWeightOfGram = BananaWeight+MilkWeight+IceCreamWeight+EggWeight;
        float SmoothiesWeightOfKilogram = SmoothiesWeightOfGram/1000f;
        System.out.println("Масса коктеля в граммах " + SmoothiesWeightOfGram + " и в килограммах "+ SmoothiesWeightOfKilogram);
    }
    public static void task7() {
        System.out.println("Задача 7");
        short TotalWeight = 7 * 1000;
        short MinWeightDay = 250;
        short MaxWeightDay = 500;
        int MaxAmountOfDay = TotalWeight/MinWeightDay;
        int MinAmountOfDay = TotalWeight/MaxWeightDay;
        int AverageNumberOfDay = (MaxAmountOfDay+MinAmountOfDay)/2;
        System.out.println("Минимальное количество дней для сброса 7 кг  " + MinAmountOfDay + ", Максимально количество дней для сброса 7 кг "+ MaxAmountOfDay+", среднее количство дней для сброса 7 кг "+ AverageNumberOfDay);
    }
    public static void task8() {
        System.out.println("Задача 8");
        int MashaLowSalaryMount = 67760;
        var MashaBigSalaryMount = MashaLowSalaryMount*1.1f;
        float MashaBigSalaryYear = MashaBigSalaryMount*12;
        int MashaLowSalaryYear = MashaLowSalaryMount*12;
        float DifferenceMasha = MashaBigSalaryYear-MashaLowSalaryYear;
        System.out.println("Маша теперь получает "+MashaBigSalaryMount+" рублей. Годовой доход вырос на  "+ DifferenceMasha+" рублей");
        int DenisLowSalaryMount = 83690;
        var DenisBigSalaryMount = DenisLowSalaryMount*1.1f;
        float DenisBigSalaryYear = DenisBigSalaryMount*12;
        int DenisLowSalaryYear = DenisLowSalaryMount*12;
        float DifferenceDenis = DenisBigSalaryYear-DenisLowSalaryYear;
        System.out.println("Денис теперь получает "+DenisBigSalaryMount+" рублей. Годовой доход вырос на  "+ DifferenceDenis+" рублей");
        int KristinaLowSalaryMount = 76230;
        var KristinaBigSalaryMount = KristinaLowSalaryMount*1.1f;
        float KristinaBigSalaryYear = KristinaBigSalaryMount*12;
        int KristinaLowSalaryYear = KristinaLowSalaryMount*12;
        float DifferenceKristina = KristinaBigSalaryYear-KristinaLowSalaryYear;
        System.out.println("Маша теперь получает "+KristinaBigSalaryMount+" рублей. Годовой доход вырос на  "+ DifferenceKristina+" рублей");

    }
}
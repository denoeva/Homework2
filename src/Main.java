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
    public static void task1 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2 () {
        var dog = 8.0;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat +4;
        var paper = 763789;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        var dog = 8.0;
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println("Общий вес боксеров: " + (firstBoxerWeight + secondBoxerWeight) + " кг");
        System.out.println("Разница в весе: " + (firstBoxerWeight - secondBoxerWeight) + " кг");
    }
    public static void task7 () {
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println("Разница в весе (вычитание из большего веса меньшего): " + (secondBoxerWeight - firstBoxerWeight) + " кг");
        System.out.println("Разница в весе (остаток от деления): " + (secondBoxerWeight % firstBoxerWeight) + " кг");
    }
    public static void task8 () {
        var workingHours = 640;
        var workingHoursPerEmployee = 8;
        var countEmployee = workingHours / workingHoursPerEmployee;
        System.out.println("Всего работников в компании: " + countEmployee);
        var deltaCountEmployee = countEmployee + 94;
        var deltaWorkingHours = deltaCountEmployee * 8;
        System.out.println("Если в компании работает " + deltaCountEmployee + " человека, то всего " + deltaWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}

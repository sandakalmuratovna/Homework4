public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(){
        System.out.println("Task1");
        int age = 12;
        if (age>=18){
            System.out.println("Вы совершеннолетний.");
        }
        else{
            System.out.println("Вы не достигли совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2(){
        System.out.println("Task2");
        int temperature = 3;
        if (temperature<=5){
            System.out.println("На улице "+temperature+" градусов,нужно надеть шапку.");
        }
        else {
            System.out.println("На улице "+temperature+" градусов,можно идти без шапки.");
        }
    }
    
    public static void task3(){
        System.out.println("Task3");
        int score = 60;
        if (score<=60){
            System.out.println("Если скорость "+score+" то можно ездить спокойно.");
        }
        else{
            System.out.println("Если скорость "+score+" то придется заплатить штраф.");
        }
    }
    
    public static void task4(){
        System.out.println("Task4");
        int age = 3;
        if(age<=6 && age>=2) {
            System.out.println("Если возраст человека равен "+age+" то ему нужно ходить в детский сад");
        }
        else if(age>=7 && age<=18){
            System.out.println("Если возраст человека равен "+age+" то ему нужно ходить в школу");
        }
        else if(age>=18 && age<=24){
            System.out.println("Если возраст человека равен "+age+" то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен "+age+" то ему нужно ходить на работу");
        }

    }
    
    public static void task5(){
        System.out.println("Task5");
        boolean adult = true;
        int age = 5;
        if(age<5){
            System.out.println("Если возраст ребенка равен "+age+", то ему нельзя кататься на аттракционе.");
        } else if(age<14){
            if(adult){
                System.out.println("Если возраст ребенка равен "+age+", то ему  можно кататься на аттракционе в сопровождении взрослого");
            }else {
                System.out.println("Если взрослого нет, то кататься нельзя.");
            }
        }
        else {
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

    }
    
    public static void task6(){
        System.out.println("Task7");
        int place = 54;
        if(place<60){
            System.out.println("There are " +(60-place) +" sitting places and "+(102-60)+" stand-up places");
        }else if (place<103){
            System.out.println("There are only "+(102-place)+" stand-up places");
        }else{
            System.out.println("There are no places");
        }
    }
    
    public static void task7(){
        System.out.println("Task7");
        int one = 5;
        int two = 4;
        int three = 33;
        if(one>two){
            if(one>three){
                System.out.println(one);
            }else{
                System.out.println(three);
            }
        }else{
            System.out.println(two);
        }
    }

}
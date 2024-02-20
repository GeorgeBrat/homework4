public class Main {
    public static void main(String[] args) {
        //Task 1
        int age = 18;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Task 2
        int temp = 5;
        System.out.print("На улице " + temp + " градусов, ");
        if (temp >= 5) {
            System.out.println("сегодня тепло, можно идти без шапки.");
        } if (temp < 5) {
            System.out.println("на улице холодно, нужно надеть шапку.");
        }
        //Task 3
        int speed = 50;
        System.out.print("Если скорость " + speed + ", то ");
        if (speed > 60) {
            System.out.println("придется заплатить штраф.");
        }if (speed < 60){
                System.out.println("можно ездить спокойно.");
            }
        //Task 4
        int years = 24;
        System.out.print("Если возраст человека равен " + years + ", то ");
        if (2 <= years && years <= 6){
            System.out.println("ему нужно ходить в детский сад.");
        }
        if (7 <= years && years <= 17){
            System.out.println("ему нужно ходить в школу.");
        }
        if (years >= 18 && years <= 24){
            System.out.println("его место в университете.");
        }
        if (years > 24){
            System.out.println("ему пора ходить на работу.");
        }
        //Task 5
        int yearsOld = 14;
        System.out.print("Если возраст ребенка равен " + yearsOld + ", то ");
        if (yearsOld < 5){
            System.out.println("он не может кататься на аттракционе.");
        }
        if (yearsOld >= 5 && yearsOld < 14){
            System.out.println("можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (yearsOld >= 14){
            System.out.println("можно кататься на аттракционе без сопровождения взрослого.");
        }
        //Task 6
        int person = 103;
        if (person <= 60){
            System.out.println("Есть места в вагоне, сидячее.");
        }
        if (person >= 60 && person <= 102){
            System.out.println("Есть места в вагоне, стоячее.");
        } else {
            System.out.println("Мест нет, вагон уже полностью забит.");
        }
        //Task 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println(one + " большее из трех чисел.");
        }
        if (two > one && two > three){
            System.out.println(two + " большее из трех чисел.");
        }
        if (three > one && three > two){
            System.out.println(three + " большее из трех чисел.");
        }
        }
    }

package home.work_4;

public class task5 {
    public static void main(String[] args) {
        int age = 7;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе.");
        }
        if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого.");
        }
    }
}

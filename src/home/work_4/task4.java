package home.work_4;

public class task4 {
    public static void main(String[] args) {
        int age = 18;
        if (age > 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age > 7 && age < 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
    }
}

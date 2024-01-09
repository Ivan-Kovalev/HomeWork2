package home.work_4;

public class task7 {
    public static void main(String[] args) {
        int a = 44;
        int b = 33;
        int c = 22;

        if (a > b || c > b) {
            if (a > c) {
                System.out.println("Максимальное число " + a);
            }
            if (c > a) {
                System.out.println("Максимальное число " + c);
            }
        } else {
            System.out.println("Максимальное число " + b);
        }
    }
}

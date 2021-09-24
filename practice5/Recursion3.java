package practice5;

import java.util.Scanner;

public class Recursion3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void recursion(int a, int b) {

        if (a > b) {
            while (b < a) {
                System.out.println(b);
                b++;
            }
        }
        if (b > a) {
            while (a < b) {
                System.out.println(a);
                a++;
            }
        }
        if (a == b) {
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        recursion(a,b);
    }
}

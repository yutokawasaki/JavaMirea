package practice5;

import java.util.Scanner;

public class Recursion1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите k: ");
        int n = scanner.nextInt();

        String last = "";

        for (int i = 1; i <= n; i++) {
            if (i == 1)
                last = String.format("%d", i);
            else
                last = last.replaceAll(String.format("%d", i - 1), String.format("%d", i)) + i;

            System.out.print(last);
        }
    }
}
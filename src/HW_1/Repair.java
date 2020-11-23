package HW_1;

import java.util.Scanner;

public class Repair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a * b) * 2 * n);
    }
}

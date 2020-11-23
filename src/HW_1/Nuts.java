package HW_1;

import java.util.Scanner;

public class Nuts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if(n*m >= k){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}

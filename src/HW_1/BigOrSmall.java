package HW_1;

import java.util.Scanner;

public class BigOrSmall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x < y){
            System.out.println("<");
        }else if (x > y){
            System.out.println(">");
        }else System.out.println("=");
    }
}

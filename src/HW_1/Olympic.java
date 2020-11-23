package HW_1;

import java.util.*;

public class Olympic {
    public static void main(String[] args) {
        int five = 0;
        int three = 0;
        int one = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> time = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            time.add(i, scanner.nextInt());
        }
        for (int i = 0; i < n; i++){
            if (five <= 300){
                five = five + time.get(i);
            }else break;
        }
        for (int i = n - 1; i >= 0; i--){
            if(three <= 300){
                three = three + time.get(i);
            }else break;
        }
        Collections.sort(time);
        for (int i = 0; i < n; i++){
            if (one <= 300){
                one = one + time.get(i);
            }else break;
        }
        if(one <= five && one <= three){
            System.out.println(1);
        }else if (three <= five){
            System.out.println(3);
        }else System.out.println(5);
    }
}

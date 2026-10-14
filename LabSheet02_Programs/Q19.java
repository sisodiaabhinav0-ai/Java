import java.util.Scanner;

// Q19. Armstrong numbers between 1 and 1000 using for loop
public class Q19 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            int temp = i;
            int digits = 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            temp = i;
            int sum = 0;
            while (temp > 0) {
                int d = temp % 10;
                int power = 1;
                for (int j = 0; j < digits; j++) power *= d;
                sum += power;
                temp /= 10;
            }
            if (sum == i) System.out.print(i + " ");
        }
        System.out.println();
    }
}

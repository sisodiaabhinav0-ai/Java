import java.util.Scanner;

// Q16. Tax calculation using income slabs
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual salary: ");
        double salary = sc.nextDouble();
        double tax;
        if (salary <= 250000)
            tax = 0;
        else if (salary <= 500000)
            tax = salary * 5 / 100;
        else if (salary <= 1000000)
            tax = salary * 20 / 100;
        else
            tax = salary * 30 / 100;
        System.out.printf("Tax payable = %.2f%n", tax);
        System.out.printf("Salary after tax = %.2f%n", salary - tax);

        sc.close();
    }
}

import java.util.Scanner;

// Q27. Profit or loss and by how much
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter selling price: ");
        double sp = sc.nextDouble();
        if (sp > cp)
            System.out.println("Profit of " + (sp - cp));
        else if (sp < cp)
            System.out.println("Loss of " + (cp - sp));
        else
            System.out.println("No profit, no loss");

        sc.close();
    }
}

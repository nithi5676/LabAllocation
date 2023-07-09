package labAllocation;

import java.util.Scanner;

public class LabAllocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int n = scanner.nextInt();
        while (true) {
            n += 1;
            if (n == x) {
                System.out.println("l1");
                break;
            }
            if (n == y) {
                System.out.println("l2");
                break;
            }
            if (n == z) {
                System.out.println("l3");
                break;
            }
        }
        scanner.close();
    }
}

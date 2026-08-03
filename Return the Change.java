import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int x = sc.nextInt();
                int roundedCost = ((x + 5) / 10) * 10;
                int change = 100 - roundedCost;
                System.out.println(change);
            }
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (isPrime(a + b)) {
                    System.out.println("Alice");
                } else {
                    System.out.println("Bob");
                }
            }
        }
        sc.close();
    }
}

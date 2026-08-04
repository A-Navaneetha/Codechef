import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                
                int countAlongSide = n / k;
                int totalSquares = countAlongSide * countAlongSide;
                
                System.out.println(totalSquares);
            }
        }
        sc.close();
    }
}

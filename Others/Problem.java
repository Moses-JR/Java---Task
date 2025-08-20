import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (n<2||n>20) {
            System.out.println("Invalid Input");
            return;
        }
        for (int i=1;i<=n;i++) {
            int mul=(i%2==1)?3:4;
            for (int j=1; j<=i; j++) {
                System.out.print((j * mul) + " ");
            }
            System.out.println();
        }
    }
}

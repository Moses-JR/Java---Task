import java.util.Scanner;
import java.util.ArrayList;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int r = sc.nextInt();
        if (r <= 0) {
            System.err.println("Invalid Input");
            return;
        }
        for (int i= 0;i <r;i++) {
            int val=sc.nextInt();
            if (list.contains(val)) {
                System.out.println("Invalid Input");
                return;
            }
            list.add(val);
        }
        for(int val:list){
            if (val>n||val<=0) {
                System.out.println("Invalid Input");
                return;
            }
        }
        for (int i=1;i<=n;i++) {
            if (!list.contains(i)) {
                System.out.print(i+" ");
                
            } else {
                System.out.print( "0");
                return;
            }
        }
    }
}

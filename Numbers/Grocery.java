import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int PCount=sc.nextInt();
        System.out.println("Products : \n 1.Chips \n 2.Biscut \n 3.Ice");
        int total=0;
        for(int i=1;i<=PCount;i++){
            int Product=sc.nextInt();
            if(Product==1){
                System.out.println("Enter the Quantity");
                int pq=sc.nextInt();
                int sum=pq*5;
                total+=sum;
            }
            if(Product==2){
                System.out.println("Enter the Quantity");
                int pq=sc.nextInt();
                int sum=pq*2;
                total+=sum;
            }
            if(Product==3){
                System.out.println("Enter the Quantity");
                int pq=sc.nextInt();
                int sum=pq*10;
                total+=sum;
            }
        }
        System.out.println("Total Price : "+total);
        sc.close();
    }
    
}

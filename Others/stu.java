import java.util.*;
public class stu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int arr[]=new int[6];
        System.out.println("Enter student mark");
        float tot=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            tot+=arr[i];
        }
        System.out.println(name);
        System.out.println(tot);
        System.out.printf("Avg : %.4f\n",(tot/6));
    }
}
import java.util.*;
public class Stud {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] name=new String[5];
        int[] mark=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter name");
            name[i]=sc.next();
            System.out.println("Enter marks");
            mark[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print("Name "+name[i]);
            System.out.println(" Mark "+mark[i]);
        }
    }
}

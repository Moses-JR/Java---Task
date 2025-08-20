import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            if(val%2==0){
                list1.add(val);
            }else{
                list2.add(val);
            }
        }
        for(int i : list1){
            System.out.print(i+" ");
        }
        for(int i : list2){
            System.out.print(i+" ");
        }
    }
}

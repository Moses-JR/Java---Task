import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] temp=new int[n];
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            int c=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==0){
                temp[k++]=arr[i];
            }
        }temp[k]=arr[n-1];
        for(int i:temp){
            if(i!=0)
            System.out.print(i+" ");
        }
        
    }
}

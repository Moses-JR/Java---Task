import java.util.*;
public class ArrayRotation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int tar=sc.nextInt();
        int ind=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==tar){
                ind=i;
                break;
            }
        }
        for(int j=ind+1;j<n;j++){
            System.out.print(arr[j]+" ");
        }
        for(int k=0;k<=ind;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

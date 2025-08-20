import java.util.*;
public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        int steps=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                steps++;
                if(arr[i]>arr[j]){
                    int l=arr[i];
                    arr[i]=arr[j];
                    arr[j]=l;
                }
            }
    }
    for(int i:arr){
        System.out.print(i+" ");
    }
    System.out.println(steps);
}
}

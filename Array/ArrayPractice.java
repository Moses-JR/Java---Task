import java.util.*;
public class ArrayPractice {
    public static void main(String[] args){
        int[] resultArray=constructArray();
       // display(resultArray);
       // displayOnlyOdd(resultArray);
       /*  displayPositive(resultArray);
        System.out.println();
        displayNegative(resultArray);
        System.out.println();
        displayPrime(resultArray);
        System.out.println(); */
        displayDuplicate(resultArray);

    }
    static int[] constructArray(){
        System.out.println("Enter the Array Size");
        Scanner sc=new Scanner(System.in);
        int arrsize=sc.nextInt();
        int[] array=new int[arrsize];
        for(int i=0;i<arrsize;i++){
            array[i]=sc.nextInt();
        }
        return array;
    }
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void displayOnlyOdd(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0)
            System.out.print(arr[i]+" ");
        }

    }
    static void displayPositive(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0)
            System.out.print(arr[i]+" ");
        }
    }
    static void displayNegative(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)
            System.out.print(arr[i]+" ");
        }
    }
    static void displayPrime(int[] arr){
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=2;j<arr[i]/2;j++){
                if(arr[i]%j==0){
                    c++;
                }
            }
            if(c==0){
                System.out.print(arr[i]+" ");
            }

        }
    }
    static void displayDuplicate(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int c=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c>0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
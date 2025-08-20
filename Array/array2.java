public class array2 {
    public static void main(String args[]){
        int[] arr={-10,-2,-3,-6,-20};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int l=arr[i];
                    arr[i]=arr[j];
                    arr[j]=l;
                }
            }
    }
            for(int i:arr)
                System.out.println(i);
            System.out.println(arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3]);
    }
}

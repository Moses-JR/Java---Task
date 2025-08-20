public class QuickSort1 {

    static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pi=getPivot(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    static int getPivot(int[] arr,int low,int high){
        int pi=arr[high];
        int i=low-1;
        for(int j=low;j<=high;j++){
            if(arr[j]<pi){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

    public static void main(String[] args){
        int[] arr={7,3,8,4,9,1};
        quickSort(arr,0,arr.length-1);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}

public class MergeSort {
    static void mergesort(int[] arr,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }
    }
    static void merge(int[] arr, int l,int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        for(int x=0;x<n1;x++){
            arr1[x]=arr[l+x];
        }
        for(int x=0;x<n2;x++){
            arr2[x]=arr[mid+x+1];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while ((j<n2)) {
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr={3,5,1,6,2,4};
        mergesort(arr,0,arr.length-1);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}

import java.util.Arrays;

public class Mergearray {
    int[] arr1={0,1,2,3,4};
    int[] arr2={9,8,7,6,5};
    int[] resultarr(){
        int[] result=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            result[i]=arr1[i];
        }
        int k=0;
        for(int j=arr1.length;j<result.length;j++){
            result[j]=arr2[k++];
        }
        for(int i=0;i<result.length-1;i++){
            for(int j=i+1;j<result.length;j++){
                if(result[i]>result[j]){
                    int temp=result[i];
                    result[i]=result[j];
                    result[j]=temp;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Mergearray obj=new Mergearray();
        System.out.println(Arrays.toString(obj.resultarr()));
    }
}

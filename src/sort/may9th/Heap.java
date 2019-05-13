package sort.may9th;

import sort.Num;

/**
 * @author Anthony on 2019/5/9
 */
public class Heap {
    public static void main(String[] args) {
        Num num = new Num();
        int[] sum = num.number();
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        heap(sum,0,sum.length-1);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void heap(int []sum,int low,int high){
        int mid = low + (high - low)/2;
        if (low < high){
            heap(sum,low,mid);
            heap(sum,mid+1,high);
            sort(sum,low,mid,high);
        }
    }

    private static void sort(int[] sum, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k =0;
        int [] array = new int [high - low + 1];
        while (i <= mid && j <= high){
            if (sum[i] < sum[j]){
                 array[k] = sum[i];
                 k++;
                 i++;
            }else {
                array[k] = sum[j];
                k++;
                j++;
            }
        }
        while (i <= mid){
            array[k] = sum[i];
            k++;
            i++;
        }
        while (j <= high){
            array[k] = sum[j];
            k++;
            j++;
        }
        for (k=0,i = low;i<=high;i++,k++){
            sum[i] = array[k];
        }

    }
}

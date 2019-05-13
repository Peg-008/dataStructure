package sort;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Anthony on 2019/4/17
 */
public class Merge {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Num num = new Num();
        int[] sum = num.number();
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        merge(sum,0,sum.length-1);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void merge(int [] num,int low,int high){
        int mid = low+(high - low)/2;
        if (low < high){
            merge(num,low,mid);
            merge(num,mid+1,high);
            sort(num,low,mid,high);
        }
    }

    private static void sort(int[] num, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k =0;
        int []array = new int[high-low+1];
        while(i <= mid &&j <= high) {
            if (num[i] < num[j]) {
                array[k] = num[i];
                k++;
                i++;
            } else {
                array[k] = num[j];
                k++;
                j++;
            }
        }
            while (i <= mid){
                array[k] = num[i];
                k++;
                i++;
            }
            while (j <= high){
                array[k] = num[j];
                k++;
                j++;
            }
            for (k = 0,i = low;i <= high;k++,i++){
                num[i] = array [k];
            }


    }
}

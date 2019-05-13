package sort.may6th;

import sort.Num;

/**
 * @author Anthony on 2019/5/6
 */
public class QuickSort {
    public static void main(String[] args) {
        Num num = new Num();
        int[] sum = {87,6,57,91,4,69,92,16,81,7};
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        quick(sum,0,sum.length-1);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void quick(int []sum,int left,int right){
        if (left<right){
            int base = sort(sum,left,right);
            quick(sum,left,base-1);
            quick(sum,base+1,right);
        }
    }

    private static int sort(int[] sum, int left, int right) {
        int base = sum[left];
        while (left<right){
            while (left<right && sum[right]>base){
                right--;
            }
            sum[left] = sum[right];
            while (left <right && sum[left] <base){
                left++;
            }
            sum[right] = sum[left];
        }
        sum[left] = base;
        System.out.print("排序过程:");
        for(int m:sum){
            System.out.print(m+" ");
        }
        System.out.println("");
        return left;
    }
}

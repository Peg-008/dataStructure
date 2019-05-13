package sort.may6th;

import sort.Num;

/**
 * @author Anthony on 2019/5/6
 */
public class SelectSort {
    public static void main(String[] args) {
        Num num = new Num();
        int[] sum = num.number();
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        select(sum);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void select(int []sum){
        int min;
        for (int i = 0;i< sum.length;i++){
            min = sum[i];
            for (int j = i+1;j<sum.length;j++){
                if (sum[j]<min){
                    min = sum[j];
                    sum[j] = sum[i];
                    sum[i] = min;
                }
            }
        }
    }
}

package sort.may9th;

import sort.Num;

/**
 * @author Anthony on 2019/5/9
 */
public class Insert {
    public static void main(String[] args) {
        Num num = new Num();
        int[] sum = num.number();
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        insert(sum);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void insert(int []sum){
        for (int i = 1 ;i < sum.length;i++){
            for (int j = i;j>0;j--){
                if (sum[j] < sum[j -1]){
                    int temp = sum [j];
                    sum[j] =sum[j-1];
                    sum[j-1] = temp;
                }
            }
        }
    }
}

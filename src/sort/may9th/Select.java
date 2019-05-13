package sort.may9th;

import sort.Num;

/**
 * @author Anthony on 2019/5/9
 */
public class Select {
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
    public static void select(int [] sum){
        for (int i = 0;i<sum.length;i++){
            int min = sum[i];
            for (int j = i+1;j <sum.length;j++){
                if (sum[j] < min){
                    min = sum[j];
                    sum[j] = sum[i];
                    sum[i] = min;
                }
            }
        }
    }
}

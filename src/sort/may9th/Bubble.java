package sort.may9th;

import sort.Num;

/**
 * @author Anthony on 2019/5/9
 */
public class Bubble {
    public static void main(String[] args) {
        Num num = new Num();
        int[] sum = num.number();
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        bubble(sum);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void bubble(int [] sum){
        int temp;
        for (int i = 0;i<sum.length;i++){
            for (int j = 0;j<sum.length-1;j++){
                if (sum[j] > sum[j+1]){
                    temp = sum[j];
                    sum[j] = sum[j+1];
                    sum[j+1] = temp;
                }
            }
        }
    }
}

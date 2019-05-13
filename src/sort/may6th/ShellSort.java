package sort.may6th;

import sort.Num;

/**
 * @author Anthony on 2019/5/6
 */
public class ShellSort {
    public static void main(String[] args) {
        Num num = new Num();
        int[] sum = num.number();
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        shell(sum);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void shell(int []sum){
        int grap =sum.length/2;
        while (grap >=1){
            for (int i = grap;i <sum.length;i++){
                int j,temp;
                temp = sum[i];
                for (j = i-grap;j>=0&&sum[j]>temp;j=j-grap){
                    sum[j+grap] = sum[j];
                }
                sum[j+grap] = temp;
            }
            grap =grap /2;
        }
    }
}

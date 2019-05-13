package sort.may6th;

import sort.Num;

/**
 * @author Anthony on 2019/5/6
 */
public class BubbleSort {
    public static void main(String[] args) {
        test();
        //Num num = new Num();
        //int[] sum = num.number();
        //System.out.print("排序前：");
        //num.print(sum);
        //System.out.println();
        //bubble(sum);
        //System.out.print("排序后：");
        //num.print(sum);
    }

    public static void test(){

        String s = "7,8";
        String[] str  =s.split(",");
        int[] sum = new int[str.length];
        for(int i=0;i<str.length;i++){
            sum[i] = Integer.parseInt(str[i]);
        }
        System.out.print(sum);
    }
    public static void bubble(int []sum){
        int temp;
        for (int i = 0;i < sum.length;i++){
            for (int j = 0; j <sum.length -1;j++){
                if (sum[j]<sum[j+1]){
                    temp = sum[j];
                    sum[j] = sum[j+1];
                    sum[j+1] = temp;
                }
            }
        }
    }
}

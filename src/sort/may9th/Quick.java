package sort.may9th;

import sort.Num;

/**
 * @author Anthony on 2019/5/9
 */
public class Quick {
    public static void main(String[] args) {
        Num num = new Num();
        int[] sum = num.number();
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        qucik(sum,0,sum.length-1);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void qucik(int []sum,int left,int right){
        if (left<right){
            int base = sort(sum,left,right);
            qucik(sum,left,base-1);
            qucik(sum,base+1,right);
        }
    }

    private static int sort(int[] sum, int left, int right) {
        int base = sum[left];
        while (left <right){
            while(left < right && sum[right] > base){
                right --;
            }
            sum[left] = sum[right];
            while (left <right && sum[left] < base){
                left++;
            }
            sum[right] = sum[left];

        }
        sum[left] = base;
        return left;
    }
}

package sort;

/**
 * @author Anthony on 2019/4/16
 */
public class QuickSort {
    public static void main(String[] args) {
        Num num = new Num();
        int[] sum = num.number();
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        quick(sum,0,sum.length-1);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void quick(int []num,int left,int right){
        if (left < right){
            int base = sort(num,left,right);
            quick(num,left,base-1);
            quick(num,base+1,right);
        }
    }

    private static int sort(int[] num, int left, int right) {
        int base = num[left];
        while(left<right){
            while(left<right && num[right]>base){
                right--;
            }
            num[left] = num[right];
            while (left<right && num[left]<base){
                left++;
            }
            num[right] = num[left];
        }
        num[left] = base;
        return left;
    }
}

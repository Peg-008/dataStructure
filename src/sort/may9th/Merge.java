package sort.may9th;

import sort.Num;

/**
 * @author Anthony on 2019/5/9
 */
public class Merge {
    public static void main(String[] args) {
        Num num = new Num();
        int[] sum = num.number();
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        merge(sum);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void merge(int []sum){
        for (int i = sum.length/2-1;i>=0;i--){
            tree(sum,i,sum.length);
        }
        for (int j = sum.length - 1;j>0;j--){
            int temp = sum[j];
            sum[j] =sum[0];
            sum[0] = temp;
            tree(sum,0,j);
        }
    }

    private static void tree(int[] sum, int parent, int length) {
        int temp = sum[parent];
        int child = parent*2+1;
        while (child < length){
            if (child+1 < length && sum[child] < sum[child+1]){
                child++;
            }
            if(temp > sum[child]){
                break;
            }
            sum[parent] = sum[child];
            parent = child;
            child = child*2+1;
        }
        sum[parent] = temp;
    }
}

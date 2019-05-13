package sort.April22th;

/**
 * @author Anthony on 2019/4/22
 */
public class Heap {
    public static void main(String[] args) {
        Num num = new Num();
        int[] sum = num.number();
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        heap(sum);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void heap(int []sum){
        for (int i=sum.length/2-1;i>=0;i--){
            tree(sum,i,sum.length);
        }
        for (int j =sum.length-1;j>0;j--){
            int temp = sum[0];
            sum[0] = sum[j];
            sum[j] = temp;
            tree(sum,0,j);
        }
    }

    private static void tree(int[] sum, int parent, int length) {
        int temp = sum[parent];
        int son = parent*2+1;
        while (son<length){
            if (son+1<length&&sum[son]<sum[son+1]){
                son++;
            }
            if (sum[son]<temp){
                break;
            }
            sum[parent] = sum[son];
            parent = son;
            son = son*2+1;
        }
        sum[parent] = temp;
    }
}

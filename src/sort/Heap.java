package sort;

/**
 * @author Anthony on 2019/4/17
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
    public static void heap(int []num){
        for (int i = num.length/2+1;i >= 0;i --){
            tree(num,i,num.length);
        }
        for (int j = num.length-1;j > 0;j --){
            int temp = num[j];
            num[j] = num[0];
            num[0] = temp;
            tree(num,0,j);
        }
    }
    private static void tree(int []num,int parent,int length){
        int temp = num[parent];
        int son = parent*2+1;
        while (son < length){
            if (son<length &&num[son]<num[son+1]){
                son ++;
            }
            if (num[parent]<num[son]){
                break;
            }
            num[parent] = num[son];
            parent = son;
            son = son*2+1;
        }
        num[parent] = temp;
    }
}

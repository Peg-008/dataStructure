package sort;

/**
 * @author Anthony on 2019/4/16
 */
public class BubbleSort {
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
    public static void bubble(int []num){
        for(int i = 0;i<num.length - 1;i++){
            for(int j = 0;j< num.length - 1;j ++){
                if (num[j]<num[j+1]){
                    int temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
}

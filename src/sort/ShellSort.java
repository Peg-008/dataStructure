package sort;

/**
 * @author Anthony on 2019/4/16
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
    public static void shell(int []num){
        int grap = num.length/2;
        while (grap >= 1){
            for (int i = grap;i < num.length;i ++){
                int j = 0;
                int temp = num[i];
                for (j = i - grap;j >= 0 && temp < num[j];j = j - grap){
                    num[j+grap] = num[j];
                }
                num[j+grap] = temp;
            }
            grap = grap/2;
        }
    }
}

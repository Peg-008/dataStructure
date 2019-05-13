package sort.April22th;

/**
 * @author Anthony on 2019/4/22
 */
public class Shell {
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
        int grap = sum.length/2;
        while (grap>=1){
            for (int i =grap;i<sum.length;i++){
                int j;
                int temp =sum[i];
                for (j = i-grap;j>=0&&temp<sum[j];j = j-grap){
                    sum[j+grap] = sum[j];
                }
                sum[j+grap] = temp;
            }
            grap = grap/2;
        }
    }
}

package sort.April22th;

/**
 * @author Anthony on 2019/4/22
 */
public class Select {
    public static void main(String[] args) {
        Num num = new Num();
        int[] sum = num.number();
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        select(sum);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void select(int [] num){
        for(int i = 0;i<num.length;i++){
            int min = num[i];
            for (int j= i+1;j<num.length;j++){
                if (num[j]<min){
                    min = num[j];
                    num[j]=num[i];
                    num[i]=min;
                }
            }
        }
    }

}

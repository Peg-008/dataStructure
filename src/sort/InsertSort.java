package sort;

public class InsertSort {
    public static void main(String[] args) {
        Num num = new Num();
        int[] sum = num.number();
        System.out.print("排序前：");
        num.print(sum);
        System.out.println();
        insert(sum);
        System.out.print("排序后：");
        num.print(sum);
    }
    public static void insert(int []num){
        for (int i = 1;i < num.length;i ++){
            for (int j = i;j >= 1;j--){
                if (num[j]<num[j-1]){
                    int temp = num[j];
                    num[j] = num [j-1];
                    num[j-1] = temp;
                }
            }
        }
    }

}

package linkedList.solution;

/**
 * @author Anthony on 2019/5/5
 */
public class Sum {
    public static int sum(int []arr){
        return sum(arr,0);
    }

    // 计算arr[l...n)这个区间内所有数字的和
    private static int sum(int []arr,int l){
        if (l == arr.length){
            return 0;
        }
        return arr[l]+sum(arr,l+1);
    }

    public static void main(String[] args) {

        int[] nums = {7, 2, 3, 9, 4, 5, 7, 6};
        System.out.println(sum(nums));
    }
}

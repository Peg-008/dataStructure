package sort;

/**
 * @author Anthony on 2019/4/16
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给出一个有n(0 < n <= 10000)个整数的数组A（-10000 <= Ai <=10000) ，
 * 请问是否可以至多修改一个元素， 使这个数组成为非递减数组。
 */
public class HeapSort {
    //public static void heap(int []num){
    //    for (int i = num.length/2-1;i >=0;i ++){
    //        tree(num,0,i-1)
    //    }
    //}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strNum = null;
        strNum = in.nextLine().split(" ");
        int nums[] = new int[strNum.length];
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = Integer.valueOf(strNum[i]);
        }

        Arrays.sort(nums);
        boolean flag = check(nums);
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        in.close();
    }

    public static boolean check(int[] nums) {
        boolean flag = false;
        int count = 0;
        if(nums.length <= 1){
            return true;
        }
        for (int i = 1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                //if(count >= 1) {
                //    return false;
                //}
                if(flag) {
                    return false;
                }
                if(i < 2) {
                    nums[i - 1] = nums[i];
                } else{
                    if(nums[i] < nums[i-2]) {
                        nums[i] = nums[i - 1];
                    }
                    if(nums[i] > nums[i-2]) {
                        nums[i - 1] = nums[i];
                    }
                }
               flag = true;
            }
        }
        return true;
    }

}

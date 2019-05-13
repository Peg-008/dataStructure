package sort.April22th;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Anthony on 2019/4/16
 */
public class Num {

        public int[] number(){
            Random ran = new Random();
            int []sum=null;
            List<Integer> list = new ArrayList<Integer>();
            while (list.size() < 10) {// 随机生成十个(1-100)不重复的数
                int num = ran.nextInt(100) + 1;
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
//        System.out.println("转换前:" + list);// 转换前打印
            sum = new int[list.size()];// 将集合转换成数组
//        System.out.print("转换后:");
            for (int i = 0; i < list.size(); i++) {
                sum[i] = list.get(i);
                //        System.out.print(sum[i] + " ");// 转换后打印
            }
            //    System.out.println("");
            return sum;
        }
        public void print(int []sum){
            System.out.print("\n");
            for(int i:sum){
                System.out.print(i+" ");
            }
        }

}

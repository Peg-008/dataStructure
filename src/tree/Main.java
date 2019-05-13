package tree;


import java.util.ArrayList;
import java.util.Random;

/**
 * @author Anthony on 2019/5/6
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums) {
            bst.add(num);
        }

        /////////////////
        //      5      //
        //    /   \    //
        //   3    6    //
        //  / \    \   //
        // 2  4     8  //
        /////////////////
        bst.preOrder();
        System.out.println();

        bst.preOrderNR();
        System.out.println();

        bst.iteratePreOrder();
        System.out.println();

        bst.levelOrder();
        System.out.println();
        //bst.inOrder();
        //System.out.println();
        //
        //bst.postOrder();
        //System.out.println();

        // test removeMax
        int n = 1000;
        Random random = new Random();
        for(int i = 0 ; i < n ; i ++) {
            bst.add(random.nextInt(10000));
        }

        ArrayList<Integer> num = new ArrayList<>();
       // nums = new ArrayList<>();
        while(!bst.isEmpty()) {
            num.add(bst.removeMax());
        }
        System.out.println(nums);
        for(int i = 1 ; i < num.size() ; i ++) {
            if (num.get(i - 1) < num.get(i)) {
                throw new IllegalArgumentException("Error!");
            }
            System.out.println("removeMax test completed.");
        }
    }
}

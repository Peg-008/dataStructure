package linkedList.solution;

import java.util.List;

/**
 * @author Anthony on 2019/5/5
 */
public  class Solution {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val){
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }
        if (head == null){
            return null;
        }
        ListNode prev = head;
        while (prev.next !=null){
            if (prev.next.val == val){
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            }else {
                prev = prev.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution()).removeElements(head, 6);
        System.out.println(res);
    }
}


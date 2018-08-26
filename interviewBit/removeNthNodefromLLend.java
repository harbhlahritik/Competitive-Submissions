/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode head = A;
        int length = getListLength(A);
        if(B >= length){
            return A.next;
        }
        int loop = length - B;
        while(loop > 1){
            head = head.next;
            loop--;
        }
        // System.out.println("Head.val after loop ==> "+head.val);
        head.next = head.next.next;
        return  A;
    }
    
    public int getListLength(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}

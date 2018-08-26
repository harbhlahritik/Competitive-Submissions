/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode head = A;
        if(head == null){
            return head;    
        }
        while(head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            } else {
                head = head.next;    
            }
        }
        return A;
    }
}

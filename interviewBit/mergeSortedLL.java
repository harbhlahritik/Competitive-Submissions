/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A == null){
            return B;
        }
        if(B == null){
            return A;
        }
        if(A.val < B.val){
            return mergeUtil(A,B);
        } else {
            return mergeUtil(B,A);
        }
    }
    
    public ListNode mergeUtil(ListNode h1,ListNode h2){
        if(h1.next == null){
            h1.next = h2;
            return h1;
        }
        ListNode curr1 = h1; ListNode next1 = h1.next;
        ListNode curr2 = h2; ListNode next2 = h2.next;
        while(curr1 != null && curr2 != null){
            if(curr2.val >= curr1.val && curr2.val <= next1.val){
                next2 = curr2.next;
                curr1.next = curr2;
                curr2.next = next1;
                curr1 = curr2;
                curr2 = next2;
            } else {
                if(next1.next != null){
                    next1 = next1.next;
                    curr1 = curr1.next;
                } else {
                    next1.next = curr2;
                    return h1;
                }
            }
        }
        return h1;
    }


    // public ListNode mergeTwoLists(ListNode A, ListNode B) {
    //     ListNode result = null;
    //     if(A == null){
    //         return B;
    //     }
    //     if(B == null){
    //         return A;
    //     }
    //     if(A.val <= B.val){
    //         result = A;
    //         result.next = mergeTwoLists(A.next,B);
    //     } else {
    //         result = B;
    //         result.next = mergeTwoLists(A,B.next);
    //     }
    //     return result;
        // ListNode head = null;
        // ListNode n = null;
        // if(A == null){
        //     return B;
        // }
        // if(B == null){
        //     return A;
        // }
        // while(A != null || B != null){
        //     if(A.val <= B.val){
        //         head = A;
        //         A = A.next;
        //         head = head.next;
        //         if(n == null){
        //             n = head;
        //         }
        //         // System.out.println("A.val ==> "+A.val);
        //         // System.out.println("n.val ==> "+n.val);
        //         // System.out.println("head.val ==> "+head.val);
        //     } else {
        //         head = B;
        //         B = B.next;
        //         head = head.next;
        //         if(n == null){
        //             n = head;
        //         }
        //         // System.out.println("B.val ==> "+B.val);
        //         // System.out.println("n.val ==> "+n.val);
        //         // System.out.println("head.val ==> "+head.val);
        //     }
        // }
        //     while(B != null){
        //         head = B;
        //         B = B.next;
        //         head = head.next;
        //     }
        //     while(A != null){
        //         head = A;
        //         A = A.next;
        //         head = head.next;
        //     }
        // return n;
    // }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        //count the number of nodes
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }

        if(count == n){
            return head.next;
        }

        //remove the nth node from the last
        ListNode p = head;
        for(int i=0;i<count-n-1;i++){           //reach the (n-1)th node from last
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }
}

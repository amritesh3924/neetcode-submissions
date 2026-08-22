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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return reverse(head,k,count);
    }
    public ListNode reverse(ListNode head, int k, int count){
        if(count<k){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        for(int i=0;i<k;i++){
            ListNode currp1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currp1;
        }
        head.next = reverse(curr,k,count-k);
        return prev;
    }
}

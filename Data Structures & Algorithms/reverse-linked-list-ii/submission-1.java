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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode leftprev = dummy;
        for(int i=1;i<left;i++){
            leftprev = leftprev.next;
        }
        ListNode curr = leftprev.next;
        ListNode prev = null;
        for(int i=0;i<right-left+1;i++){
            ListNode currp1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currp1;
        }
        leftprev.next.next = curr;
        leftprev.next = prev;
        return dummy.next;
    }
}
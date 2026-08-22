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
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if(k == 0){
            return null;
        }
        if(k == 1){
            return lists[0];
        }
        ListNode ans = lists[0];
        for(int i=1;i<k;i++){
            ans = mergeTwoSortedList(ans,lists[i]);
        }
        return ans;
    }
    public ListNode mergeTwoSortedList(ListNode l1,ListNode l2){
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode dummy  = new ListNode(0);
        ListNode head3 = dummy;
        while(head1!=null && head2!=null){
            int val;
            if(head1.val<head2.val){
                val = head1.val;
                head1 = head1.next;
            }
            else{
                val = head2.val;
                head2 = head2.next;
            }
            head3.next = new ListNode(val);
            head3 = head3.next;
        }
        if(head1!=null){
            head3.next = head1;
        }
        if(head2!=null){
            head3.next = head2;
        }
        return dummy.next;
    }
}

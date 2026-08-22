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
    public void reorderList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode nextTomid = mid.next;
        mid.next = null;
        ListNode p1 = head;
        ListNode p2 = reverse(nextTomid);
        ListNode p1next;
        while(p1!=null && p2!=null){
            p1next = p1.next;
            p1.next = p2;
            p1 = p2;
            p2 = p1next;
        }
    }

    public ListNode findMid(ListNode head){
        ListNode f = head;
        ListNode s = head;
        while(f.next!=null && f.next.next!=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode currp1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currp1;
        }
        head = prev;
        return head;
    }
}

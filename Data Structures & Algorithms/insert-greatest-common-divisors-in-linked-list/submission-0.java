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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2!=null){
            ListNode node = new ListNode(gcd(p1.val,p2.val));
            insert(node,p1,p2);
            p1 = p2;
            p2 = p2.next;
        }
        return head;
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    private void insert(ListNode node, ListNode p1, ListNode p2){
        ListNode temp = p1.next;
        p1.next = node;
        node.next = temp;
    }
}
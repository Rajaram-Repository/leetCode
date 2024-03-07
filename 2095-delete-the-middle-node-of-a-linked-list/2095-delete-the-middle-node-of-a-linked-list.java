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
    public ListNode deleteMiddle(ListNode head) {
        ListNode prev = new ListNode(0,head);
        ListNode n = prev ;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            n=n.next;
            slow=slow.next;
            fast=fast.next.next;
        }
        n.next=slow.next;
        return prev.next;
    }
}
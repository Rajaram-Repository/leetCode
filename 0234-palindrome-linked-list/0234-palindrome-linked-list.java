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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
        ListNode fast = head;
        ListNode slow = head;
        String s = "";
        while(fast!=null && fast.next!=null){
            s+=String.valueOf(slow.val);
            slow=slow.next;
            fast=fast.next.next;
            
        }
        int i = s.length()-1;
        if(fast!=null)
             slow=slow.next;
        while(slow!=null){
            int r =Character.getNumericValue(s.charAt(i));
            if(slow.val!= r)
                return false;
            i--;
            slow=slow.next;
        }
        return true;
    }
}
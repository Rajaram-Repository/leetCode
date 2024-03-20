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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode node = list2;
        while(node.next!=null)
             node=node.next;
        ListNode f =new ListNode(0, list1);
        int i=0;
        while(i<a){
            f=f.next;
            i++;
        }
        i=i-2;
        ListNode back =f;
         while(i<b){
             back=back.next;
             i++;
         }
         node.next=back;
        f.next=list2;
        return list1;
    }
}
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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr= dummy;
        while(curr.next !=null && curr.next.next!=null){
            ListNode num1 = curr.next;
            ListNode num2 = curr.next.next;

            num1.next = num2.next;
            num2.next = num1;
            curr.next = num2;

            curr = num1;

        }
        return dummy.next;
        
    }
}
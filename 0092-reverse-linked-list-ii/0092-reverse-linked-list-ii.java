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
        ListNode dummy = new ListNode(0);//aak extra null node head se pehle;
        dummy.next = head;

        ListNode leftpre = dummy;
        ListNode curr = head;

        for(int i=0; i<left-1; i++){
            leftpre = leftpre.next;
            curr = curr.next;
        }
        ListNode newhead = curr;//reverse list ka head;
        ListNode prev = null;//revese karne ke liye null pointer ka use;

        for(int i=0; i<=right-left; i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        leftpre.next = prev; 
        newhead.next = curr;

        return dummy.next;


    }
}
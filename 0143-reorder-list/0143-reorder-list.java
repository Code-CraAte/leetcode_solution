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
        if(head==null || head.next==null) return ;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){ //find middle of linklist
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode premid = slow; //reverse half linklist
        ListNode precurr = slow.next;
        while(precurr.next != null){
            ListNode curr = precurr.next;
            precurr.next = curr.next;
            curr.next = premid.next;
            premid.next = curr;
        }
        slow = head;
        fast = premid.next;
        while(slow!=premid){
            premid.next = fast.next;
            fast.next = slow.next;
            slow.next = fast;
            slow = fast.next;
            fast = premid.next;
    }
}}
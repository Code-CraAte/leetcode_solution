/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode start = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
             
             if(slow == fast){ // confirm that loop is present;
               while(start != slow){// find starting index;
                start = start.next;
                slow = slow.next;
               }
               return slow;
             }
        }
        return null;
       
    }
}
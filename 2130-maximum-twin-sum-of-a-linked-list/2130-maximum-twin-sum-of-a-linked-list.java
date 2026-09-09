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
    public int pairSum(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode curr = head;
        while(curr!= null){
            ans.add(curr.val);
            curr = curr.next;
        }
        int maxsum = 0;
        int sum=0;
        int n = ans.size();
        for(int i=0; i< n/2; i++){
            sum = ans.get(i) + ans.get(n-1-i);
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
    }
}
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
        
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        //make the first half of list point forward
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            ListNode tmp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = tmp;
        }
        
        //slow pointer will end at the first of the second half of list
        //fast pointer will go beyond the list
        int result = 0;
        while(slow != null){
            result = Math.max(result, prev.val + slow.val);
            prev = prev.next;
            slow = slow.next;
        
        }
        return result;
    }
}
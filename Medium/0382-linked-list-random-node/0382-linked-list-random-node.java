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

private Random rnd;
    private ListNode head;
    private int length;

    public Solution(ListNode head) {
        rnd = new Random();
        this.head = head;
        length = 0;
        ListNode tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            length++;
        }
    }
    
    public int getRandom() {
        int index = rnd.nextInt(0, length);
        ListNode tmp = head;
        while (index > 0) {
            tmp = tmp.next;
            index--;
        }
        return tmp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
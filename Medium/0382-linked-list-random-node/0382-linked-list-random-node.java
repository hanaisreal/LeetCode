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
   Random r;
    int size;
    int[] arr;
    public Solution(ListNode head) {
        r = new Random();
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        arr = new int[size];
        int i = 0;
        cur = head;
        while (cur != null) {
            arr[i++] = cur.val;
            cur = cur.next;
        }
    }
    
    public int getRandom() {
        int x = r.nextInt(size);
        return arr[x];
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
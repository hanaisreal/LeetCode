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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        //1. find the middle element of the linked list. 
        //2. create a new node with the middle element as its value
        //3. set the left subtree of the new node to the result of recursively calling the function on the left sorted list
        //4. set the right subtree like 3.
        //5. return the new node
        
        //To find middle element, make two pointers: slow and fast to head. fast pointer move 2 steps, slow pointer move 1 step at a time. so, the index of slow pointer when fast pointer reach the end is the middle element. 
        if(head == null) return null;
        if(head.next == null) return new TreeNode(head.val);
        
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //System.out.println(slow.next.val);
        TreeNode result = new TreeNode(slow.next.val);  //the mid value
        ListNode rightHalf = slow.next.next;
        slow.next = null;
        result.left = sortedListToBST(head);
        result.right = sortedListToBST(rightHalf);
        return result;
        
    }
}
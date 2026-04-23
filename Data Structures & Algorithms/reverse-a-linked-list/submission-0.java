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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        if(head == null || head.next == null)
        return head;
        ListNode curr = temp.next;
        ListNode prev = null;
        while(curr != null){
            temp.next = prev;
            prev = temp;
            temp = curr;
            curr = curr.next;
        }
        
        temp.next = prev;
        head = temp;

        return head;

    }
}

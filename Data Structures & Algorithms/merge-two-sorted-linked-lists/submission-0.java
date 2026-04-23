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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyStart = new ListNode(-1);
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode result = dummyStart;

        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                dummyStart.next = temp1;
                temp1 = temp1.next;
                dummyStart = dummyStart.next;
            } else {
                dummyStart.next = temp2;
                temp2 = temp2.next;
                dummyStart = dummyStart.next;
            }
        }

        while(temp1!=null){
            dummyStart.next = temp1;
            temp1 = temp1.next;
            dummyStart = dummyStart.next;
        }

        
        while(temp2!=null){
            dummyStart.next = temp2;
            temp2 = temp2.next;
            dummyStart = dummyStart.next;
        }

        return result.next;

    }
}
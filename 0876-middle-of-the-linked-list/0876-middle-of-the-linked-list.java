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
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast=fast.next.next;
        }
        int count=0;
        while(temp!=null){
            count=count+1;
            temp=temp.next;
        }
        if(count%2==0)
            return slow.next;
        else return slow;
        
        
    }
}
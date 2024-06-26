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
    public boolean isPalindrome(ListNode head) {
        if(head==null&&head.next==null) return false;
        else{
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode prev=null;
            ListNode curr=slow;
            ListNode next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            ListNode temp=head;
            while(temp!=null&&prev!=null){
                if(temp.val!=prev.val) return false;
                temp=temp.next;
                prev=prev.next;
            }
            return true;
        }
        
        
    }
}
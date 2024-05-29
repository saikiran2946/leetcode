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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0) return head;
        else{
            ListNode temp=head;
            int count=0;
            while(temp.next!=null){
                count++;
                temp=temp.next;
            }
            count++;
            if(k%count==0) return head;
            k=k%count;
            temp.next=head;
            ListNode prev=head;
            for(int i=0;i<count-k+1;i++){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            head=temp;
            return head;
        }
        
    }
}
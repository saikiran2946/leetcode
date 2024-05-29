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
    public ListNode oddEvenList(ListNode head) {
        ListNode evenHead=new ListNode(-1);
        ListNode oddHead=new ListNode(-1);
        ListNode even=evenHead;
        ListNode odd=oddHead;
        int index=1;
        ListNode temp=head;
        while(temp!=null){
            if(index%2==0){
                even.next=temp;
                even=even.next;
            }
            else{
                odd.next=temp;
                odd=odd.next;
            }
            index++;
            temp=temp.next;
        }
        odd.next=evenHead.next;
        even.next=null;
        return oddHead.next;
        
        
    }
}
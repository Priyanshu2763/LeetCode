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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val==0 && l1.next==null){
            return l2;
        }
        if(l2.val==0 && l2.next==null){
            return l1;
        }

        ListNode t1=l1,t2=l2,dummy=new ListNode(-1),curr=dummy;
        int carry=0;
        while(t1!=null || t2!=null || carry!=0){
            int n=carry;
            if(t1!=null){
                n+=t1.val;
                t1=t1.next;
            }
            if(t2!=null){
                n+=t2.val;
                t2=t2.next;
            }
            carry=n/10;
            curr.next=new ListNode(n%10);
            curr=curr.next;
        }
       
        return dummy.next;
    }
}
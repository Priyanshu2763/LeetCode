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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        // int size=1;
        // ListNode temp=head;
        // while(temp.next!=null){
        //     size++;
        //     temp=temp.next;
        // }
        //     if (n == size) {
        //     return head.next;
        // }
        // temp=head;
        // size-=n;
        // for(int i=0;i<size-1;i++){
        //     temp=temp.next;
        // }
        
        // temp.next=temp.next.next;
        

        ListNode s=head;
        ListNode f=head;
        while(n>0 ){
            f=f.next;
            n--;
        }
        if(f==null){
                return head.next;
            }
        
        while(f.next!=null){
            s=s.next;
            f=f.next;
        }
        if(s.next==null){
            return head;
        }
        s.next=s.next.next;
       
        return head;
    }
}
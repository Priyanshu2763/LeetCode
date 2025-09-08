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
        ListNode t=list1;
        ListNode temp=list2;
        ListNode dummy=new ListNode(-1);
        ListNode a=dummy;
        while(t!=null && temp!=null){
            if(t.val<temp.val){
                a.next=t;
                a=a.next;
                t=t.next;
            }else{
                a.next=temp;
                a=a.next;
                temp=temp.next;
            }
        }
        if(t!=null){
            a.next=t;
        }
        if(temp!=null){
            a.next=temp;
        }
        return dummy.next;
    }
}
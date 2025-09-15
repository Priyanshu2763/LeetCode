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
    public ListNode reverse(ListNode temp){
        ListNode t=temp,prev=null;
        while(t!=null){
            ListNode front=t.next;
            t.next=prev;
            prev=t;
            t=front;
        }
        return prev;
    }
    public ListNode findKthNode(ListNode head, int k){
        ListNode temp=head;k--;
        while(temp!=null &&k>0){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null||k<2){
            return head;
        }
        ListNode temp=head,prevLast=null,nextNode;

        while(temp!=null){
            ListNode kthNode=findKthNode(temp,k);
            if(kthNode==null){
                if(prevLast!=null)prevLast.next=temp;
                break;
            }else{
                nextNode=kthNode.next;
                kthNode.next=null;
                reverse(temp);
                if(head==temp){
                    head=kthNode;
                }else{
                    prevLast.next=kthNode;
                }
                prevLast=temp;
                temp=nextNode;


            }
        }
        return head;
    }
}
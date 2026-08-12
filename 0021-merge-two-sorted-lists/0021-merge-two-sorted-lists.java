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
        if(list1==null && list2==null) return null;
        if(list1==null && list2!=null) return list2;
        if(list1!=null && list2==null) return list1;
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode dummy=new ListNode(100);
        ListNode temp3=dummy;
        while(temp1!=null && temp2!=null){
        if(temp1.val<=temp2.val){
            ListNode a=new ListNode(temp1.val);
            temp1=temp1.next;
            temp3.next=a;
            temp3=temp3.next;
        }else if(temp1.val>temp2.val){
             ListNode a=new ListNode(temp2.val);
            temp2=temp2.next;
            temp3.next=a;
            temp3=temp3.next;
        }
        }
        while(temp1!=null && temp2==null){
            ListNode a=new ListNode(temp1.val);
            temp3.next=a;
            temp3=temp3.next;
            temp1=temp1.next;
        }

         while(temp2!=null && temp1==null){
            ListNode a=new ListNode(temp2.val);
            temp3.next=a;
            temp3=temp3.next;
            temp2=temp2.next;
        }

        return dummy.next;
        
    }
}
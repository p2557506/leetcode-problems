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

        if(head.next == null){
            return true;
            //Because only one element is present
        }
        //Return true if list is the same forwards and backwards
        Stack<ListNode> stack = new Stack();
        
        
        ListNode current = head;

       

       
            //Continues until end of list is reached
            while(current != null){
                
                //Add nodes to stack
                stack.push(current);
                //Traverse to next node
                current = current.next;
            }

            //all nodes are now added to stack
            //Start at beginning of list
            current = head;

            while(current != null){
                ListNode temp = stack.pop();
                if(current.val != temp.val){
                    return false;
                }
                current = current.next;
            }

            return true;
            
    }
}
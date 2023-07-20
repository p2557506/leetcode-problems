/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null){
            
            return false;
        }
    
        ListNode slow = head;
        ListNode fast = head.next;
        

        //If next node is null cant be cycle

        //Slow and fast node, if they meet, linked list has a a cycle
        

            while(slow != fast){
                if(fast == null || fast.next ==null){
                    //No cycle
                    return false;
                }
                //Traverse
                slow = slow.next;
                fast = fast.next.next;
            }
        //Returns true if all check
            return true;
            
     

       
    }
}
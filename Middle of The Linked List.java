class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null)
        {
           if(fast.next==null)
           {
               return slow;
           }
            if(fast.next.next==null)
            {
                return slow.next;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

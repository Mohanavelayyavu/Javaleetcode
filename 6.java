class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode Fast=head;
        ListNode Slow=head;
        ListNode T=head;
        while(Fast!=null && Fast.next!=null){
            Slow=Slow.next;
            Fast=Fast.next.next;
        }
        return Slow;
    }
}

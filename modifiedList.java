class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> ob = new HashSet<>();
        for(int a : nums) {
            ob.add(a);
        }

        ListNode start = head, prev = head, temp = null;
        while(start != null) {
            if(ob.contains(start.val)) {
                if(start == head) {
                    head = head.next;
                }
                prev.next = start.next;
            } else {
                prev = start;
            }
            start = start.next;
        }
        return head;
    }
}

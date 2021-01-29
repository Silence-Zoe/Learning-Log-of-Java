public class Solution {
    public boolean hasCycle(ListNode head) {
        int pos = -1;
        ListNode Fast = head;
        ListNode Low = head;
        while (Fast != null && Fast.next != null && Fast.next.next != null && head.next != null && head.next.next != null) {
            Fast = Fast.next.next;
            Low = Low.next;
            if (Fast == Low) {
                pos = 1;
                break;
            }
        }
        if (pos == -1) {
            return false;
        } else {
            return true;
        }
    }
}
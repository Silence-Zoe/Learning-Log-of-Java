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
    public ListNode detectCycle(ListNode head) {
        int cnt, l, n1, n2, n3;
        cnt = n1 = n2 = n3 = -1;
        l = 0;
        ListNode Fast = head;
        ListNode Slow = head;
        while (Fast != null && Fast.next != null) {
            Fast = Fast.next.next;
            Slow = Slow.next;
            cnt++;
            if (Slow == Fast && n1 == -1) {
                n1 = cnt;
            } else if (n2 == -1) {
                n2 = cnt;
                l = n2 - n1;
                cnt = 0; 
            }
            if (n1 != -1 && n2 != -1) {
                Fast = head;
                Slow = head;
                while (Fast != null && Fast.next != null) {
                    for (int i = 0; i < l; i++) {
                        Fast = Fast.next;
                    }
                    Slow = Slow.next;
                    cnt++;
                    if (Fast == Slow) {
                        n3 = n1 - cnt;
                        ListNode x = head;//.next;
                        if (n3 != -1) {
                            for (int i = 0; i <= n3; i++) {
                                x = x.next;
                            }
                            return x;
                        }
                    }
                }
            }
        }
        return null;
    }
}
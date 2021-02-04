/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    Node n = new Node();
    Node pn = n;
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Node p = head;
        while (p.next != null || p.next == null && p.child != null) {
            while (p.child != null) {
                if (p.next != null) {
                    pn.next = new Node();
                    pn.next.prev = pn;
                    pn.next.child = p.next;
                    pn = pn.next;
                }
                p.next = p.child;
                p.child = null;
                p.next.prev = p;
                p = p.next;
            }
            if (p.next != null) {
                p = p.next;
            }
        }
        for (; pn != n; pn = pn.prev) {
            p.next = pn.child;
            p.next.prev = p;
            while (p.next != null) {
                p = p.next;
            }
        }
        return head;
    }
}
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummyhead = new Node(-1);
        dummyhead.next = null;
        Node p1 = dummyhead;
        Node p2 = head;
        for (; p2 != null; p2 = p2.next, p1 = p1.next) {
            p1.next = new Node(p2.val);
        }
        p1.next = null;
        p1 = dummyhead.next;
        p2 = head;
        Node c = head;
        int cnt = 0;
        for (; p1 != null; p1 = p1.next, p2 = p2.next) {
            if (p2.random == null) {
                p1.random = null;
            } else {
                for (cnt = 0, c = head; c != p2.random; c = c.next ) {
                    cnt ++;
                }
                c = dummyhead.next;
                for (int i = 0; i < cnt; i++, c = c.next) {
                    ;
                }
                p1.random = c;
            }
        }
        return dummyhead.next;
    }
}
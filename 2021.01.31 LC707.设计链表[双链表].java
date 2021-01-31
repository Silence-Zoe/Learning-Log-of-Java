public class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    ListNode (int x) {
        val = x;
    }
}

class MyLinkedList {
    int size;
    ListNode head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new ListNode(0);
        head.next = null;
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size || head.next == null) {
            return -1;
        } else {
            ListNode a = head.next;
            for (int i = 0; i < index; i++) {
                a = a.next;
            }
            return a.val;
        }
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0 ,val);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0) {
            index = 0;
        }
        if (index > size) {
            return;
        } else {
            ListNode a = head;
            for (int cur = 0; cur < index; cur++){
                a = a.next;
            }
            ListNode add = new ListNode(val);
            add.next = a.next;
            a.next = add;
            add.prev = a;
            if (add.next != null) {
                add.next.prev = add;
            }
            size++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >= 0 && index <size && head.next != null) {
            ListNode a = head.next;
            for (int i = 0; i < index; i++) {
                a = a.next;
            }
            a.prev.next = a.next;
            if (a.next != null) {
                a.next.prev = a.prev;
            }
            size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
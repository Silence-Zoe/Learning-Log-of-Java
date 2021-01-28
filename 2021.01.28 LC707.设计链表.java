class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

public class MyLinkedList {
    int size;
    ListNode head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0); 
        head.next = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        ListNode n = head;
        if (index < 0 || index > size - 1) {
            return -1;
        } else {
            for (int i = 0; i < index + 1; i++) {
                n = n.next;
            }
            return n.val;
        }
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	ListNode a = new ListNode(val);
    	if(size == 0) {
    		head.next = a;
    		a.next = null;
    	} else {
    		ListNode oldhead = head.next;
	        head.next = a;
	        a.next = oldhead;
	    }
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode oldtail = head;
        ListNode newtail = new ListNode(val);
        for (int i = 0; i < size && oldtail.next != null; i++) {
            oldtail = oldtail.next;
        }
        oldtail.next = newtail;
        newtail.next = null;
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        ListNode n = head.next;
        ListNode a = new ListNode(val);
        if (index <= 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            a.next = n.next;
            n.next = a;
            size++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        ListNode n = head;
        if (index >= 0 && index < size) {
            for (int i = 0; i < index; i++) {
                n = n.next;
            }
            n.next = n.next.next;
            size--;
        } else if (index == size - 1) {
            for (int i = 0; i < size; i++) {
                n = n.next;
            }
            n.next = null;
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
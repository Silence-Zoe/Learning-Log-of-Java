/**
 * 执行用时：12 ms，在所有 Java 提交中击败了 69.77% 的用户
 * 内存消耗：39 MB，在所有 Java 提交中击败了 81.01% 的用户
 */
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
 * 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 * 在链表类中实现这些功能：
 *     get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 *     addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 *     addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 *     addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
 *     deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 * --------------------------------------------------
 * 提示：
 * 所有val值都在 [1, 1000] 之内。
 * 操作次数将在  [1, 1000] 之内。
 * 请不要使用内置的 LinkedList 库。
 */
class MyCircularQueue {
    int s;
    int front, rear;
    int[] a;
    public MyCircularQueue(int k) {
        s = k + 1;
        a = new int[s];
        front = rear = 0;
    }
    
    public boolean enQueue(int value) {
        if (!isFull()) {
            rear = (rear + 1) % s;
            a[rear] = value;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if (!isEmpty()) {
            front = (front + 1) % s;
            return true;
        }    
        return false;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        } else {
            return a[(front + 1) % s];
        }
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        } else {
            return a[rear];
        }
    }
    
    public boolean isEmpty() {
        return front == rear;
    }
    
    public boolean isFull() {
        return (rear + 1) % s == front;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
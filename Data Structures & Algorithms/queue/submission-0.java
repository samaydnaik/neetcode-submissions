class Deque {
    class Node{
        Node next;
        int data;
        Node prev;
        public Node(int val){
            data = val;
            next = null;
            prev = null;
        }
    }

    Node head, tail;

    public Deque() {
        head = tail = null;
    }

    public boolean isEmpty() {
       return head == null;
    }

    public void append(int value) {
      Node newData = new Node(value);
      if(isEmpty()){
        head = tail = newData;
      } else{
        tail.next = newData;
        newData.prev = tail;
        tail = newData;
      }
       
    }

    public void appendleft(int value) {
        Node newData = new Node(value);
        if(isEmpty()){
            head = tail = newData;
        } else {
            newData.next = head;
            head.prev = newData;
            head = newData;
        }
    }

    public int pop() {
       if(isEmpty()) return -1;
       int val = tail.data;
       tail = tail.prev;
       if(tail == null) head = null;
       else tail.next = null;
       return val;
    }

    public int popleft() {
        if(isEmpty()) return -1;
        int val = head.data;
        head = head.next;
        if(head == null) tail = null;
        else head.prev = null;
        return val;
    }
}

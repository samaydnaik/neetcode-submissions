 class Node{
      int data;
      Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

class LinkedList {

   
    private Node head;
    private Node tail;
    public LinkedList() {
        this.head = new Node(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        int count = 0;
        Node temp = this.head.next;
        while(temp!=null){
            if(count == index)
            return temp.data;
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node temp = new Node(val);
        temp.next = this.head.next;
        this.head.next = temp;
        if(temp.next == null)
        this.tail = temp;
    }

    public void insertTail(int val) {
        Node temp = new Node(val);
        this.tail.next = temp;
        this.tail = tail.next;
    }

    public boolean remove(int index) {
        int count = 0;
        Node temp = this.head;

        while(count<index && temp!=null){
            count++;
            temp = temp.next;
        }

        if(temp !=null && temp.next != null){
            if(temp.next == this.tail){
                this.tail = temp;
            }
            temp.next = temp.next.next;
            return true;
        }

        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head.next;
        while(temp!=null){
            arr.add(temp.data);
            temp = temp.next;
        }

        return arr;
    }
}

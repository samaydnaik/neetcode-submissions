class LinkedList {
    class Node{
        Node next;
        int data;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    private Node head;

    public LinkedList() {
        head = new Node(-1);
    }

    public int get(int index) {
        Node temp = head.next;
        int count = 0;
        while(temp!=null){
            if(count == index)
            return temp.data;
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node valueNode = new Node(val);
        valueNode.next = head.next;
        head.next = valueNode;
    }

    public void insertTail(int val) {
        Node valueNode = new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = valueNode;
    }

    public boolean remove(int index) {
        Node temp = head;
        int count = 0;

        while(temp.next!=null){
            if(count == index){
                temp.next = temp.next.next;
                return true;
            }
            count++;
            temp = temp.next;
        }

        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer>arrayList = new ArrayList<>();
        Node temp = head.next;
        while(temp!=null){
            arrayList.add(temp.data);
            temp = temp.next;
        }

        return arrayList;
    }
}

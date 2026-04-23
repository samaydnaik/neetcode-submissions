class DynamicArray {
    int[] arr;
    int capacity;
    int length;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.length = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(length == capacity)
        resize();
        arr[length] = n;
        length++;
    }

    public int popback() {
        if(length>0){
            length--;
        }
        return arr[length];
    }

    private void resize() {
        this.capacity = 2*this.capacity;
        int[] newArr = new int[this.capacity];
        for(int i = 0;i<length;i++)
        newArr[i] = arr[i];
        arr = newArr;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}

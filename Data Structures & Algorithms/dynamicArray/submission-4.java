class DynamicArray {
    int[] arr;
    int endPointer;
    int capacity;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        endPointer = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(capacity == endPointer){
            resize();
        } 
        arr[endPointer] = n;
        endPointer++;
    }

    public int popback() {
        endPointer--;
        int element = arr[endPointer];
        return element;
    }

    private void resize() {
        capacity = capacity*2;
        int[] newArr = new int[capacity];
        for(int i = 0;i<endPointer;i++)
        newArr[i] = arr[i];
        arr = newArr;
    }

    public int getSize() {
        return endPointer;
    }

    public int getCapacity() {
        return capacity;
    }
}

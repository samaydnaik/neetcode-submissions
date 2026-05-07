interface Observer {
    void notify(String itemName);
}

class Customer implements Observer {
    private String name;
    private int notifications;

    public Customer(String name) {
        this.name = name;
        this.notifications = 0;
    }

    public void notify(String itemName) {
        this.notifications += 1;
    }

    public int countNotifications() {
        return this.notifications;
    }
}

class OnlineStoreItem {
    private String itemName;
    private int stock;
    private List<Observer> observerList = new ArrayList<>();

    public OnlineStoreItem(String itemName, int stock) {
        this.itemName = itemName;
        this.stock = stock;
    }

    public void subscribe(Observer observer) {
        this.observerList.add(observer);
    }

    public void unsubscribe(Observer observer) {
        this.observerList.remove(observer);
    }

    public void updateStock(int newStock) {
        if(this.stock == 0 && newStock != 0){
            for(Observer observer: this.observerList){
                observer.notify(this.itemName);
            }
        }
        this.stock = newStock;
    }
}

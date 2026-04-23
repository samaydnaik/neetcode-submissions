static class Singleton {
    private static Singleton singleTonObject;
    private String value;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(singleTonObject == null){
            singleTonObject = new Singleton();
        }
        return singleTonObject;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}

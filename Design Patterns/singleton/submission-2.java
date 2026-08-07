// on demand lazy 
static class Singleton {
    private String value;

    private Singleton() {

    }

    private static class Holder{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.instance;

    }

    public String getValue() {
        return this.value;

    }

    public void setValue(String value) {
        this.value = value;
    }
    
}

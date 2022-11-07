public class Value {

    //---------------------------------ATTRIBUTES---------------------------------
    private String name;
    private int value;

    //---------------------------------CONSTRUCTOR--------------------------------
    public Value(String name, int value) {
        this.name = name;
        this.value = value;
    }

    //---------------------------------METHODS------------------------------------
    // toString method
    public String toString() {
        return "<"+this.name+"; "+this.value+">";
    }
}

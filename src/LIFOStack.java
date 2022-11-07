import java.util.ArrayList;
import java.util.EmptyStackException;

// implémente Stack.java
public class LIFOStack implements Stack{

    //---------------------------------ATTRIBUTES---------------------------------
    private ArrayList<Value> stack = new ArrayList<Value>();


    //---------------------------------METHODS------------------------------------
    public boolean empty() {
        return this.stack.isEmpty();
    }

    public void push(Value v) {
        this.stack.add(v);
    }

    public Value pop() throws EmptyStackException {
        if (this.empty()) {
            throw new EmptyStackException();
        }
       return (Value) this.stack.remove(this.stack.size()-1);
    }

    public Value peek() throws EmptyStackException {
        if (this.empty()) {
            throw new EmptyStackException();
        }
        return (Value) this.stack.get(this.stack.size()-1);
    }




}

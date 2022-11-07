import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new LIFOStack();
//        stack.push(new Value("a", 1));
        try{
            System.out.println(stack.pop());

        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
    }
}

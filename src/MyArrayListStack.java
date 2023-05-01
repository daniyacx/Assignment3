import java.util.EmptyStackException;
public class MyArrayListStack {

    private static MyArrayList stack = new MyArrayList();
    MyArrayListStack(){}
    public static void push(Object o){
        stack.add(o);
    }
}

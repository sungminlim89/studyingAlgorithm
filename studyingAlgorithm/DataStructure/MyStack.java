package DataStructure;
/*
 * Stack Implementation
 * *
 * @author camel
 *
 */
public class MyStack {
    
    private Object[] arr;
    
    private int top;
    
    private int maxSize;
    

    public MyStack(int maxSize) {
        
        this.maxSize = maxSize;
        this.arr = new Object[this.maxSize];
        this.top = -1;
        
    }
    
    public Object peek() {
        try {
            return arr[top];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Underflow!!");
            System.exit(0);
            return null;
        }
    }
    
    public Object pop() {
        
        Object currentTop = peek();
        top--;
        return currentTop;
    }
    
    public void push(Object obj) {
        
        try {
            arr[++top] = obj;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Overflow!!");
            System.exit(0);
        }
    }
}

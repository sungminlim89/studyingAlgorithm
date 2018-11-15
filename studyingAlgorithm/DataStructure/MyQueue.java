package DataStructure;

/**
 * Queue Implementation
 * 
 * @author camel
 *
 */
public class MyQueue {

    /**
     * Array for queue.
     */
    private Object[] arr;

    /**
     * current front of the queue.
     */
    private int front;

    /**
     * current rear index;
     */
    private int current;

    /**
     * the size of the queue.
     */
    private int maxSize;

    /**
     * Constructor Initialize the queue.
     * 
     * @param maxSize The size of Queue.
     */
    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new Object[this.maxSize];
        this.front = 0;
        this.current = -1;
    }

    /**
     * @return The value of current front.
     */
    public Object peek() {

        try {
            isEmpty();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Underflow!!");
            System.exit(0);
        }


        return arr[front];
    }

    /**
     * @param obj
     * 
     *            Insert into the queue.
     */
    public void put(Object obj) {

        try {
            arr[++current] = obj;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Overflow!!");
            System.exit(0);
        }

    }

    /**
     * @return current front value.
     * 
     *         get and remove
     */
    public Object get() {

        try {
            isEmpty();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Underflow!!");
            System.exit(0);
        }

        return arr[front++];
    }
    
    /**
     * Showing queue size information.
     */
    public void getQueueSize() {
        System.out.println("Max Size : " + maxSize);
        System.out.println("Current Size : " + (current + 1));
        System.out.println("Available Size : " + (maxSize - current - 1));
    }

    private void isEmpty() {
        if (front > current)
            throw new ArrayIndexOutOfBoundsException();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        
        String str = "[";
        for (int i=front; i <= current; i++) {
            str += arr[i];
            if (i < current) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }

}

package DataStructure;

/**
 * @author camel
 *
 *         LinkedList Implementation.
 */
public class MyLinkedList {

    /**
     * Header Node
     */
    private Node head;

    /**
     * Tail Node
     */
    private Node tail;

    /**
     * Size
     */
    private int size = 0;

    public void addFirst(Object obj) {

        Node newNode = new Node(obj);

        this.head = newNode;
        size++;

        if (head.nextNode == null)
            this.tail = this.head;
    }

    public void addLast(Object obj) {

        Node newNode = new Node(obj);

        if (size == 0) {
            addFirst(new Node(obj));
        } else {
            tail.nextNode = newNode;
            tail = newNode;
            size++;
        }
    }

    public void add(Object obj, int index) {

        if (size == 0) {
            addFirst(obj);
        } else {
            Node before = node(index - 1);
            Node next = before.nextNode;

            Node newNode = new Node(obj);

            before.nextNode = newNode;
            newNode.nextNode = next;

            size++;

            if (newNode.nextNode == null) {
                tail = newNode;
            }
        }
    }

    public void removeFirst() {

        Node temp = head;
        head = temp.nextNode;
        temp = null;
        size--;
    }

    public void removeTail(int index) {
        if (index == 0)
            removeFirst();

        Node temp = node(index - 1);

        Node beDeleted = temp.nextNode;
        temp.nextNode = temp.nextNode.nextNode;

        if (beDeleted == tail) {
            tail = temp;
        }

        beDeleted = null;
        size--;
    }

    public Object showNode(int nodeIndex) {

        return node(nodeIndex).content;
    }

    public int getSize() {
        return this.size;
    }

    public int indexOf(Object obj) {

        Node temp = head;

        int index = 0;

        while (temp.content != obj) {
            
            temp = temp.nextNode;
            index++;
            
            if (temp == null) {
                return -1;
            }
        }

        return index;

    }

    public String toString() {

        if (head == null) {
            return "[]";
        }

        Node temp = head;
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        while (temp.nextNode != null) {
            sb.append(temp.content + ",");
            temp = temp.nextNode;
        }

        sb.append(temp.content);
        sb.append("]");

        return sb.toString();
    }

    private Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = head.nextNode;
        }
        return x;
    }

    /**
     * @author camel Node Class
     */
    private class Node {

        private Object content;

        private Node nextNode;

        public Node(Object obj) {
            this.content = obj;
            this.nextNode = null;
        }

        @Override
        public String toString() {
            return String.valueOf(this.content);
        }

    }
}

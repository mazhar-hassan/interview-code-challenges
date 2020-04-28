package o4.challenges.code.ds.linklist;

public class LinkList {
    private Node head;
    private Node tail;


    static void test() {
        LinkList list = new LinkList();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.print();

        list.delete(1);
        list.print();
        list.delete(5);
        list.print();
        list.delete(3);
        list.print();
        list.delete(4);
        list.print();
        list.delete(2);
        list.print();
    }

    public static void main(String[] args) throws InterruptedException {
        test();
        System.out.println(Node.count);

    }

    public static void memory() {

        int mb = 1024 * 1024;

        // get Runtime instance
        Runtime instance = Runtime.getRuntime();

        System.out.println("***** Heap utilization statistics [MB] *****\n");

        // available memory
        System.out.println("Total Memory: " + instance.totalMemory() / mb);

        // free memory
        System.out.println("Free Memory: " + instance.freeMemory() / mb);

        // used memory
        System.out.println("Used Memory: "
                + (instance.totalMemory() - instance.freeMemory()) / mb);

        // Maximum available memory
        System.out.println("Max Memory: " + instance.maxMemory() / mb);

    }

    public void add(int data) {
        Node tmp = new Node(data, null);
        if (head == null) {
            head = tail = tmp;
        } else {
            tail.setNext(tmp);
            tail = tmp;
        }
    }

    public Node find(int data) {
        if (head == null) {
            return null;
        }
        Node f = head;
        while (f != null) {
            if (f.getData() == data) {
                return f;
            }
            f = f.getNext();
        }
        return null;
    }

    public boolean delete(int data) {
        System.out.println("Delete---------> " + data);
        if (head == null) {
            return false;
        }

        Node f = head;
        Node p = null;
        while (f != null) {
            if (f.getData() == data) {
                if (head == tail && tail == f) {
                    head = tail = null;
                } else if (f == head) {
                    head = f.getNext();
                } else if (f == tail) {
                    p.setNext(null);
                    tail = p;
                } else {
                    p.setNext(f.getNext());
                }
                return true;
            }
            p = f;
            f = f.getNext();
        }
        return false;
    }

    public void print() {
        if (head == null) {
            System.out.println("[ Empty array ]");
            return;
        }
        System.out.print("[ ");
        Node f = head;
        while (f != null) {
            System.out.print(f.getData() + " -> ");
            f = f.getNext();
        }
        System.out.println("null ]");

    }

}

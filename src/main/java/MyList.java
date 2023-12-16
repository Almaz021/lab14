public class MyList implements Queue {
    static Node head;
    Node current = head;

    public static void main(String[] args) {
        MyList queue = new MyList();
        queue.init();
    }

    public void init() {
        for (int i = 1; i < 11; ++i) {
            Node n = new Node();
            n.value = i;
            add(n);
            if (i == 10) {
                current = n;
                n.next = head;
            }
        }
    }

    public void add(Node n) {
        if (head == null) {
            head = n;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
    }

    public int next(Node n) {
        current = n.next;
        return current.value;
    }
}

public class linkedlist {
    static Node head;
    static int size;

    linkedlist() {
        this.size = 0;
    }

    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // adding first
    public static void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    // adding last
    public static void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {

            currNode = currNode.next;
        }
        size++;
        currNode.next = newNode;

    }

    // deleting first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        size--;
        head = head.next;
    }

    // deleting last
    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getsize() {
        return size;
    }

    public void reverse(){
            if(head==null||head.next==null){
                return;
            }
            Node prev=head;
            Node currNode=head.next;
            while(currNode!=null){
                Node nextNode=currNode.next;
                currNode.next=prev;
                
                //update
                prev=currNode;
                currNode=nextNode;
            }
            head.next=null;
            head=prev;
        }

        public void print() {
            if (head == null) {
                System.out.println("Empty list");
                return;
            }
    
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
            System.out.println();
        }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addLast("list");
        ll.addFirst("This");
        ll.print();

        // ll.deleteFirst();
        // ll.print();

        // ll.deleteLast();
        // ll.print();

        int size = ll.getsize();
        System.out.println(size);

        ll.reverse();
        ll.print();
    }
}
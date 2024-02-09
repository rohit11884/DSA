//stack using Linked List
public class StackDS {
        static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head = null;
        public static void push(int data) {
            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static boolean isEmpty() {
            return head == null;
        }

        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
        // int b=stack.pop();
        // System.out.println(b);
        // int a=stack.peek();
        // System.out.println(a);
        
    }
}

// public class StackDS{
//     public static class Node{

//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             next=null;
//         }
//     }
//     public static class Stack{
//         public static Node head=null;
//         public static void push(int data){
//             Node newNode=new Node(data);
//                 if(head==null){
//                     head=newNode;
//                     return ;
//                 }
//                 newNode.next=head;
//                 head=newNode;
//         }

//         public static boolean isEmpty(){
//             return head.next==null;
//         }

//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             Node top=head;
//             head=head.next;
//             return top.data;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             Node top=head;
//             return top.data;
//         }
//     }
//     public static void main(String[] args) {
//         Stack st=new Stack();

//         st.push(1);
//         st.push(2);
//         st.push(3);
//         st.push(4);

//         int a=st.pop();
//         int b=st.peek();
//         System.out.println("Pop element is : "+a);
//         System.out.println("Peek element is : "+b);
//     }
// }
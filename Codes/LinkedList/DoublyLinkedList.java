class Node{
    int data;
    Node next;
    Node back;
    Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
    Node (int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class DoublyLinkedList {
    public static void main(String [] args){
        int[] arr = {1,3,2,4};
        Node head = convertArr2DLL(arr);
        // printDDL(head);
        // head = deleteHead(head);
        // printDDL(head);
        printDDL(head);
        insertBeforeNode(head.next, 100);
        printDDL(head);
        

    }
    public static Node convertArr2DLL(int[] arr){

        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = prev.next;
        }
        return head;
    }
    // printing the Doubly LinkedList
    public static void printDDL(Node head){
      
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
    // Deleting the head
    public static Node deleteHead(Node head){
        if(head == null || head.next == null) return null;
        System.out.print("\nhead deleted..");
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }
    
    // Deleting the tail
    public static Node deleteTail(Node head){
        if(head == null || head.next == null) return null;
        Node tail = head;
        System.out.print("\ntail deleted..");
        while(tail.next != null){
            tail = tail.next;
        }
        Node prev = tail.back;
        prev.next = null;
        tail.back = null;
        return head;
    }
    
    // Removing kth Element
    public static Node deleteKthElement(Node head, int k){
        if(head == null) return null;
        Node temp = head;
        int cnt = 0;
        while(temp.next != null){
            cnt ++;
            if(cnt == k){
                break;
            }
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;
        if(prev == null && front == null){
            return null;
        }
        else if(prev == null){
            return deleteHead(head);
        }
        else if(front == null){
            return deleteTail(head);
        }
        System.out.print("\nelement deleted..");
        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;
        return head;

    }

    // Inserting before the head in the Doubly LinkedList
    public static Node insertBeforeHead(Node head, int val){
        System.out.print("\nNode inserted before head...");
        Node newNode = new Node(val, head, null);
        head.back = newNode;
        return newNode;
    }

    // Insert before the tail in the Doubly LinkedList
    public static Node insertBeforeTail(Node head, int val){
        Node tail = head;
        System.out.print("\nNode inserted before tail...");
        while(tail.next != null){
            tail = tail.next;
        }
        Node prev = tail.back;
        Node newNode = new Node(10, tail, prev);
        prev.next = newNode;
        tail.back = newNode;
        return head;
    }

    // Inserting before the Kth element
    public static Node insertbeforeKthElement(Node head, int val, int k){
        if(head == null) return new Node(10);
        System.out.print("\nnode inserted before Kth element...");
        if(k == 1) return insertBeforeHead(head, val);
        Node temp = head;
        int cnt = 0;
        while(temp.next != null){
            cnt++;
            if(cnt == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }

    // Inserting before the Node
    public static void insertBeforeNode(Node node, int val){
        System.out.print("\nelemnt inserted...");
        Node prev = node.back;
        Node newNode = new Node(val, node, prev);
        prev.next = newNode;
        node.back = newNode;
    }
    
}

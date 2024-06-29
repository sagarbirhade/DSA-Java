class Node{
    int data;
    Node next;
    Node back;
    Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
class DoublyLL {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        Node head = convertArrtoDll(arr);
        print(head);

        Node newhead = deleteTail(head);
        print(newhead);

        Node newhead2 = deletekNode(head, 4);
        print(newhead2);

        Node newhead3 = insertMiddle(head, 12, 6);
        print(newhead3);


        
    }

    // Converting arrray to DDl
    public static Node convertArrtoDll(int [] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = prev.next;
        }

        return head; 

    }

    // printtiong linked list
    public static void print(Node head){
        Node temp = head;
        while(temp.next  != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Deleting head of linked list
    public static Node deleteHead(Node head){
        if(head == null) return null;
        head = head.next;
        head.back = null;
        return head;
    }

    // Deleting tail
    public static Node deleteTail(Node head){
        if(head == null) return null;
        Node temp = head;
        Node prev = null;
        while(temp.next != null){
            temp = temp.next;
        }

        prev = temp.back;
        prev.next = null;
        temp.back = null;
        return head;
    }

    // deleting kth element
    public static Node deletekNode(Node head, int k){

        if(head == null) return null;
        if(k == 1){
            head = head.next;
            head.back = null;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        Node front = null;

        while(temp != null){
            cnt++;
            if(cnt == k){
                break;
            }
            temp = temp.next;
        }
        prev = temp.back;
        front = temp.next;
        if(front == null && prev == null){
            return null;
        }
        else if(prev == null){
            return deleteHead(head);    
        }
        else if(front == null){
            return deleteTail(head);      
        }
        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;
        return head;
    
    
    }

    // Inserting the at kth index
    public static Node insertMiddle(Node head, int val, int k){

        if(head == null) return new Node(val);
        if(k == 1){
            Node newnode = new Node(val, head, null);
            head.back = newnode;
            return newnode;
        }

        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt == k){
                break;
            }
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newnode = new Node(val, temp, prev);
        prev.next = newnode;
        temp.back = newnode;

        return head;
    }
    
}

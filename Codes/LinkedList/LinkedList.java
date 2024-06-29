class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    } 
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
class LinkedList{
    
    public static void main(String[] args){
        
        // int[] arr = {1,2,3,4,5,6};
        // Node head = convertArr2LL(arr);
        
        // System.out.println();
        // print(head);
        // head = insertPosition(head, 10, 2);
        // print(head);
        // head = insertHead(head, 10);
        // print(head);
        // head = insertHead(head, 20);
        // print(head);
        // head = insertTail(head, 30);
        // print(head);
        Node head = null;
        head = insertTail(head, 10);
        head = insertTail(head, 20);
        print(head);
    }

    // Converting Array to LinkedList
    public static Node convertArr2LL(int[] arr){ 
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp; // moves = temp;
            mover = mover.next;
        }
        return head;
    }

    // Finding length of LL
    public static int lengtghofLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count = count + 1;
            temp = temp.next;
        }
        return count;
    }

    // Search in Linked List
    public static String searchinLL(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val) return "Present";
            temp = temp.next;
        }
        return "Not Present";
    }

    // printing a LinkedList
    public static void print(Node head){
        Node temp = head;
        System.out.print("\nLinked List: ");
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    // Removing head of LinkedList
    public static Node removeHead(Node head){
        System.out.print("\nhead removed...");
        if(head == null) return head;
        head = head.next;
        return head;
    }

    // Removing tail of LinkedList
    public static Node removeTail(Node head){
        if(head == null || head.next == null) return null;
        System.out.print("\ntail removed...");
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // Removing at the middle of LinkedList with position given as k
    public static Node removeK(Node head, int k){
        if(head == null) return head;
        System.out.print("\nkth element removed...");;
        if(k == 1){
            head = head.next;
            return head;
        }
        int count = 0;
        Node prev = null;
        Node temp = head;
        while(temp != null){
            count = count + 1;
            if(k == count){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    //Removing element from LinkedList or we can say directly the data
    public static Node removeEL(Node head, int val){
        if(head == null) return null;
        System.out.print("\nelement removed...");;
        if(head.data == val){
            head = head.next;
            return head;
        }
        Node prev = null;
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // Inserting an head
    public static Node insertHead(Node head, int val){ 
        System.out.print("\nelement inserted at head...");
        Node temp = new Node(val); // we can also give here the next pointer value as in constructor 
        if(head == null ) return temp;// but we are assigning it as null bcoz we want to make temp= temp.next;
        temp.next = head;
        return temp;  
    }

    // Inserting new node at tail
    public static Node insertTail(Node head, int val){
        System.out.print("\nelement inserted at tail...");
         if(head == null ) return new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    // Inserting at any position in LinedList
    public static Node insertPosition(Node head, int val, int k){
        if(head == null){
            if(k == 1){
                return new Node(val);
            }
        }
        System.out.print("\nlement inserted at position "+k);
        if(k == 1){
            return new Node(val,head);
        }
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            if(cnt == k-1){
                Node newNode = new Node(10);
                newNode.next = temp.next; // Very Very important first link the new node with temp.next
                // We can write this anove line in constructor directly Node newNode = new Node(10,teamp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

}
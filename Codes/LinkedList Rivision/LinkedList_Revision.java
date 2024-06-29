
class Node1{
    int data;
    Node next;
    Node1(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node1(int data1){
        this.data = data1;
        this.next = null;
    }
}
class LinkedList_Revision {
    public static void main(String[] args) {
        System.out.println("Jay Bijasani Mata");

        int arr[] = {1,2,3,4,5,6,7,8,9};
  
        Node head = arrtoLL(arr);
        // System.out.println(head.data);

        print(head);

        // System.out.println("\n\n");
        // System.out.println(findLengthLL(head));

        // System.out.println(searchLL(head, 5));
        // Node newhead = removeHead(head);
        // print(newhead);       

        // Node newhead1 = removeTail(head);
        // print(newhead1);

        // Node newhead2 = removeMiddle(head, 8);
        // print(newhead2);

        // Node newhead3 = removeElement(head, 3);
        // print(newhead3);

        // Node newhead = insertHead(head);
        // print(newhead);

        // Node newhead1 = insertTail(head,20);
        // print(newhead1);
        Node newhead3 = insertAtPosition(head,12, 1);
        print(newhead3);

    }

    // arrto LL
    public static Node arrtoLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length ; i++){
            Node temp  = new Node(arr[i]);
            mover.next = temp; // moves = temp;
            mover = mover.next;
        }
        return head;
    }

    //printing
    public static void print(Node head){
        Node temp = head;
        System.out.print("\nLinked List: ");
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    //length
    public static int findLengthLL(Node head){
        Node temp = head;
        int cnt = 0;
        while(temp.next != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    //length
    public static String searchLL(Node head, int val){
        Node temp = head;
        while(temp.next != null){
            if(temp.data == val) return "present";
            temp = temp.next;
        }
        return "Not present";
    }

   //removing head
     public static Node removeHead(Node head){

    if(head == null) return head;
    head = head.next;
    return head;
   }

   //remove tail
    public static Node removeTail(Node head){
        Node temp = head;
        while(temp.next.next !=  null){
            temp = temp.next;
        }
        temp.next = null;
    return head;
    }

    // removing middle of linked list with position given as k
    public static Node removeMiddle(Node head, int k){

        if(head == null || head.next == null) return head;
        if(k == 1){
            head = head.next;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null){
            cnt++;
            if(cnt == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    //removing a perticular element
    public static Node removeElement(Node head, int val){

        if(head == null || head.next == null) return head;
        if(head.data == val){
            head = head.next;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == val){
                prev.next = prev.next.next;

            }
            prev = temp;
            temp = temp.next;
        } 

        return head;
    }

    // insert at head
    public static Node insertHead(Node head){

        Node newNode = new Node(12, head);
        head = newNode;
        return head;
    }

    //insert tail
    public static Node insertTail(Node head, int val){
        if(head == null ) return new Node(val);
        Node temp =  head;
        while(temp.next != null){
            temp = temp.next;
        }
         Node newnode = new Node(val);
         temp.next = newnode;
    

        return head;
    }
    

    // inserting at any position in linoked list

    public static Node insertAtPosition(Node head, int val, int k){

        if(head == null) return new Node(val);
        
        if(k == 1){
            return new Node(val, head);
        }

        Node temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            if(cnt == k-1){
                Node newnode = new Node(val);
                newnode.next = temp.next;
                temp.next = newnode;
                break;
            }
            temp = temp.next;

        }
        return head;
    }
}

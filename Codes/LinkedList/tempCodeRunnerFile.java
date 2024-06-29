
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
       System.out.println(arr.length);
       Node head = arrtoLL(arr);
       System.out.println(head.data);

       print(head);

       // System.out.println("\n\n");
       // System.out.println(findLengthLL(head));

       // System.out.println(searchLL(head, 5));
       // Node newhead = removeHead(head);
       // print(newhead);       

       // Node newhead1 = removeTail(head);
       // print(newhead1);

       Node newhead2 = removeMiddle(head, 4);
       print(newhead2);
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
       if(cnt == k){
           prev.next = prev.next.next;
       }
       prev = temp;
       temp = temp.next;

       return head;
   }
   
}

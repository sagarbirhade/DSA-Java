import java.util.Scanner;
class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();
        // Declatring an array
        int marks[] = new int[size];

        // input array
        for(int i=0;i<size;i++){
            marks[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search : ");
        int number = sc.nextInt();

        // printing the array
        for(int i=0;i<marks.length;i++){

            
            // Lineaer Serach in an Array

            if(marks[i] == number){
                System.out.println(number + " found on location : " + i);
            }
        }
    }
}
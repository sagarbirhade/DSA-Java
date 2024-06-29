import java.util.HashSet;
public class Union2Array {
    public static void main(String[] args){

        //problem: find union and Intersection of two array
        int arr1[] = {1,2,3,4,5,6};
        int arr2[]= {1,2,3,8,9};
   
        int num = intersection(arr1, arr2);
        System.out.println(num);

    }
    public static int unionOfTwoArray(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i  < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }
        return set.size();
        
    }
    public static int intersection(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i= 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
            
        }
        return count;
    }
    
}

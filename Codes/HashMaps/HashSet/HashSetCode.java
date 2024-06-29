import java.util.HashSet;
import java.util.Iterator;
public class HashSetCode{
    public static void main(String[] args){
        // creating
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size
        System.out.println("size of set is "+set.size());
        
        // Search - contains
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Does not contain");
        }

        // delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1");
        }

        // Set all elements
        System.out.println(set);

        // Iterator 
        Iterator it = set.iterator();
        //hasNext() // next()
        while(it.hasNext()){
            System.out.println(it.next());
        }
        }
}
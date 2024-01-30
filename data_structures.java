import java.util.*;

public class data_structures {
    public static void main(String[] args) {

        int[] base = {2, 3, 7, 7, 11, 13, 17};
        String[] base2 = {"a", "b", "c", "d", "e", "f", "g"};
        // ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int b: base){
            arr.add(b);
        }
        System.out.println("Array list: " + arr);

        // LinkedList
        LinkedList<Integer> link = new LinkedList<Integer>();
        for (int b: base){
            link.add(b);
        }
        System.out.println("Linked list: "+ link);

        // Stack
        Stack<Integer> stack = new Stack<Integer>();
        for (int b: base){
            stack.push(b);
        }
        System.out.println("Stack: " + stack);

        // Queue
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int b: base){
            queue.add(b);
        }
        System.out.println("Queue: " + queue);

        // Set
        Set<Integer> set = new HashSet<Integer>();
        for (int b: base){
            set.add(b);
        }
        System.out.println("Set: " + set);

        // Map
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < base.length; i++){
            map.put(base[i], base2[i]);
        }
        System.out.println("Map: " + map);
    }
}
package Collection_Framework;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;



public class Demo{
    public static void main(String[] args) {

    //ArrayList

    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(2,25);
    System.out.println(list);

    

    //LinkedList

    List linkedList = new LinkedList<Integer>();
    linkedList.add(0,20);
    linkedList.add(10);
    linkedList.add(1,15);
    linkedList.remove(1);
    System.out.println(linkedList);



    //Vector
    Vector<String> vector = new Vector<String>();
    vector.add("Saamer");
    vector.add("Bin");
    vector.add("Mohammed");
    vector.add("Jaidi");
    System.out.println("vector = "+vector);
    vector.clear();
    System.out.println(vector);




    //Stack
    Stack<Integer> stack = new Stack<Integer>();
    stack.add(10);
    stack.add(10);
    stack.add(20);
    System.out.println("Stack = "+stack);
    stack.pop();
    System.out.println(stack.peek());



    //Set
    //HashSet
    Set<Integer> set = new HashSet<Integer>();
    set.add(10);
    set.add(5);
    set.add(20);
    set.add(3);
    set.add(10);
    System.out.println("Hash Set = "+set);



    // LinkedHashSet
    LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();
    lhset.add(5);
    lhset.add(2);
    lhset.add(2);
    lhset.add(10);
    System.out.println("Linked Hash Set = "+lhset);
    boolean bl = lhset.contains(2);
    System.out.println("2 is present or not = "+bl);



    // Treeset
    TreeSet<Integer> tset = new TreeSet<Integer>();
    tset.add(20);
    tset.add(5);
    tset.add(10);
    tset.add(12);
    tset.add(6);
    tset.add(6);
    System.out.println("TreeSet = "+tset);



    // Queue
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(10);
    queue.offer(20);
    queue.offer(15);
    queue.add(50);
    System.out.println("Queue = "+queue);
    System.out.println("removed element = "+queue.remove());
    System.out.println("Queue = "+queue);
    System.out.println("Poll = "+queue.poll());
    System.out.println("Queue = "+queue);
    System.out.println("peek = "+queue.peek());




    // ArrayDeque  (deque means double ended queue)
    Deque<Integer> adq = new ArrayDeque<Integer>();
    adq.offer(10);
    adq.offer(20);
    adq.offerLast(30);
    adq.pollLast();
    adq.offerFirst(40);
    System.out.println("Deque = "+adq);




    // Priority Queue
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
    pq.offer(12);
    pq.add(3);
    pq.offer(5);
    pq.add(10);
    pq.offer(2);
    System.out.println("Priority Queue = "+pq.peek());




    // Map
    HashMap<String,Integer> map = new HashMap<String,Integer>();
    map.put("Second", 20);
    map.put("First", 5);
    System.out.println("HashMap = "+map);



    // TreeMap
    TreeMap<String,Integer> tmap = new TreeMap<String,Integer>();
    tmap.put("Second", 20);
    tmap.put("First",5);
    System.out.println("TreeMap = "+tmap);
    // System.out.println(tmap.get(key:"First"));
    System.out.println(tmap.keySet());
    System.out.println(tmap.values());


    int arr[] = {1,20,3,40,5,6,7,7};
    for(int e : arr)
    System.out.println(e + ",");
    Arrays.sort(arr);
    System.out.println();
    for(int e : arr)
    System.out.println(e + ",");
    System.out.println(Arrays.binarySearch(arr, 40));
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Second");
    myList.add("First");
    myList.add("Third");
    System.out.println(myList);
    Collections.sort(myList);
    System.out.println("Max = "+Collections.max(list));
    System.out.println(myList);
    Iterator it = myList.iterator();
    while (it.hasNext()) {
    System.out.println("List value = "+it.next());
        
    }


    
    


    }
}
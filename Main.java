package pak;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();

        books.add("Dari");
        books.add("Pashto");
        books.add("English");

        System.out.println("ArrayList: " + books);

        System.out.println("------------------");

        List<String> list=new ArrayList<String>();

        list.add("computer");
        list.add("Desktop");
        list.add("laptop");
        list.add("Telphon");

        for(String fruit:list)
            System.out.println(fruit);

        System.out.println("----------------------");



                Set<Integer> a = new HashSet<Integer>();


                a.addAll(Arrays.asList(
                        new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));


                Set<Integer> b = new HashSet<Integer>();

                b.addAll(Arrays.asList(
                        new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));



                Set<Integer> union = new HashSet<Integer>(a);
                union.addAll(b);
                System.out.print("Union of the two Set");
                System.out.println(union);


                Set<Integer> intersection = new HashSet<Integer>(a);
                intersection.retainAll(b);
                System.out.print("Intersection of the two Set");
                System.out.println(intersection);


                Set<Integer> difference = new HashSet<Integer>(a);
                difference.removeAll(b);
                System.out.print("Difference of the two Set");
                System.out.println(difference);



                System.out.println("---------------------");



                Queue<Integer> q
                        = new LinkedList<>();


                for (int i = 0; i < 5; i++)
                    q.add(i);


                System.out.println("Elements of queue "
                        + q);

                // To remove the head of queue.
                int removedele = q.remove();
                System.out.println("removed element-"
                        + removedele);

                System.out.println(q);


                int head = q.peek();
                System.out.println("head of queue-"
                        + head);


                int size = q.size();
                System.out.println("Size of queue-"
                        + size);



                System.out.println("------------------");


        Map map=new HashMap();

        map.put(1,"Yasna");
        map.put(5,"Popal");
        map.put(2,"Hasib");
        map.put(6,"Hasina");

        Set set=map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){

            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());


            System.out.println("-----------------------------");

                    Deque<String> deque
                            = new LinkedList<String>();



                    deque.add("Element 1 (Tail)");


                    deque.addFirst("Element 2 (Head)");


                    deque.addLast("Element 3 (Tail)");


                    deque.push("Element 4 (Head)");


                    deque.offer("Element 5 (Tail)");


                    deque.offerFirst("Element 6 (Head)");

                    System.out.println(deque + "\n");


                    deque.removeFirst();
                    deque.removeLast();
                    System.out.println("Deque after removing "
                            + "first and last: "
                            + deque);
                }
            }//main class
        }

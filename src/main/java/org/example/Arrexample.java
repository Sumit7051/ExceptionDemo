package org.example;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Arrexample {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Sumit");
        arr.add("Trivani");
        arr.add("Raghav");

        System.out.println(arr);
        System.out.println(arr.get(1));


        LinkedList<String> list = new LinkedList<>();
        list.add("Jammu");
        list.add("Kathua");
        list.add("Samba");
        list.addFirst("Hiranagar");
        list.add("Jammu");

        System.out.println(list);
        Iterator<String> it = list.descendingIterator();

        while(it.hasNext())
        {
//            String val = it.next()
            System.out.print(it.next()+" ");
        }
        System.out.println();
        HashSet<String> set = new HashSet<>();

        set.add("Argentina");
        set.add("Itlay");
        set.add("Portugal");
        set.add("France");
        set.add("Argentina");

        System.out.println(set);


        PriorityQueue<Integer> que = new PriorityQueue<>();
        que.add(10);
        que.add(30);
        que.add(50);
        que.add(70);
        que.add(90);
        que.add(90);

        System.out.println(que);
            System.out.println(que.size());
            System.out.println(que.remove(30));
        System.out.println(que);


        ArrayDeque<Integer> deq = new ArrayDeque<>();
        deq.add(20);
        deq.add(40);
        deq.add(60);
        deq.add(80);
        deq.add(100);
        deq.addFirst(100);
        System.out.println(deq);
        System.out.println(deq.removeAll(deq));
        System.out.println(deq.size());

        HashMap<Integer,String> hash = new HashMap<>();
        hash.put(1,"BRAZIL");
        hash.put(2,"RUSSIA");
        hash.put(3,"INDIA");
        hash.put(4,"CHINA");
        hash.put(5,"South Africa");
//        hash.put(6,"South Africa"); //duplicate allowed

        System.out.println(hash);
        hash.replace(1,"B");
        hash.replace(2,"R");
        hash.replace(3,"I");
        hash.replace(4,"C");
        hash.replace(5,"S");
        System.out.println(hash.values());


    }
}

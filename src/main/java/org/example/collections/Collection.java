package org.example.collections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection.*;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
     List<Integer> num = new ArrayList<>();
     num.add(0,2);
        System.out.println(num);

        List<String> names = new ArrayList<>();
       names.add("Rahul");
       names.add("Rohit");
        System.out.println(names.get(1));

        List<Employee> emp = Arrays.asList(new Employee("Sumit",101,80000),
                new Employee("Sunil Gode",102,100000));

        for(Employee n : emp)
        {
            System.out.println(n);
        }
    }
}

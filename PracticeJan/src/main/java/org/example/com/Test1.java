package org.example.com;

import org.example.com.groupingBy.Employee;
import org.example.com.groupingBy.MyClass;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {


        char[] charArr = {'g','a','e','a','b','c','g'};

        char x =   new String(charArr).chars()
                .mapToObj(c-> Character.valueOf((char)c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue()==1L)
                .findFirst()
                .get()
                .getKey();
        System.out.println(x);

        List<List<Integer>> numLists = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6)
        );
        numLists.stream().flatMap(list-> list.stream()).collect(Collectors.toList()).forEach(System.out::println);


        List<Integer> nums = Arrays.asList(1,2,3,4);
       /* nums.get(0).compareTo()

        MyClass myClass = new MyClass();
        nums.stream().map(MyClass::print).collect(Collectors.toList()).forEach(System.out::println);*/

       /* int sum = nums.stream().reduce(0, (a,b)-> a+b);
        System.out.println(sum);


        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        StringBuilder sb5 = new StringBuilder("hello");
        StringBuilder sb6 = new StringBuilder("hello");

        System.out.println("===================================");

        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false

        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s2));//true

        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//true

        System.out.println(s1.equals(sb5));//false

        System.out.println(sb5==sb6);//false
        System.out.println(sb5.equals(sb6));//true
        System.out.println(sb5.compareTo(sb6)==0);//true

        String s7 = "hello";
        String s8 = new String("hello");

        System.out.println(s7==s8);
        s8 =s8.intern();

        System.out.println(s7==s8);

       TestStaticMethod.m1();

        Map<Integer, Integer> map = new HashMap<>();

        map.entrySet().stream();
        Set<Integer> set = new HashSet<>();


        Arrays.stream(new int[] {1,2});

        map.put(1,2);
        map.put(2,2);
        map.put(3,2);

        map.entrySet().stream().map(entry-> entry.getKey()).collect(Collectors.toList()).forEach(System.out::println);

        List<Employee> employees = Arrays.asList(new Employee(1,"subhash", "IT",276746),
                new Employee(1,"subhash", "IT",276746),
                new Employee(1,"subhash", "IT",276746)
        );

        employees.stream().filter(emp-> emp.getSalary()>30000).skip(4)
                .collect(Collectors.toList());

        double avgSalary =  employees.stream().mapToDouble(emp-> emp.getSalary()).average().getAsDouble();






*/



    }



}

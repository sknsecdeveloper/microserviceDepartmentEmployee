package org.example.com.groupingBy;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class NumberGrouping {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Employee employee = new Employee(1,"subhash","IT",3434);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        int x = 3;
        Future<Integer> futInt = executorService.submit(()->x*x);
        futInt.get();

        CompletableFuture.supplyAsync(()-> x*x);

        Predicate<Integer> predicate = (n) -> n%2==0;
        System.out.println(predicate.test(10));//filter

        Consumer<Integer> consumer = (n)-> System.out.println(n);
        consumer.accept(6);//for each

        Supplier<List<Integer>> supplier = ()-> Arrays.asList(1,2,3);
        System.out.println(supplier.get());// OptionaObject.orElseGet(()-> "Alternate result)


        Function<Integer,Double> function = (a)-> Math.PI*a*a;
        function.apply(20);








        /*int[] arr = {6,4,7,3,9,1,4,1};

        Map<Integer, List<Integer>> mapNumberByGroup =  Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n->n));
        System.out.println(mapNumberByGroup);

        char[] charArr = {'g','a','e','a','b','c','g'};
        Map.Entry<Character, Long> nrc =  new String(charArr).chars().mapToObj(c-> Character.valueOf((char) c)).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,  Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1L)
                .findFirst().orElseThrow();

        System.out.println(nrc);*/



       // Map<String, List<Double>> empDepatSal = Arrays.asList(new Employee()).stream().collect(Collectors.groupingBy(emp->emp.getDepartment(), Collectors.mapping(emp->emp.getSalary(), Collectors.toList())));


        //Arrays.asList(new Employee()).stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary));
        /*Arrays.asList(new Employee()).stream().sorted(

                    (e1,e2) -> {

                        int sortByDept = e1.getDepartment().compareTo(e1.getDepartment());
                        return sortByDept == 0 ? (int) (e1.getSalary()-e2.getSalary()):sortByDept;

                    }


                )*/

    }
}

package no.satyam.ocp.chap3;

import java.util.function.*;
import java.util.stream.*;
import java.util.*;

import static java.util.Arrays.*;

public class BuildInInterfaceDemo {
  public BooleanSupplier bolSupplier = () -> true;

	public static void main(String... args){
		//Stream<Integer> stream = Stream.iterate(1, n -> n + 3).limit(5);

    // Optional<Integer> max = stream.min((a, b) -> a - b);  
    //Stream<Integer> stream = Stream.iterate(1, n -> n + 1).limit(10);
    // Optional<Integer> first = stream.findFirst();
    //long count = stream.count();
    //Optional<Integer> any = stream.findAny();

    //Set<Integer> list = stream.collect(Collectors.toSet());
    //System.out.println(list);    

    // stream.forEach(System.out::println);
    // IntStream stream = IntStream.of(1, 2, 3, 4, 5);
    // System.out.println(stream.average().getAsDouble());

    // DoubleStream doubleStream = DoubleStream.iterate(0.5, d -> d/2).limit(5);
    // doubleStream.forEach(System.out::println);
    //tripleStream.peek(System.out::println).sorted().forEach(System.out::println);
    //stream.filter(n -> n % 2 == 1).forEach(System.out::println);
    // stream.forEach(System.out::println); 
    BooleanSupplier supplier = new BuildInInterfaceDemo().bolSupplier;
    System.out.println(supplier.getAsBoolean()); 
	}
}
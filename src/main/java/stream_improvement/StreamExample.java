package stream_improvement;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author nitish on 23/9/17.
 */
/*

In Java SE 9, Oracle Corp has added four useful new methods to java.util.Stream interface. As Stream is an interface, all those new implemented methods are default methods. Two of them are very important: dropWhile and takeWhile methods

If you are familiar with Scala Language or any Functions programming language, you will definitely know about these methods. These are very useful methods in writing some functional style code. Let us discuss about takeWhile utility method here.

This takeWhile() takes a predicate as an argument and returns a Stream of subset of the given Stream values until that Predicate returns false for first time. If first value does NOT satisfy that Predicate, it just returns an empty Stream.

 */
public class StreamExample {
  private StreamExample() {
  }

  /* dropWhile
       takeWhile
       iterate
       ofNullable
     */
  public static void main(String args[]) {
    //passing the stream to supplier for stream reuse
    Supplier<Stream<Integer>> streamSupplier = () -> Stream.of(10, 20, 30, 40, 60, 80);

    //drop while - prints 40,50,60,80
    System.out.println("Drop while --> " + streamSupplier.get()
        .dropWhile(value -> value <= 30)
        .collect(Collectors.toList()));

    //take while - print only 10,20,30
    System.out.println("Take while --> " + streamSupplier.get()
        .takeWhile(value -> value <= 30)
        .collect(Collectors.toList()));

    //nullable

    Stream.ofNullable(streamSupplier.get())
        .forEach(s -> System.out.println("Value --->" + s.collect(Collectors.toList())));
    //if empty, return empty value instead of exception
    Stream.ofNullable(null)
        .forEach(System.out::println);

  }
}

package factory.methods;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author nitish on 23/9/17.
 */
public class FactoryMethodExample {

  private FactoryMethodExample() {

  }

  public static void main(String args[]) {
    //Immutable list
    List<String> immutableEmptyList = List.of();
    System.out.println("Empty List " + immutableEmptyList);
    List<String> immutableList = List.of("a", "b", "c", "d");
    System.out.println("Immutable list " + immutableList);

    //Immutable map
    Map<String, Integer> sampleMap = Map.of("a", 10, "b", 20, "c", 30);
    System.out.println("Map " + sampleMap);

    //similarly set
    Set<String> sampleSet = Set.of("a","b","c");
    System.out.println("Map " + sampleSet);

    Map<String, String> entriesMap = Map.ofEntries(Map.entry("A","a"),
                                            Map.entry("B","b"));
    System.out.println("Entries map " + entriesMap);



  }
}

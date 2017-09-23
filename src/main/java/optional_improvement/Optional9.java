package optional_improvement;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author nitish on 23/9/17.
 */
@SuppressWarnings("ALL")
public class Optional9 {
  private Optional9() {
  }

  public static void main(String args[]) {

    //if Present usage
    Optional9 optional9 = new Optional9();
    optional9.implementLogicForIfPresentOrElse();

    //or usage
    optional9.implementLogicForStream();

    //or usage
    //if we pass NonNull values, optional will consider 1 value
    optional9.implementLogicForOr("1");
    //if we pass Null values, Optional will become empty, so it will execute Or method and takes supplier implementation
    optional9.implementLogicForOr(null);
  }

  public void implementLogicForIfPresentOrElse() {
    ImmutableList.Builder<String> builder = ImmutableList.builder();

    Stream.of("A", "B", "C")
        .forEach(value -> Optional.ofNullable(defaultMap().get(value))
            .ifPresentOrElse(builder::add,
                             () -> System.out.println("Entry not found for Value " + value)));


    System.out.println("At the end " + builder.build());
  }

  public void implementLogicForStream() {
    Optional<Integer> integer = Optional.of(10);
    Optional<Integer> integer1 = Optional.of(20);
    Stream<Optional<Integer>> optionalStream = Stream.of(integer, integer1);
    Stream<Integer> integerStream = optionalStream.flatMap(Optional::stream);
    System.out.println("Optional to stream" + integerStream.collect(Collectors.toList()));
  }

  public void implementLogicForOr(Object value) {
    Optional or = Optional.ofNullable(value)
        .or(() -> Optional.of("99"));
    System.out.println("Optional --" + or.get());
  }

  private Map<String, String> defaultMap() {
    return Map.ofEntries(Map.entry("A", "123"));
  }


  private static class OptionalToStreamModel {
    public String name;
    List<String> place;

    public List<String> getPlace() {
      return place;
    }
  }

}

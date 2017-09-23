package try_with_resource;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author nitish on 23/9/17.
 */
@SuppressWarnings("ALL")
public class TryWithResourceEnhancement {
  private TryWithResourceEnhancement() {
  }

  public static void main(String args[]) throws Exception {
    //java7 try with resource for reading the file

    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(
        "/home/nitish/Downloads/java9/src/main/resources/file.txt"))) {
      System.out.println("Java7 reader " + bufferedReader.readLine());
    }

    //java9 easy to read
      BufferedReader bufferedReader = new BufferedReader(new FileReader(
          "/home/nitish/Downloads/java9/src/main/resources/file.txt"));
      try (bufferedReader) {
        System.out.println("Java9 reader " + bufferedReader.readLine());
      }

  }
}

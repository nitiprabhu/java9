package process_builder;

import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author nitish on 23/9/17.
 */
public class ProcessBuilderExample {
  private ProcessBuilderExample() {

  }

  public static void main(String args[]) throws Exception {
    ProcessBuilder ls = new ProcessBuilder()
        .command("ls")
        .directory(Paths.get("/home/nitish/Documents").toFile())
        .redirectOutput(ProcessBuilder.Redirect.PIPE);
    ProcessBuilder grepPdf = new ProcessBuilder()
        .command("grep", "pdf")
        .redirectOutput(ProcessBuilder.Redirect.INHERIT);

    //this method is added in java9
    ProcessBuilder.startPipeline(Arrays.asList(ls, grepPdf));
  }
}

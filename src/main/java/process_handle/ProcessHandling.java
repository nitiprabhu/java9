package process_handle;

/**
 * @author nitish on 23/9/17.
 */
public class ProcessHandling {
  private ProcessHandling() {
  }

  public static void main(String args[]) throws Exception {
    ProcessHandle processHandle = ProcessHandle.current();
    System.out.println(processHandle.getPid()
                           + "-"
                           + processHandle.info()
                           + "-"
                           + processHandle.parent());




  }
}

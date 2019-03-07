/** This is the main class, when ran it called the IOSystem.java, and
 *  MazeRunner.java to ask for instructions on what direction to move
 *  and reverses those instructions if the e key it entered
 *  @author     Allen Rankin
 *  @id         aarankin
 *  @course     CSIS 252:  Programming II
 *  @assignment Lab 2 - Maze
 *  @related    IOSystem.java, LLNode.java, MazeRunner.java, Stack.java, 
 *              StackInterface.java, StackOverflowException.java,
 *              StackUnderflowException.java, UnboundedStackInterface.java
 */
import java.io.*;

/**Initializes the IOSystem and then runs MazeRunner to start the program
  *@params args[] - the string to be used in MazeRunner 
  */
public class Lab2{
    public static void main(String [] args) throws IOException{
        IOSystem run;
        run=new IOSystem(args);
      
        MazeRunner mazeRun;
        mazeRun = new MazeRunner(run);
    }
}
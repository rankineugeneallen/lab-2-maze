/** This class handles the StackUnderflowException
 *  @author     Cathy Bareiss
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Lab 2 - Maze
 *  @related    IOSystem.java, Lab2.java, LLNode.java, MazeRunner.java,   
 *              Stack.java, StackInterface.java, StackOverflowException.java,
 *              UnboundedStackInterface.java
 */

public class StackUnderflowException extends RuntimeException {
    public StackUnderflowException() {
        super();
    }
    public StackUnderflowException(String message) {
        super(message);
    }
}
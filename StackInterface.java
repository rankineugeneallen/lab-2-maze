/** This class is the interface for the Stack class
 *  @author     Cathy Bareiss
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Lab 2 - Maze
 *  @related    Lab2.java, LLNode.java, MazeRunner.java, Stack.java, 
 *              StackOverflowException.java, StackUnderflowException.java, 
 *              UnboundedStackInterface.java
 */

public interface StackInterface <T> {
    public boolean isEmpty();
    public T top() throws StackUnderflowException;
    public void pop() throws StackUnderflowException;
    String toString();
}
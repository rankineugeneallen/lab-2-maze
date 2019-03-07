/** This class is the interface for an UnboundedStack
 *  @author     Cathy Bareiss
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Lab 2 - Maze
 *  @related    Lab2.java, LLNode.java, MazeRunner.java, Stack.java, 
 *              StackInterface.java, StackOverflowException.java,
 *              StackUnderflowException.java
 */

public interface UnboundStackInterface <T> extends StackInterface <T> {
    public void push(T element);
}
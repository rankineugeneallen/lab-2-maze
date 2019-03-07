/** This class does all I/O (either to standard input/output or specified
 *  files depending on what is sent the constructor).  It is designed to aid
 *  in the use of command line arguements to specify input/output files.
 *  @author     Cathy Bareiss
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Lab 2 - Maze
 *  @related    IOSystem.java, Lab2.java, MazeRunner.java, Stack.java, 
 *              StackInterface.java, StackOverflowException.java,
 *              StackUnderflowException.java, UnboundedStackInterface.java
 */

public class LLNode <T> {
    private T info;
    private LLNode link;
    
    public LLNode(T inInfo) {
        info = inInfo;
        link = null;
    }
    
    public T getInfo() {
        return info;
    }
    
    public LLNode getLink() {
        return link;
    }
    
    public void setInfo(T inInfo) {
        info = inInfo;
    }
    
    public void setLink(LLNode inLink) {
        link = inLink;
    }
    
    public String toString() {
        return info.toString();
    }
}
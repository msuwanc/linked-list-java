import models.Node;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;


public class UnitTest {
    @Test
    public void testCase1() {
        LinkedListHelper linkedListHelper = new LinkedListHelper();

        Node nodeD = new Node("D", null);
        Node nodeC = new Node("C", nodeD);
        Node nodeB = new Node("B", nodeC);
        Node input = new Node("A", nodeB);


        String result = linkedListHelper.findBeginningOfLoopNode(input) == null ? null : linkedListHelper.findBeginningOfLoopNode(input).getValue();
        assertNull(result);
    }

    @Test
    public void testCase2() {
        LinkedListHelper linkedListHelper = new LinkedListHelper();

        Node nodeD = new Node("D", null);
        Node nodeC = new Node("C", nodeD);
        Node nodeB = new Node("B", nodeC);
        nodeD.setNextNode(nodeB);
        Node input = new Node("A", nodeB);

        String result = linkedListHelper.findBeginningOfLoopNode(input).getValue();
        assertThat(result, is("B"));
    }
}
import models.Node;

public class LinkedListHelper {
    public Boolean isLoop(Node node) {
        Boolean result = false;
        Node tortoise = node;
        Node hare = node;

        while(!result && hare != null) {
            tortoise = tortoise.getNextNode();

            if(hare.getNextNode() != null) {
                hare = hare.getNextNode().getNextNode();
            }

            if(tortoise == hare) {
                result = true;
            }
        }

        return result;
    }
}

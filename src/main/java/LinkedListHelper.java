import models.Node;

import java.util.ArrayList;
import java.util.List;

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

    public Node findBeginningOfLoopNode(Node node) {
        Node result = null;
        Node pointer = node;
        List<Node> passedNode = new ArrayList<>();
        Boolean isStop = false;

        while (!isStop) {
            if (pointer != null) {
                passedNode.add(pointer);
                pointer = pointer.nextNode;

                for (int i = 0; i < passedNode.size(); i++) {
                    if (pointer != null) {
                        if (passedNode.get(i).getValue().equals(pointer.getValue())) {
                            isStop = true;
                            result = pointer;
                        }
                    } else {
                        isStop = true;
                    }
                }
            }
        }

        return result;
    }
}

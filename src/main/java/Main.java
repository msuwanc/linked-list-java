import models.Node;

public class Main {
    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        first.setNextNode(second);
        second.setNextNode(third);
        third.setNextNode(fourth);
        fourth.setNextNode(first);

        LinkedListHelper linkedListHelper = new LinkedListHelper();

        Boolean result = linkedListHelper.isLoop(first);
        System.out.println(result);
    }
}

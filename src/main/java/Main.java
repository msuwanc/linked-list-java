import models.Node;

public class Main {
    public static void main(String[] args) {
        Node first = new Node("A");
        Node second = new Node("B");
        Node third = new Node("C");
        Node fourth = new Node("D");

        first.setNextNode(second);
        second.setNextNode(third);
        third.setNextNode(fourth);
        fourth.setNextNode(first);

        LinkedListHelper linkedListHelper = new LinkedListHelper();

        Boolean result = linkedListHelper.isLoop(first);
        System.out.println(result);
    }
}

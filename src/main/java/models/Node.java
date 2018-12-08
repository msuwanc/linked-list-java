package models;

public class Node {
    public String value;
    public Node nextNode;

    public Node(String value) {
        this.value = value;
        this.nextNode = null;
    }

    public Node(String value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}

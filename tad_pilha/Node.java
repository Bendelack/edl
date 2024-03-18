package tad_pilha;

public class Node {
    private Object data;
    private Node next;

    public Node ( ) {
        this.data = null;
        this.next = null;
    }

    public Node ( Object e ){
        this.data = e;
        this.next = null;
    }
}

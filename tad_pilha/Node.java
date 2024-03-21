package tad_pilha;

public class Node {

    public Object value;
    public Node next;

    public Node ( ) {
        this.value = null;
        this.next = null;
    }

    public Node ( Object e ){
        this.value = e;
        this.next = null;
    }

}

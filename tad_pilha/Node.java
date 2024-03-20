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

    // public Object value ( ) {
    //     return this._value;
    // }

    // public Node next ( ) {
    //     return this._next;
    // }

}

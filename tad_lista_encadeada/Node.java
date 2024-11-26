package tad_lista_encadeada;

public class Node {
    public Object valor;
    public Node prev;
    public Node next;

    public Node() {
        this.valor = null;
        this.prev = null;
        this.next = null;    
    }

    public Object prev(){
        return this.prev;
    }
    public Object next(){
        return this.next;
    }
    public Object valor(){
        return this.valor;
    }
}

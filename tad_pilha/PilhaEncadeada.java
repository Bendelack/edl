package tad_pilha;

public class PilhaEncadeada implements Pilha {

    private Node top; // representa o topo da pilha
    private Integer t; // armazena a quantidade de elementos da pilha

    public PilhaEncadeada(){
        this.top = new Node();
        this.t = 0;
    }

    public void push ( Object e ) {
        Node toPush = new Node();
        toPush.value = e;
        if ( this.t > 0 ) {
            toPush.next = this.top;
        }
        this.top = toPush;
        this.t++;
        
    }

    public Object top () throws IsEmptyException {
        if ( this.t == 0 ) {
            IsEmptyException e;
            e = new IsEmptyException("Pilha Vazia");
            throw e;
        }
        return this.top.value;
    }

    public Object pop ( ) throws IsEmptyException {
        if ( this.t == 0 ) {
            IsEmptyException e;
            e = new IsEmptyException("Pilha Vazia");
            throw e;
        }

        Node toRemove = this.top;
        Object toRemoveValue = toRemove.value;
        Node penultimo = new Node();
        penultimo = toRemove.next;
        this.top.next = null;
        this.top.value = null;
        this.top = penultimo;

        this.t--;
        return toRemoveValue;

    }

    public Integer size () {
        return this.t;
    }

    @Override
    public void empty (){
        Node newNode = new Node();
        this.top = newNode;
        this.t = 0;

    }
        
}

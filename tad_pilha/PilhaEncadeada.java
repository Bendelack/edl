package tad_pilha;

import tad_pilha.Node;

public class PilhaEncadeada {

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
        
        System.out.println("Elemento " + e + " inserido com sucesso.");
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

        Object toRemove = this.top.value;

        if ( this.t == 1 ) {
            this.top.value = null;
        }

        Node ultimo = new Node();
        ultimo.value = this.top.next;
        ultimo.next = null;
        this.top = ultimo;

        this.t--;
        return toRemove;

    }
        
}

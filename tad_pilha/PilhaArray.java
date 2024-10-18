package tad_pilha;

public class PilhaArray implements Pilha {
    
    private int t; // armazena a quantidade de elementos
    private int c; // armazena a capacidade do vetor
    private Object[] p; // vetor que armazena os elementos da pilha

    public PilhaArray ( ) { // método construtor
        this.t = -1;
        this.c = 2;
        this.p = new Object[2];
    }

    @Override
    public void push ( Object e ) { // adiciona um elemento no topo da ilha
        if ( (this.t + 1) == this.c )
            this.increaseCapacity();
        this.p[++this.t] = e;
    }

    @Override
    public Object top ( ) throws IsEmptyException { // retorna o elemento do topo da pilha
        if ( this.isEmpty() ) {
            IsEmptyException e;
            e = new IsEmptyException("Pilha vazia.");
            throw e;
        }
        return this.p[t];
    }

    @Override
    public Integer size ( ) { // retorna a quantidade de elementos da pilha
        return this.t + 1;
    }

    @Override
    public Object pop ( ) throws IsEmptyException { // remove e retorna o elemento do topo da pilha
        if ( this.isEmpty() ) {
            IsEmptyException e;
            e = new IsEmptyException("Pilha vazia.");
            throw e;
        }
        Object toRemove = this.p[this.t];
        this.t--;// = this.t - 1;
        return toRemove;
    }

    private void increaseCapacity( ) { // aumenta a capacidade da pilha. (substitui por um array 2x maior)
        Object[] newArray = new Object[2*this.c];
        for ( int i = 0; i < this.c; i++ )
            newArray[i] = this.p[i];
        this.c = this.c*2;
        this.p = newArray;
    }

    @Override
    public Boolean isEmpty() { // retorna 'true' se a pilha estiver vazia e 'false' caso contrário
        return this.t == -1;
     }

}

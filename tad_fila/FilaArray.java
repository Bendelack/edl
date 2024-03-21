package tad_fila;

import tad_pilha.IsEmptyException;

public class FilaArray implements Fila {
    private Integer i;
    private Integer f;
    private Object[] array;
    private Integer n;

    public FilaArray ( ) {

        this.i = 0;
        this.f = 0;
        this.array = new Object[8];
        this.n = 8;
    
    }

    @Override
    public Integer tamanho() {
        return (n - i + f)%n;
    }

    @Override
    public Boolean estaVazia() {
        return this.i == this.f;
    }

    @Override
    public Object inicio() throws EmptyQueueException {
        if ( this.tamanho() == 0 ){
            EmptyQueueException e;
            e = new EmptyQueueException("Fila vazia.");
            throw e;
        }
        return this.array[this.i];
    }

    @Override
    public void enfileirar(Object e) {
        if ( this.tamanho() == (n-1) )
            this.increasyCapacity();

        this.array[f] = e;
        this.f = (this.f + 1) % n;

    }

    @Override
    public Object desenfileirar() throws EmptyQueueException {
        if ( this.tamanho() == 0 ){
            EmptyQueueException e;
            e = new EmptyQueueException("Fila Vazia.");
            throw e;
        }
        Object toRemove = this.array[this.i];
        this.i = (this.i+1)%this.n;
        if ( ((this.tamanho() * 100) / this.n) <= 25 )
            this.decreasyCapacity();
        return toRemove;
    }

    private void increasyCapacity () {
        Object[] newArray = new Object[this.n*2];
        for (int x = 0; x < n; x++)
            newArray[(x+this.i)%this.n] = this.array[(x+this.i)%this.n];
        this.n = this.n * 2;
        this.array = newArray;
    }

    private void decreasyCapacity() {
        Object[] newArray = new Object[this.n/2];

        for (int x = 0; x < this.tamanho(); x++)
            newArray[x] = this.array[(x+this.i)%this.n];

        this.i = 0;
        this.f = this.tamanho();
        this.n = this.n / 2;
        this.array = newArray;

    }

}

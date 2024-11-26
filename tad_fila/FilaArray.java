package tad_fila;

import exception.IsEmptyException;

public class FilaArray implements Fila {
    private Integer i; // indice do elemento do inicio
    private Integer f; // indice imediatamente após o último elemento
    private Integer n; // capacidade do array
    private Object[] q; // array que armazena os elementos da fila

    public FilaArray(){
        this.i = 0;
        this.f = 0;
        this.n = 8;
        this.q = new Object[8];
    }

    @Override
    public void enqueue(Object e){
        if (this.size() + 1 == this.n){
            Integer preSize = this.size();
            this.n = this.n*2;
            Object[] newArray = new Object[this.n];
            for(int x = 0; x < preSize; x++){
                newArray[x] = this.q[this.i];
                this.i = (this.i + 1) % (this.n/2);
            }
            this.i = 0;
            this.f = this.size();
            this.q = newArray;

        }
        q[f] = e;
        this.f = (this.f + 1) % this.n;
    }

    @Override
    public Object dequeue() throws IsEmptyException {
        if (this.isEmpty()){
            IsEmptyException e = new IsEmptyException("A fila está vazia");
            throw e;
        }
        Object o = q[i];
        this.i = (this.i + 1) % this.n;
        return o;
    }

    @Override
    public Object first() throws IsEmptyException {
        if (this.isEmpty()){
            IsEmptyException e = new IsEmptyException("A fila está vazia");
            throw e;
        }
        return q[this.i];
    }

    @Override
    public Integer size(){
        return (this.n - this.i + this.f) % this.n;
    }

    @Override
    public Boolean isEmpty() {
        return (this.i == this.f);
    }
}

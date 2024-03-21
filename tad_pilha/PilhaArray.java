package tad_pilha;

public class PilhaArray implements Pilha {
    
    private int t; // armazena a quantidade de elementos
    private int c; // armazena a capacidade do vetor
    private Object[] p; // vetor que armazena os elementos da pilha

    public PilhaArray ( ) {
        this.t = -1;
        this.c = 2;
        this.p = new Object[2];
    }

    @Override
    public void push ( Object e ) {
        if ( (this.t + 1) == this.c )
            this.increaseCapacity();
        this.p[++this.t] = e;
        //System.out.println("elemento " + e + " adicionado com sucesso");
    }

    @Override
    public Object top ( ) throws IsEmptyException {
        if ( this.t == -1 ) {
            IsEmptyException e;
            e = new IsEmptyException("Pilha vazia.");
            throw e;
        }
        return this.p[t];
    }

    @Override
    public Integer size ( ) {
        return this.t + 1;
    }

    @Override
    public Object pop ( ) throws IsEmptyException {
        if ( this.t == -1 ) {
            IsEmptyException e;
            e = new IsEmptyException("Pilha vazia.");
            throw e;
        }
        Object toRemove = this.p[this.t];
        this.t--;// = this.t - 1;
        if ( ((this.size() * 100) / this.c) <= 25 )
            this.decreasyCapacity();
        return toRemove;
    }

    private void increaseCapacity( ) {
        Object[] newArray = new Object[2*this.c];
        for ( int i = 0; i < this.c; i++ )
            newArray[i] = this.p[i];
        this.c = this.c*2;
        this.p = newArray;
    }

    public void listar() throws IsEmptyException{
        if ( this.t == -1 ) {
            IsEmptyException e;
            e = new IsEmptyException("Pilha vazia.");
            throw e;
        }
        System.out.print("{");
        for ( int i = 0; i < this.t; i++ ){
            System.out.print(this.p[i] + ", ");
        }
        System.out.print(this.p[this.t]);
        System.out.println("}");

    }

    private void decreasyCapacity ( ) { 
        Object[] newArray = new Object[this.c/2];
        for ( int i = 0; i < this.t+1; i++ )
            newArray[i] = this.p[i];
        this.c = this.c/2;
        this.p = newArray;

     }

    @Override
    public void empty ( ) {
        Object[] newArray = new Object[2];
        this.c = 2;
        this.p = newArray;
        this.t = -1;
    }

}

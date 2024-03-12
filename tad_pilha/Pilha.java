package tad_pilha;

public class Pilha {
    
    private int t;
    private int c;
    private Object[] p;

    public Pilha ( ) {
        this.t = -1;
        this.c = 8;
        this.p = new Object[8];
    }

    public void push ( Object e ) {
        if ( (this.t + 1) == this.c )
            this.increaseCapacity();
        this.p[++this.t] = e;
    }

    public Object top ( ) throws IsEmptyException {
        if ( this.t == -1 ) {
            IsEmptyException e;
            e = new IsEmptyException(this.t);
            throw e;
        }
        return this.p[t];
    }

    public int size ( ) {
        return this.t + 1;
    }

    public Object pop ( ) throws IsEmptyException {
        if ( this.t == -1 ) {
            IsEmptyException e;
            e = new IsEmptyException(this.t);
            throw e;
        }
        this.t -= 1;
        return this.p[this.t+1];
    }

    private void increaseCapacity( ) {
        Object[] newArray = new Object[2*this.c];
        for ( int i = 0; i < this.c; i++ )
            newArray[i] = this.p[i];
        this.c = this.c*2;
        this.p = newArray;
    }

    public void empty ( ) {
        Object[] newArray = new int[this.c];
        this.p = newArray;
        this.t = -1;
    }

}

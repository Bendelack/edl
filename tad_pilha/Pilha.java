package tad_pilha;

public class Pilha {
    
    private int t; // armazena a quantidade de elementos
    private int c; // armazena a capacidade do vetor
    private Object[] p; // vetor que armazena os elementos da pilha

    public Pilha ( ) {
        this.t = -1;
        this.c = 8;
        this.p = new Object[8];
    }

    public void push ( Object e ) {
        if ( (this.t + 1) == this.c )
            this.increaseCapacity();
        this.p[++this.t] = e;
        //System.out.println("elemento " + e + " adicionado com sucesso");
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
        this.t--;// = this.t - 1;
        if ( ((this.size() * 100) / this.c) <= 25 )
            this.decreasyCapacity();
        return this.p[this.t+1];
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
            e = new IsEmptyException(this.t);
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

    public void empty ( ) {
        Object[] newArray = new Object[8];
        this.c = 8;
        this.p = newArray;
        this.t = -1;
    }

}

package tad_pilha.pilha_colorida;

public class PilhaColorida {
    
    private int redTop;
    private int blackTop;
    private int capacity;
    private int[] vetor;

    public PilhaColorida () {

        this.redTop = -1;
        this.blackTop = 8;
        this.capacity = 8;
        this.vetor = new int[8];

    }

    public void pushRed ( int e ) {
        if (this.blackTop - this.redTop == 1) 
            this.increaseCapacity();
            
        this.vetor[++this.redTop] = e;
    }

    public void pushBlack ( int e ) {
        if (this.blackTop - this.redTop == 1) 
            this.increaseCapacity();
        
        this.vetor[--this.blackTop] = e;
    }

    public int topRed ( ) throws ColorNotFoundException {
        if ( this.redTop == -1 ) {
            ColorNotFoundException e;
            e = new ColorNotFoundException("A pilha vermelha está vazia");
            throw e;
        }
        return this.vetor[this.redTop];
    }

    public int topBlack ( ) throws ColorNotFoundException {
        if ( this.blackTop == this.capacity ) {
            ColorNotFoundException e;
            e = new ColorNotFoundException("A pilha preta está vazia");
            throw e;
        }
        return this.vetor[this.blackTop];
    }

    public int popRed ( ) throws ColorNotFoundException {
        if ( this.redTop == -1 ) {
            ColorNotFoundException e;
            e = new ColorNotFoundException("A pilha vermelha está vazia");
            throw e;
        }
        this.redTop--;
        return this.vetor[this.redTop+1];
    }

    public int popBlack ( ) throws ColorNotFoundException {
        if ( this.blackTop == this.capacity ) {
            ColorNotFoundException e;
            e = new ColorNotFoundException("A pilha preta está vazia");
            throw e;
        }
        this.blackTop++;
        return this.vetor[this.blackTop-1];
    }

    private void increaseCapacity() {
        int newCapacity = this.capacity*2;
        int[] newVetor = new int[newCapacity];

        // insert reds
        for ( int i = 0; i < this.redTop + 1; i++ )
            newVetor[i] = this.vetor[i];

        // insert blacks
        int blackQtd = this.capacity - this.blackTop;
        for (int i = 1; i < blackQtd; i++)
            newVetor[newCapacity-i] = this.vetor[this.capacity-i];

        this.capacity = newCapacity;
        this.vetor = newVetor;
    }
}

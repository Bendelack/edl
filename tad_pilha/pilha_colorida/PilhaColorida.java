package tad_pilha.pilha_colorida;

public class PilhaColorida {
    
    private int redTop;
    private int blackTop;
    private int[] vetor;

    public PilhaColorida () {

        this.redTop = -1;
        this.blackTop = 8;
        this.vetor = new int[8];

    }

    public void pushRed ( int e ) {
        this.vetor[++this.redTop] = e;
    }

    public void pushBlack ( int e ) {
        this.vetor[--this.blackTop] = e;
    }

    public int topRed ( ) {
        return this.vetor[this.redTop];
    }

    public int topBlack ( ) {
        return this.vetor[this.blackTop];
    }

}

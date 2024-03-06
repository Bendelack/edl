package tad_pilha;

public class IsEmptyException extends Exception {

    private int t;

    public IsEmptyException (int t) {
        super("Pilha vazia.");
        this.t = t;
    }

    public int getTop ( ) {
        return this.t;
    }
}

package tad_pilha;

public class PilhaEncadeada implements Pilha {
    private int t;
    private ListaEncadeada p;

    public PilhaEncadeada(){
        this.t = 0;
        this.p = new ListaEncadeada();
    }

    @Override
    public void push(Object e){
        this.p.push_back(e);
    }

    @Override
    public Object top() throws IsEmptyException {
        if ( this.isEmpty() ) {
            IsEmptyException e;
            e = new IsEmptyException("Pilha vazia.");
            throw e;
        }
        return this.p.last();
    }

    @Override
    public Object pop() throws IsEmptyException {
        if ( this.isEmpty() ) {
            IsEmptyException e;
            e = new IsEmptyException("Pilha vazia.");
            throw e;
        }
        Object valor = this.p.pop_back();
        return valor;
    }

    @Override
    public Integer size(){
        return t;
    }

    @Override
    public Boolean isEmpty(){
        return t == 0;
    }
}

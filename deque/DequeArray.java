package deque;

public class DequeArray implements Deque {
    private Integer i;
    private Integer f;
    private Integer n;
    private Object[] d;

    public DequeArray(){
        this.i = 0;
        this.f = 0;
        this.n = 8;
        this.d = new Object[8];
    }

    @Override
    public void inserirInicio(Object e) {
        this.d[this.i] = e;
        this.i = (this.i == 0) ? this.n - 1 : (this.i + 1) % n;
    }

    @Override
    public Object removerInicio() {
        Object primeiro = this.d[this.i];
        this.i = (this.i - 1) % this.n;

        return primeiro;
    }

    @Override
    public void inserirFim(Object e) {
        this.d[this.i] = e;
        this.i = (this.i + 1) % n;
    }

    @Override
    public Object removerFim() {
        Object ultimo = this.d[this.f];
        this.i = (this.i - 1) % this.n;

        return ultimo;
    }

    @Override
    public Object primeiro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'primeiro'");
    }

    @Override
    public Object ultimo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ultimo'");
    }

    @Override
    public Integer tamanho() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tamanho'");
    }

    @Override
    public Boolean estaVazia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estaVazia'");
    }


    
}

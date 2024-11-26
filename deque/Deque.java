package deque;

public interface Deque {

    public void inserirInicio(Object e);
    public Object removerInicio();
    public void inserirFim(Object e);
    public Object removerFim();
    public Object primeiro();
    public Object ultimo();
    public Integer tamanho();
    public Boolean estaVazia();
    
}
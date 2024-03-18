package tad_fila;

Interface Queue {
    private Integer i;
    private Integer f;

    public Integer size();
    public Boolean isEmpty();
    public Object fisrt() throws EmptyQueueException;
    public void queue(Object e);
    public Object dequeue() throws EmptyQueueException;

}
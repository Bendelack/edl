package tad_fila;

Interface Queue {
    public Integer size();
    public Boolean isEmpty();
    public Object fisrt() throws EmptyQueueException;
    public void queue(Object e);
    public Object dequeue() throws EmptyQueueException;
    private void increaseCapacity();

}
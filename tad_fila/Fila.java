package tad_fila;

interface Fila {

    public Integer tamanho();
    public Boolean estaVazia();
    public Object inicio() throws EmptyQueueException;
    public void enfileirar(Object e);
    public Object desenfileirar() throws EmptyQueueException;

}
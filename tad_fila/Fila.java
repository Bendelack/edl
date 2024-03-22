package tad_fila;

// segue o esquema FIFO: Fisrt In, Fisrt Out.

interface Fila {

    public Integer tamanho();
    public Boolean estaVazia();
    public Object inicio() throws EmptyQueueException;
    public void enfileirar(Object e);
    public Object desenfileirar() throws EmptyQueueException;

}
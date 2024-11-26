package tad_fila;
import exception.IsEmptyException;

public interface Fila {

    public void enqueue(Object e); // insere um elemento no fim da fila
    public Object dequeue() throws IsEmptyException; // remove um elemento do inicio da fila
    public Object first() throws IsEmptyException;; // retorna o primeiro elemento da fila sem removê-lo
    public Object size(); // retorna o tamanho da fila
    public Boolean isEmpty(); // indica se há elementos na fila
}
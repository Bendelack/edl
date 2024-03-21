package tad_pilha;

public interface Pilha {

    public void push ( Object e ); // adiciona um elemento ao fim da pilha

    public Object top ( ) throws IsEmptyException; // retorna o último elemento da pilha (topo)

    public Object pop ( ) throws IsEmptyException; // remove o último elemento da pilha (topo)

    public Integer size ( ); // retorna a quantidade de elementos da pilha

    public void empty ( ); // limpa a pilha (semelhnate ao método clear() do ArrayList)
}

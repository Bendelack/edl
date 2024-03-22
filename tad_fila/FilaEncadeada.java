package tad_fila;

import tad_pilha.Node;

public class FilaEncadeada implements Fila {
    private Node fisrt; // armazena o primeiro elemento da fila.
    private Node last;  // armazena o ultimo elemento da fila.
    private Integer size; // armazena a quantidade de elementos da fila.

    public FilaEncadeada ( ) {
        this.fisrt = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public Integer tamanho() {
        return this.size;
    }

    @Override
    public Boolean estaVazia() {
        return this.size == 0;
    }

    @Override
    public Object inicio() throws EmptyQueueException {
        return this.fisrt.value;
    }

    @Override
    public void enfileirar(Object e) {
        Node newNode = new Node(e);

        if ( this.size == 0 )
            this.fisrt = newNode; // se a fila estiver vazia, o novo nó será o primeiro
        else {
            this.last.next = newNode; // o ultimo nó atual aponta para o novo nó
            if ( this.size == 1 )
                this.fisrt.next = newNode; // se o tamanho atual for igual a 1, o primeiro aponta para o novo nó
        }

        this.last = newNode; // o ultimo agora é o novo nó
        this.size++; // incremento do tamanho

        System.out.println("elemento adicionado com sucesso");
        
    }

    @Override
    public Object desenfileirar() throws EmptyQueueException {
        if ( this.size == 0 )
            throw new EmptyQueueException("Fila vazia.");

        Object toRemove = this.fisrt.value; // armazena valor para retorno

        if ( this.size == 1 ){ // se o tamanho atual for igual a 1, o value de fisrt e last recebem o valor null.
            this.fisrt.value = null;
            this.last.value = null;
        } else {
            this.fisrt = this.fisrt.next; // fisrt recebe o proximo depois dele.
        }

        this.size--;
        return toRemove;
    }
}

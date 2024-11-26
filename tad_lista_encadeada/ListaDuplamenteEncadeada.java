package tad_lista_encadeada;

public class ListaDuplamenteEncadeada {
    private Node first;
    private Node last;
    private Integer size;

    public ListaDuplamenteEncadeada(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void push_back(Object e){
        Node novo = new Node();
        novo.valor = e;

        if (this.size() == 0){
            this.first = novo;
            this.last = novo;

        } else if(this.size() == 1){
            this.last = novo;
            this.first.next = this.last;
            this.last.prev = this.first;
        } else {
            novo.prev = this.last;
            this.last.next = novo;
            this.last = novo;            
        }

        this.size++;
    }

    public void push_front(Object e){
        Node novo = new Node();
        novo.valor = e;

        if(this.size() == 0){
            this.first = novo;
            this.last = novo;
        } else if (this.size() == 1){
            this.first = novo;
            this.first.next = this.last;
            this.last.prev = this.first;
        } else {
            novo.next = this.first;
            this.first.prev = novo;
            this.first = novo;
        }
        this.size++;

    }

    public Object pop_back(){
        Node lastNode = this.last;
        Object topo = lastNode.valor;

        if(this.size() == 1){
            this.first = null;
            this.last = null;
        } else {
            this.last = this.last.prev;
            this.last.next = null;
            lastNode.prev = null;
            // lastNode.next = null;
        }

        this.size--;

        return topo;
    }

    public Object pop_front(){
        Node firstNode = this.first;
        Object inicio = firstNode.valor;

        if ( this.size() == 1 ){
            this.first = null;
            this.last = null;
        } else {
            this.first = this.first.next;
            this.first.prev = null;
            firstNode.next = null;
        }

        this.size--;
        return inicio;
    }

    public Object first(){
        return this.first.valor;
    }

    public Object last(){
        return this.last.valor;
    }


    public Integer size(){
        return this.size;
    }
}

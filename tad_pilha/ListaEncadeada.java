package tad_pilha;

public class ListaEncadeada {
    private Node first;
    private Node last;
    private Integer size;

    public ListaEncadeada(){
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

    public Object pop(){
        Node lastNode = this.last;
        Object topo = lastNode.valor;

        if(this.size() == 1){
            this.first = null;
            this.last = null;
        } else {
            this.last = this.last.prev;
            this.last.next = null;
            lastNode.prev = null;
            lastNode.next = null;
        }

        return topo;
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

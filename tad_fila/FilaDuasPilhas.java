package tad_fila;

import tad_pilha.IsEmptyException;
import tad_pilha.PilhaEncadeada;

public class FilaDuasPilhas implements Fila {
    private PilhaEncadeada entrada; // utilizada para inserir novos elementos
    private PilhaEncadeada saida; // utilizada para remover ou retornar o primeiro elemento

    public FilaDuasPilhas ( ) {
        this.entrada = new PilhaEncadeada();
        this.saida = new PilhaEncadeada();
    }

    @Override
    public Integer tamanho() {
        return this.entrada.size() + this.saida.size(); //soma da quantidade de elementos de cada pilha
    }

    @Override
    public Boolean estaVazia() {
        return (this.entrada.size() + this.saida.size()) == 0;
    }

    @Override
    public Object inicio() throws EmptyQueueException {
        try {

            if ( this.estaVazia() )
            throw new EmptyQueueException("Fila vazia.");

            if ( this.saida.isEmpty() ){ // se a pilha de saída estiver vazia é preciso recuperar os valores da pilha de entrada
                Integer n = this.entrada.size();
                for (int i = 0; i < n; i++) {
                    this.saida.push(this.entrada.pop()); // removendo da pilha de entrada e adicionando na pilha de saída
                }
                            
            }
            return this.saida.top(); // retorna o último elemento da pilha de saída (primeiro elemento da fila)
            
        } catch (IsEmptyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void enfileirar(Object e) {
        this.entrada.push(e); // adiciona um novo elemento na pilha de entrada
    }

    @Override
    public Object desenfileirar() throws EmptyQueueException {
        try {

            if ( this.estaVazia() )
            throw new EmptyQueueException("Fila vazia.");

            if ( this.saida.isEmpty() ){
                Integer n = this.entrada.size();
                for (int i = 0; i < n; i++) {
                    this.saida.push(this.entrada.pop());
                }

            }
            return this.saida.pop();
            
        } catch (IsEmptyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
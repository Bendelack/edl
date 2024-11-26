package tad_pilha;
import tad_lista_encadeada.ListaDuplamenteEncadeada;

public class TestePilhaEncadeada {
    public static void main(String args[]){
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        for (int i = 0; i < 10; i++) {
            lista.push_front(i+1);
            System.out.println(lista.first());
        }
        for (int i = 0; i < 10; i++)
            System.out.println(lista.pop_front());
    }
}

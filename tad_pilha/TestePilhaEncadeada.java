package tad_pilha;

public class TestePilhaEncadeada {
    public static void main(String args[]){
        ListaEncadeada pilha = new ListaEncadeada();
        pilha.push_back(10);
        pilha.push_back(11);
        pilha.push_back(12);
        pilha.push_back(13);
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
    }
}

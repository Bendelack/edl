package tad_fila;

import exception.IsEmptyException;

public class TesteFilaArray {
    public static void main(String[] args){
        try {
            FilaArray fila = new FilaArray();
            for(int i = 0; i < 20; i++){
                fila.enqueue(i+1);
            }
            for(int i = 0; i < 21; i++)
                System.out.println(fila.dequeue());
            System.out.println("Tamanho: " + fila.size());
            System.out.println("isEmpty? " + fila.isEmpty());

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}

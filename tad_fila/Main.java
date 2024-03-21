package tad_fila;

public class Main {
    public static void main(String[] args) {

        try {
            FilaArray fila = new FilaArray();

            for (int index = 0; index < 10; index++)
                fila.enfileirar(index);
    
            for (int index = 0; index < 10; index++){
                System.out.println(fila.desenfileirar());
                System.out.println("t > " + fila.tamanho());
            }

        } catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }
    }
}

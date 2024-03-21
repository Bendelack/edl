package tad_fila;

public class Main {
    public static void main(String[] args) {

        try {
            FilaArray fila = new FilaArray();

            for (int index = 0; index < 1000; index++)
                fila.enfileirar(index);
    
            for (int index = 0; index < 1000; index++)
                System.out.println(fila.desenfileirar());

        } catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }
    }
}

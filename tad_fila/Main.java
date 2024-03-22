package tad_fila;

public class Main {
    public static void main(String[] args) {

        try {
            FilaDuasPilhas fila = new FilaDuasPilhas();

            for (int index = 0; index < 10; index++)
                fila.enfileirar(index);
    
            for (int index = 0; index < 10; index++){
                System.out.println(fila.inicio());
                fila.desenfileirar();
                if(fila.estaVazia())
                    System.out.println("A fila está vazia.");
            }

        } catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }
    }
}

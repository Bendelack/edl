package tad_pilha.pilha_colorida;

public class Main {
    public static void main(String[] args) {

        try {

            PilhaColorida pilha = new PilhaColorida();

            // push vermelha
            for (int i = 1; i < 2; i++)
                pilha.pushRed(i);
    

            // push preta
            for (int i = 5; i < 6; i++)
                pilha.pushBlack(i);
    
            System.out.println(pilha.topRed());
            System.out.println(pilha.topBlack());
    
            System.out.println(pilha.popBlack());
            System.out.println(pilha.popRed());
            System.out.println(pilha.popRed());
            System.out.println(pilha.popRed());

                
        } catch (ColorNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}

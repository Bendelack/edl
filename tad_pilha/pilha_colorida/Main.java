package tad_pilha.pilha_colorida;

public class Main {
    public static void main(String[] args) {
        PilhaColorida pilha = new PilhaColorida();

        pilha.pushRed(13);
        pilha.pushBlack(22);

        System.out.println(pilha.topRed());
        System.out.println(pilha.topBlack());

    }
}

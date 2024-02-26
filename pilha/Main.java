public class Main {

    public static void main(String[] args) {

        try {

            Pilha pilha = new Pilha();
            pilha.push(13);
            pilha.push(13);
            pilha.push(13);
            pilha.push(13);
            pilha.push(13);
            pilha.push(13);
            pilha.push(13);
            pilha.push(13);
            pilha.push(13);
            pilha.push(13);
            System.out.println(pilha.pop());
            System.out.println(pilha.size());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}

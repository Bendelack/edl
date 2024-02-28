public class Main {

    public static void main(String[] args) {

        try {

            Pilha pilha = new Pilha();
            pilha.push(5);
            pilha.push(3);
            pilha.pop(); 
            pilha.push(2); 
            pilha.push(8);
            pilha.pop(); 
            pilha.pop(); 
            pilha.push(9); 
            pilha.push(1); 
            pilha.pop(); 
            pilha.push(7); 
            pilha.push(6); 
            pilha.pop(); 
            pilha.pop();
            pilha.push(4); 
            pilha.pop();
            pilha.pop();
            System.out.println(pilha.pop());
            System.out.println(pilha.size());

        } catch (IsEmptyException err) {
            System.out.println(err.getMessage());
        }
    }
    
}

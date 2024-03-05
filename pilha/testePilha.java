import java.util.Scanner;

public class testePilha {
    public static void main(String[] args) {

        try {
            
            Scanner scanner = new Scanner(System.in);

            Pilha pp = new Pilha();
            long start, end, time;

            start = System.currentTimeMillis();

            for ( int i = 0; i < 10; i++ ){
                int e = scanner.nextInt();
                pp.push(e);
            }
    
            for ( int i = 0; i < 10; i++ )
                pp.pop();

            end = System.currentTimeMillis();
            time = end - start;
    
            System.out.println("Execution time: " + time);
       
        } catch (IsEmptyException e) {

            System.out.println(e);

        }

    }
}
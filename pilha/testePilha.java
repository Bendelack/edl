
import java.util.Scanner;

public class testePilha {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            Pilha pp = new Pilha();
            long start, end, time;

            start = System.currentTimeMillis();

            int n = scanner.nextInt();

            for ( int i = 0; i < n; i++ ){
                int e = scanner.nextInt();
                pp.push(e);
            }

            end = System.currentTimeMillis();
            time = end - start;

            System.out.println("Execution time: " + time);

        } catch (Exception e) {

            System.out.println(e);

        }

    }
}
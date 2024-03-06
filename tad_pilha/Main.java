package tad_pilha;

import java.util.Scanner;

public class Main {
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

            scanner.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }
}

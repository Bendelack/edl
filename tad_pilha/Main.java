package tad_pilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            PilhaEncadeada linkedStack = new PilhaEncadeada();

            for ( int i = 0; i < 100; i++ )
                linkedStack.push(i);

            for ( int i = 0; i < 100; i++ )
                System.out.println(linkedStack.pop());

            scanner.close();

        } catch (IsEmptyException e) {

            System.out.println(e.getMessage());

        }

    }
}
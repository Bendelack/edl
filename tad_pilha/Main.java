package tad_pilha;

import java.util.Scanner;

import exception.IsEmptyException;

public class Main {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            PilhaArray pilha = new PilhaArray();

            for ( int i = 0; i < 10; i++ )
                pilha.push(i);

            System.out.println(pilha.top());
            System.out.println(pilha.size());

            for ( int i = 0; i < 10; i++ )
                System.out.println(pilha.pop());

            System.out.println(pilha.isEmpty());

            scanner.close();

        } catch (IsEmptyException e) {

            System.out.println(e.getMessage());

        }

    }
}
package tad_pilha.energia_solar;

import java.util.ArrayList;
import java.util.Scanner;

import tad_pilha.IsEmptyException;
import tad_pilha.Pilha;

public class EnergiaSolar {

    public static void main(String[] args) {

        try {
            
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> casas = new ArrayList<>(); // armazena os valores de cada casa
        ArrayList<Pilha> linhas = new ArrayList<>(); // armazena as linhas de força

        Integer element = -1;

        System.out.println();
        System.out.println("Digite 0 para finalizar a execução do programa!");

        // leitura dos dados
        while (true) {
            element = scanner.nextInt();

            // condição de parada
            if (element == 0)
                break;

            casas.add(element);
        }

        // alocação das linhas de força

        while ( true ) {

            Pilha linhaDaVez = new Pilha(); // armazena as casas de uma linha de força
            ArrayList<Integer> restantes = new ArrayList<>();

            // se o houver apenas um elemente, ele será inserido na ultima pilha
            if ( casas.size() == 1 )
                linhaDaVez.push(casas.get(0));

            for ( int i = 1; i < casas.size(); i++ ){
                //condição verdadeira para a pilha atual vazia
                if ( linhaDaVez.size() == 0 && casas.get(i-1) > casas.get(i) ){
                    System.out.println("Entrou no if 1");
                    linhaDaVez.push(i-1); // adicionando o primeiro elemento na pilha
                    linhaDaVez.push(i); // adicionando o elemento seguinte na pilha
                } else if ( linhaDaVez.size() == 0 && casas.get(i-1) < casas.get(i) ) {
                    System.out.println("Entrou no if 2");
                    linhaDaVez.push(casas.get(i));
                    restantes.add(casas.get(i-1));
                } else if ( linhaDaVez.size() > 0 && casas.get(i-1) > casas.get(i) ){
                    System.out.println("Entrou no if 3");
                    linhaDaVez.push(casas.get(i));
                    System.out.println(linhaDaVez.top());
                } else if ( linhaDaVez.size() > 0 && casas.get(i-1) < casas.get(i) ){
                    System.out.println("Entrou no if 4");
                    restantes.add(casas.get(i));
                }
            }
            System.out.println("> " + linhaDaVez.top());

            casas = restantes; // fazendo o arraylist apontar para os elementos restantes

            // se o tamanho do arraylist for zero, o laço termina
            if (casas.size() == 0 )
                break;


            linhas.add(linhaDaVez); // adcionando a linha atual no arraylist de pilhas

        }
        System.out.println(linhas.get(1).size());

        for ( int i = 0; i < linhas.size(); i++){
            linhas.get(i).listar();
            System.out.println();
        }

        scanner.close();
        } catch (IsEmptyException e) {
            System.out.println(e.getMessage());
        }

    }

}
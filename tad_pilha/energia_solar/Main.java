package tad_pilha.energia_solar;

import java.util.ArrayList;
import java.util.Scanner;
import tad_pilha.IsEmptyException;
import tad_pilha.Pilha;

public class Main {

    public static void main(String[] args) {

        try {
            
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> casas = new ArrayList<>(); // armazena os valores de cada casa
        ArrayList<Pilha> linhas = new ArrayList<>(); // armazena as linhas de força

        Integer element = -1;

        System.out.println();
        System.out.println("Digite 0 para finalizar as entradas do programa!");

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
            Pilha restantes = new Pilha(); // pilha que armazena as casas restantes para análise

            // se o houver apenas um elemente, ele será inserido na ultima pilha
            if ( casas.size() == 1 )
                linhaDaVez.push(casas.get(0));

            for ( int i = 1; i < casas.size(); i++ ){
                if ( linhaDaVez.size() == 0 && casas.get(i-1) > casas.get(i) ){
                    linhaDaVez.push(casas.get(i-1));
                    linhaDaVez.push(casas.get(i));
                } else if ( linhaDaVez.size() == 0 && casas.get(i-1) < casas.get(i) ) {
                    linhaDaVez.push(casas.get(i));
                    restantes.push(casas.get(i-1));
                } else if ( linhaDaVez.size() > 0 && casas.get(i-1) > casas.get(i) ){
                    linhaDaVez.push(casas.get(i));
                } else if ( linhaDaVez.size() > 0 && casas.get(i-1) < casas.get(i) ){
                    restantes.push(casas.get(i));
                }
            }
            // adicionando a linha da vez ao ArrayList de pilhas
            linhas.add(linhaDaVez);

            //limpando o ArrayList que armazena as casas para análise
            casas.clear();
            // pilha que recebe os elementos restantes temporariamente, mas com os valores invertidos
            Pilha pilhaInvertida = new Pilha();
            // variável que armazena a quantidade de elementos restantes
            Integer n = restantes.size();
            
            // laço for para colocar os valores restantes na pilha invertida
            for (int index = 0; index < n; index++)
                pilhaInvertida.push((Integer)restantes.pop());

            // laço for para colocar os valores da pilha invertida no ArrayList de casas
            for (int index = 0; index < n; index++)
                casas.add((Integer)pilhaInvertida.pop());

            // se o tamanho do arraylist for zero, o laço termina
            if (casas.size() == 0 )
                break;
        }

        // imprimindo os valores de cada linha de força
        for ( int i = 0; i < linhas.size(); i++){
            System.out.print("Linha de força " + (i+1) + ": ");
            linhas.get(i).listar();
            System.out.println();
        }

        scanner.close();
        } catch (IsEmptyException e) {
            System.out.println(e.getMessage());
        }

    }

}
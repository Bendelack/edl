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
        /*casas.add(3);
        casas.add(6);
        casas.add(2);
        casas.add(7);
        casas.add(5);*/

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
        ArrayList<Integer> restantes = new ArrayList<>();

        while ( true ) {

            Pilha linhaDaVez = new Pilha(); // armazena as casas de uma linha de força
            //restantes.clear();

            // se o houver apenas um elemente, ele será inserido na ultima pilha
            if ( casas.size() == 1 )
                linhaDaVez.push(casas.get(0));

            System.out.println(" casas size > " + casas.size());
            for ( int i = 1; i < casas.size(); i++ ){
                //condição verdadeira para a pilha atual vazia
                
                //System.out.println("Em análise: " + casas.get(i-1) + " <> " + casas.get(i));
                if ( linhaDaVez.size() == 0 && casas.get(i-1) > casas.get(i) ){
                    linhaDaVez.push(i-1); // adicionando o primeiro elemento na pilha
                    linhaDaVez.push(i); // adicionando o elemento seguinte na pilha
                } else if ( linhaDaVez.size() == 0 && casas.get(i-1) < casas.get(i) ) {
                    System.out.println("if 2");
                    linhaDaVez.push(casas.get(i));
                    restantes.add(casas.get(i-1));
                } else if ( linhaDaVez.size() > 0 && casas.get(i-1) > casas.get(i) ){
                    linhaDaVez.push(casas.get(i));
                } else if ( linhaDaVez.size() > 0 && casas.get(i-1) < casas.get(i) ){
                    restantes.add(casas.get(i));
                }
            }
            linhaDaVez.listar();
            linhas.add(linhaDaVez);

            // System.out.println("casas antes");
            // for (int i = 0; i < casas.size(); i++) {
            //     System.out.println(casas.get(i));
            // }
            casas.clear();
            casas = restantes; // fazendo o arraylist apontar para os elementos restantes
            System.out.println("casas depois");
            for (int i = 0; i < casas.size(); i++) {
                System.out.println(casas.get(i));
            }
            //System.out.println("tamanho do ArrayList: " + casas.size());

            // se o tamanho do arraylist for zero, o laço termina
            if (casas.size() == 0 )
                break;


            //linhas.add(linhaDaVez); // adcionando a linha atual no arraylist de pilhas

        }

        /*for ( int i = 0; i < linhas.size(); i++){
            linhas.get(i).listar();
            System.out.println();
        }*/

        scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
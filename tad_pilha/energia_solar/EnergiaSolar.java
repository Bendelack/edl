package tad_pilha.energia_solar;

import java.util.ArrayList;
import java.util.Scanner;

import tad_pilha.Pilha;

public class EnergiaSolar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> casas = new ArrayList<>(); // armazena os valores de cada casa
        ArrayList<Pilha> linhas = new ArrayList<>(); // armazena as linhas de força
        Boolean fimLinhas = false;

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
            Integer i = 1;

            Pilha linhaDaVez = new Pilha();
            ArrayList<Integer> aux = new ArrayList<>();
            // linhaDaVez.push(casas.get(i));

            while ( true ) {

                if ( casas.get(i-1) > casas.get(i) && casas.get(i) != 0) {
                    linhaDaVez.push(casas.get(i-1));
                    casas.add(i-1, 0);
                } else {
                    aux.add(casas.get(i-1));
                    casas.add(i-1, 0);
                }


                if ( i == (casas.size() - 1) )
                    break;
                i++;
                System.out.println("while interno");
    
            }
            linhas.add(linhaDaVez);
            int x = 0;
            for (int index = 0; index < casas.size(); index++) {
                if (casas.get(index) != 0)
                    x++;
            }

            if (x == 0 )
                break;

            System.out.println("While externo");

        }

        scanner.close();

    }

}
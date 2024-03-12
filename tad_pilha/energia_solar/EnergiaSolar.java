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
        Integer i = 0;
        while ( !fimLinhas ) {
            Pilha linhaDaVez = new Pilha();
            linhaDaVez.push(casas.get(i));

            while ( true ) {

                if ( casas.get(i)  < casas.get(i+1))
                    linhaDaVez.push(casas.get(i));


                System.out.println(casas.get(i));
    
            }
            //linhas.add(linhaDaVez);

        }

        scanner.close();

    }

}
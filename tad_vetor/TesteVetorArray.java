package tad_vetor;

import exception.IsEmptyException;
import exception.OutOfBoundException;

public class TesteVetorArray {
    public static void main(String[] args) {
        try {
            VetorArray vetor = new VetorArray();
            vetor.insertAtRank(0, 1);
        // for (int i = 0; i < 5; i++) {
        //     vetor.insertAtRank(i, i+1);
        //     System.out.println(vetor.size());
        // }
        } catch (OutOfBoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

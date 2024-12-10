package tad_vetor;

import exception.IsEmptyException;
import exception.OutOfBoundException;

public interface Vetor {

    public Object elementAtRank(Integer r) throws IsEmptyException, OutOfBoundException ; // retorna o elemento na colocação r sem removê-lo.
    public Object replaceAtRank(Integer r, Object o) throws OutOfBoundException; // substitui o elemento na colocação r por o e retorna o antigo elemento.
    public void insertAtRank(Integer r, Object o) throws OutOfBoundException; // insere um novo elemento o na colocação r.
    public Object removeAtRank(Integer r) throws IsEmptyException, OutOfBoundException ; // remove e retorna o elemento na colocação r.
    public Integer size(); // retorna o tamanho do vetor
    public Boolean isEmpty(); // verifica se o vetor está vazio
}